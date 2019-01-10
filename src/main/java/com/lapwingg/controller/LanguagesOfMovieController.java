package com.lapwingg.controller;

import com.lapwingg.repository.LanguagesOfMovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LanguagesOfMovieController {
	private LanguagesOfMovieRepository languagesOfMovieRepository;

	public LanguagesOfMovieController(LanguagesOfMovieRepository languagesOfMovieRepository){
		this.languagesOfMovieRepository = languagesOfMovieRepository;
	}

	@RequestMapping("/languagesOfMovie")
	public String getLanguagesOfMovie(Model model){
		model.addAttribute("languagesOfMovie", languagesOfMovieRepository.findAll());

		return "languagesOfMovie";
	}
}
