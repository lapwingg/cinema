package com.lapwingg.model.compositePK;

import com.lapwingg.model.DirectorsOfMovie;
import com.lapwingg.model.MovieGeneralInfo;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieDirectorsId implements Serializable {
	@OneToOne
	@JoinColumn(name = "DirectorsOfMovieId", referencedColumnName = "id")
	private DirectorsOfMovie directorsOfMovie;
	@OneToOne
	@JoinColumn(name = "MovieGeneralInfoId", referencedColumnName = "id")
	private MovieGeneralInfo movieGeneralInfoId;

	public MovieDirectorsId(){

	}

	public MovieDirectorsId(DirectorsOfMovie directorsOfMovie, MovieGeneralInfo movieGeneralInfoId) {
		this.directorsOfMovie = directorsOfMovie;
		this.movieGeneralInfoId = movieGeneralInfoId;
	}

	public DirectorsOfMovie getDirectorsOfMovie() {
		return directorsOfMovie;
	}

	public void setDirectorsOfMovie(DirectorsOfMovie directorsOfMovie) {
		this.directorsOfMovie = directorsOfMovie;
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
		MovieDirectorsId that = (MovieDirectorsId) o;
		return Objects.equals(directorsOfMovie, that.directorsOfMovie) &&
				Objects.equals(movieGeneralInfoId, that.movieGeneralInfoId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(directorsOfMovie, movieGeneralInfoId);
	}
}
