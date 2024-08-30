package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class UsingSaveMethodTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		  Employee emp=new Employee(1001, "raja", "hyd", 90000.0, true);
		  String idVal=service.registerEmployeeUsingSave(emp);
		  System.out.println(" id value ::"+idVal);
	}

}
