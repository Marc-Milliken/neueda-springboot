package uk.ac.belfastmet.constituencies.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import uk.ac.belfastmet.constituencies.domain.AllMembers;
import uk.ac.belfastmet.constituencies.domain.AllMembersList;
import uk.ac.belfastmet.constituencies.domain.Member;


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
		
		ArrayList<Member> members = allMembers.getAllMembersList().getAllMembers();
		
		model.addAttribute("member", members);
		
		return "members";
	}

	
	@GetMapping("/constituency/{constituencyId}")
	public String event(@PathVariable("constituencyId") Integer constituencyId,  Model model) {
		
		model.addAttribute("pageTitle", "MLA Members");
		String mlaMembersUrl = "http://data.niassembly.gov.uk/members_json.ashx?m=GetAllCurrentMembersByConstituencyId&constituencyId=";
		
		RestTemplate restTemplate = new RestTemplate();
		
		AllMembers allMembers = restTemplate.getForObject(mlaMembersUrl + constituencyId.toString(), AllMembers.class);
		
		ArrayList<Member> members = allMembers.getAllMembersList().getAllMembers();
		
		model.addAttribute("member", members);
		
		return "members";
	}
	
	
	/*@GetMapping("/constituency/{constituencyId}")
	public String singleEvent(Model model, @PathVariable("constituencyId") String constituencyId)
	{
		model.addAttribute("pageTitle", "Constituency");
		
		//using an edited version of the original json because its terrible
		String membersUrl = "https://api.myjson.com/bins/y888n";
		
		RestTemplate restTemplate = new RestTemplate();
		AllMembersList members = restTemplate.getForObject(membersUrl, AllMembersList.class);
		ArrayList<Member> requestedMembers = new ArrayList<Member>();
		

		for(Member member: members.getAllMembers())
		{
			
			if (member.getConstituencyId().equals(constituencyId))
			{
				requestedMembers.add(member);
			}

		}
			
		model.addAttribute("constituency", requestedMembers.get(0).getConstituencyName());
		model.addAttribute("member", requestedMembers);
		return "members";
	}*/
	
}
