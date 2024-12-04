package fr.cyril.accountdataservice.mapper;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import fr.cyril.accountdataservice.model.Customer;
import fr.cyril.customerdataservice.stub.CustomerServiceOuterClass;

@Component
public class CustomerMapper {
	 private ModelMapper modelMapper = new ModelMapper();

	public Customer fromSoapCustomer(fr.cyril.customerdataservice.web.Customer soapCustomer) {
		return modelMapper.map(soapCustomer, Customer.class);
	}
	
	public Customer fromGrpcCustomer(CustomerServiceOuterClass.Customer grpcCustomer ) {
		return modelMapper.map(grpcCustomer, Customer.class);
		
	}
	
}