package in.ashokit.runner;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Actor;
import in.ashokit.repo.IActorRepository;

@Component
public class FinderMethodsRunner implements CommandLineRunner {

	@Autowired
	private IActorRepository repo;
	@Override
	public void run(String... args) throws Exception {
         List<Actor> itr=repo.findByAnameEquals("Deepika");
         itr.forEach(System.out::println);
         System.out.println("-----------------1----------------");
         List<Actor> itr1=repo.findByAnameIs("Deepika");
         itr1.forEach(System.out::println);
         System.out.println("-----------------2----------------");
         List<Actor> itr2=repo.findByAnameIgnoreCase("deepika");
         itr2.forEach(System.out::println);
         System.out.println("-----------------3----------------");
         List<Actor> itr3=repo.findByAnameContaining("a");
         itr3.forEach(System.out::println);
         System.out.println("-----------------4----------------");
         List<Actor> itr4=repo.findByAnameStartingWith("A");
         itr4.forEach(System.out::println);
         System.out.println("-----------------5----------------");
         List<Actor> itr5=repo.findByAnameEndingWith("a");
         itr5.forEach(System.out::println);
         System.out.println("-----------------6----------------");
         List<Actor> itr6=repo.findByIdBetween(5,10);
         itr6.forEach(System.out::println);
         System.out.println("-----------------7----------------");
         List<Actor> itr7=repo.findByAnameLikeIgnoreCase("H%");
         itr7.forEach(System.out::println);
         System.out.println("-----------------8----------------");
         List<Actor> itr8=repo.findByAnameLikeIgnoreCase("%K");
         itr8.forEach(System.out::println);
         System.out.println("-----------------9----------------");
         List<Actor> itr9=repo.findByAnameLike("_____");
         itr9.forEach(System.out::println);
         System.out.println("----------------10----------------");
         List<Actor> itr10=repo.findByIdGreaterThanEqual(10);
         itr10.forEach(System.out::println);
         System.out.println("----------------11----------------");
         List<Actor> itr11=repo.findByIdLessThanEqual(5);
         itr11.forEach(System.out::println);
         System.out.println("----------------12----------------");
         List<Actor> itr12=repo.findByAnameIn(List.of("Vijay","Deepika","Abhisek"));
         itr12.forEach(System.out::println);
         System.out.println("----------------13----------------");
         List<Actor> itr13=repo.findByAnameInIgnoreCase(List.of("vijay","deepika","abhisek"));
         itr13.forEach(System.out::println);
         System.out.println("----------------14----------------");
         List<Actor> itr14=repo.findByIdLessThanEqualAndAnameContainingIgnoreCase(10,"ee");
         itr14.forEach(System.out::println);
         System.out.println("----------------15----------------");
         List<Actor> itr15=repo.findByAnameInIgnoreCaseAndCategoryContaining(List.of("deepika","abhisek","vijay"),"Actress");
         itr15.forEach(System.out::println);
         System.out.println("----------------16----------------");
         List<Actor> itr16=repo.findByAnameInIgnoreCaseOrCategoryContaining(List.of("deepika","abhisek","vijay"),"Actress");
         itr16.forEach(System.out::println);

	}

}
