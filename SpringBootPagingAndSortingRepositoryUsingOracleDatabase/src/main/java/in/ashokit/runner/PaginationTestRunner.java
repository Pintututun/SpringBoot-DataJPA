package in.ashokit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Actor;
import in.ashokit.service.ActorMgmtServiceImpl;

//@Component
public class PaginationTestRunner implements CommandLineRunner {

	@Autowired
	private ActorMgmtServiceImpl service;
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Show all records in particular page");
		Page<Actor> page=service.showPageRecords(0, 2);
		List<Actor> list=page.getContent();
		System.out.println("Records are ::");
		list.forEach(System.out::println);
		System.out.println("Other info about page");
		System.out.println("Currentpage no :"+page.getNumber());
		System.out.println("Total pages:"+page.getTotalPages());
		System.out.println("Total records :"+page.getTotalElements());
		System.out.println("Is it first page :"+page.isFirst());
		System.out.println("Is it Last page :"+page.isLast());
      
      service.showActorsByPage(3);
	}

}
