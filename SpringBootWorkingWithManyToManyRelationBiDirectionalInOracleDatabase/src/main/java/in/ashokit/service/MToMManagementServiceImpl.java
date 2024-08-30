package in.ashokit.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Doctor;
import in.ashokit.entity.Patient;
import in.ashokit.repository.IDoctorRepository;
import in.ashokit.repository.IPatientRepository;

@Service
public class MToMManagementServiceImpl implements IMToMManagementService {

	@Autowired
	private IDoctorRepository doctorRepo;
	
	@Autowired
	private IPatientRepository patientRepo;
	
	@Override
	public void saveDataUsingDoctor() {
		Doctor doc1=new Doctor("Raja","Physican");
		Doctor doc2=new Doctor("Suresh","Ortho");
		
		 
		Patient pat1=new Patient("Karan",40,"Heart");
		Patient pat2=new Patient("Ramesh",41,"Kidney");
		Patient pat3=new Patient("Ram",40,"BP");
		Patient pat4=new Patient("Rakesh",35,"Stomach");
		
		doc1.setPatients(Arrays.asList(pat1,pat2));
		doc2.setPatients(Arrays.asList(pat3,pat4));
		
		pat1.setDoctors(Arrays.asList(doc1));
		pat2.setDoctors(Arrays.asList(doc1));
		pat3.setDoctors(Arrays.asList(doc1,doc2));
		pat4.setDoctors(Arrays.asList(doc2));
	
		doctorRepo.saveAll(Arrays.asList(doc1,doc2));
		System.out.println("Doctors and their patients are saved");

	}

	@Override
	public void saveDataUsingPatient() {
		Doctor doc1=new Doctor("Rajesh","Physican");
		Doctor doc2=new Doctor("Kamlesh","Ortho");
		
		Patient pat1=new Patient("Kiran",40,"Heart");
		Patient pat2=new Patient("Ram",41,"Kidney");
		Patient pat3=new Patient("Raheem",40,"BP");
		Patient pat4=new Patient("John",35,"Stomach");
		
		List<Patient> doc1Patients=new ArrayList<Patient>();
		doc1Patients.add(pat1);
		doc1Patients.add(pat2);
		doc1Patients.add(pat3);
		doc1.setPatients(doc1Patients);
		
		List<Patient> doc2Patients=new ArrayList<Patient>();
		doc2Patients.add(pat3);
		doc2Patients.add(pat4);
		doc2.setPatients(doc2Patients);
		
		List<Doctor> pat1Doctors=new ArrayList();
		pat1Doctors.add(doc1);
		pat1.setDoctors(pat1Doctors);
		List<Doctor> pat2Doctors=new ArrayList<Doctor>();
		pat2Doctors.add(doc2);
		pat2.setDoctors(pat2Doctors);
		
		List<Doctor> pat3Doctors=new ArrayList<Doctor>();
		pat3Doctors.add(doc1);
		pat3Doctors.add(doc2);
		pat3.setDoctors(pat3Doctors);
		
		List<Doctor> pat4Doctors=new ArrayList<Doctor>();
		pat4Doctors.add(doc2);
		pat4.setDoctors(pat4Doctors);
		
		patientRepo.saveAll(Arrays.asList(pat1,pat2,pat3,pat4));
		System.out.println("Patients and Doctors information is saved");
	}

	@Override
	public void loadDataUsingDoctor() {
		// TODO Auto-generated method stub

	}

	@Override
	public void loadDataUsingPatient() {
		// TODO Auto-generated method stub

	}

}
