package com.lapwingg.repository;

import com.lapwingg.model.TypesOfMovie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypesOfMovieRepository extends CrudRepository<TypesOfMovie, Integer> {
}
