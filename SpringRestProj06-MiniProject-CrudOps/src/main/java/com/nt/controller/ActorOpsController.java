package com.nt.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
		try {
			String str = actorServiceMgmt.createActor(actor);
			return new ResponseEntity<String>(str, HttpStatus.CREATED);
		} catch (Exception ex) {
			return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/get")
	public ResponseEntity<?> getAllActors() {
		try {
			return new ResponseEntity<Iterable>(actorServiceMgmt.getAllActors(), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Exception occured: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("/create-all")
	public ResponseEntity<?> createAll(@RequestBody List<Actor> actors) {
		try {
			List<Long> savedAcotrsIds = actorServiceMgmt.createActors(actors);
			return new ResponseEntity<List<Long>>(savedAcotrsIds, HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<List<Long>>(Collections.emptyList(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
