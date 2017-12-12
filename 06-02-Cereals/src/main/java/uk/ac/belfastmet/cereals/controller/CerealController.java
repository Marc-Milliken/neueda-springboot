package uk.ac.belfastmet.cereals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
		model.addAttribute("cereal", cerealRepository.findByOrderByCerealId());
		return "cerealPage";
	}

}
