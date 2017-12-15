package uk.ac.belfastmet.rhi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.rhi.domain.Applicant;
import uk.ac.belfastmet.rhi.repository.ApplicantRepository;


@Service
public class ApplicantRestServiceImpl implements ApplicantRestService {

	@Autowired
	private ApplicantRepository applicantRepository;
	
	
	public ApplicantRestServiceImpl(ApplicantRepository applicantRepository) {
		super();
		this.applicantRepository = applicantRepository;
	}

	@Override
	public Iterable<Applicant> list() {
	
		return this.applicantRepository.findAll();
	}

	@Override
	public Applicant create(Applicant applicant) {
		
		return this.applicantRepository.save(applicant);
	}

	@Override
	public Applicant read(Integer applicantId) {
		
		return this.applicantRepository.findOne(applicantId);
	}

	@Override
	public Applicant update(Integer applicantId, Applicant update) {
		
		Applicant applicant = this.applicantRepository.findOne(applicantId);
		applicant.setName(update.getName());
		applicant.setDate(update.getDate());
		applicant.setLocation(update.getLocation());
		applicant.setTechType(update.getTechType());
		applicant.setCapacity(update.getCapacity());
		applicant.setPayment(update.getPayment());

		return applicantRepository.save(applicant);
	
	}

	@Override
	public void delete(Integer applicantId) {
		this.applicantRepository.delete(applicantId);

	}

}