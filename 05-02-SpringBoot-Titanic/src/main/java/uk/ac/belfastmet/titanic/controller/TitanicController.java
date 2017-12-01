package uk.ac.belfastmet.titanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.repository.TitanicRepository;


@Controller
@RequestMapping("/")
public class TitanicController {

		@Autowired
		TitanicRepository passengerRepoistory;
		
		public TitanicController(TitanicRepository passengerRepoistory) {
			this.passengerRepoistory = passengerRepoistory;
		}

		@GetMapping("/")
		public String home(Model model) {
			
			return "homePage";
		}
		
		@GetMapping("/passengers")
		public String passengers(Model model) {
			model.addAttribute("passengers", passengerRepoistory.findByName("Disney"));
			return "passengersPage";
		}
	
}
