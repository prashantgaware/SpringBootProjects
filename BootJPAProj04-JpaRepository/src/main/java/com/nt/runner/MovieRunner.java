package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Movie;
import com.nt.service.IMovieMgmt;

@Component
public class MovieRunner implements CommandLineRunner {
	
	@Autowired
	private IMovieMgmt movieMgmt;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Jpa Repository");
		System.out.println("*******deleteAllByIdInBatch(List<Integer> ids)**********");
		try {
			List<Integer> ids = Arrays.asList(20,26,56);
			System.out.println(movieMgmt.removeMoviesByIds(ids));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("******findAll(Example ex, Sort sort)********");
		try {
			Movie m = new Movie();
			m.setMovieRating(9.4f);
			m.setReleaseYear("2019");
			List<Movie> movie = movieMgmt.serachMoviesByMovie(m, true, "movieName");
			movie.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("******getById(int id)********");
		try {
			Movie movie = movieMgmt.searchMovieById(100);
			System.out.println(movie);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
