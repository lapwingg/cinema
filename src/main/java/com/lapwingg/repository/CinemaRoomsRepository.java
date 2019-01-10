package com.lapwingg.repository;

import com.lapwingg.model.CinemaRooms;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaRoomsRepository extends CrudRepository<CinemaRooms, Integer> {
}
