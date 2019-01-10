package com.lapwingg.repository;

import com.lapwingg.model.CountriesOfMovie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CountriesOfMovieRepositoryTest {
	@MockBean
	CountriesOfMovieRepository countriesOfMovieRepository;

	@Test
	public void addingElemTest(){
		CountriesOfMovie countriesOfMovie = new CountriesOfMovie("Poland");
		countriesOfMovieRepository.save(countriesOfMovie);

		Mockito.when(countriesOfMovieRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		CountriesOfMovie countriesOfMovie = new CountriesOfMovie("Poland");
		countriesOfMovieRepository.save(countriesOfMovie);
		countriesOfMovieRepository.save(countriesOfMovie);

		Mockito.when(countriesOfMovieRepository.count()).thenReturn(1L);
	}
}
