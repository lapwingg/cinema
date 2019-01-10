package com.lapwingg.repository;

import com.lapwingg.model.DirectorsOfMovie;
import com.lapwingg.model.MovieDirectors;
import com.lapwingg.model.MovieGeneralInfo;
import com.lapwingg.model.compositePK.MovieDirectorsId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MovieDirectorsRepositoryTest {
	@MockBean
	private DirectorsOfMovieRepository directorsOfMovieRepository;
	@MockBean
	private MovieGeneralInfoRepository movieGeneralInfoRepository;
	@MockBean
	private MovieDirectorsRepository movieDirectorsRepository;

	@Test
	public void addingElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		DirectorsOfMovie directorsOfMovie = new DirectorsOfMovie("Roman", "Polanski");
		directorsOfMovieRepository.save(directorsOfMovie);
		MovieDirectors movieDirectors = new MovieDirectors(new MovieDirectorsId(directorsOfMovie, movieGeneralInfo));
		movieDirectorsRepository.save(movieDirectors);

		Mockito.when(movieDirectorsRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		DirectorsOfMovie directorsOfMovie = new DirectorsOfMovie("Roman", "Polanski");
		directorsOfMovieRepository.save(directorsOfMovie);
		MovieDirectors movieDirectors = new MovieDirectors(new MovieDirectorsId(directorsOfMovie, movieGeneralInfo));
		movieDirectorsRepository.save(movieDirectors);
		movieDirectorsRepository.save(movieDirectors);

		Mockito.when(movieDirectorsRepository.count()).thenReturn(1L);

	}
}
