package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {

}
