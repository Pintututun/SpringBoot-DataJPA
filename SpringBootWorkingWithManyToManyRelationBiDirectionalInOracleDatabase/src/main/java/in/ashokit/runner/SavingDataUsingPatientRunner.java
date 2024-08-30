package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.service.MToMManagementServiceImpl;

@Component
public class SavingDataUsingPatientRunner implements CommandLineRunner {

	@Autowired
	private MToMManagementServiceImpl service;
	@Override
	public void run(String... args) throws Exception {

      service.saveDataUsingPatient();
		
	}

}
