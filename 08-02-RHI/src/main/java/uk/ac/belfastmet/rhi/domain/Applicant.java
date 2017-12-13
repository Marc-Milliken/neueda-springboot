package uk.ac.belfastmet.rhi.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Applicant {
	
	@Id
	@GeneratedValue
	private Integer applicantId;
	@NotEmpty
	private String name;
	private String date;
	private String location;
	private String techType;
	private Integer capacity;
	private Double payment;
	
	public Applicant() {
	}

	public Applicant(Integer applicantId, String name, String date, String location, String techType, Integer capacity,
			Double payment) {

		this.applicantId = applicantId;
		this.name = name;
		this.date = date;
		this.location = location;
		this.techType = techType;
		this.capacity = capacity;
		this.payment = payment;
	}

	public Integer getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(Integer applicantId) {
		this.applicantId = applicantId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getTechType() {
		return techType;
	}

	public void setTechType(String techType) {
		this.techType = techType;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

}