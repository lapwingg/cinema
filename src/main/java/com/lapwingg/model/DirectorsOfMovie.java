package com.lapwingg.model;

import javax.persistence.*;

@Entity
@Table(name = "DirectorsOfMovie")
public class DirectorsOfMovie {
	@Id
	@SequenceGenerator(name = "directorsOfMovieId", sequenceName = "Directors_Of_Movie_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Directors_Of_Movie_Id")
	@Column(name = "Id")
	private int id;
	@Column(name = "DirectorName")
	private String directorName;
	@Column(name = "DirectorSurname")
	private String directorSurname;

	public DirectorsOfMovie(){

	}

	public DirectorsOfMovie(String directorName, String directorSurname) {
		this.directorName = directorName;
		this.directorSurname = directorSurname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getDirectorSurname() {
		return directorSurname;
	}

	public void setDirectorSurname(String directorSurname) {
		this.directorSurname = directorSurname;
	}
}
