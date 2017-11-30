package uk.ac.belfastmet.charts.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.charts.domain.Chart;

@Service
public class ChartService {

	private ArrayList<Chart> rockSingles;
	private ArrayList<Chart> rockAlbums;

	public ChartService() {
	}
	
public ArrayList<Chart> getRockSingles(){
		
		rockSingles = new ArrayList<Chart>();
		
		Chart CantStop = new Chart(1, "Can't Stop", "Red Hot Chili Peppers", "CantStop.png");
		rockSingles.add(CantStop);

		Chart BackInBlack = new Chart(2, "Back in Black", "AC/DC", "BackInBlack.png");
		rockSingles.add(BackInBlack);
		
		Chart Iris = new Chart(3, "Iris", "Goo Goo Dolls", "Iris.png");
		rockSingles.add(Iris);
		
		Chart SweetChildOMine = new Chart(4, "Sweet Child O' Mine", "Guns N' Roses", "SweetChildOMine.png");
		rockSingles.add(SweetChildOMine);
		
		Chart Numb = new Chart(5, "Numb", "Linkin Park", "Numb.png");
		rockSingles.add(Numb);
		
		Chart Thunderstruck = new Chart(6, "Thunderstruck", "AC/DC", "Thunderstruck.png");
		rockSingles.add(Thunderstruck);
		
		Chart ImmigrantSong = new Chart(7, "Immigrant Song", "Led Zeppelin", "ImmigrantSong.png");
		rockSingles.add(ImmigrantSong);
		
		Chart DontStopMeNow = new Chart(8, "Don't Stop Me Now", "Queen", "DontStopMeNow.png");
		rockSingles.add(DontStopMeNow);
		
		Chart BohemianRhapsody = new Chart(9, "Bohemian Rhapsody", "Queen", "BohemianRhapsody.png");
		rockSingles.add(BohemianRhapsody);
		
		Chart BringMeToLife = new Chart(10, "Bring Me To Life", "Evanesences", "BringMeToLife.png");
		rockSingles.add(BringMeToLife);
		
		return rockSingles;
	
	}
	
public ArrayList<Chart> getRockAlbums(){
		
		rockAlbums = new ArrayList<Chart>();
		
		Chart THEBOOKOFSOULSLIVECHAPTER = new Chart(1, "The Book of Souls - Live Chapter", "Iron Maiden", 
				 "THEBOOKOFSOULSLIVECHAPTER.png");
		rockAlbums.add(THEBOOKOFSOULSLIVECHAPTER);
		
		Chart GreatestHitsGodsFavourateBand = new Chart(2, "Greatest Hits - Gods Favourate Band", "Green Day", 
				 "GreatestHitsGodsFavourateBand.png");
		rockAlbums.add(GreatestHitsGodsFavourateBand);

		Chart TheEnd = new Chart(3, "The End", "Black Sabbath", "TheEnd.png");
		rockAlbums.add(TheEnd);
		
		Chart ConcreteAndGold = new Chart(4, "Concrete and Gold", "Foo Fighters", "ConcreteAndGold.png");
		rockAlbums.add(ConcreteAndGold);
		
		Chart LiveAtPompeii = new Chart(5, "Live at Pompeii", "David Gilmour", "LiveAtPompeii.png");
		rockAlbums.add(LiveAtPompeii);
		
		Chart Villains = new Chart(6, "Villains", "Queens of the Stone Age", "Villains.png");
		rockAlbums.add(Villains);
		
		Chart HowDidWeGetSoDark = new Chart(7, "How Did We Get So Dark", "Royal Blood", "HowDidWeGetSoDark.png");
		rockAlbums.add(HowDidWeGetSoDark);
		
		Chart Infinite = new Chart(8, "Infinite", "Deep Purple", "Infinite.png");
		rockAlbums.add(Infinite);
		
		Chart WizardBloodyWizard = new Chart(9, "Wizard Bloody Wizard", "Electric Wizard", "WizardBloodyWizard.png");
		rockAlbums.add(WizardBloodyWizard);
		
		Chart TheDarkSideOfTheMoon = new Chart(10, "The Dark Side Of The Moon", "Pink Floyd", 
				"TheDarkSideOfTheMoon.png");
		rockAlbums.add(TheDarkSideOfTheMoon);
		
		
		return rockAlbums;
	
	}
	

	
}
