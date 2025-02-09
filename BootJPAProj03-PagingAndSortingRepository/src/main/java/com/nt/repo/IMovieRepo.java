package com.nt.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.Movie;

public interface IMovieRepo extends PagingAndSortingRepository<Movie, Integer> {

}
