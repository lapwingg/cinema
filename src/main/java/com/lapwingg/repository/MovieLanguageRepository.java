package com.lapwingg.repository;

import com.lapwingg.model.MovieLanguage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieLanguageRepository extends CrudRepository<MovieLanguage, Integer> {
}
