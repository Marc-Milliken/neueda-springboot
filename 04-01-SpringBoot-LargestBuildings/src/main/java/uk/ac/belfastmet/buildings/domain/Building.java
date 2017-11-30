package uk.ac.belfastmet.buildings.domain;

public class Building {

	private int rank;
	private String name;
	private String country;
	private String place;
	private String measurements;
	private String image;
	
	public Building() {
	}
	
	public Building(int rank, String name, String country, String place, String measurements, 
			String image) {
		this.rank = rank;
		this.name = name;
		this.country = country;
		this.place = place;
		this.measurements = measurements;
		this.image = image;
	}
	
	public void Display() {
		System.out.println("Rank: " + rank);
		System.out.println("Name: " + name);
		System.out.println("Country: " + country);
		System.out.println("Place: " + place);
		System.out.println("Floor Area: " + measurements);
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getMeasurements() {
		return measurements;
	}

	public void setMeasurements(String measurements) {
		this.measurements = measurements;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
}
