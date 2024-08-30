package in.ashokit.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Customer;
import in.ashokit.service.CustomerMgmtImpl;

//@Component
public class InsertingCustomerDetailsRunner implements CommandLineRunner {

	@Autowired
	private CustomerMgmtImpl service;
	
	@Override
	public void run(String... args) throws Exception {
		
		 Customer customer1 = new Customer("John Doe", "123 Elm Street", LocalDateTime.of(1990, 5, 20, 14, 30), LocalTime.of(10, 30), LocalDate.of(2023, 6, 11));
	        Customer customer2 = new Customer("Jane Smith", "456 Oak Avenue", LocalDateTime.of(1985, 3, 15, 8, 45), LocalTime.of(9, 0), LocalDate.of(2022, 12, 25));
	        Customer customer3 = new Customer("Alice Johnson", "789 Pine Road", LocalDateTime.of(2000, 11, 25, 18, 0), LocalTime.of(14, 15), LocalDate.of(2021, 7, 4));
	        Customer customer4 = new Customer("Bob Brown", "101 Maple Lane", LocalDateTime.of(1995, 7, 10, 16, 20), LocalTime.of(13, 45), LocalDate.of(2020, 5, 1));
	        Customer customer5 = new Customer("Charlie White", "202 Birch Boulevard", LocalDateTime.of(1988, 2, 5, 10, 10), LocalTime.of(11, 20), LocalDate.of(2019, 9, 15));
	        
	        // Add them to a list
	        List<Customer> customers = Arrays.asList(customer1, customer2, customer3, customer4, customer5);
	        System.out.println(service.registerCustomer(customers));
	}

}
