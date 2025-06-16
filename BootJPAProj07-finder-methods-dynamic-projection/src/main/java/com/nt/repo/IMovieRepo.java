package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Movie;
import com.nt.view.IResultView1;
import com.nt.view.View;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	<T extends View> Iterable<T> findByMovieNameIn(List<String> movies, Class<T> clazz);
	
	<T extends View> Iterable<T> findByMovieRatingBetween(float start, float end, Class<T> clazz);
	
	<T extends View> Iterable<T> findByMovieRatingGreaterThan(float rating, Class<T> clazz);
	
	<T extends View> Iterable<T> findByMovieRatingLessThan(float rating, Class<T> clazz);
	
	<T extends View> Iterable<T> findByMovieRating(float rating, Class<T> clazz);
	
	<T extends View> Iterable<T> findByMovieNameContaining(String substring, Class<T> clazz);
	
	<T extends View> Iterable<T> findByMovieNameNot(String name, Class<T> clazz);

}
