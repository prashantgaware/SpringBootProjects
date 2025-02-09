package com.nt.service;

import com.nt.entity.Movie;
import java.util.*;

import org.springframework.data.domain.Page;

public interface IMovieMgmt {
	
	Iterable<Movie> displayMoviesBySort(boolean asc, String ... args);
	
	Page<Movie> generateReport(int pageNo, int pageSize, boolean asc, String...args);
}
