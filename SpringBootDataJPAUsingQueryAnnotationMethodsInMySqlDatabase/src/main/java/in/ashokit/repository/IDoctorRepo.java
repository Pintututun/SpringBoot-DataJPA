package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import in.ashokit.entity.Doctor;

public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {

	@Query("from Doctor")
	public List<Doctor> showAllDoctorDetails();
	
	@Query("select doc from Doctor doc")
	public List<Doctor> showDoctorDetails();
	
	@Query("from Doctor doc where doc.income>=?1 and doc.income<=?2")
	public List<Doctor> showDoctorsByIncomeRange(double startRange,double endRange);
	
	@Query("from Doctor doc where doc.income>=?1 and doc.income<=?2")
	public List<Doctor> showDoctorsInIncomeRange(double start,double end);
	
	@Query("from Doctor doc where doc.income>=:start and doc.income<=:end")
	public List<Doctor> displayDoctorsByIncomeRange(@Param("start") double startRange,@Param("end") double endRange);
	
	@Query("from Doctor doc where doc.income>=:start and doc.income<=:end")
	public List<Doctor> displayDoctorsInIncomeRange(double start,double end);
	
	@Query("from Doctor doc where doc.income between :start and :end")
	public List<Doctor> representDoctorsWithinIncomeRange(double start,double end);
	
	@Query("from Doctor doc where doc.income between :start and :end order by specialization")
	public List<Doctor> showInOrder(double start,double end);
	
	@Query("select id,dname,specialization from Doctor where dname in(:first,:second,:third,:fourth)")
	public List<Object[]> getDoctorData(String first,String second,String third,String fourth);
	
	@Query("select dname from Doctor where specialization like :initChars")
	public List<String> getDoctorsByNames(String initChars);
	
	@Query("from Doctor where dname in(:name)")
	public Doctor getDoctorByName(String name);
	
	@Query("select id,specialization,income from Doctor where dname =:name")
	public Object getDoctorDetailByName(String name);
	
	@Query("select specialization from Doctor where dname=:name")
	public String getSpecializationByName(String name);
	
	@Query("select count(distinct specialization) from Doctor")
	public int fetchAllDoctorCountBySpecialization();
	
	@Query("select count(*),max(income),min(income),avg(income),sum(income) from Doctor")
	public Object fetchDoctorsAggregateData();
	
}
