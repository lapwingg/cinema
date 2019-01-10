package com.lapwingg.repository;

import com.lapwingg.model.CinemaRooms;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CinemaRoomsRepositoryTest {
	@MockBean
	private CinemaRoomsRepository cinemaRoomsRepository;

	@Test
	public void addingElemTest(){
		CinemaRooms c = new CinemaRooms("Oxford", 100);
		cinemaRoomsRepository.save(c);
		Mockito.when(cinemaRoomsRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		CinemaRooms c = new CinemaRooms("Oxford", 100);
		cinemaRoomsRepository.save(c);
		cinemaRoomsRepository.save(c);
		Mockito.when(cinemaRoomsRepository.count()).thenReturn(1L);
	}
}
