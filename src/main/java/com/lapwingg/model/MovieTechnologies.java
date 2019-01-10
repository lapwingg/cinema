package com.lapwingg.model;

import com.lapwingg.model.compositePK.MovieTechnologiesId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MovieTechnologies")
public class MovieTechnologies {
	@EmbeddedId
	private MovieTechnologiesId movieTechnologiesId;

	public MovieTechnologies(){

	}

	public MovieTechnologies(MovieTechnologiesId movieTechnologiesId) {
		this.movieTechnologiesId = movieTechnologiesId;
	}

	public MovieTechnologiesId getMovieTechnologiesId() {
		return movieTechnologiesId;
	}

	public void setMovieTechnologiesId(MovieTechnologiesId movieTechnologiesId) {
		this.movieTechnologiesId = movieTechnologiesId;
	}
}
