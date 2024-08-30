package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class RegisteringMultipleEmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		
		 Employee emp1 = new Employee("John Doe", "123 Elm St", 1234567890L, 50000.0);
	        Employee emp2 = new Employee("Jane Smith", "456 Oak St", 2345678901L, 60000.0);
	        Employee emp3 = new Employee("Jim Brown", "789 Pine St", 3456789012L, 55000.0);
	        Employee emp4 = new Employee("Jill White", "101 Maple St", 4567890123L, 52000.0);
	        Employee emp5 = new Employee("Jack Black", "202 Birch St", 5678901234L, 48000.0);
	        Employee emp6 = new Employee("Alice Green", "303 Cedar St", 6789012345L, 51000.0);
	        Employee emp7 = new Employee("Bob Blue", "404 Spruce St", 7890123456L, 47000.0);
	        Employee emp8 = new Employee("Charlie Yellow", "505 Fir St", 8901234567L, 59000.0);
	        Employee emp9 = new Employee("Diana Red", "606 Ash St", 9012345678L, 53000.0);
	        Employee emp10 = new Employee("Eve Purple", "707 Willow St", 1123456789L, 56000.0);
	        
        String[] ids=service.registerMultipleEmployee(List.of(emp1, emp2, emp3, emp4,emp5, emp6, emp7, emp8,emp9,emp10));
        System.out.println("Documents are registered with :"+Arrays.toString(ids));
        
	}

}
