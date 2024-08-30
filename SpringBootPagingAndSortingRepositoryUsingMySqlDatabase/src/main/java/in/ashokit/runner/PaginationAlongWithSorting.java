package in.ashokit.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.service.ActorMgmtServiceImpl;

//@Component
public class PaginationAlongWithSorting implements CommandLineRunner {

	@Autowired
	private ActorMgmtServiceImpl service;
	@Override
	public void run(String... args) throws Exception {
	
		service.showActorsByPageInSortingOrder(0, 3, false,"aname");

	}

}
