package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

@Component
public class UsingSaveAllMethodTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {

		Employee emp1 = new Employee(1002, "Sita", "Mumbai", 85000.0, false);
        Employee emp2 = new Employee(1003, "Ram", "Delhi", 95000.0, true);
        Employee emp3 = new Employee(1004, "Lakshman", "Chennai", 87000.0, true);
        Employee emp4 = new Employee(1005, "Hanuman", "Bangalore", 88000.0, false);
        List<Employee> asList = Arrays.asList(emp1,emp2,emp3,emp4);
        String msg=service.registerBatchEmployeesUsingSaveAll(asList);
        System.out.println(msg);

	}

}
