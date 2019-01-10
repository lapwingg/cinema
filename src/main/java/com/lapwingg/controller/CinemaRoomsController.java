package com.lapwingg.controller;

import com.lapwingg.repository.CinemaRoomsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CinemaRoomsController {
	private CinemaRoomsRepository cinemaRoomsRepository;

	public CinemaRoomsController(CinemaRoomsRepository crr){
		this.cinemaRoomsRepository = crr;
	}

	@RequestMapping("/cinemaRooms")
	public String getCinemaRooms(Model model){
		model.addAttribute("cinemaRooms", cinemaRoomsRepository.findAll());

		return "cinemaRooms";
	}
}
