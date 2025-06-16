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
			Object[] results = (Object[]) repo.fetchAggregateDataOnMovies();
			System.out.println("Movie with max rating: " + results[0]);
			System.out.println("Movie with min rating: " + results[1]);
			System.out.println("Average movie rating: " + results[2]);
			System.out.println("Total sum movie ratings: " + results[3]);
			
			System.out.println("-------------------------------------------------");
			System.out.println("Movies with max rating:");
			repo.fetchMaxRatingMovies().forEach(System.out::println);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
