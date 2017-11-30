package uk.ac.belfastmet.buildings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.buildings.service.BuildingService;



@Controller
@RequestMapping("/")
public class BuildingsController {

	@Autowired
	private BuildingService buildingService;

	@GetMapping("/largestFloorArea")
	public String largestFloorArea(Model model) {
		this.buildingService = new BuildingService();
		model.addAttribute("buildings",this.buildingService.getLargestFloorArea());
		return "largestFloorArea";
	}
	
	@GetMapping("/")
	public String home(Model model) {
		
		return "homePage";
	}
	
	@GetMapping("/largestFootprint")
	public String largestFootprint(Model model) {
		this.buildingService = new BuildingService();
		model.addAttribute("buildings",this.buildingService.getLargestFootprint());
		return "largestFootprint";
	}
	
	@GetMapping("/largestUsableVolume")
	public String largestUsableVolume(Model model) {
		this.buildingService = new BuildingService();
		model.addAttribute("buildings",this.buildingService.getLargestUsableArea());
		return "largestUsableVolume";
	}
	
	
}
