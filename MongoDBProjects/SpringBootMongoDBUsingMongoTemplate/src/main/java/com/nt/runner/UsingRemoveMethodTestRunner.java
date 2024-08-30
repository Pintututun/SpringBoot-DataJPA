package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;

//@Component
public class UsingRemoveMethodTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	@Override
	public void run(String... args) throws Exception {

         String deleteEmployeeDataByEno = service.deleteEmployeeDataByEno(1002);
         System.out.println(deleteEmployeeDataByEno);

	}

}
