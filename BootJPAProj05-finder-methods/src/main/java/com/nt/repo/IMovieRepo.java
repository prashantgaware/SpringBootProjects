package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	List<Movie> findByMovieName(String name);
	
	List<Movie> findByMovieRating(Float rating);
	
	List<Movie> findByReleaseYear(String year);
	
	List<Movie> findByMovieNameAndMovieRating(String name, Float rating);
	
	List<Movie> findByMovieNameOrReleaseYear(String name, String year);
	
	List<Movie> findByMovieNameLike(String pattern);
	
	List<Movie> findByMovieNameNotLike(String pattern);
	
	List<Movie> findByMovieNameStartingWith(String prefix);
	
	List<Movie> findByMovieNameEndingWith(String suffix);
	
	List<Movie> findByMovieNameContaining(String substring);
	
	List<Movie> findByMovieNameNot(String name);
	
	List<Movie> findByMovieRatingBetween(Float start, Float end);
	
	List<Movie> findByMovieRatingLessThan(Float rating);		
	
	List<Movie> findByMovieRatingGreaterThan(Float rating);
	
	List<Movie> findAll();
	
	long count();

}
