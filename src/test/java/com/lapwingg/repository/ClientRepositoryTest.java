package com.lapwingg.repository;

import com.lapwingg.model.Client;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ClientRepositoryTest {
	@MockBean
	private ClientRepository clientRepository;

	@Test
	public void addingElemTest(){
		Client client = new Client("Kamil", "Czajka");
		clientRepository.save(client);

		Mockito.when(clientRepository.count()).thenReturn(1L);
	}

	@Test
	public void addingTheSameElemTest(){
		Client client = new Client("Kamil", "Czajka");
		clientRepository.save(client);
		clientRepository.save(client);

		Mockito.when(clientRepository.count()).thenReturn(1L);
	}
}
