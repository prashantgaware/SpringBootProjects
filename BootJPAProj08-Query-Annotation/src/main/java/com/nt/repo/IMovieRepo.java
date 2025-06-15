package com.nt.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Movie;

public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	@Query("Select m FROM Movie m WHERE m.movieId BETWEEN :min AND :max")
	List<Movie> searchMoviesByIdRange(int min, int max);
	
	@Query("Select m FROM Movie m WHERE m.movieRating >= :minRating AND m.movieRating <= :maxRating")
	List<Movie> searchMoviesByRatingRange(float minRating, float maxRating);
	
	@Query("Select m FROM Movie m WHERE m.movieName LIKE CONCAT(:prefix, '%')")
	List<Movie> getMoviesStartingWith(String prefix);
	
	@Query("Select m FROM Movie m")
	List<Movie> getAllMovies();
	
	@Query("Select count(m) FROM Movie m")
	int getCountOfMovie();
	
	// this two annotations are required when we are updating or inserting records 
	@Modifying
	@Transactional
	@Query("UPDATE Movie m SET m.movieRating = :rating WHERE m.movieId = :id")
	int updateMovie(int id, float rating);
	
}
