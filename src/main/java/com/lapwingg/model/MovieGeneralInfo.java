package com.lapwingg.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MovieGeneralInfo")
public class MovieGeneralInfo implements Serializable {
	@Id
	@SequenceGenerator(name = "movieGeneralInfoId", sequenceName = "Movie_General_Info_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Movie_General_Info_Id")
	@Column(name = "Id")
	private int id;
	@Column(name = "Title")
	private String title;
	@Column(name = "ProductionYear")
	private int productionYear;
	@Column(name = "LengthMinutes")
	private int lengthMinutes;
	@Column(name = "Description")
	private String description;
	@Column(name = "AgeLimitAbove")
	private int ageLimitAbove;

	public MovieGeneralInfo(){

	}

	public MovieGeneralInfo(String title, int productionYear, int lengthMinutes, String description, int ageLimitAbove) {
		this.title = title;
		this.productionYear = productionYear;
		this.lengthMinutes = lengthMinutes;
		this.description = description;
		this.ageLimitAbove = ageLimitAbove;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public int getLengthMinutes() {
		return lengthMinutes;
	}

	public void setLengthMinutes(int lengthMinutes) {
		this.lengthMinutes = lengthMinutes;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAgeLimitAbove() {
		return ageLimitAbove;
	}

	public void setAgeLimitAbove(int ageLimitAbove) {
		this.ageLimitAbove = ageLimitAbove;
	}
}
