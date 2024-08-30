package com.nt.runner;

import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Medal;
import com.nt.document.Sport;
import com.nt.service.IPlayerMgmtService;

@Component
public class DisplayingPlayerInformationRunner implements CommandLineRunner {

	@Autowired
	private IPlayerMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {
       service.showPlayerInfo().forEach(per->{
    	   System.out.println("Parent :"+per);
    	   Set<Sport> sports=per.getSportsInfo();
    	   sports.forEach(sport->{
    		   System.out.println("Child:"+sport);
    	   });
    	   Map<String,Medal> medals=per.getMedalsInfo();
    	   medals.forEach((type,medal)->{
    		   System.out.println("Child2:"+type+"...."+medal);
    	   });
       });
         
	}

}
