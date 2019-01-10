package com.lapwingg.model.compositePK;

import com.lapwingg.model.MovieGeneralInfo;
import com.lapwingg.model.TypesOfMovie;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieTypeId implements Serializable {
	@OneToOne
	@JoinColumn(name = "TypesOfMovieId", referencedColumnName = "id")
	private TypesOfMovie typesOfMovieId;
	@OneToOne
	@JoinColumn(name = "MovieGeneralInfoId", referencedColumnName = "id")
	private MovieGeneralInfo movieGeneralInfoId;


	public MovieTypeId(){

	}

	public MovieTypeId(TypesOfMovie typesOfMovieId, MovieGeneralInfo movieGeneralInfoId) {
		this.typesOfMovieId = typesOfMovieId;
		this.movieGeneralInfoId = movieGeneralInfoId;
	}

	public TypesOfMovie getTypesOfMovieId() {
		return typesOfMovieId;
	}

	public void setTypesOfMovieId(TypesOfMovie typesOfMovieId) {
		this.typesOfMovieId = typesOfMovieId;
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
		MovieTypeId that = (MovieTypeId) o;
		return Objects.equals(typesOfMovieId, that.typesOfMovieId) &&
				Objects.equals(movieGeneralInfoId, that.movieGeneralInfoId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(typesOfMovieId, movieGeneralInfoId);
	}
}
