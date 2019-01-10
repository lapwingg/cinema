package com.lapwingg.model.compositePK;

import com.lapwingg.model.MovieGeneralInfo;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovieAvailableId implements Serializable {
	@OneToOne
	@JoinColumn(name = "MovieAvalailableId", referencedColumnName = "id")
	private MovieGeneralInfo movieAvailableId;

	public MovieAvailableId(){

	}

	public MovieAvailableId(MovieGeneralInfo movieAvailableId) {
		this.movieAvailableId = movieAvailableId;
	}

	public MovieGeneralInfo getMovieAvailableId() {
		return movieAvailableId;
	}

	public void setMovieAvailableId(MovieGeneralInfo movieAvailableId) {
		this.movieAvailableId = movieAvailableId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		MovieAvailableId that = (MovieAvailableId) o;
		return Objects.equals(movieAvailableId, that.movieAvailableId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(movieAvailableId);
	}
}
