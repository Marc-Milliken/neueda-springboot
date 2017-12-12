package uk.ac.belfastmet.cereals.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cereal {
	
	@Id
	@GeneratedValue
	private Integer cerealId;
	private String manufacturer;
	private String cereal;
	private Integer energy;
	private Integer calories;
	private Float protein;
	private Float carbohydrate;
	private Float sugars;
	private Float fat;
	private Float saturates;
	private Float fibre;
	private Float sodium;
	private Float salt;
	private Float iron;
	
	public Cereal() {
	}

	public Cereal(Integer cerealId, String manufacturer, String cereal, Integer energy, Integer calories,
			Float protein, Float carbohydrate, Float sugars, Float fat, Float saturates, Float fibre, Float sodium, 
			Float salt, Float iron) {

		this.cerealId = cerealId;
		this.manufacturer = manufacturer;
		this.cereal = cereal;
		this.energy = energy;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrate = carbohydrate;
		this.sugars = sugars;
		this.fat = fat;
		this.saturates = saturates;
		this.fibre = fibre;
		this.sodium = sodium;
		this.salt = salt;
		this.iron = iron;
	}

	public Integer getCerealId() {
		return cerealId;
	}

	public void setCerealId(Integer cerealId) {
		this.cerealId = cerealId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setmanufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCereal() {
		return cereal;
	}

	public void setCereal(String cereal) {
		this.cereal = cereal;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Float getProtein() {
		return protein;
	}

	public void setProtein(Float protein) {
		this.protein = protein;
	}

	public Float getCarbohydrate() {
		return carbohydrate;
	}

	public void setCarbohydrate(Float carbohydrate) {
		this.carbohydrate = carbohydrate;
	}

	public Float getSugars() {
		return sugars;
	}

	public void setSugars(Float sugars) {
		this.sugars = sugars;
	}

	public Float getFat() {
		return fat;
	}

	public void setFat(Float fat) {
		this.fat = fat;
	}

	public Float getSaturates() {
		return saturates;
	}

	public void setSaturates(Float saturates) {
		this.saturates = saturates;
	}

	public Float getFibre() {
		return fibre;
	}

	public void setFibre(Float fibre) {
		this.fibre = fibre;
	}

	public Float getSodium() {
		return sodium;
	}

	public void setSodium(Float sodium) {
		this.sodium = sodium;
	}

	public Float getSalt() {
		return salt;
	}

	public void setSalt(Float salt) {
		this.salt = salt;
	}

	public Float getIron() {
		return iron;
	}

	public void setIron(Float iron) {
		this.iron = iron;
	}

}
