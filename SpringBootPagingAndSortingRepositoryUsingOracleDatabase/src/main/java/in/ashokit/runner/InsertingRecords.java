package in.ashokit.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.ashokit.entity.Actor;
import in.ashokit.repo.IActorRepository;

//@Component
public class InsertingRecords implements CommandLineRunner {

	@Autowired
	private IActorRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		Actor a1=new Actor("Vijay","Actor",9898989810l);
		Actor a2=new Actor("Abhinash","Actor",9898989820l);
		Actor a3=new Actor("Kartik","Actor",9898989830l);
		Actor a4=new Actor("Abhisek","Actor",9898989840l);
		Actor a5=new Actor("Amitabh","Actor",9898989850l);
		Actor a6=new Actor("Prabhash","Actor",9898989870l);
		Actor a7=new Actor("Katrina","Actress",8898989810l);
		Actor a8=new Actor("Deepika","Actress",7798989810l);
		Actor a9=new Actor("Kareena","Actor",6698989810l);
		Actor a10=new Actor("Kajal","Actress",5598989810l);
		Actor a11=new Actor("Sunny","Actor",4498989820l);
		Actor a12=new Actor("Anjali","Actress",3398989830l);
		Actor a13=new Actor("Adhikara","Actor",7598989840l);
		Actor a14=new Actor("Ramacharan","Actor",9998989850l);
		Actor a15=new Actor("Chiranjibi","Actor",9877989870l);
		Actor a16=new Actor("Babusan","Actor",8898987710l);
		Actor a17=new Actor("Johnlever","Actor",7798989990l);
		Actor a18=new Actor("Sidhanta","Actor",6698933810l);
		
        List<Actor> list=new ArrayList<Actor>(Arrays.asList( a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18));
        repo.saveAll(list);
	}

}
