package in.ashokit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.repo.IActorRepository;
import in.ashokit.view.IResultView;
import in.ashokit.entity.*;

@Component
public class FinderScalarOperations implements CommandLineRunner{

	@Autowired
	private IActorRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		List<IResultView> itr=repo.findByIdGreaterThanEqualAndIdLessThanEqual(5, 15);
		itr.forEach(view->
		System.out.println(view.getId()+"  "+view.getAname())
		);
	}

}
