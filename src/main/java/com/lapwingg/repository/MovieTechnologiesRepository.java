package com.lapwingg.repository;

import com.lapwingg.model.MovieTechnologies;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieTechnologiesRepository extends CrudRepository<MovieTechnologies, Integer> {
}
