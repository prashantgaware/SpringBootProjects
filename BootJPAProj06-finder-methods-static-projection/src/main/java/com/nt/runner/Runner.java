package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repo.IMovieRepo;
import com.nt.view.IResultView;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		Iterable<IResultView> it = repo.findByMovieIdGreaterThanEqualAndMovieIdLessThanEqual(45, 60);
		it.forEach(view -> {
			System.out.println("model class name : " + view.getClass());
			System.out.println(view.getMovieId() + "   " + view.getMovieName());
		});
		
	}

}
