package com.nt.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.service.IOneToOneAssociationMgmtService;

//@Component
public class SavingDataUsingParentRunner implements CommandLineRunner{

	@Autowired
	private  IOneToOneAssociationMgmtService  service;
	
	@Override
	public void run(String... args) throws Exception {

		try {
			Person per=new Person("raja", "hyd", 40);
			DrivingLicense license=new DrivingLicense("LMV",LocalDate.now(),LocalDate.of(2024, 10, 24));
			//add child to the parent 
			per.setLicenseDetails(license);
			 //use service
			System.out.println(service.saveDataUsingPerson(per));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
	}

}
