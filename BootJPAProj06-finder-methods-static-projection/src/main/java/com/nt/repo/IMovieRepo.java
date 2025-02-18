package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Movie;
import com.nt.view.IResultView;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	Iterable<IResultView> findByMovieIdGreaterThanEqualAndMovieIdLessThanEqual(int startMovieId, int endMovieId);

}
