package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

@Component
public class CustomIdRegisteredEmployeeUsingInsertMethodRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		 Employee emp1 = new Employee(1, "John Doe", "123 Elm St", 1234567890L, 50000.0);
	     Employee emp2 = new Employee(2, "Jane Smith", "456 Oak St", 2345678901L, 60000.0);
	     Employee emp3 = new Employee(3, "Jim Brown", "789 Pine St", 3456789012L, 55000.0);
	     Employee emp4 = new Employee(4, "Jill White", "101 Maple St", 4567890123L, 52000.0);
	     Employee emp5 = new Employee(5, "Jack Black", "202 Birch St", 5678901234L, 48000.0);
         service.registerEmployee(List.of(emp1,emp2,emp3,emp4,emp5));
	}

}
