package com.lapwingg.repository;

import com.lapwingg.model.DirectorsOfMovie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorsOfMovieRepository extends CrudRepository<DirectorsOfMovie, Integer> {
}
