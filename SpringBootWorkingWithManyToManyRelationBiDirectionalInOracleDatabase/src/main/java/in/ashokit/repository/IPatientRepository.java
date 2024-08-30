package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {

}
