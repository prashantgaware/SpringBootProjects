package com.nt.service;

import com.nt.entity.Movie;
import java.util.*;

public interface IMovieMgmt {
	
	String registerMovie(Movie movie);
	
	long fetchMovieCount();
	
	boolean checkMovieById(int id);

	Iterable<Movie> findAllMovies();
	
	Iterable<Movie> fetchAllMoviesByIds(List<Integer> ids);
	
	Movie fetchMovieById(int id);
	
	Movie fetchOptionalMovieById(int id);
	
	Optional<Movie> getherMovieById(int id);
	
	String saveAllMovies(List<Movie> movies);
	
	String updateMovieDetails(int id, String year, float rating);
	
	String deleteMovieById(int id);
	
	String deleteAllById(List<Integer> ids);
	
	String deleteByMovieObj(Movie m);
	
	String deleteMovies(List<Movie> movies);
	
	String deleteAllMovies();
}
