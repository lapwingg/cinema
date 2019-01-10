package com.lapwingg.repository;

import com.lapwingg.model.MovieGeneralInfo;
import com.lapwingg.model.MovieTechnologies;
import com.lapwingg.model.TechnologiesOfMovie;
import com.lapwingg.model.compositePK.MovieTechnologiesId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MovieTechnologiesRepositoryTest {
	@MockBean
	private MovieGeneralInfoRepository movieGeneralInfoRepository;
	@MockBean
	private TechnologiesOfMovieRepository technologiesOfMovieRepository;
	@MockBean
	private MovieTechnologiesRepository movieTechnologiesRepository;

	@Test
	public void addingElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		TechnologiesOfMovie technologiesOfMovie = new TechnologiesOfMovie("2d");
		technologiesOfMovieRepository.save(technologiesOfMovie);
		MovieTechnologies movieTechnologies = new MovieTechnologies(new MovieTechnologiesId(technologiesOfMovie, movieGeneralInfo));
		movieTechnologiesRepository.save(movieTechnologies);

		Mockito.when(movieTechnologiesRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		TechnologiesOfMovie technologiesOfMovie = new TechnologiesOfMovie("2d");
		technologiesOfMovieRepository.save(technologiesOfMovie);
		MovieTechnologies movieTechnologies = new MovieTechnologies(new MovieTechnologiesId(technologiesOfMovie, movieGeneralInfo));
		movieTechnologiesRepository.save(movieTechnologies);
		movieTechnologiesRepository.save(movieTechnologies);

		Mockito.when(movieTechnologiesRepository.count()).thenReturn(1L);
	}
}
