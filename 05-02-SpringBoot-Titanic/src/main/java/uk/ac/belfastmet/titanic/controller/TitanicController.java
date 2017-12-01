package uk.ac.belfastmet.titanic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.titanic.repository.PassengerRepository;


@Controller
@RequestMapping("/")
public class TitanicController {

		@Autowired
		PassengerRepository passengerRepoistory;
		
		public TitanicController(PassengerRepository passengerRepoistory) {
			this.passengerRepoistory = passengerRepoistory;
		}

		@GetMapping("/")
		public String home(Model model) {
			
			return "homePage";
		}
		
		@GetMapping("/passengers")
		public String passengers(Model model) {
			model.addAttribute("passengers", passengerRepoistory.findByOrderByPassengerId());
			return "passengersPage";
		}
		
		@GetMapping("/passengers/survivors")
		public String survivors(Model model) {
			model.addAttribute("passengers", passengerRepoistory.findBySurvived(1));
			return "passengersPage";
		}
	
		@GetMapping("/passengers/first-class")
		public String firstClassPassengers(Model model) {
			model.addAttribute("passengers", passengerRepoistory.findBypClass(1));
			return "passengersPage";
		}
		
		@GetMapping("/passengers/second-class")
		public String secondClassPassengers(Model model) {
			model.addAttribute("passengers", passengerRepoistory.findBypClass(2));
			return "passengersPage";
		}
		
		@GetMapping("/passengers/third-class")
		public String thirdClassPassengers(Model model) {
			model.addAttribute("passengers", passengerRepoistory.findBypClass(3));
			return "passengersPage";
		}
		
}
