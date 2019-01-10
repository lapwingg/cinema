package com.lapwingg.model;

import javax.persistence.*;

@Entity
@Table(name = "TechnologiesOfMovie")
public class TechnologiesOfMovie {
	@Id
	@SequenceGenerator(name = "technologiesOfMovieId", sequenceName = "Technologies_Of_Movie_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Technologies_Of_Movie_Id")
	@Column(name = "Id")
	private int id;
	@Column(name = "TechnologyName")
	private String technologyName;

	public TechnologiesOfMovie(){

	}

	public TechnologiesOfMovie(String technologyName) {
		this.technologyName = technologyName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTechnologyName() {
		return technologyName;
	}

	public void setTechnologyName(String technologyName) {
		this.technologyName = technologyName;
	}
}
