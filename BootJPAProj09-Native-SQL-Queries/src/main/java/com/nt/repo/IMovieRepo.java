package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.nt.entity.Movie;

@Transactional
public interface IMovieRepo extends JpaRepository<Movie, Integer> {
	
	@Modifying
    @Query(value = "INSERT INTO Movie_Table (Name, Rating, Year) VALUES (:movieName, :movieRating, :releaseYear)", nativeQuery = true)
    int insertMovie(@Param("movieName") String movieName,
                    @Param("movieRating") Float movieRating,
                    @Param("releaseYear") String releaseYear);
	
}
