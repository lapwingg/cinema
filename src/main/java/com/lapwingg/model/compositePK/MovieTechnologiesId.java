package com.lapwingg.model.compositePK;

import com.lapwingg.model.MovieGeneralInfo;
import com.lapwingg.model.TechnologiesOfMovie;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieTechnologiesId implements Serializable {
	@OneToOne
	@JoinColumn(name = "TechnologiesOfMovieId", referencedColumnName = "id")
	private TechnologiesOfMovie technologiesOfMovieId;
	@OneToOne
	@JoinColumn(name = "MovieGeneralInfoId", referencedColumnName = "id")
	private MovieGeneralInfo movieGeneralInfoId;

	public MovieTechnologiesId(){

	}

	public MovieTechnologiesId(TechnologiesOfMovie technologiesOfMovieId, MovieGeneralInfo movieGeneralInfoId) {
		this.technologiesOfMovieId = technologiesOfMovieId;
		this.movieGeneralInfoId = movieGeneralInfoId;
	}

	public TechnologiesOfMovie getTechnologiesOfMovieId() {
		return technologiesOfMovieId;
	}

	public void setTechnologiesOfMovieId(TechnologiesOfMovie technologiesOfMovieId) {
		this.technologiesOfMovieId = technologiesOfMovieId;
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
		MovieTechnologiesId that = (MovieTechnologiesId) o;
		return Objects.equals(technologiesOfMovieId, that.technologiesOfMovieId) &&
				Objects.equals(movieGeneralInfoId, that.movieGeneralInfoId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(technologiesOfMovieId, movieGeneralInfoId);
	}
}
