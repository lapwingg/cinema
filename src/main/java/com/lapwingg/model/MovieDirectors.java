package com.lapwingg.model;

import com.lapwingg.model.compositePK.MovieDirectorsId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MovieDirectors")
public class MovieDirectors {
	@EmbeddedId
	private MovieDirectorsId movieDirectorsId;

	public MovieDirectors(){

	}

	public MovieDirectors(MovieDirectorsId movieDirectorsId) {
		this.movieDirectorsId = movieDirectorsId;
	}

	public MovieDirectorsId getMovieDirectorsId() {
		return movieDirectorsId;
	}

	public void setMovieDirectorsId(MovieDirectorsId movieDirectorsId) {
		this.movieDirectorsId = movieDirectorsId;
	}
}
