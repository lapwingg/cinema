package com.lapwingg.repository;

import com.lapwingg.model.TechnologiesOfMovie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TechnologiesOfMovieRepositoryTest {
	@MockBean
	private TechnologiesOfMovieRepository technologiesOfMovieRepository;

	@Test
	public void addingElemTest(){
		TechnologiesOfMovie technologiesOfMovie = new TechnologiesOfMovie("2d");
		technologiesOfMovieRepository.save(technologiesOfMovie);

		Mockito.when(technologiesOfMovieRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		TechnologiesOfMovie technologiesOfMovie = new TechnologiesOfMovie("2d");
		technologiesOfMovieRepository.save(technologiesOfMovie);
		technologiesOfMovieRepository.save(technologiesOfMovie);

		Mockito.when(technologiesOfMovieRepository.count()).thenReturn(1L);
	}
}
