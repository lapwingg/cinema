package com.lapwingg.controller;

import com.lapwingg.repository.ReportSoldTicketsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReportSoldTicketsController {
	private ReportSoldTicketsRepository reportSoldTicketsRepository;

	public ReportSoldTicketsController(ReportSoldTicketsRepository reportSoldTicketsRepository){
		this.reportSoldTicketsRepository = reportSoldTicketsRepository;
	}

	@RequestMapping("/reportSoldTickets")
	public String getReportSoldTickets(Model model){
		model.addAttribute("reportSoldTickets", reportSoldTicketsRepository.findAll());

		return "reportSoldTickets";
	}
}
