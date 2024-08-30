package com.nt.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.document.Sport;
import com.nt.repository.ISportRepo;
@Service
public class SportMgmtServiceImpl implements ISportMgmtService {

	@Autowired
	private ISportRepo sportRepo;
	
	@Override
	public String registerSportWithPlayerAndMedal(List<Sport> sports) {

        List<Sport> list=sportRepo.saveAll(sports);
        String[] idVal=new String[list.size()];
        for(int i=0;i<idVal.length;i++)
        	idVal[i]=String.valueOf(list.get(i).getSid());
		return "Sport document is registered with id value:"+Arrays.toString(idVal);
	}

	@Override
	public List<Sport> showAllSportsInfo() {
		return sportRepo.findAll();
	}

}
