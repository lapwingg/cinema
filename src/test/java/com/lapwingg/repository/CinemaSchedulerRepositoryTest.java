package com.lapwingg.repository;

import com.lapwingg.model.CinemaRooms;
import com.lapwingg.model.CinemaScheduler;
import com.lapwingg.model.MovieGeneralInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CinemaSchedulerRepositoryTest {
	@MockBean
	private CinemaSchedulerRepository cinemaSchedulerRepository;
	@MockBean
	private MovieGeneralInfoRepository movieGeneralInfoRepository;
	@MockBean
	private CinemaRoomsRepository cinemaRoomsRepository;

	@Test
	public void addingElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		MovieGeneralInfo movieGeneralInfo1 = new MovieGeneralInfo("Harry Potter 2", 2002, 176, "Also Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		movieGeneralInfoRepository.save(movieGeneralInfo1);
		CinemaRooms cinemaRooms = new CinemaRooms("Oxford", 100);
		CinemaRooms cinemaRooms1 = new CinemaRooms("Pearl Harbor", 666);
		cinemaRoomsRepository.save(cinemaRooms);
		cinemaRoomsRepository.save(cinemaRooms1);
		CinemaScheduler cinemaScheduler = new CinemaScheduler(cinemaRooms, movieGeneralInfo, "2018.10.10", null);
		cinemaSchedulerRepository.save(cinemaScheduler);

		Mockito.when(cinemaSchedulerRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		MovieGeneralInfo movieGeneralInfo1 = new MovieGeneralInfo("Harry Potter 2", 2002, 176, "Also Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		movieGeneralInfoRepository.save(movieGeneralInfo1);
		CinemaRooms cinemaRooms = new CinemaRooms("Oxford", 100);
		CinemaRooms cinemaRooms1 = new CinemaRooms("Pearl Harbor", 666);
		cinemaRoomsRepository.save(cinemaRooms);
		cinemaRoomsRepository.save(cinemaRooms1);
		CinemaScheduler cinemaScheduler = new CinemaScheduler(cinemaRooms, movieGeneralInfo, "2018.10.10", null);
		cinemaSchedulerRepository.save(cinemaScheduler);
		cinemaSchedulerRepository.save(cinemaScheduler);

		Mockito.when(cinemaSchedulerRepository.count()).thenReturn(1L);
	}
}
