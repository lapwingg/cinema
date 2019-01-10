package com.lapwingg.controller;

import com.lapwingg.repository.MovieAvailableRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieAvailableController {
	private MovieAvailableRepository movieAvailableRepository;

	public MovieAvailableController(MovieAvailableRepository movieAvailableRepository){
		this.movieAvailableRepository = movieAvailableRepository;
	}

	@RequestMapping("/movieAvailable")
	public String getMovieAvailable(Model model){
		model.addAttribute("movieAvailable", movieAvailableRepository.findAll());

		return "movieAvailable";
	}
}
