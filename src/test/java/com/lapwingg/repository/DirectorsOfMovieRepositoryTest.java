package com.lapwingg.repository;

import com.lapwingg.model.DirectorsOfMovie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DirectorsOfMovieRepositoryTest {
	@MockBean
	private DirectorsOfMovieRepository directorsOfMovieRepository;

	@Test
	public void addingElemTest(){
		DirectorsOfMovie directorsOfMovie = new DirectorsOfMovie("Roman", "Polanski");
		directorsOfMovieRepository.save(directorsOfMovie);

		Mockito.when(directorsOfMovieRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		DirectorsOfMovie directorsOfMovie = new DirectorsOfMovie("Roman", "Polanski");
		directorsOfMovieRepository.save(directorsOfMovie);
		directorsOfMovieRepository.save(directorsOfMovie);

		Mockito.when(directorsOfMovieRepository.count()).thenReturn(1L);
	}
}
