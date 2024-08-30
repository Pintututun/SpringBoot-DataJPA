package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.service.CustomerMgmtImpl;

//@Component
public class GetingDetailsRunner implements CommandLineRunner {

	@Autowired
	private CustomerMgmtImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		service.getAllCustomers().forEach(System.out::println);

	}

}
