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
		// TODO Auto-generated method stub
		repo.findByMovieName("Joker").forEach(System.out::println);
		
		System.out.println("Movie by rating : ");
		repo.findByMovieRating(8.5f).forEach(System.out::println);
		System.out.println("Movie by year : ");
		repo.findByReleaseYear("2019").forEach(System.out::println);
		System.out.println("Movie by name and rating : ");
		repo.findByMovieNameAndMovieRating("Joker", 8.5f).forEach(System.out::println);
		System.out.println("Movie by name or year : ");
		repo.findByMovieNameOrReleaseYear("Joker", "2019").forEach(System.out::println);
		System.out.println("Movie by name like : ");
		repo.findByMovieNameLike("%Joker%").forEach(System.out::println);
		System.out.println("Movie by name not like : ");
		repo.findByMovieNameNotLike("%Joker%").forEach(System.out::println);
		System.out.println("Movie by name starting with : ");
		repo.findByMovieNameStartingWith("J").forEach(System.out::println);
		System.out.println("Movie by name ending with : ");
		repo.findByMovieNameEndingWith("ker").forEach(System.out::println);
		System.out.println("Movie by name containing : ");
		repo.findByMovieNameContaining("oke").forEach(System.out::println);
		System.out.println("Movie by name not : ");
		repo.findByMovieNameNot("Joker").forEach(System.out::println);
		System.out.println("Movie by rating between : ");
		repo.findByMovieRatingBetween(8.0f, 9.0f).forEach(System.out::println);
		System.out.println("Movie by rating less than : ");
		repo.findByMovieRatingLessThan(8.5f).forEach(System.out::println);
		System.out.println("Movie by rating greater than : ");
		repo.findByMovieRatingGreaterThan(8.5f).forEach(System.out::println);
		System.out.println("All movies : ");
		repo.findAll().forEach(System.out::println);
		System.out.println("Count of movies : " + repo.count());
		
	}
	
}
