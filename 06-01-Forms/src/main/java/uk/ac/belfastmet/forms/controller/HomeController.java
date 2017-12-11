package uk.ac.belfastmet.forms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		
		return "formPage";
	}
	
	@PostMapping("/result")
	public String postresult(@RequestParam("firstname")String firstName, @RequestParam("lastname") String lastName, 
			@RequestParam("gender")String gender, Model model) {
		model.addAttribute("firstname", firstName);
		model.addAttribute("lastname", lastName);
		model.addAttribute("gender", gender);
		return "resultPage";
	}
	
	@GetMapping("/result")
	public String getresult(Model model) {
		model.addAttribute("firstname", "Chuck");
		model.addAttribute("lastname", "Norris");
		model.addAttribute("gender", "All of them");
		return "resultPage";
	}

}
