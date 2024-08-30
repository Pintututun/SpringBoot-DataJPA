package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.ashokit.bean.Customer;

@SpringBootApplication
public class LombokApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApiApplication.class, args);
		Customer c=new Customer();
		c.setCid(100);
		c.setName("Pintu");
		System.out.println(c);
	}

}
