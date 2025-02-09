package com.nt.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repo.IMovieRepo;

@Service("movieMgmt")
public class MovieMgmt implements IMovieMgmt {

	@Autowired
	private IMovieRepo movieRepo;

	@Override
	public Iterable<Movie> displayMoviesBySort(boolean asc, String... args) {
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, args);
		return movieRepo.findAll(sort);
	}

	@Override
	public Page<Movie> generateReport(int pageNo, int pageSize, boolean asc, String... args) {
		Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(asc ? Direction.ASC : Direction.DESC, args));
		Page<Movie> page = movieRepo.findAll(pageable);
		return page;
	}
	
	

}
