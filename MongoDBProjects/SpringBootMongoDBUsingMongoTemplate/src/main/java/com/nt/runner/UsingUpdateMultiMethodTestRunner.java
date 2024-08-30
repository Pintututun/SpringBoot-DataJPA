package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;

//@Component
public class UsingUpdateMultiMethodTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {

        String andUpdateEmpDataBySalaryRange = service.findAndUpdateEmpDataBySalaryRange(65000.0,70000.0,"Tamil Nadu");
        System.out.println(andUpdateEmpDataBySalaryRange);

	}

}
