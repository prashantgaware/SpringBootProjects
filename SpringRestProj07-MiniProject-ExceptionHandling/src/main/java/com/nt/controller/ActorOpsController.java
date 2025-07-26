package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Actor;
import com.nt.service.IActorServiceMgmt;

@RestController
@RequestMapping("/actor")
public class ActorOpsController {

	@Autowired
	private IActorServiceMgmt actorServiceMgmt;

	@GetMapping("/get/{id}")
	public ResponseEntity<Actor> get(@PathVariable Long id) {
		Actor actor = actorServiceMgmt.getActor(id);
		return new ResponseEntity<Actor>(actor, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> create(@RequestBody Actor actor) {
		String str = actorServiceMgmt.createActor(actor);
		return new ResponseEntity<String>(str, HttpStatus.CREATED);
	}

	@GetMapping("/get")
	public ResponseEntity<?> getAllActors() {
		return new ResponseEntity<Iterable>(actorServiceMgmt.getAllActors(), HttpStatus.OK);
	}

	@PostMapping("/create-all")
	public ResponseEntity<?> createAll(@RequestBody List<Actor> actors) {
		List<Long> savedAcotrsIds = actorServiceMgmt.createActors(actors);
		return new ResponseEntity<List<Long>>(savedAcotrsIds, HttpStatus.OK);
	}

	@GetMapping("/get/{category1}/{category2}/{category3}")
	public ResponseEntity<?> getActorsByCategories(@PathVariable String category1, @PathVariable String category2,
			@PathVariable String category3) {
		List<Actor> actors = actorServiceMgmt.getActorsByCategories(category1, category2, category3);
		return new ResponseEntity<List<Actor>>(actors, HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<?> updateActor(@RequestBody Actor actor) {
		Actor ac = actorServiceMgmt.updateActor(actor);
		return new ResponseEntity<Actor>(actor, HttpStatus.OK);
	}

	@DeleteMapping("delete/{id}")
	public ResponseEntity<?> deleteById(@PathVariable Long id) {
		String msg = actorServiceMgmt.deleteActorById(id);
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
