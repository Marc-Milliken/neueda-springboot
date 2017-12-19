package uk.ac.belfastmet.constituencies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.constituencies.domain.AllMembers;


@Controller
@RequestMapping("/")
public class ConstituencyController {

	@GetMapping("/")
	public String home(Model model) {
		
		return "homePage";
	}

	@GetMapping("/members")
	public String members(Model model) {
		
		model.addAttribute("pageTitle", "MLA Members");
		
		String mlaMembersUrl = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembers";
		
		RestTemplate restTemplate = new RestTemplate();
		
		AllMembers allMembers = restTemplate.getForObject(mlaMembersUrl, AllMembers.class);
		
		model.addAttribute("member", allMembers.getAllMembers());
		
		return "members";
	}
	
	
}
