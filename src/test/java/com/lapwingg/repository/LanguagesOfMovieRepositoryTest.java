package com.lapwingg.repository;

import com.lapwingg.model.DirectorsOfMovie;
import com.lapwingg.model.LanguagesOfMovie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class LanguagesOfMovieRepositoryTest {
	@MockBean
	private LanguagesOfMovieRepository languagesOfMovieRepository;

	@Test
	public void addingElemTest(){
		LanguagesOfMovie languagesOfMovie = new LanguagesOfMovie("PL");
		languagesOfMovieRepository.save(languagesOfMovie);

		Mockito.when(languagesOfMovieRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		LanguagesOfMovie languagesOfMovie = new LanguagesOfMovie("PL");
		languagesOfMovieRepository.save(languagesOfMovie);
		languagesOfMovieRepository.save(languagesOfMovie);

		Mockito.when(languagesOfMovieRepository.count()).thenReturn(1L);
	}
}