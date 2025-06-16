package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.repo.IMovieRepo;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		try {
			System.out.println("------------------------------------------------");
			int count = (int) repo.count();
			System.out.println("Total number of movies: " + count);
			System.out.println("----------------Rows Affected-------------------");
			Movie movie  = new Movie();
			movie.setMovieName("Kings");
			movie.setMovieRating(8.5f);
			movie.setReleaseYear("2022");
			int rowsAffected = repo.insertMovie(
	                movie.getMovieName(),
	                movie.getMovieRating(),
	                movie.getReleaseYear()
	            );

	        System.out.println("Rows affected after inserting a new movie: " + rowsAffected);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
