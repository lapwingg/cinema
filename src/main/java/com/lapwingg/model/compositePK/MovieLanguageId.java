package com.lapwingg.model.compositePK;

import com.lapwingg.model.LanguagesOfMovie;
import com.lapwingg.model.MovieGeneralInfo;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieLanguageId implements Serializable {
	@OneToOne
	@JoinColumn(name = "LanguagesOfMovieId", referencedColumnName = "id")
	private LanguagesOfMovie languagesOfMovie;
	@OneToOne
	@JoinColumn(name = "MovieGeneralInfoId", referencedColumnName = "id")
	private MovieGeneralInfo movieGeneralInfoId;

	public MovieLanguageId(){

	}

	public MovieLanguageId(LanguagesOfMovie languagesOfMovie, MovieGeneralInfo movieGeneralInfoId) {
		this.languagesOfMovie = languagesOfMovie;
		this.movieGeneralInfoId = movieGeneralInfoId;
	}

	public LanguagesOfMovie getLanguagesOfMovie() {
		return languagesOfMovie;
	}

	public void setLanguagesOfMovie(LanguagesOfMovie languagesOfMovie) {
		this.languagesOfMovie = languagesOfMovie;
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
		MovieLanguageId that = (MovieLanguageId) o;
		return Objects.equals(languagesOfMovie, that.languagesOfMovie) &&
				Objects.equals(movieGeneralInfoId, that.movieGeneralInfoId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(languagesOfMovie, movieGeneralInfoId);
	}
}
