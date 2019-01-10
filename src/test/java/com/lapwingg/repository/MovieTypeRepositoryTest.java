package com.lapwingg.repository;

import com.lapwingg.model.MovieGeneralInfo;
import com.lapwingg.model.MovieType;
import com.lapwingg.model.TypesOfMovie;
import com.lapwingg.model.compositePK.MovieTypeId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MovieTypeRepositoryTest {
	@MockBean
	private MovieGeneralInfoRepository movieGeneralInfoRepository;
	@MockBean
	private TypesOfMovieRepository typesOfMovieRepository;
	@MockBean
	private MovieTypeRepository movieTypeRepository;

	@Test
	public void addingElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		TypesOfMovie typesOfMovie = new TypesOfMovie("anime");
		typesOfMovieRepository.save(typesOfMovie);
		MovieType movieType = new MovieType(new MovieTypeId(typesOfMovie, movieGeneralInfo));
		movieTypeRepository.save(movieType);

		Mockito.when(movieTypeRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		TypesOfMovie typesOfMovie = new TypesOfMovie("anime");
		typesOfMovieRepository.save(typesOfMovie);
		MovieType movieType = new MovieType(new MovieTypeId(typesOfMovie, movieGeneralInfo));
		movieTypeRepository.save(movieType);
		movieTypeRepository.save(movieType);

		Mockito.when(movieTypeRepository.count()).thenReturn(1L);

	}
}
