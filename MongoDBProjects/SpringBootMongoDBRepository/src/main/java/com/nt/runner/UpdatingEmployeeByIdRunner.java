package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;

//@Component
public class UpdatingEmployeeByIdRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
		  try {
			  String msg=service.updateEmployeeById("6676d584d4d87c128e9b034f", 120000.0);
			  System.out.println(msg);
			  }
			  catch(Exception e) {
			   e.printStackTrace();
			  }
	}

}
