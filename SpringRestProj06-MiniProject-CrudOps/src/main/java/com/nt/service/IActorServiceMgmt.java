package com.nt.service;

import java.util.List;

import com.nt.entity.Actor;

public interface IActorServiceMgmt {
	
	Actor getActor(Long id);
	
	String createActor(Actor actor);
	
	Iterable<Actor> getAllActors();
	
	List<Long> createActors(List<Actor> actors);
	
	List<Actor> getActorsByCategories(String category1, String category2, String category3);
	
	Actor updateActor(Actor actor);
	
	String deleteActorById(Long id);

}
