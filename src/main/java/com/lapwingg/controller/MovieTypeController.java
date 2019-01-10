package com.lapwingg.controller;

import com.lapwingg.repository.MovieTypeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieTypeController {
	private MovieTypeRepository movieTypeRepository;

	public MovieTypeController(MovieTypeRepository movieTypeRepository){
		this.movieTypeRepository = movieTypeRepository;
	}

	@RequestMapping("/movieType")
	public String getMovieType(Model model){
		model.addAttribute("movieType", movieTypeRepository.findAll());

		return "movieType";
	}
}
