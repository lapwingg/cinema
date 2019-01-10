package com.lapwingg.model;

import javax.persistence.*;

@Entity
@Table(name = "ReportSoldTickets")
public class ReportSoldTickets {
	@Id
	@SequenceGenerator(name = "reportSoldTicketsId", sequenceName = "Report_Sold_Tickets_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Report_Sold_Tickets_Id")
	@Column(name = "Id")
	private int id;
	@OneToOne
	@JoinColumn(referencedColumnName = "id", name = "CinemaSchedulerId")
	private CinemaScheduler cinemaSchedulerId;
	@OneToOne
	@JoinColumn(referencedColumnName = "id", name = "ClientId")
	private Client clientId;
	@Column(name = "TicketCost")
	private double ticketCost;

	public ReportSoldTickets(){

	}

	public ReportSoldTickets(CinemaScheduler cinemaSchedulerId, Client clientId, float ticketCost) {
		this.cinemaSchedulerId = cinemaSchedulerId;
		this.clientId = clientId;
		this.ticketCost = ticketCost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CinemaScheduler getCinemaSchedulerId() {
		return cinemaSchedulerId;
	}

	public void setCinemaSchedulerId(CinemaScheduler cinemaSchedulerId) {
		this.cinemaSchedulerId = cinemaSchedulerId;
	}

	public Client getClientId() {
		return clientId;
	}

	public void setClientId(Client clientId) {
		this.clientId = clientId;
	}

	public double getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(double ticketCost) {
		this.ticketCost = ticketCost;
	}
}
