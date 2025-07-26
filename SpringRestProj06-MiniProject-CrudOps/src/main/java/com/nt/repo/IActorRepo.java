package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.entity.Actor;

@Repository("actorRepo")
public interface IActorRepo extends JpaRepository<Actor, Long> {

}
