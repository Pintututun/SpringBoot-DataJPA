package com.nt.service;

import java.util.List;

import com.nt.document.Sport;

public interface ISportMgmtService {

	public String registerSportWithPlayerAndMedal(List<Sport> sports);
	public List<Sport> showAllSportsInfo();
}
