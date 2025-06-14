package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Movie;
import com.nt.view.IResultView;
import com.nt.view.IResultView2;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	Iterable<IResultView> findByMovieIdGreaterThanEqualAndMovieIdLessThanEqual(int startMovieId, int endMovieId);

	Iterable<IResultView2> findByMovieIdGreaterThanEqualAndMovieIdLessThanEqualAndMovieNameContaining(
			int startMovieId, int endMovieId, String movieNamePattern);
	
	// Additional methods can be added here if needed
	// For example, if you want to find movies by rating or year, you can add methods like:
	 Iterable<IResultView> findByMovieRatingGreaterThan(float rating);
	 Iterable<IResultView2> findByReleaseYear(String year);
	 Iterable<IResultView2> findByMovieNameContaining(String substring);
	 Iterable<IResultView2> findByMovieNameNot(String name);
	 Iterable<IResultView2> findByMovieNameStartingWith(String prefix);
	 Iterable<IResultView2> findByMovieNameEndingWith(String suffix);
	 Iterable<IResultView2> findByMovieNameLike(String pattern);
	 Iterable<IResultView2> findByMovieNameNotLike(String pattern);
	 Iterable<IResultView2> findByMovieNameAndMovieRating(String name, float rating);
}
