package com.lapwingg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TypesOfMovie")
public class TypesOfMovie implements Serializable {
	@Id
	@SequenceGenerator(name = "typesOfMovieId", sequenceName = "Types_Of_Movie_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Types_Of_Movie_Id")
	@Column(name = "Id")
	private int id;
	@Column(name = "MovieType")
	private String movieType;

	public TypesOfMovie(){

	}

	public TypesOfMovie(String movieType) {
		this.movieType = movieType;
	}

	public int getId() {
		return id;
	}

	public String getMovieType() {
		return movieType;
	}

	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
}
