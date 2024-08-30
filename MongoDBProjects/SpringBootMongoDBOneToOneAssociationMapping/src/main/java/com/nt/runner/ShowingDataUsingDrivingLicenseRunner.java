package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Person;
import com.nt.service.IOneToOneAssociationMgmtService;

@Component
public class ShowingDataUsingDrivingLicenseRunner implements CommandLineRunner {

	@Autowired
	private  IOneToOneAssociationMgmtService  service;
	
	@Override
	public void run(String... args) throws Exception {

		service.showDataUsingDrivingLicense().forEach(lic->{
			   System.out.println("child ::"+lic);
			   Person per=lic.getPersonDetails();
			   System.out.println("parent::"+per);
		   });

	}

}
