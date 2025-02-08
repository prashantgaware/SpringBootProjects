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

	@Override
	public long fetchMovieCount() {
		return movieRepo.count();
	}

	@Override
	public boolean checkMovieById(int id) {
		// TODO Auto-generated method stub
		return movieRepo.existsById(2);
	}

}
