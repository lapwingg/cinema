package com.lapwingg.repository;

import com.lapwingg.model.CountriesOfMovie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesOfMovieRepository extends CrudRepository<CountriesOfMovie, Integer> {
}
