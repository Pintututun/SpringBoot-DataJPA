package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
