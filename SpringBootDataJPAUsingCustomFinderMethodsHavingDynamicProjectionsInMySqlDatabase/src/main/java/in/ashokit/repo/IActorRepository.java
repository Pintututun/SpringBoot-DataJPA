package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import in.ashokit.entity.Actor;
import in.ashokit.view.IResultView;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

	public List<IResultView> findByIdGreaterThanEqualAndIdLessThanEqual(Integer a,Integer b);
	public <T extends IResultView> List<T> findByCategoryEqualsIgnoreCase(String category,Class<T> clazz);
	public <T extends IResultView> List<T> findByAnameStartingWithAndAnameEndingWithAllIgnoreCase(String a,String b,Class<T> clazz);
     
}