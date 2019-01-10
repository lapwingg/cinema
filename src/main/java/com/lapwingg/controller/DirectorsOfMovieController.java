package com.lapwingg.controller;

import com.lapwingg.repository.DirectorsOfMovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DirectorsOfMovieController {
	private DirectorsOfMovieRepository directorsOfMovieRepository;

	public DirectorsOfMovieController(DirectorsOfMovieRepository directorsOfMovieRepository){
		this.directorsOfMovieRepository = directorsOfMovieRepository;
	}

	@RequestMapping("/directorsOfMovie")
	public String getDirectorsOfMovie(Model model){
		model.addAttribute("directorsOfMovie", directorsOfMovieRepository.findAll());

		return "directorsOfMovie";
	}
}
