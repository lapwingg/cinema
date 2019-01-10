package com.lapwingg.model;

import com.lapwingg.model.compositePK.MovieLanguageId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MovieLanguage")
public class MovieLanguage {
	@EmbeddedId
	private MovieLanguageId movieLanguageId;

	public MovieLanguage(){

	}

	public MovieLanguage(MovieLanguageId movieLanguageId) {
		this.movieLanguageId = movieLanguageId;
	}

	public MovieLanguageId getMovieLanguageId() {
		return movieLanguageId;
	}

	public void setMovieLanguageId(MovieLanguageId movieLanguageId) {
		this.movieLanguageId = movieLanguageId;
	}
}
