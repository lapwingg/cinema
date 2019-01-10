package com.lapwingg.model;

import com.lapwingg.model.compositePK.MovieCountriesId;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MovieCountries")
public class MovieCountries {
	@EmbeddedId
	private MovieCountriesId movieCountriesId;

	public MovieCountries(){

	}

	public MovieCountries(MovieCountriesId movieCountriesId) {
		this.movieCountriesId = movieCountriesId;
	}

	public MovieCountriesId getMovieCountriesId() {
		return movieCountriesId;
	}

	public void setMovieCountriesId(MovieCountriesId movieCountriesId) {
		this.movieCountriesId = movieCountriesId;
	}
}
