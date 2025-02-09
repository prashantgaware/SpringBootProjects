package com.nt.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

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

	@Override
	public Iterable<Movie> findAllMovies() {
		
		return movieRepo.findAll();
	}

	@Override
	public Iterable<Movie> fetchAllMoviesByIds(List<Integer> ids) {
		
		return movieRepo.findAllById(ids);
	}

	@Override
	public Movie fetchMovieById(int id) {
		Optional<Movie> opt = movieRepo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		} else {
			return new Movie();
		}
	}

	@Override
	public Movie fetchOptionalMovieById(int id) {
		return movieRepo.findById(id)
				.orElse(new Movie());
	}

	@Override
	public Optional<Movie> getherMovieById(int id) {
		Optional<Movie> opt = movieRepo.findById(id);
		return opt.isEmpty() ? Optional.empty() : opt;
	}

	@Override
	public String saveAllMovies(List<Movie> movies) {
		Iterable<Movie> savedMovies = movieRepo.saveAll(movies);
		List<Integer> movieIds = new ArrayList<Integer>();
		if (savedMovies != null && ((List<Movie>) savedMovies).size() > 0) {
			savedMovies.forEach(m -> {
				movieIds.add(m.getMovieId());
			});
		}
		return movieIds.toString();
	}

	@Override
	public String updateMovieDetails(int id, String year, float rating) {
		Optional<Movie> opt = movieRepo.findById(id);
		if (opt.isPresent()) {
			Movie movie = opt.get();
			movie.setMovieRating(rating);
			movie.setReleaseYear(year);
			movieRepo.save(movie);
			return "Movie updated with " + id;
		} else {
			return "Movie not found with " + id;
		}
	}

	@Override
	public String deleteMovieById(int id) {
		movieRepo.deleteById(id);
		return "Movie with " + id + " deleted";
	}

	@Override
	public String deleteAllById(List<Integer> ids) {
		movieRepo.deleteAllById(ids);
		return "deleted mvies";
	}

	@Override
	public String deleteByMovieObj(Movie m) {
		movieRepo.delete(m);
		return m.getMovieName() + " deleted.";
	}

	@Override
	public String deleteMovies(List<Movie> movies) {
		List<String> names = new ArrayList<>();
		for (Movie movie : movies) {
			names.add(movie.getMovieName());
		}
		movieRepo.deleteAll(movies);
		return "Deleted movies: " + names.toString();
	}

	@Override
	public String deleteAllMovies() {
		long count = movieRepo.count();
		if (count != 0) {
			movieRepo.deleteAll();
		}
		return count + " mvies deleted.";
	}

}
