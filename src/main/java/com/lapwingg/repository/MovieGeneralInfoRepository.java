package com.lapwingg.repository;

import com.lapwingg.model.MovieGeneralInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieGeneralInfoRepository extends CrudRepository<MovieGeneralInfo, Integer> {

}
