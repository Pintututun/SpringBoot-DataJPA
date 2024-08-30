package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class RegisteringEmployeeRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			 Employee emp=new Employee(1001, "Raja", "hyd", 90000.0, true);
			String msg=service.registerEmployee(emp);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
