package uk.ac.belfastmet.rhi.controller;

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

import uk.ac.belfastmet.rhi.domain.Applicant;
import uk.ac.belfastmet.rhi.repository.ApplicantRepository;


@Controller
@RequestMapping("/")
public class RhiController {

			@Autowired
			ApplicantRepository applicantRepoistory;
			
			public RhiController(ApplicantRepository applicantRepoistory) {
				this.applicantRepoistory = applicantRepoistory;
			}

			@GetMapping("/")
			public String home(Model model) {
				
				return "homePage";
			}
			
			@GetMapping("/applicants")
			public String applicants(Model model) {
				model.addAttribute("applicants", applicantRepoistory.findByOrderByApplicantId());
				return "applicantPage";
			}
	
			@GetMapping("/applicants/view/{applicantId}")
			public String view(@PathVariable("applicantId") Integer applicantId, Model model) {
				model.addAttribute("pageTitle", "View Passengers");
				model.addAttribute("applicant", applicantRepoistory.findOne(applicantId));
				return "viewApplicantPage";
			}
	
			@GetMapping("/applicants/add")
			public String add(Model model) {
				model.addAttribute("pageTitle", "Add Applicant");
				model.addAttribute("applicant", new Applicant());
				return "editApplicantPage";
			}
	
			@GetMapping("/applicants/edit/{applicantId}")
			public String edit(@PathVariable("applicantId") Integer applicantId, Model model) {
				model.addAttribute("pageTitle", "Edit Applicant");
				model.addAttribute("applicant", applicantRepoistory.findOne(applicantId));
				
				return "editApplicantPage";
			}
			
			
			@GetMapping("/applicants/delete/{applicantId}")
			public String delete(@PathVariable("applicantId") Integer applicantId, RedirectAttributes redirectAttributes) {
				
				applicantRepoistory.delete(applicantId);
				redirectAttributes.addFlashAttribute("message", "Applicant was Deleted");
				
				return "redirect:/applicants";
			}
			
			@PostMapping("/applicants/save")
			public String save(@Valid Applicant applicant, BindingResult bindingResult, Model model) {

				if(bindingResult.hasErrors()) {
					
					return "editApplicantPage";
					
				}else {
					
					Applicant savedApplicant = applicantRepoistory.save(applicant);
					return "redirect:/applicants/view/" + savedApplicant.getApplicantId();
					
				}
				
			}
}
