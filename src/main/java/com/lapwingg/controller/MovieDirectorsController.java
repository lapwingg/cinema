package com.lapwingg.controller;

import com.lapwingg.repository.MovieDirectorsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieDirectorsController {
	private MovieDirectorsRepository movieDirectorsRepository;

	public MovieDirectorsController(MovieDirectorsRepository movieDirectorsRepository){
		this.movieDirectorsRepository = movieDirectorsRepository;
	}

	@RequestMapping("/movieDirectors")
	public String getMovieDirectors(Model model){
		model.addAttribute("movieDirectors", movieDirectorsRepository.findAll());

		return "movieDirectors";
	}
}
