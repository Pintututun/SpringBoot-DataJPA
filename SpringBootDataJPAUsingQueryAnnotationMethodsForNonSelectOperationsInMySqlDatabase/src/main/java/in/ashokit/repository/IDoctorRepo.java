package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.ashokit.entity.Doctor;
import jakarta.transaction.Transactional;

public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {

	@Query("update Doctor set income=income+(income*:percentage/100.0) where specialization=:sp")
	@Modifying
	@Transactional
	public int hikeDoctorsIncomeBySpecialization(String sp,double percentage);
	
	@Query("Delete from Doctor where income>=:start and income<=:end")
	@Modifying
	@Transactional
    public int removeDoctorsByIncomeRange(double start,double end);

	
}
