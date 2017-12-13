package uk.ac.belfastmet.titanic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import uk.ac.belfastmet.titanic.domain.Passenger;
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
		
		@GetMapping("/passengers/view/{passengerId}")
		public String view(@PathVariable("passengerId") Integer passengerId, Model model) {
			model.addAttribute("pageTitle", "View Passengers");
			model.addAttribute("passenger", passengerRepoistory.findOne(passengerId));
			return "viewPassengerPage";
		}
		
		@GetMapping("/passengers/add")
		public String add(Model model) {
			model.addAttribute("pageTitle", "Add Passenger");
			model.addAttribute("passenger", new Passenger());
			return "editPassengerPage";
		}
		
		@GetMapping("/passengers/edit/{passengerId}")
		public String edit(@PathVariable("passengerId") Integer passengerId, Model model) {
			model.addAttribute("pageTitle", "Edit Passenger");
			model.addAttribute("passenger", passengerRepoistory.findOne(passengerId));
			
			return "editPassengerPage";
		}
		
		@GetMapping("/passengers/delete/{passengerId}")
		public String delete(@PathVariable("passengerId") Integer passengerId, RedirectAttributes redirectAttributes) {
			
			passengerRepoistory.delete(passengerId);
			redirectAttributes.addFlashAttribute("message", "Passenger was Deleted");
			
			return "redirect:/passengers";
		}
		
		@PostMapping("/passengers/save")
		public String save(@Valid Passenger passenger, BindingResult bindingResult, Model model) {

			if(bindingResult.hasErrors()) {
				
				return "editPassengerPage";
				
			}else {
				
				Passenger savedPassenger = passengerRepoistory.save(passenger);
				return "redirect:/passengers/view/" + savedPassenger.getPassengerId();
				
			}
			
		}
		
		
		@GetMapping("/passengers/survivors")
		public String survivors(Model model) {
			model.addAttribute("passengers", passengerRepoistory.findBySurvived(1));
			return "passengersPage";
		}
		
		@GetMapping("/passengers/victims")
		public String victims(Model model) {
			model.addAttribute("passengers", passengerRepoistory.findBySurvived(0));
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
