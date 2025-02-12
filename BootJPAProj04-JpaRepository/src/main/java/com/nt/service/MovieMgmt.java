package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repo.IMovieRepo;

@Service("movieMgmt")
public class MovieMgmt implements IMovieMgmt {

	@Autowired
	private IMovieRepo movieRepo;

	@Override
	public String removeMoviesByIds(List<Integer> ids) {

		List<Movie> mIds = movieRepo.findAllById(ids);
		long count = mIds.size();
		movieRepo.deleteAllByIdInBatch(ids);
		
		return count + " records removed in batch";
	}

	@Override
	public List<Movie> serachMoviesByMovie(Movie movie, boolean asc, String... args) {
		Example ex = Example.of(movie);
		Sort sort = Sort.by(asc?Direction.ASC:Direction.DESC, args);
		List<Movie> movies = movieRepo.findAll(ex,sort);
		return movies;
	}

	@Override
	public Movie searchMovieById(int id) {
		Movie movie = movieRepo.getById(id);
		if (movie == null) {
			// no need to throw the exception bcos 
			// if record is not here spring itself throws
			// jakarta.persistence.EntityNotFoundException
			throw new IllegalArgumentException("Movie not available");
		} else {
			return movie;
		}
	}

	
}
