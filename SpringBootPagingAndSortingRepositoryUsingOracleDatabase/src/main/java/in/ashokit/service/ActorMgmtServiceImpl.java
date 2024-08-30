package in.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import in.ashokit.entity.Actor;
import in.ashokit.repo.IActorRepository;

@Service
public class ActorMgmtServiceImpl implements IActorMgmtService {

	@Autowired
	private IActorRepository actorRepo;
	
	@Override
	public Iterable<Actor> showActorsByOrder(boolean asc, String... properties) {
		//prepare Sort object
	     Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, properties);
	     // get records  by applying sorting
	     Iterable<Actor> it=actorRepo.findAll(sort);
		return it;
	}

	@Override
	public Page<Actor> showPageRecords(int pageNo, int pageSize) {
		// create Pageable object
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		// get given Page records
		Page<Actor> page=actorRepo.findAll(pageable);
		return page;
	}

	@Override
	public void showActorsByPage(int pageSize) {
		long recordsCount=actorRepo.count();
		long pagesCount=recordsCount/pageSize;
		  pagesCount=(recordsCount%pageSize==0)?pagesCount:++pagesCount;
		  
		  for(int i=0;i<pagesCount;++i) {
			  Pageable pageable=PageRequest.of(i, pageSize);
			  Page<Actor> page=actorRepo.findAll(pageable);
			  System.out.println((i+1)+" page records ::");
			  page.getContent().forEach(System.out::println);
		  }

	}

	@Override
	public void showActorsByPageInSortingOrder(int pageNo, int pageSize, boolean order, String... properties) {
		Sort sort=Sort.by(order?Direction.ASC:Direction.DESC, properties);
		Pageable pageable=PageRequest.of(pageNo, pageSize, sort);
		Page<Actor> page=actorRepo.findAll(pageable);
		List<Actor> list=page.getContent();
		list.forEach(System.out::println);
		
		
		
	}

}
