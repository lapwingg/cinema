package com.lapwingg.model;

import javax.persistence.*;

@Entity
@Table(name = "LanguagesOfMovie")
public class LanguagesOfMovie {
	@Id
	@SequenceGenerator(name = "langaugesOfMovieId", sequenceName = "Languages_Of_Movie_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Languages_Of_Movie_Id")
	@Column(name = "Id")
	private int id;
	@Column(name = "LanguageName")
	private String languageName;

	public LanguagesOfMovie(){

	}

	public LanguagesOfMovie(String languageName) {
		this.languageName = languageName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
}
