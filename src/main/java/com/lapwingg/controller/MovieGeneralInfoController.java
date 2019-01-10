package com.lapwingg.controller;

import com.lapwingg.repository.MovieGeneralInfoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieGeneralInfoController {
	private MovieGeneralInfoRepository movieGeneralInfoRepository;

	public MovieGeneralInfoController(MovieGeneralInfoRepository movieGeneralInfoRepository){
		this.movieGeneralInfoRepository = movieGeneralInfoRepository;
	}

	@RequestMapping("/movieGeneralInfo")
	public String getMovieGeneralInfo(Model model){
		model.addAttribute("movieGeneralInfo", movieGeneralInfoRepository.findAll());

		return "movieGeneralInfo";
	}
}
