package com.lapwingg.model;

import com.lapwingg.model.compositePK.MovieTypeId;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MovieType")
public class MovieType implements Serializable {
	@EmbeddedId
	private MovieTypeId movieTypeId;

	public MovieType(){

	}

	public MovieType(MovieTypeId movieTypeId) {
		this.movieTypeId = movieTypeId;
	}

	public MovieTypeId getMovieTypeId() {
		return movieTypeId;
	}

	public void setMovieTypeId(MovieTypeId movieTypeId) {
		this.movieTypeId = movieTypeId;
	}
}
