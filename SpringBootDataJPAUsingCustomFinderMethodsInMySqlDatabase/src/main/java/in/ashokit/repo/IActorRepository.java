package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import in.ashokit.entity.Actor;

public interface IActorRepository extends JpaRepository<Actor, Integer> {

	public List<Actor> findByAnameEquals(String name);
	public List<Actor> findByAnameIs(String name);
	public List<Actor> findByAnameIgnoreCase(String name);
	public List<Actor> findByAnameContaining(String word);
	public List<Actor> findByAnameStartingWith(String initValue);
	public List<Actor> findByAnameEndingWith(String lastValue);
	public List<Actor> findByIdBetween(Integer a,Integer b);
	public List<Actor> findByAnameLikeIgnoreCase(String name);
	public List<Actor> findByAnameLike(String name);
	public List<Actor> findByIdGreaterThanEqual(Integer a);
	public List<Actor> findByIdLessThanEqual(Integer b);
	public List<Actor> findByAnameIn(List<String> name);
	public List<Actor> findByAnameInIgnoreCase(List<String> name);
	public List<Actor> findByIdLessThanEqualAndAnameContainingIgnoreCase(Integer a,String word);
	public List<Actor> findByAnameInIgnoreCaseAndCategoryContaining(List<String> names,String category);
	public List<Actor> findByAnameInIgnoreCaseOrCategoryContaining(List<String> names,String category);
	
}