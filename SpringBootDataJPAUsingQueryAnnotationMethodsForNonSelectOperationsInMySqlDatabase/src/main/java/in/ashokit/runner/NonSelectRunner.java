package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.service.IDoctorMgmt;

@Component
public class NonSelectRunner implements CommandLineRunner {

	@Autowired
	private IDoctorMgmt service;
	@Override
	public void run(String... args) throws Exception {
		
       System.out.println(service.appraiseDoctorsIncomeBySpecialization("Cardiologist",10.0)+" number of doctors have been hiked this year");
       System.out.println(service.fireDoctorsByIncomeRange(40000.0, 50000.0)+" number of doctors have been fired");
	}

}
