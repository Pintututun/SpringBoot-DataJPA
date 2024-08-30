package in.ashokit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Doctor;
import in.ashokit.repository.IDoctorRepo;

//@Component
public class UseOfOrdinalPositionalParams implements CommandLineRunner {

	@Autowired
	private IDoctorRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
	
		/*List<Doctor> itr=repo.showDoctorsByIncomeRange(50000.0, 60000.0);
		itr.forEach(System.out::println);*/
      
      List<Doctor> itr=repo.showDoctorsInIncomeRange(50000.0, 60000.0);
      itr.forEach(System.out::println);
	}

}
