package com.lapwingg.model;

import javax.persistence.*;

@Entity
@Table(name = "Client")
public class Client {
	@Id
	@SequenceGenerator(name = "clientId", sequenceName = "Client_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Client_Id")
	@Column(name = "Id")
	private int id;
	@Column(name = "ClientName")
	private String clientName;
	@Column(name = "ClientSurname")
	private String clientSurname;

	public Client(){

	}

	public Client(String clientName, String clientSurname) {
		this.clientName = clientName;
		this.clientSurname = clientSurname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientSurname() {
		return clientSurname;
	}

	public void setClientSurname(String clientSurname) {
		this.clientSurname = clientSurname;
	}
}
