package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.service.IMovieMgmt;

@Component
public class MovieRunner implements CommandLineRunner {
	
	@Autowired
	private IMovieMgmt movieMgmt;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Movie movie = new Movie();
//		Here, we cannot set id bcos it is auto incrementing
//		movie.setMovieId(001);
		movie.setMovieName("Chhava");
		movie.setMovieRating(4.9f);
		movie.setReleaseYear("2025");
		
		try {
			System.out.println(movieMgmt.registerMovie(movie));
		} catch (Exception e) {
			e.printStackTrace();
		};
	}

}
