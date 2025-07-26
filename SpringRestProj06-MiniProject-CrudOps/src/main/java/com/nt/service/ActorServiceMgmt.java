package com.nt.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repo.IActorRepo;

@Service("actorServiceMgmt")
public class ActorServiceMgmt implements IActorServiceMgmt {

	@Autowired
	private IActorRepo actorRepo;
	
	@Override
	public Actor getActor(Long id) {
		return actorRepo.findById(id).orElseThrow(() -> new IllegalArgumentException());
	}

	@Override
	public String createActor(Actor actor) {
		if (actor != null) {
			Actor a = actorRepo.save(actor);
			return "Actor " + a.getName() + " is saved with id : " + a.getId();
		} else {
			return "Actor is not saved";
		}
	}

	@Override
	public Iterable<Actor> getAllActors() {
		return actorRepo.findAll();
	}

	@Override
	public List<Long> createActors(List<Actor> actors) {
		try {
			List<Actor> savedActors= actorRepo.saveAll(actors);
			return savedActors
					.stream()
					.map(Actor::getId)
					.toList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return Collections.emptyList();
		}
	}

}
