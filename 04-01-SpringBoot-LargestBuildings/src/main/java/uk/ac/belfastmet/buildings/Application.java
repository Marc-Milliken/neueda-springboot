package uk.ac.belfastmet.buildings;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.buildings.domain.Building;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct
	public void createDwarfs() {
		ArrayList<Building> buildings = new ArrayList<Building>();

		Building NewCenturyGlobalCenter = new Building(1, "New Century Global Center", "China", 
				"Chengdu", "1,760,000 m2", "NewCenturyGlobalCenter.png");
		buildings.add(NewCenturyGlobalCenter);

	}

}
