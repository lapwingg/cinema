package com.lapwingg.repository;

import com.lapwingg.model.MovieType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieTypeRepository extends CrudRepository<MovieType, Integer> {
}
