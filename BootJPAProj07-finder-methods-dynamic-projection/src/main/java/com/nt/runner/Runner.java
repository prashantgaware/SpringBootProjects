package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repo.IMovieRepo;
import com.nt.view.IResultView1;
import com.nt.view.IResultView2;
import com.nt.view.IResultView3;

@Component
public class Runner implements CommandLineRunner {
	
	@Autowired
	private IMovieRepo repo;

	@Override
	public void run(String... args) throws Exception {
		
		Iterable<IResultView1> it1 = repo.findByMovieNameIn(List.of("Frozen","Memento","Zootopia"), IResultView1.class);
		it1.forEach(view1 -> {
			System.out.println("model class name : " + view1.getClass());
			System.out.println(view1.getMovieId() + "   " + view1.getMovieName());
		});
		System.out.println("***************");
		Iterable<IResultView2> it2 = repo.findByMovieNameIn(List.of("Cars","Joker"), IResultView2.class);
		it2.forEach(view2 -> {
			System.out.println("model class name : " + view2.getClass());
			System.out.println(view2.getMovieId() + "   " + view2.getMovieName() + "  " + view2.getReleaseYear());
		});
		System.out.println("***************");
		Iterable<IResultView3> it3 = repo.findByMovieNameIn(List.of("Se7en","Arrival","Parasite"), IResultView3.class);
		it3.forEach(view3 -> {
			System.out.println("model class name : " + view3.getClass());
			System.out.println(view3.getMovieId() + "   " + view3.getMovieName() + "  " + view3.getMovieRating());
		});
		
		System.out.println("***************");
		Iterable<IResultView1> it4 = repo.findByMovieRatingBetween(8.0f, 9.0f, IResultView1.class);
		it4.forEach(view1 -> {
			System.out.println("model class name : " + view1.getClass());
			System.out.println(view1.getMovieId() + "   " + view1.getMovieName());
		});
		
		System.out.println("***************");
		Iterable<IResultView2> it5 = repo.findByMovieRatingBetween(8.0f, 9.0f, IResultView2.class);
		it5.forEach(view2 -> {
			System.out.println("model class name : " + view2.getClass());
			System.out.println(view2.getMovieId() + "   " + view2.getMovieName() + "  " + view2.getReleaseYear());
		});
		
		System.out.println("***************");
		Iterable<IResultView3> it6 = repo.findByMovieRatingGreaterThan(0.0f, IResultView3.class);
		it6.forEach(view3 -> {
			System.out.println("model class name : " + view3.getClass());
			System.out.println(view3.getMovieId() + "   " + view3.getMovieName() + "  " + view3.getMovieRating());
		});
		
		System.out.println("***************");
		Iterable<IResultView1> it7 = repo.findByMovieRatingLessThan(10.0f, IResultView1.class);
		it7.forEach(view1 -> {
			System.out.println("model class name : " + view1.getClass());
			System.out.println(view1.getMovieId() + "   " + view1.getMovieName());
		});
		
		System.out.println("***************");
		Iterable<IResultView2> it8 = repo.findByMovieRating(10.0f, IResultView2.class);
		it8.forEach(view2 -> {
			System.out.println("model class name : " + view2.getClass());
			System.out.println(view2.getMovieId() + "   " + view2.getMovieName() + "  " + view2.getReleaseYear());
		});
		
		System.out.println("***************");
		Iterable<IResultView3> it9 = repo.findByMovieNameContaining("Avengers", IResultView3.class);
		it9.forEach(view3 -> {
			System.out.println("model class name : " + view3.getClass());
			System.out.println(view3.getMovieId() + "   " + view3.getMovieName() + "  " + view3.getMovieRating());
		});
		
		System.out.println("***************");
		Iterable<IResultView1> it10 = repo.findByMovieNameNot("Avengers", IResultView1.class);
		it10.forEach(view1 -> {
			System.out.println("model class name : " + view1.getClass());
			System.out.println(view1.getMovieId() + "   " + view1.getMovieName());
		});
	}

}
