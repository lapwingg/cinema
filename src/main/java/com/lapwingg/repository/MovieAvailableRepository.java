package com.lapwingg.repository;

import com.lapwingg.model.MovieAvailable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieAvailableRepository extends CrudRepository<MovieAvailable, Integer> {
}
