package com.lapwingg.controller;

import com.lapwingg.repository.TechnologiesOfMovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TechnologiesOfMovieController {
	private TechnologiesOfMovieRepository technologiesOfMovieRepository;

	public TechnologiesOfMovieController(TechnologiesOfMovieRepository technologiesOfMovieRepository){
		this.technologiesOfMovieRepository = technologiesOfMovieRepository;
	}

	@RequestMapping("/technologiesOfMovie")
	public String getTechnologiesOfMovie(Model model){
		model.addAttribute("technologiesOfMovie", technologiesOfMovieRepository.findAll());

		return "technologiesOfMovie";
	}
}
