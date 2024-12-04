package fr.cyril.accountdataservice.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import fr.cyril.accountdataservice.model.Customer;

@FeignClient(url = "http://localhost:8081", value = "customer-rest-client")
public interface CustomerRestClient {
	@GetMapping("/customers")
	public List<Customer> listCustomersOpenFeign();
	
	@GetMapping("/customers/{id}")
	Customer getCustomerOpenFeignById(@PathVariable Long id);

}
