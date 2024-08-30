package in.ashokit;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Employee;
import in.ashokit.service.EmployeeService;

@SpringBootApplication
public class SpringBootCrudRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringBootCrudRepositoryApplication.class, args);
		
		EmployeeService service=context.getBean(EmployeeService.class);
		Employee e1=new Employee(101,"Pintu",2000.0);
		service.createSingleRecord(e1);
		Employee e2=new Employee(102,"Satya",1200.0);
		List<Employee> list=Arrays.asList(e1,e2);
		service.createMultipleRecords(list);
		service.countRecords();
		Employee e3=new Employee(101,"Priya",2000.0);
		service.updateById(e3);
		/*service.deleteById(101);
		service.createSingleRecord(e3);
		List<Integer> list1=Arrays.asList(101,102);
		service.deleteByIds(list1);
		service.createMultipleRecords(list);
		service.deleteSingleRecord(e1);
		service.createSingleRecord(e1);
		service.deleteMultipleRecords(list);
		service.createMultipleRecords(list);*/
	}

}
