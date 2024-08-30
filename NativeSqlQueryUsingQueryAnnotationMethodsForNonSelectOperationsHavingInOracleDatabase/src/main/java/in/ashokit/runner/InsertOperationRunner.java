package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.service.IEmployeeMgmt;

//@Component
public class InsertOperationRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmt service;
	
	@Override
	public void run(String... args) throws Exception {
		
      System.out.println(service.insertDoctor("Pavan","CEO", 1000000.0));
	}

}
