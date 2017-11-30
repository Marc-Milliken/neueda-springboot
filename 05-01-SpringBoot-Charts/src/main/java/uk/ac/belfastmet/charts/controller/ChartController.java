package uk.ac.belfastmet.charts.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.charts.service.ChartService;

@Controller
@RequestMapping("/")
public class ChartController {

	@Autowired
	private ChartService chartService;
	
	@GetMapping("/")
	public String home(Model model) {
		
		return "homePage";
	}

	@GetMapping("/rockSingles")
	public String rockSingles(Model model) {
		this.chartService = new ChartService();
		model.addAttribute("charts",this.chartService.getRockSingles());
		return "rockSingles";
	}
	
	
	
	@GetMapping("/rockAlbums")
	public String rockAlbums(Model model) {
		this.chartService = new ChartService();
		model.addAttribute("charts",this.chartService.getRockAlbums());
		return "rockAlbums";
	}
	
	
	
}
