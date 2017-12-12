package uk.ac.belfastmet.cereals.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.cereals.domain.Cereal;
import uk.ac.belfastmet.cereals.repository.CerealRepository;

@Controller
@RequestMapping("/")
public class CerealController {

	@Autowired
	CerealRepository cerealRepository;

	public CerealController(CerealRepository cerealrepository) {
		this.cerealRepository = cerealrepository;
	}

	@GetMapping("/")
	public String home(Model model) {

		return "homePage";
	}

	@GetMapping("/cereals")
	public String cereal(Model model) {
		model.addAttribute("cereals", cerealRepository.findByOrderByCerealId());
		return "cerealPage";
	}
	
	@GetMapping("/cereals/view/{cerealId}")
	public String view(@PathVariable("cerealId") Integer cerealId, Model model) {
		model.addAttribute("pageTitle", "View Cereal");
		model.addAttribute("cereal", cerealRepository.findOne(cerealId));
		return "viewCerealPage";
	}
	
	@GetMapping("/cereals/add")
	public String add(Model model) {
		model.addAttribute("pageTitle", "Add Cereal");
		model.addAttribute("cereal", new Cereal());
		return "editCerealPage";
	}
	
	@PostMapping("/cereals/save")
	public String save(@Valid Cereal cereal, BindingResult bindingResult, Model model) {

		if(bindingResult.hasErrors()) {
			
			return "editCerealPage";
			
		}else {
			
			Cereal savedCereal = cerealRepository.save(cereal);
			return "redirect:/cereals/view/" + savedCereal.getCerealId();
			
		}
		
	}

}
