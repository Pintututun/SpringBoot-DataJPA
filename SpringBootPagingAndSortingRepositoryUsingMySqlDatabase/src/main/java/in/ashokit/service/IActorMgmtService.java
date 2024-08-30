package in.ashokit.service;

import org.springframework.data.domain.Page;

import in.ashokit.entity.Actor;

public interface IActorMgmtService {
	 public  Iterable<Actor>   showActorsByOrder(boolean asc,String ...properties);
     public  Page<Actor>  showPageRecords(int pageNo,int pageSize);
     public   void   showActorsByPage(int pageSize);
     public void showActorsByPageInSortingOrder(int pageNo,int pageSize,boolean order,String... properties);
    
	
}
