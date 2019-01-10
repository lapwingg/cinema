package com.lapwingg.controller;

import com.lapwingg.repository.MovieTechnologiesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieTechnologiesController {
	private MovieTechnologiesRepository movieTechnologiesRepository;

	public MovieTechnologiesController(MovieTechnologiesRepository movieTechnologiesRepository){
		this.movieTechnologiesRepository = movieTechnologiesRepository;
	}

	@RequestMapping("/movieTechnologies")
	public String getMovieTechnologies(Model model){
		model.addAttribute("movieTechnologies", movieTechnologiesRepository.findAll());

		return "movieTechnologies";
	}
}
