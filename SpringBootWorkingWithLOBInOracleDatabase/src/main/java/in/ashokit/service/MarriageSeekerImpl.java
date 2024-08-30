package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.entity.MarriageSeeker;
import in.ashokit.repo.MarriageRepository;

@Service
public class MarriageSeekerImpl implements IMarriageSeeker {

	@Autowired
	private MarriageRepository repo;
	@Override
	public String registerMarriageSeeker(MarriageSeeker seeker) {
		Long idVal=repo.save(seeker).getMid();
		return "Marriage Seeker is registered with id value:"+idVal;
	}
	@Override
	public MarriageSeeker getMarriageSeekerDetailsByiId(Long id) {
		
		return repo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
	}

}
