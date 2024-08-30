package in.ashokit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.repo.IActorRepository;
import in.ashokit.view.IResultView;
import in.ashokit.view.IResultView1;
import in.ashokit.view.IResultView2;

@Component
public class FinderDynamicOperations implements CommandLineRunner {

	@Autowired
	private IActorRepository repo;
	@Override
	public  void run(String... args) throws Exception {
		List<IResultView1> itr=repo.findByCategoryEqualsIgnoreCase("actress",IResultView1.class);
        itr.forEach(view->{
        	System.out.println(view.getId()+" "+view.getAname()+" "+view.getCategory()+" "+view.getMobileNo());
        });
        
        List<IResultView2> itr1=repo.findByAnameStartingWithAndAnameEndingWithAllIgnoreCase("A","K",IResultView2.class);
        itr1.forEach(view->System.out.println(view.getId()+" "+view.getAname()+" "+view.getCategory()));
	}

}
