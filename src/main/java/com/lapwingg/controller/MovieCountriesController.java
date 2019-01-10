package com.lapwingg.controller;

import com.lapwingg.repository.MovieCountriesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieCountriesController {
	private MovieCountriesRepository movieCountriesRepository;

	public MovieCountriesController(MovieCountriesRepository movieCountriesRepository){
		this.movieCountriesRepository = movieCountriesRepository;
	}

	@RequestMapping("/movieCountries")
	public String getClients(Model model){
		model.addAttribute("movieCountries", movieCountriesRepository.findAll());

		return "movieCountries";
	}
}
