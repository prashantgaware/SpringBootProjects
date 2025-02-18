package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "Movie_Table")
@RequiredArgsConstructor
@NoArgsConstructor
public class Movie {
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movieId;
	
	@Column(name = "Name")
	@NonNull
	private String movieName;
	
	@Column(name = "Rating")
	@NonNull
	private Float movieRating;
	
	@Column(name = "Year")
	@NonNull
	private String releaseYear;
}
