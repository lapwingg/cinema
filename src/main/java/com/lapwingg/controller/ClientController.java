package com.lapwingg.controller;

import com.lapwingg.repository.ClientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {
	private ClientRepository clientRepository;

	public ClientController(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}

	@RequestMapping("/client")
	public String getClients(Model model){
		model.addAttribute("client", clientRepository.findAll());

		return "client";
	}
}