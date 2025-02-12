package com.nt.service;

import java.util.*;

import com.nt.entity.Movie;

public interface IMovieMgmt {
	
	String removeMoviesByIds(List<Integer> ids);
	
	List<Movie> serachMoviesByMovie(Movie movie, boolean asc, String ... args);
	
	Movie searchMovieById(int id);
}
