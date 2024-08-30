package in.ashokit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Doctor;
import in.ashokit.repository.IDoctorRepo;

//@Component
public class UseOfNamedParams implements CommandLineRunner {

	@Autowired
	private IDoctorRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
	
		/*List<Doctor> itr=repo.displayDoctorsByIncomeRange(40000.0, 50000.0);
		itr.forEach(System.out::println);*/
		
		/*List<Doctor> itr=repo.displayDoctorsInIncomeRange(40000.0, 50000.0);
		itr.forEach(System.out::println);*/
		
		/*List<Doctor> itr=repo.representDoctorsWithinIncomeRange(20000.0, 40000.0);
		itr.forEach(System.out::println);*/

	}

}
