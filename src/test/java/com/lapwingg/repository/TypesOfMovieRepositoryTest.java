package com.lapwingg.repository;

import com.lapwingg.model.TypesOfMovie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TypesOfMovieRepositoryTest {
	@MockBean
	private TypesOfMovieRepository typesOfMovieRepository;

	@Test
	public void addingElemTest(){
		TypesOfMovie typesOfMovie = new TypesOfMovie("anime");
		typesOfMovieRepository.save(typesOfMovie);

		Mockito.when(typesOfMovieRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		TypesOfMovie typesOfMovie = new TypesOfMovie("anime");
		typesOfMovieRepository.save(typesOfMovie);
		typesOfMovieRepository.save(typesOfMovie);

		Mockito.when(typesOfMovieRepository.count()).thenReturn(1L);
	}
}
