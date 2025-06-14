package com.nt.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
//			System.out.println(movieMgmt.registerMovie(movie));
		} catch (Exception e) {
			e.printStackTrace();
		};
		
		System.out.println("*********** count() ***********");
		try {
			System.out.println(movieMgmt.fetchMovieCount());
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("*********** existById() ***********");
		try {
			System.out.println("Is there? " + movieMgmt.checkMovieById(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("********** FindAll() **********");
		try {
			Iterable<Movie> movies = movieMgmt.findAllMovies();
			movies.forEach(m -> System.out.println(m));
			System.out.println("----------");
			movies.forEach(System.out::print);
			System.out.println();
			System.out.println("----------");
			Arrays.asList(movies).stream().forEach(System.out::print);
			System.out.println();
			System.out.println("---------");
			for (Movie m : movies)
				System.out.println(m);
			System.out.println("----------");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("****** findAllByID() ********");
		try {
			List<Integer> ids = new ArrayList<>();
			ids.add(1); ids.add(5);
			System.out.println(movieMgmt.fetchAllMoviesByIds(ids));
			System.out.println("--------------");
			System.out.println(movieMgmt.fetchAllMoviesByIds(List.of(2,5,3)));
			System.out.println("-------------");
			System.out.println(movieMgmt.fetchAllMoviesByIds(Arrays.asList(3,6,44)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("****** Optional Api findById() **********");
		try {
			System.out.println(movieMgmt.fetchMovieById(2));
			System.out.println("---------");
			System.out.println("If movie not present :");
			System.out.println(movieMgmt.fetchMovieById(56));
			System.out.println("----------------");
			System.out.println(movieMgmt.fetchOptionalMovieById(2));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("********Return optiona object *******");
		try {
			System.out.println(movieMgmt.getherMovieById(2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("****** saveAll() **********");
		try {
//			Movie movie1 = new Movie();
//			movie1.setMovieName("Inception");
//			movie1.setMovieRating(8.8f);
//			movie1.setReleaseYear("2010");
//
//			Movie movie2 = new Movie();
//			movie2.setMovieName("The Dark Knight");
//			movie2.setMovieRating(9.0f);
//			movie2.setReleaseYear("2008");
//
//			Movie movie3 = new Movie();
//			movie3.setMovieName("Interstellar");
//			movie3.setMovieRating(8.6f);
//			movie3.setReleaseYear("2014");
			
			Movie movie1 = new Movie("Avengers: Endgame", 8.4f, "2019");
			Movie movie2 = new Movie("Joker", 8.4f, "2019");
			Movie movie3 = new Movie("Dune", 8.1f, "2021");

//			System.out.println(movieMgmt.saveAllMovies(Arrays.asList(movie1, movie2, movie3)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("********save() **********");
		try {
			System.out.println(movieMgmt.updateMovieDetails(5, "2009", 9.9f));
			System.out.println("If record is not there : ");
			System.out.println(movieMgmt.updateMovieDetails(65, "2009", 9.9f));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("********deleteById()");
		try {
			System.out.println(movieMgmt.deleteMovieById(58));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("*******deleteAllByID() **********");
		try {
//			System.out.println(movieMgmt.deleteAllById(Arrays.asList(64,32,54)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("********delete() with object ***********");
		try {
			System.out.println(movieMgmt.deleteByMovieObj(new Movie("Dune", 8.1f, "2021")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("*******deleteAllById(List<Movie> movies)");
		try {
			System.out.println(movieMgmt.deleteMovies(Arrays.asList(new Movie("Avengers: Endgame", 8.4f, "2019"), new Movie("Joker", 8.4f, "2019"))));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("******deleteAll()**************");
		try {
//			System.out.println(movieMgmt.deleteAllMovies());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
