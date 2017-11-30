package uk.ac.belfastmet.charts.domain;

public class Chart {

	private int position;
	private String title;
	private String artist;
	private String image;
	
	public Chart() {
		
	}
	
	public Chart(int position, String title, String artist, String image) {
		
		this.position = position;
		this.title = title;
		this.artist = artist;
		this.image = image;
		
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
}
