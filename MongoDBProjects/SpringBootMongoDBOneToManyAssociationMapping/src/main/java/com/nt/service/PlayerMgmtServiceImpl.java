package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Player;
import com.nt.repository.IPlayerRepo;

@Service
public class PlayerMgmtServiceImpl implements IPlayerMgmtService {

	@Autowired
	private IPlayerRepo playerRepo;

	@Override
	public String registerPlayerWithSportAndMedal(Player player) {
        Integer idVal=playerRepo.save(player).getPid();
		return "Player is registered with the id value:"+idVal;
	}

	@Override
	public List<Player> showPlayerInfo() {
		return playerRepo.findAll();
	}

}
