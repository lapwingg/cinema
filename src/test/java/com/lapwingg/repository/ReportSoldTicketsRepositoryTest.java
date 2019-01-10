package com.lapwingg.repository;

import com.lapwingg.model.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ReportSoldTicketsRepositoryTest {
	@MockBean
	private CinemaRoomsRepository cinemaRoomsRepository;
	@MockBean
	private MovieGeneralInfoRepository movieGeneralInfoRepository;
	@MockBean
	private CinemaSchedulerRepository cinemaSchedulerRepository;
	@MockBean
	private ClientRepository clientRepository;
	@MockBean
	private ReportSoldTicketsRepository reportSoldTicketsRepository;

	@Test
	public void addingElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		CinemaRooms cinemaRooms = new CinemaRooms("Oxford", 100);
		cinemaRoomsRepository.save(cinemaRooms);
		CinemaScheduler cinemaScheduler = new CinemaScheduler(cinemaRooms, movieGeneralInfo, "2018.10.10", null);
		cinemaSchedulerRepository.save(cinemaScheduler);
		Client client = new Client("Kamil", "Czajka");
		clientRepository.save(client);
		ReportSoldTickets reportSoldTickets = new ReportSoldTickets(cinemaScheduler, client, 20);
		reportSoldTicketsRepository.save(reportSoldTickets);

		Mockito.when(reportSoldTicketsRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		MovieGeneralInfo movieGeneralInfo = new MovieGeneralInfo("Harry Potter", 2000, 180, "Awesome", 12);
		movieGeneralInfoRepository.save(movieGeneralInfo);
		CinemaRooms cinemaRooms = new CinemaRooms("Oxford", 100);
		cinemaRoomsRepository.save(cinemaRooms);
		CinemaScheduler cinemaScheduler = new CinemaScheduler(cinemaRooms, movieGeneralInfo, "2018.10.10", null);
		cinemaSchedulerRepository.save(cinemaScheduler);
		Client client = new Client("Kamil", "Czajka");
		clientRepository.save(client);
		ReportSoldTickets reportSoldTickets = new ReportSoldTickets(cinemaScheduler, client, 20);
		reportSoldTicketsRepository.save(reportSoldTickets);
		reportSoldTicketsRepository.save(reportSoldTickets);

		Mockito.when(reportSoldTicketsRepository.count()).thenReturn(1L);

	}
}
