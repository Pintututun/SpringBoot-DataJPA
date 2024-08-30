package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class UsingInsertAllMethodTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		 Employee emp5 = new Employee(1006, "Krishna", "Pune", 89000.0, true);
	        Employee emp6 = new Employee(1007, "Radha", "Hyderabad", 86000.0, false);
	        Employee emp7 = new Employee(1008, "Arjun", "Kolkata", 92000.0, true);
	        Employee emp8 = new Employee(1009, "Bhima", "Ahmedabad", 93000.0, true);
         System.out.println(service.registerBatchEmployeesUsingInsertAll(List.of(emp5,emp6,emp7,emp8)));
	}

}
