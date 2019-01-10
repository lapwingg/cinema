package com.lapwingg.model;

import javax.persistence.*;

@Entity
@Table(name = "CinemaScheduler")
public class CinemaScheduler {
	@Id
	@SequenceGenerator(name = "cinemaSchedulerId", sequenceName = "Cinema_Scheduler_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Cinema_Scheduler_Id")
	@Column(name = "Id")
	private int id;
	@OneToOne
	@JoinColumn(referencedColumnName = "id", name = "CinemaRoomsId")
	private CinemaRooms cinemaRoomsId;
	@OneToOne
	@JoinColumn(referencedColumnName = "id", name = "MovieId")
	private MovieGeneralInfo movieId;
	@Column(name = "StartDate")
	private String startDate;
	@Column(name = "EndDate", nullable = true)
	private String endDate;

	public CinemaScheduler(){

	}

	public CinemaScheduler(CinemaRooms cinemaRoomsId, MovieGeneralInfo movieId, String startDate, String endDate) {
		this.cinemaRoomsId = cinemaRoomsId;
		this.movieId = movieId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CinemaRooms getCinemaRoomsId() {
		return cinemaRoomsId;
	}

	public void setCinemaRoomsId(CinemaRooms cinemaRoomsId) {
		this.cinemaRoomsId = cinemaRoomsId;
	}

	public MovieGeneralInfo getMovieId() {
		return movieId;
	}

	public void setMovieId(MovieGeneralInfo movieId) {
		this.movieId = movieId;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
