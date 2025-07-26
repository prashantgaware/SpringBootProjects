package com.nt.service;

import java.util.List;

import com.nt.entity.Actor;

public interface IActorServiceMgmt {
	
	Actor getActor(Long id);
	
	String createActor(Actor actor);
	
	Iterable<Actor> getAllActors();
	
	List<Long> createActors(List<Actor> actors);

}
