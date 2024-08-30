package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.repository.ICustomerRepository;
import in.ashokit.service.IOToMOperationService;

//@Component
public class OToMAssociationMultipleRecordsTestRunner implements CommandLineRunner {

	@Autowired
	private IOToMOperationService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.saveDataUsingMultipleCustomers();

	}

}
