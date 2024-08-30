package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.Employee;
import jakarta.transaction.Transactional;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query(value="Insert into Employee(eid,ename,job,salary) values(EMP_SEQ.NEXTVAL,:name,:job,:income)",nativeQuery = true)
    @Modifying
    @Transactional
	public int registerEmployee(String name,String job,Double income);
	
	
	@Query(value="Select Sysdate from Dual",nativeQuery=true)
	public String showSystemDate();
	
	@Query(value="Create table temp(col1 number(5))",nativeQuery = true)
	@Modifying
	@Transactional
	public int createTempTable();
	
}
