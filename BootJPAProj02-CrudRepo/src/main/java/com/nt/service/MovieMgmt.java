package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repo.IMovieRepo;

@Service("movieMgmt")
public class MovieMgmt implements IMovieMgmt {

	@Autowired
	private IMovieRepo movieRepo;
	
	@Override
	public String registerMovie(Movie movie) {
		movieRepo.save(movie);
		return "Movie saved";
	}

}
