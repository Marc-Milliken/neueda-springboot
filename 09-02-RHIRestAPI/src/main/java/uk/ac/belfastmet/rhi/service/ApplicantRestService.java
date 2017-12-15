package uk.ac.belfastmet.rhi.service;

import uk.ac.belfastmet.rhi.domain.Applicant;

public interface ApplicantRestService {

	Iterable<Applicant> list();

	Applicant create(Applicant applicant);

	Applicant read(Integer applicantId);

	Applicant update(Integer applicantId, Applicant applicant);

	void delete(Integer applicantId);

	

	

}
