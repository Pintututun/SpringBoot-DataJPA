package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Doctor;

public interface IDoctorRepository extends JpaRepository<Doctor, Integer> {

}
