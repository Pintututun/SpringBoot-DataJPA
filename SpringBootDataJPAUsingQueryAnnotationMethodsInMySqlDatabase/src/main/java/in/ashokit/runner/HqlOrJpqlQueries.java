package in.ashokit.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Doctor;
import in.ashokit.repository.IDoctorRepo;

@Component
public class HqlOrJpqlQueries implements CommandLineRunner {

	@Autowired
	private IDoctorRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		/*List<Doctor> itr=repo.showInOrder(40000.0, 60000.0);
		itr.forEach(System.out::println);
		*/
		/*List<Object[]> itr=repo.getDoctorData("Ashish Sharma","Ravi Kumar","Suresh Patel","Sunita Aggarwal");
		itr.forEach(obj->
		           {
		       for(Object data:obj)
		    	   {
		    	   System.out.print(data+" ");
		    	   }
		       System.out.println();
		           }
		    	   );*/
		
		/*List<String> itr=repo.getDoctorsByNames("P%");
		itr.forEach(System.out::println);*/
		
		/*Doctor doc=repo.getDoctorByName("Ashish Sharma");
		System.out.print(doc);*/
		
		/*Object obj=repo.getDoctorDetailByName("Ashish Sharma");
		Object[] data=(Object[])obj;
		System.out.println(Arrays.toString(data));*/
		
		/*String name=repo.getSpecializationByName("Anita Desai");
		System.out.println(name);*/
		
		/*int count=repo.fetchAllDoctorCountBySpecialization();
		System.out.println(count);*/
		
		Object obj=repo.fetchDoctorsAggregateData();
		Object[] data=(Object[])obj;
		System.out.println("Count :"+data[0]);
		System.out.println("Max income:"+data[1]);
		System.out.println("Min income :"+data[2]);
		System.out.println("Average income :"+data[3]);
		
			 }
	
}
