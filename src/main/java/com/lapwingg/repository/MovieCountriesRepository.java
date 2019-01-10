package com.lapwingg.repository;

import com.lapwingg.model.MovieCountries;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCountriesRepository extends CrudRepository<MovieCountries, Integer> {
}
