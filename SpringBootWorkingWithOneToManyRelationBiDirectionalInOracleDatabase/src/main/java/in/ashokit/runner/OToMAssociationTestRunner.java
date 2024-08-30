package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.service.IOToMOperationService;

//@Component
public class OToMAssociationTestRunner implements CommandLineRunner {

	@Autowired
	private IOToMOperationService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		//Save the data using parent data
		
		service.saveDataUsingCustomer( );

	}

}
