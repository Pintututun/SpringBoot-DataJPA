package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;

//@Component
public class UsingQueryClass_In_And_MethodTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		service.findEmployeesByAddrsAndSalaryRange(70000.0, 90000.0, "Mumbai","Chennai","Kolkata").forEach(System.out::println);

	}

}
