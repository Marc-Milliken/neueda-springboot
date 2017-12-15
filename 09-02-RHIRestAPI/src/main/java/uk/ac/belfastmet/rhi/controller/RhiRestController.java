package uk.ac.belfastmet.rhi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.rhi.domain.Applicant;
import uk.ac.belfastmet.rhi.service.ApplicantRestService;


@RestController
@RequestMapping("/api/applicant")
public class RhiRestController {

	@Autowired
	ApplicantRestService applicantRestService;
	
	public RhiRestController(ApplicantRestService applicantRestService) {

		this.applicantRestService = applicantRestService;
	}
	
	@GetMapping("/")
	public Iterable<Applicant>list(){
		return applicantRestService.list();
	}
	
	@PostMapping("/")
	public Applicant create(@RequestBody Applicant applicant ){
		return applicantRestService.create(applicant);
	}
	
	
	@GetMapping("/{applicantId}")
	public Applicant read(@PathVariable("applicantId") Integer applicantId){
		return applicantRestService.read(applicantId);
	}
	
	
	@PutMapping("/{applicantId}")
	public Applicant update(@PathVariable("applicantId") Integer applicantId, @RequestBody Applicant applicant ){
		return applicantRestService.update(applicantId, applicant);
	}
	
	
	@DeleteMapping("/{applicantId}")
	public void delete(@PathVariable("applicantId") Integer applicantId){
		applicantRestService.delete(applicantId);
	}
	
}
