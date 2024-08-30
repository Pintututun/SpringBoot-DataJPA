package com.nt.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.DrivingLicense;
import com.nt.document.Person;
import com.nt.service.IOneToOneAssociationMgmtService;

//@Component
public class SavingDataUsingChildRunner implements CommandLineRunner {

	@Autowired
	private  IOneToOneAssociationMgmtService  service;
	
	@Override
	public void run(String... args) throws Exception {
         
		try {
			Person per=new Person("raja1", "hyd1", 41);
			DrivingLicense license=new DrivingLicense("LMV",LocalDate.now(),LocalDate.of(2024, 11, 25));
			//add parent to the child 
			license.setPersonDetails(per);
		 //use service
			System.out.println(service.saveDataUsingDrivingLicense(license));
			}
			catch(Exception e) {
				e.printStackTrace();
			}

	}

}
