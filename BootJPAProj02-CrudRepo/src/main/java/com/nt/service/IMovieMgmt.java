package com.nt.service;

import com.nt.entity.Movie;

public interface IMovieMgmt {
	
	String registerMovie(Movie movie);
	
	long fetchMovieCount();
	
	boolean checkMovieById(int id);

}
