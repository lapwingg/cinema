package com.lapwingg.controller;

import com.lapwingg.repository.MovieLanguageRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieLanguageController {
	private MovieLanguageRepository movieLanguageRepository;

	public MovieLanguageController(MovieLanguageRepository movieLanguageRepository){
		this.movieLanguageRepository = movieLanguageRepository;
	}

	@RequestMapping("/movieLanguage")
	public String getMovieDirectors(Model model){
		model.addAttribute("movieLanguage", movieLanguageRepository.findAll());

		return "movieLanguage";
	}
}
