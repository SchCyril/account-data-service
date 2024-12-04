package fr.cyril.accountdataservice.web;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.client.ClientGraphQlResponse;
import org.springframework.graphql.client.HttpGraphQlClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import fr.cyril.accountdataservice.feign.CustomerRestClient;
import fr.cyril.accountdataservice.mapper.CustomerMapper;
import fr.cyril.accountdataservice.model.Customer;
import fr.cyril.customerdataservice.stub.CustomerServiceGrpc.CustomerServiceBlockingStub;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersRequest;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetAllCustomersResponse;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdRequest;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass.GetCustomerByIdResponse;
import fr.cyril.customerdataservice.web.CustomerSoapService;
import graphql.PublicApi;
import lombok.var;
import net.devh.boot.grpc.client.inject.GrpcClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/account-service")
public class AccountRestController implements CustomerRestClient {
	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private CustomerRestClient customerRestClient;

	@Autowired
	private CustomerSoapService customerSoapService;
	
	@GrpcClient(value = "customerService")
	private CustomerServiceBlockingStub customerServiceBlockingStub;


	@Autowired
	private CustomerMapper customerMapper;

	// ------------------------------REST----------------------------------//
	
	@GetMapping("/customers")
	public List<Customer> listCustomersRestTemplate() {
		// RestTemplate restTemplate=new RestTemplate();
		return List.of(restTemplate.getForObject("http://localhost:8081/customers", Customer[].class));
	}

	@GetMapping("/customers/{id}")
	public Customer customerById(@PathVariable Long id) {
		return restTemplate.getForObject("http://localhost:8081/customers/" + id, Customer.class);
	}

	// ------------------------------Web Client----------------------------------//

	@GetMapping("/customers/v2")
	public Flux<Customer> listCustomersWebClient() {
		WebClient webClient = WebClient.builder().baseUrl("http://localhost:8081").build();
		return webClient.get().uri("/customers").retrieve().bodyToFlux(Customer.class);
	}

	@GetMapping("/customers/v2/{id}")
	public Mono<Customer> listCustomersWebClientById(@PathVariable Long id) {
		WebClient webClient = WebClient.builder().baseUrl("http://localhost:8081").build();
		return webClient.get().uri("/customers/{id}", id).retrieve().bodyToMono(Customer.class);
	}

	// --------------------------------Open Feign--------------------------------//

	@GetMapping("/customers/v3")
	public List<Customer> listCustomersOpenFeign() {
		return customerRestClient.listCustomersOpenFeign();
	}

	@GetMapping("/customers/v3/{id}")
	public Customer getCustomerOpenFeignById(Long id) {
		return customerRestClient.getCustomerOpenFeignById(id);
	}

	// ---------------------------------GraphQL-------------------------------//

	@GetMapping("/graphql/customers")
	public Mono<List<Customer>> ListCustomersGraphql() {
		HttpGraphQlClient httpGraphQlClient = HttpGraphQlClient.builder().url("http://localhost:8081/graphql").build();

		var httpRequestDocument = """

					  query {
					  allCustomers {
					  id, name, email
					  }
					}
				""";

		return httpGraphQlClient.document(httpRequestDocument).retrieve("allCustomers").toEntityList(Customer.class);

	}

	@GetMapping("/graphql/customers/{id}")
	public Mono<Customer> GetCustomersGraphqlById(@PathVariable Long id) {
		HttpGraphQlClient httpGraphQlClient = HttpGraphQlClient.builder().url("http://localhost:8081/graphql").build();

		var httpRequestDocument = """
						query($id:Int) {
						customerById(id:$id){
						id, name
						}
					}
				""";

		return httpGraphQlClient.document(httpRequestDocument).variable("id", id).retrieve("customerById")
				.toEntity(Customer.class);

	}

	// ---------------------------------SOAP-------------------------------//

	@GetMapping("/soap/customers")
	public List<Customer> soapCustomers() {
		List<fr.cyril.customerdataservice.web.Customer> soapCustomers = customerSoapService.customerList();
		return soapCustomers.stream().map(customerMapper::fromSoapCustomer).collect(Collectors.toList());

	}
	
	@GetMapping("/soap/customer/{id}")
	public Customer soapCustomerById(@PathVariable Long id) {
		
		fr.cyril.customerdataservice.web.Customer soapCustomer = customerSoapService.customerById(id);
		return customerMapper.fromSoapCustomer(soapCustomer);

	}
	
	
	// ---------------------------------GRPC-------------------------------//
	
	@GetMapping("/grpc/customers")
	public List<Customer> GrpcCustomers() {
		CustomerServiceOuterClass.GetAllCustomersRequest request = CustomerServiceOuterClass.GetAllCustomersRequest.newBuilder().build();
		CustomerServiceOuterClass.GetAllCustomersResponse response = customerServiceBlockingStub.getAllCustomers(request);
		List<CustomerServiceOuterClass.Customer> customersList = response.getCustomersList();
		return customersList.stream().map(customerMapper::fromGrpcCustomer).collect(Collectors.toList());
	}
	
	@GetMapping("/grpc/customers/{id}")
	public Customer GrpcCustomerById(@PathVariable Long id) {
		GetCustomerByIdRequest request = GetCustomerByIdRequest.newBuilder()
				.setCustomerId(id)
				.build();
		GetCustomerByIdResponse response = customerServiceBlockingStub.getCustomerById(request);
	    CustomerServiceOuterClass.Customer customer = response.getCustomer();
		return customerMapper.fromGrpcCustomer(customer);
	}

}
