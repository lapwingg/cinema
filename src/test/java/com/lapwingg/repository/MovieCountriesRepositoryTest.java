package com.lapwingg.repository;

import com.lapwingg.model.CountriesOfMovie;
import com.lapwingg.model.MovieCountries;
import com.lapwingg.model.MovieGeneralInfo;
import com.lapwingg.model.compositePK.MovieCountriesId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MovieCountriesRepositoryTest {
	@MockBean
	private CountriesOfMovieRepository countriesOfMovieRepository;
	@MockBean
	private MovieGeneralInfoRepository movieGeneralInfoRepository;
	@MockBean
	private MovieCountriesRepository movieCountriesRepository;

	@Test
	public void addingElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		CountriesOfMovie countriesOfMovie = new CountriesOfMovie("Poland");
		countriesOfMovieRepository.save(countriesOfMovie);
		MovieCountries movieCountries = new MovieCountries(new MovieCountriesId(countriesOfMovie, movieGeneralInfo));
		movieCountriesRepository.save(movieCountries);

		Mockito.when(movieCountriesRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		CountriesOfMovie countriesOfMovie = new CountriesOfMovie("Poland");
		countriesOfMovieRepository.save(countriesOfMovie);
		MovieCountries movieCountries = new MovieCountries(new MovieCountriesId(countriesOfMovie, movieGeneralInfo));
		movieCountriesRepository.save(movieCountries);
		movieCountriesRepository.save(movieCountries);

		Mockito.when(movieCountriesRepository.count()).thenReturn(1L);
	}
}
