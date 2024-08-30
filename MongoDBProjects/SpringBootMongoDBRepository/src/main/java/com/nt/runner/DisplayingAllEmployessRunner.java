package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;

//@Component
public class DisplayingAllEmployessRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {

		 try {
				service.showAllEmployees().forEach(emp->{
					System.out.println(emp);
				});
			}//try
			catch(Exception e) {
				e.printStackTrace();
			}

	}

}
