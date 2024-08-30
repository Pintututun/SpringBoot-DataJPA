package in.ashokit.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Doctor;
import in.ashokit.repository.IDoctorRepo;

//@Component
public class InsertingRecordRunner implements CommandLineRunner {

	@Autowired
	private IDoctorRepo repo;
	@Override
	public void run(String... args) throws Exception {
	
		 List<Doctor> doctors = Arrays.asList(
		            new Doctor("Ashish Sharma", "Cardiologist", 40000.0),
		            new Doctor("Ravi Kumar", "Neurologist", 41000.0),
		            new Doctor("Priya Singh", "Dermatologist", 42000.0),
		            new Doctor("Anita Desai", "Pediatrician", 43000.0),
		            new Doctor("Vikas Gupta", "Oncologist", 44000.0),
		            new Doctor("Suresh Patel", "Orthopedic", 45000.0),
		            new Doctor("Rekha Jain", "Ophthalmologist", 46000.0),
		            new Doctor("Rahul Mehta", "Psychiatrist", 47000.0),
		            new Doctor("Sunita Aggarwal", "Gynecologist", 48000.0),
		            new Doctor("Manoj Mishra", "Radiologist", 49000.0),
		            new Doctor("Meera Verma", "Anesthesiologist", 50000.0),
		            new Doctor("Karan Bhatt", "Gastroenterologist", 51000.0),
		            new Doctor("Asha Joshi", "Urologist", 52000.0),
		            new Doctor("Nitin Rao", "Pulmonologist", 53000.0),
		            new Doctor("Pooja Sinha", "Endocrinologist", 54000.0),
		            new Doctor("Ramesh Chawla", "Rheumatologist", 55000.0),
		            new Doctor("Neha Malhotra", "Infectious Disease Specialist", 56000.0),
		            new Doctor("Vikram Saxena", "Nephrologist", 57000.0),
		            new Doctor("Seema Kapoor", "Hematologist", 58000.0),
		            new Doctor("Arun Nair", "Allergist", 59000.0),
		            new Doctor("Shweta Kaur", "Immunologist", 60000.0),
		            new Doctor("Rajesh Iyer", "Pathologist", 61000.0),
		            new Doctor("Nandini Dutta", "General Surgeon", 62000.0),
		            new Doctor("Amit Ahuja", "Plastic Surgeon", 63000.0),
		            new Doctor("Deepika Reddy", "Vascular Surgeon", 64000.0)
		        );
		 repo.saveAll(doctors);

	}

}
