package com.lapwingg.repository;

import com.lapwingg.model.TechnologiesOfMovie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologiesOfMovieRepository extends CrudRepository<TechnologiesOfMovie, Integer> {
}
