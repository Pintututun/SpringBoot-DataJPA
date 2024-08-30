package com.nt.runner;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class RegisteringEmployeeWithUUIDAsIdValueRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			 Employee emp=new Employee(UUID.randomUUID().toString(),1001, "raja", "hyd", 90000.0, true);
			String msg=service.registerEmployee(emp);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	}

}
