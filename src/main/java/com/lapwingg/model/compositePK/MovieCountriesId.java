package com.lapwingg.model.compositePK;

import com.lapwingg.model.CountriesOfMovie;
import com.lapwingg.model.MovieGeneralInfo;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieCountriesId implements Serializable {
	@OneToOne
	@JoinColumn(name = "CountriesOfMovieId", referencedColumnName = "id")
	private CountriesOfMovie countriesOfMovie;
	@OneToOne
	@JoinColumn(name = "MovieGeneralInfoId", referencedColumnName = "id")
	private MovieGeneralInfo movieGeneralInfoId;

	public MovieCountriesId(){

	}

	public MovieCountriesId(CountriesOfMovie countriesOfMovie, MovieGeneralInfo movieGeneralInfoId) {
		this.countriesOfMovie = countriesOfMovie;
		this.movieGeneralInfoId = movieGeneralInfoId;
	}

	public CountriesOfMovie getCountriesOfMovie() {
		return countriesOfMovie;
	}

	public void setCountriesOfMovie(CountriesOfMovie countriesOfMovie) {
		this.countriesOfMovie = countriesOfMovie;
	}

	public MovieGeneralInfo getMovieGeneralInfoId() {
		return movieGeneralInfoId;
	}

	public void setMovieGeneralInfoId(MovieGeneralInfo movieGeneralInfoId) {
		this.movieGeneralInfoId = movieGeneralInfoId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MovieCountriesId that = (MovieCountriesId) o;
		return Objects.equals(countriesOfMovie, that.countriesOfMovie) &&
				Objects.equals(movieGeneralInfoId, that.movieGeneralInfoId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(countriesOfMovie, movieGeneralInfoId);
	}
}
