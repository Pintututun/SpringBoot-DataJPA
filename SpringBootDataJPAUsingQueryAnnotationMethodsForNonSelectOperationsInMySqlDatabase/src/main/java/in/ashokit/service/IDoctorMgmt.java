package in.ashokit.service;

public interface IDoctorMgmt {

	public int appraiseDoctorsIncomeBySpecialization(String specialization,double hikePercentage);
	public int fireDoctorsByIncomeRange(double start,double end);
}
