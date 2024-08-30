package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicense;
import com.nt.service.IOneToOneAssociationMgmtService;

//@Component
public class ShowingDataUsingPersonRunner implements CommandLineRunner {

	@Autowired
	private  IOneToOneAssociationMgmtService  service;
	
	@Override
	public void run(String... args) throws Exception {
		 service.showDataUsingPerson().forEach(per->{
			   System.out.println("parent::"+per);
			   DrivingLicense license=per.getLicenseDetails();
			   System.out.println("Child::"+license);
		   });

	}

}
