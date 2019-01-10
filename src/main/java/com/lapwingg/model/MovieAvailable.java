package com.lapwingg.model;

import com.lapwingg.model.compositePK.MovieAvailableId;

import javax.persistence.*;

@Entity
@Table(name = "MovieAvailable")
public class MovieAvailable {
	@EmbeddedId
	private MovieAvailableId movieId;
	@Column(name = "StartDate")
	private String startDate;
	@Column(name = "EndDate", nullable = true)
	private String endDate;
	@Column(name = "TicketCost")
	private double ticketCost;

	public MovieAvailable(){

	}

	public MovieAvailable(MovieAvailableId movieId, String startDate, String endDate, double ticketCost) {
		this.movieId = movieId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.ticketCost = ticketCost;
	}

	public MovieAvailableId getMovieId() {
		return movieId;
	}

	public void setMovieId(MovieAvailableId movieId) {
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

	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
}
