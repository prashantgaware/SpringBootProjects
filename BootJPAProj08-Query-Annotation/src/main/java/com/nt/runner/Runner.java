package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repo.IMovieRepo;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		try {
			System.out.println("------------------------------------------------");
			repo.searchMoviesByIdRange(117, 240).forEach(System.out::println);
			
			System.out.println("-------------------------------------------------");
			repo.searchMoviesByRatingRange(8.5f, 9.5f).forEach(System.out::println);
			
			System.out.println("-------------------------------------------------");
			repo.getMoviesStartingWith("T").forEach(System.out::println);
			
			System.out.println("Getting all the movies:");
			repo.getAllMovies().forEach(System.out::println);
			
			System.out.println("-------------------------------------------------");
			System.out.println("Count of movies: " + repo.getCountOfMovie());
			
			System.out.println("-------------------------------------------------");
			System.out.println("Updating movie with ID 210 to rating 9.0");
			System.out.println("Rows Affected: " + repo.updateMovie(210, 9.3f));
			repo.findById(210).ifPresentOrElse(
					movie -> System.out.println("Movie updated: " + movie),
					() -> System.out.println("Movie with ID 210 not found."));
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
