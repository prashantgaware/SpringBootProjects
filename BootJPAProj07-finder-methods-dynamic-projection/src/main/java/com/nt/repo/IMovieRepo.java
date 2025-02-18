package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Movie;
import com.nt.view.IResultView1;
import com.nt.view.View;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	<T extends View> Iterable<T> findByMovieNameIn(List<String> movies, Class<T> clazz);

}
