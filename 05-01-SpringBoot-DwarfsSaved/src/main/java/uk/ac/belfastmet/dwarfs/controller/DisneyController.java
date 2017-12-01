package uk.ac.belfastmet.dwarfs.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repositories.DwarfRepository;

@Controller
@RequestMapping("/")
public class DisneyController {

	@Autowired
	DwarfRepository dwarfRepoistory;
	
	public DisneyController(DwarfRepository dwarfRepoistory) {
		this.dwarfRepoistory = dwarfRepoistory;
	}

	@GetMapping("/disney")
	public String disney(Model model) {
		model.addAttribute("pageTitle","Disney!");
		model.addAttribute("dwarfs", dwarfRepoistory.findByAuthorOrName("Disney", "Thorin"));
		return "disneyPage";
	}
	
	@GetMapping("/tolkien")
	public String tolkien(Model model) {
		model.addAttribute("pageTitle","Tolkien!");
		model.addAttribute("dwarfs", dwarfRepoistory.findByAuthor("Tolkien"));
		return "tolkienPage";
	}
	
	@GetMapping("/")
	public String home(Model model) {
		
		return "homePage";
	}
	
}
