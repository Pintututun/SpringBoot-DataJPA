package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Employee;
import com.nt.service.IEmployeeMgmtService;

//@Component
public class FindingEmployeeByIdRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		try {
			Employee e=service.findEmployeeById("6676d3aa3ec70648d1725fa");
			System.out.println(e);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
        

	}

}
