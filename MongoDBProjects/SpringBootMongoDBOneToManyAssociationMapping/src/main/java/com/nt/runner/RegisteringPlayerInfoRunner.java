package com.nt.runner;

import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.Medal;
import com.nt.document.Player;
import com.nt.document.Sport;
import com.nt.service.IPlayerMgmtService;

@Component
public class RegisteringPlayerInfoRunner implements CommandLineRunner {

	@Autowired
	private IPlayerMgmtService service;
	
	@Override
	public void run(String... args) throws Exception {

		try {
        Sport sport1=new Sport(new Random().nextInt(1000),"Badminton",new String[]{"Racket","Shocks","Net"});
        Sport sport2=new Sport(new Random().nextInt(1000),"Tennis",new String[] {"Racket","Tennis Ball","Net"});
        
        Medal medal1=new Medal("Olympic-Gold","Gold","Tokyo_Olympic","Tokyo");
        Medal medal2=new Medal("Cwg-silver","Silver","Cwg-Japan","Tokyo");
        
        Player player=new Player(new Random().nextInt(1000),"Sindhu","Hyd",25,Set.of(sport1,sport2),Map.of("Medal1",medal1,"Medal2",medal2));
        System.out.println(service.registerPlayerWithSportAndMedal(player));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
