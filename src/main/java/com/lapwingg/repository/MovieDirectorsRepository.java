package com.lapwingg.repository;

import com.lapwingg.model.MovieDirectors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieDirectorsRepository extends CrudRepository<MovieDirectors, Integer> {
}
