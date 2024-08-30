package com.nt.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.repository.IEmployeeRepository;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class RegisterEmployeesRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		Random rm=new Random();

		 Employee emp1 = new Employee(rm.nextInt(10000), "John Doe", "123 Elm St", 1234567890L, 50000.0);
	     Employee emp2 = new Employee(rm.nextInt(10000), "Jane Smith", "456 Oak St", 2345678901L, 60000.0);
	     Employee emp3 = new Employee(rm.nextInt(10000), "Jim Brown", "789 Pine St", 3456789012L, 55000.0);
	     Employee emp4 = new Employee(rm.nextInt(10000), "Jill White", "101 Maple St", 4567890123L, 52000.0);
	     Employee emp5 = new Employee(rm.nextInt(10000), "Jack Black", "202 Birch St", 5678901234L, 48000.0);
	     Employee emp6 = new Employee(rm.nextInt(10000), "Emily Davis", "303 Cedar St", 6789012345L, 47000.0);
	     Employee emp7 = new Employee(rm.nextInt(10000), "Michael Johnson", "404 Spruce St", 7890123456L, 59000.0);
	     Employee emp8 = new Employee(rm.nextInt(10000), "Sarah Wilson", "505 Aspen St", 8901234567L, 53000.0);
	     Employee emp9 = new Employee(rm.nextInt(10000), "David Martinez", "606 Fir St", 9012345678L, 62000.0);
	     Employee emp10 = new Employee(rm.nextInt(10000), "Linda Garcia", "707 Willow St", 1230984567L, 51000.0);
         service.registerEmployee(List.of(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10));
	}

}
