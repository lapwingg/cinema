package com.lapwingg.controller;

import com.lapwingg.repository.CountriesOfMovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountriesOfMovieController {
	private CountriesOfMovieRepository countriesOfMovieRepository;

	public CountriesOfMovieController(CountriesOfMovieRepository countriesOfMovieRepository){
		this.countriesOfMovieRepository = countriesOfMovieRepository;
	}

	@RequestMapping("/countriesOfMovie")
	public String getCountriesOfMovie(Model model){
		model.addAttribute("countriesOfMovie", countriesOfMovieRepository.findAll());

		return "countriesOfMovie";
	}
}
