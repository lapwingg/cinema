package com.lapwingg.controller;

import com.lapwingg.repository.TypesOfMovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TypesOfMovieController {
	private TypesOfMovieRepository typesOfMovieRepository;

	public TypesOfMovieController(TypesOfMovieRepository typesOfMovieRepository){
		this.typesOfMovieRepository = typesOfMovieRepository;
	}

	@RequestMapping("/typesOfMovie")
	public String getMovieDirectors(Model model){
		model.addAttribute("typesOfMovie", typesOfMovieRepository.findAll());

		return "typesOfMovie";
	}
}
