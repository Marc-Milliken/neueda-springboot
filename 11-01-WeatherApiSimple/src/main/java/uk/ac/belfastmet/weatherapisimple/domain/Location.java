package uk.ac.belfastmet.weatherapisimple.domain;

public class Location {

	private String name;
	private Float latitutde;
	private Float Longitude;
	
	public Location() {
		super();
	}

	public Location(String name, Float latitutde, Float longitude) {
		super();
		this.name = name;
		this.latitutde = latitutde;
		Longitude = longitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getLatitutde() {
		return latitutde;
	}

	public void setLatitutde(Float latitutde) {
		this.latitutde = latitutde;
	}

	public Float getLongitude() {
		return Longitude;
	}

	public void setLongitude(Float longitude) {
		Longitude = longitude;
	}

	@Override
	public String toString() {
		return "Location [name=" + name + ", latitutde=" + latitutde + ", Longitude=" + Longitude + "]";
	}

}
