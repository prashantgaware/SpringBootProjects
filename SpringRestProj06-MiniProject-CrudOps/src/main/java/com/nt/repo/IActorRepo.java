package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nt.entity.Actor;

@Repository("actorRepo")
public interface IActorRepo extends JpaRepository<Actor, Long> {
	
	@Query("SELECT a FROM Actor a WHERE a.category IN (:cat1, :cat2, :cat3)")
	List<Actor> fetchActorsByCategories(@Param("cat1") String category1,
	                                     @Param("cat2") String category2,
	                                     @Param("cat3") String category3);


}
