package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IEmployeeMgmtService;

//@Component
public class UsingUpsertMethodTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {

       String saveOrUpdateEmpDataByEno = service.saveOrUpdateEmpDataByEno(1004, "Assam", 34000.0);
       System.out.println(saveOrUpdateEmpDataByEno);

	}

}
