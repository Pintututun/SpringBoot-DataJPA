package com.nt.service;

import java.util.List;

import com.nt.document.Player;

public interface IPlayerMgmtService {

	public String registerPlayerWithSportAndMedal(Player player);
	public List<Player> showPlayerInfo();
}
