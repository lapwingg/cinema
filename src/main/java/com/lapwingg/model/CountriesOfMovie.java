package com.lapwingg.model;

import javax.persistence.*;

@Entity
@Table(name = "CountriesOfMovie")
public class CountriesOfMovie {
	@Id
	@SequenceGenerator(name = "countriesOfMovieId", sequenceName = "Countries_Of_Movie_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Countries_Of_Movie_Id")
	@Column(name = "Id")
	private int id;
	@Column(name = "CountryName")
	private String countryName;

	public CountriesOfMovie(){

	}

	public CountriesOfMovie(String countryName) {
		this.countryName = countryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
}
