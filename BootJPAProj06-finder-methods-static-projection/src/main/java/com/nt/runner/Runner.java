package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repo.IMovieRepo;
import com.nt.view.IResultView;
import com.nt.view.IResultView2;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		Iterable<IResultView> it = repo.findByMovieIdGreaterThanEqualAndMovieIdLessThanEqual(160, 210);
		it.forEach(view -> {
//			System.out.println("model class name : " + view.getClass());
			System.out.println(view.getMovieId() + "   " + view.getMovieName());
		});
		
		System.out.println("-------------------------------------------------");
		
		Iterable<IResultView2> it2 = repo.findByMovieIdGreaterThanEqualAndMovieIdLessThanEqualAndMovieNameContaining(160, 210, "Avengers");
		it2.forEach(view2 -> {
			System.out.println(
					view2.getMovieId()
					+ "   " + view2.getMovieName()
					+ "   " + view2.getReleaseYear()
					+ "   " + view2.getMovieRating());
		});
		
		System.out.println("-------------------------------------------------");
		repo.findByMovieIdGreaterThanEqualAndMovieIdLessThanEqualAndMovieNameContaining(160, 210, "Avengers")
			.forEach(System.out::println);
		System.out.println("-------------------------------------------------");
		repo.findByMovieIdGreaterThanEqualAndMovieIdLessThanEqual(160, 210)
			.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------");
		repo.findByMovieIdGreaterThanEqualAndMovieIdLessThanEqualAndMovieNameContaining(160, 210, "Avengers")
			.forEach(view3 -> {
				System.out.println(
						view3.getMovieId()
						+ "   " + view3.getMovieName()
						+ "   " + view3.getReleaseYear()
						+ "   " + view3.getMovieRating());
			});
		
		System.out.println("-------------------------------------------------");
		repo.findByMovieIdGreaterThanEqualAndMovieIdLessThanEqual(160, 210)
			.forEach(view3 -> {
				System.out.println(view3.getMovieId() + "   " + view3.getMovieName());
			});
		System.out.println("-------------------------------------------------");
		repo.findByMovieIdGreaterThanEqualAndMovieIdLessThanEqual(160, 210)
			.forEach(System.out::println);
		System.out.println("-------------------------------------------------");
		
		repo.findByMovieIdGreaterThanEqualAndMovieIdLessThanEqual(160, 210)
			.forEach(view3 -> {
				System.out.println(
						view3.getMovieId()
						+ "   " + view3.getMovieName());
			});
		
	}

}
