package com.lapwingg.repository;

import com.lapwingg.model.LanguagesOfMovie;
import com.lapwingg.model.MovieGeneralInfo;
import com.lapwingg.model.MovieLanguage;
import com.lapwingg.model.compositePK.MovieLanguageId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MovieLanguageRepositoryTest {
	@MockBean
	private MovieGeneralInfoRepository movieGeneralInfoRepository;
	@MockBean
	private LanguagesOfMovieRepository languagesOfMovieRepository;
	@MockBean
	private MovieLanguageRepository movieLanguageRepository;

	@Test
	public void addingElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		LanguagesOfMovie languagesOfMovie = new LanguagesOfMovie("PL");
		languagesOfMovieRepository.save(languagesOfMovie);
		MovieLanguage movieLanguage = new MovieLanguage(new MovieLanguageId(languagesOfMovie, movieGeneralInfo));
		movieLanguageRepository.save(movieLanguage);

		Mockito.when(movieLanguageRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		LanguagesOfMovie languagesOfMovie = new LanguagesOfMovie("PL");
		languagesOfMovieRepository.save(languagesOfMovie);
		MovieLanguage movieLanguage = new MovieLanguage(new MovieLanguageId(languagesOfMovie, movieGeneralInfo));
		movieLanguageRepository.save(movieLanguage);
		movieLanguageRepository.save(movieLanguage);

		Mockito.when(movieLanguageRepository.count()).thenReturn(1L);
	}
}
