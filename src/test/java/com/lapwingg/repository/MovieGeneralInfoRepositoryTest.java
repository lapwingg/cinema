package com.lapwingg.repository;

import com.lapwingg.model.MovieGeneralInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MovieGeneralInfoRepositoryTest {
	@MockBean
	private MovieGeneralInfoRepository movieGeneralInfoRepository;

	@Test
	public void addingElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);

		Mockito.when(movieGeneralInfoRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		movieGeneralInfoRepository.save(movieGeneralInfo);

		Mockito.when(movieGeneralInfoRepository.count()).thenReturn(1L);
	}
}
