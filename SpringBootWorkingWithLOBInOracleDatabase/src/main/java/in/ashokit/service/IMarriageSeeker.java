package in.ashokit.service;

import in.ashokit.entity.MarriageSeeker;

public interface IMarriageSeeker {

	public String registerMarriageSeeker(MarriageSeeker seeker);
    public MarriageSeeker getMarriageSeekerDetailsByiId(Long id);
    
    
}

