package com.lapwingg.controller;

import com.lapwingg.repository.CinemaSchedulerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CinemaSchedulerController {
	private CinemaSchedulerRepository cinemaSchedulerRepository;

	public CinemaSchedulerController(CinemaSchedulerRepository cinemaSchedulerRepository) {
		this.cinemaSchedulerRepository = cinemaSchedulerRepository;
	}

	@RequestMapping("/cinemaScheduler")
	public String getCinemaScheduler(Model model){
		model.addAttribute("cinemaScheduler", cinemaSchedulerRepository.findAll());

		return "cinemaScheduler";
	}
}