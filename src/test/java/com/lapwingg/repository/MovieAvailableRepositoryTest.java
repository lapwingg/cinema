package com.lapwingg.repository;

import com.lapwingg.model.MovieAvailable;
import com.lapwingg.model.MovieGeneralInfo;
import com.lapwingg.model.compositePK.MovieAvailableId;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class MovieAvailableRepositoryTest {
	@MockBean
	private MovieGeneralInfoRepository movieGeneralInfoRepository;
	@MockBean
	private MovieAvailableRepository movieAvailableRepository;

	@Test
	public void addingElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		MovieAvailable movieAvailable = new MovieAvailable(new MovieAvailableId(movieGeneralInfo), "2018.10.10", null, 20.0);
		movieAvailableRepository.save(movieAvailable);

		Mockito.when(movieAvailableRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		MovieAvailable movieAvailable = new MovieAvailable(new MovieAvailableId(movieGeneralInfo), "2018.10.10", null, 20.0);
		movieAvailableRepository.save(movieAvailable);
		movieAvailableRepository.save(movieAvailable);

		Mockito.when(movieAvailableRepository.count()).thenReturn(1L);
	}
}
