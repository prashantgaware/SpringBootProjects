package com.nt.repo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.nt.entity.Actor;

@SpringBootTest
class ActorRepoTest {
	
	@Autowired
	private IActorRepo actorRepo;

	@Test
	public void getAllActors() {
		try {
			List<Actor> actors = actorRepo.findAll();
			System.out.println(actors.toString());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
		}
	}

}
