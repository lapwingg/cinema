package com.lapwingg.repository;

import com.lapwingg.model.CinemaScheduler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaSchedulerRepository extends CrudRepository<CinemaScheduler, Integer> {
}
