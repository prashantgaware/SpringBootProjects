package com.nt.runner;

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
		System.out.println("Paging And Sorting Repository");
		System.out.println("*******findAll(Sort sort)**********");
		try {
			Iterable<Movie> movieList = movieMgmt.displayMoviesBySort(true, "releaseYear", "movieRating");
			movieList.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("******findAll(Page page)********");
		try {
			Page<Movie> page = movieMgmt.generateReport(3, 4, true, "movieName");
			System.out.println("page number : " + page.getNumber());
			System.out.println("page count : " + page.getTotalPages());
			System.out.println("is it first page : " + page.isFirst());
			System.out.println("is it last page : " + page.isLast());
			System.out.println("page size : " + page.getSize());
			System.out.println("page elements count : " + page.getNumberOfElements());
			if (!page.isEmpty()) {
				List<Movie> movieList = page.getContent();
				movieList.forEach(System.out::println);
			} else {
				System.out.println("Pages not found.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
