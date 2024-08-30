package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.repository.IDoctorRepo;

@Service
public class DoctorMgmtImpl implements IDoctorMgmt {

	@Autowired
	private IDoctorRepo repo;
	@Override
	public int appraiseDoctorsIncomeBySpecialization(String specialization, double hikePercentage) {
		int count=repo.hikeDoctorsIncomeBySpecialization(specialization, hikePercentage);
		
		return count;
	}

	@Override
	public int fireDoctorsByIncomeRange(double start, double end) {
	int count =repo.removeDoctorsByIncomeRange(start, end);
		return count;
	}

}
