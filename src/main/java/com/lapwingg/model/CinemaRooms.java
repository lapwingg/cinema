package com.lapwingg.model;

import javax.persistence.*;

@Entity
@Table(name = "CinemaRooms")
public class CinemaRooms {
	@Id
	@SequenceGenerator(name = "cinemaRoomsId", sequenceName = "Cinema_Rooms_Id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Cinema_Rooms_Id")
	@Column(name = "Id")
	private int id;
	@Column(name = "RoomName")
	private String roomName;
	@Column(name = "Capacity")
	private int capacity;

	public CinemaRooms(){

	}

	public CinemaRooms(String roomName, int capacity) {
		this.roomName = roomName;
		this.capacity = capacity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}
