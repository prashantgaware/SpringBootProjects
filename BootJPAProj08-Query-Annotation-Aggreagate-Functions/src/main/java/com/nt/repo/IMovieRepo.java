package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	@Query("Select max(m.movieRating), min(m.movieRating), avg(m.movieRating), sum(m.movieRating) FROM Movie m")
	Object fetchAggregateDataOnMovies();
	
	@Query("SELECT m FROM Movie m WHERE m.movieRating = (SELECT max(m1.movieRating) FROM Movie m1)")
	List<Movie> fetchMaxRatingMovies();
}
