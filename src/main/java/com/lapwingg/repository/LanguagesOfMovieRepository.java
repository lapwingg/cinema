package com.lapwingg.repository;

import com.lapwingg.model.LanguagesOfMovie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguagesOfMovieRepository extends CrudRepository<LanguagesOfMovie, Integer> {
}
