package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Actor;
import in.ashokit.service.IActorMgmtService;

//@Component
public class SortingTestRunner implements CommandLineRunner {

	@Autowired
	private IActorMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
	   
		 System.out.println("Showing all actors in sorted in descending order ");
		 Iterable<Actor> itr=service.showActorsByOrder(false,"aname");
		 itr.forEach(System.out::println);
		 
		 System.out.println("Showing all actors in sorted in ascending order");
		 Iterable<Actor> itr1=service.showActorsByOrder(true, "aname");
		 itr1.forEach(System.out::println);
       
       System.out.println("Sorting all actors in ascending order having two properties");
       Iterable<Actor> itr2=service.showActorsByOrder(true, "aname","id");
       itr2.forEach(System.out::println);
	}

}
