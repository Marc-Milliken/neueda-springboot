package uk.ac.belfastmet.buildings.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.buildings.domain.Building;


@Service
public class BuildingService {
	
	private ArrayList<Building> largestFloorArea;
	private ArrayList<Building> largestFootprint;
	private ArrayList<Building> largestUsableArea;

	public BuildingService() {
	}
	
	public ArrayList<Building> getLargestFloorArea(){
		
		largestFloorArea = new ArrayList<Building>();
		
		Building NewCenturyGlobalCenter = new Building(1, "New Century Global Center", "China", 
				"Chengdu", "1,760,000 m\u00B2", "NewCenturyGlobalCenter.png");
		largestFloorArea.add(NewCenturyGlobalCenter);
		
		Building DubaiInternationalAirportTerminal3 = new Building(2, 
				"Dubai International Airport Terminal 3", "United Arab Emirates", "Dubai", 
				"1,713,000 m\u00B2", "DubaiInternationalAirportTerminal3.png");
		largestFloorArea.add(DubaiInternationalAirportTerminal3);
		
		Building AbrajAlBaitEndowment = new Building(3, 
				"Abraj Al-Bait Endowment", "Saudi Arabia", "Mecca", 
				"1,575,815 m\u00B2", "AbrajAlBaitEndowment.png");
		largestFloorArea.add(AbrajAlBaitEndowment);
		
		Building CentralWorld = new Building(4, 
				"CentralWorld", "Thailand", "Bangkok", "1,024,000 m\u00B2", "CentralWorld.png");
		largestFloorArea.add(CentralWorld);
		
		Building AalsmeerFlowerAuction = new Building(5, 
				"Aalsmeer Flower Auction", "Netherlands", "Aalsmeer", 
				"990,000 m\u00B2", "AalsmeerFlowerAuction.png");
		largestFloorArea.add(AalsmeerFlowerAuction);
		
		Building BeijingCapitalInternationalAirportTerminal3 = new Building(6, 
				"Beijing Capital International Airport Terminal 3", "China", "Beijing", 
				"986,000 m\u00B2", "BeijingCapitalInternationalAirportTerminal3.png");
		largestFloorArea.add(BeijingCapitalInternationalAirportTerminal3);
		
		Building TheVenetianMacao = new Building(7, 
				"The Venetian Macao", "Macau", " Macau", "980,000 m\u00B2", "TheVenetianMacao.png");
		largestFloorArea.add(TheVenetianMacao);
		
		Building SandsCotaiCentral = new Building(8, 
				"Sands Cotai Central", "Macau", " Macau", "890,000 m\u00B2", "SandsCotaiCentral.png");
		largestFloorArea.add(SandsCotaiCentral);
		
		Building CiputraWorldSurabaya = new Building(9, 
				"Ciputra World Surabaya", "Indonesia", "Surabaya", 
				"750,000 m\u00B2", "CiputraWorldSurabaya.png");
		largestFloorArea.add(CiputraWorldSurabaya);
		
		Building BerjayaTimesSquare = new Building(10, 
				"Berjaya Times Square", "Malaysia", "Kuala Lumpur", 
				"700,000 m\u00B2", "BerjayaTimesSquare.png");
		largestFloorArea.add(BerjayaTimesSquare);
		
		
		return largestFloorArea;
	}
	
	public ArrayList<Building> getLargestFootprint(){
			
			largestFootprint = new ArrayList<Building>();
			
			Building AalsmeerFlowerAuction = new Building(1, "Aalsmeer Flower Auction", "Netherlands", 
					"Aalsmeer", "518,000 m\u00B2", "AalsmeerFlowerAuction.png");
			largestFootprint.add(AalsmeerFlowerAuction);
			
			Building TeslaFactory = new Building(2, 
					"Tesla Factory", "United States", "Fremont, California", 
					"427,354 m\u00B2", "TeslaFactory.png");
			largestFootprint.add(TeslaFactory);
			
			Building BoeingEverettFactory = new Building(3, 
					"Boeing Everett Factory", "United States", "Everett, Washington", 
					"398,000 m\u00B2", "BoeingEverettFactory.png");
			largestFootprint.add(BoeingEverettFactory);
			
			Building MichelinDistributionCenter = new Building(4, 
					"Michelin Distribution Center", "United States", "Spartanburg, South Carolina", 
					"371,612 m\u00B2", "MichelinDistributionCenter.png");
			largestFootprint.add(MichelinDistributionCenter);
			
			Building GreatMosqueofMecca = new Building(5, 
					"Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", 
					"356,000 m\u00B2", "GreatMosqueofMecca.png");
			largestFootprint.add(GreatMosqueofMecca);
			
			Building NikeNorthAmericaLogisticsCenter = new Building(6, 
					"Nike - North America Logistics Center", "United States", "Memphis, Tennessee", 
					"260,000 m\u00B2", "NikeNorthAmericaLogisticsCenter.png");
			largestFootprint.add(NikeNorthAmericaLogisticsCenter);
			
			Building JohnDeereNorthAmericanPartsDistributionCenter = new Building(7, 
					"John Deere North American Parts Distribution Center", "United States", " Milan, Illinois", 
					"246,000 m\u00B2", "JohnDeereNorthAmericanPartsDistributionCenter.png");
			largestFootprint.add(JohnDeereNorthAmericanPartsDistributionCenter);
			
			Building MallofDubai = new Building(8, 
					"Mall of Dubai", "United Arab Emirates", " Dubai", "500,000 m\u00B2", "MallofDubai.png");
			largestFootprint.add(MallofDubai);
			
			Building MitsubishiMotorsNorthAmerica = new Building(9, 
					"Mitsubishi Motors North America", "United States", "Normal, Illinois", 
					"220,000 m\u00B2", "MitsubishiMotorsNorthAmerica.png");
			largestFootprint.add(MitsubishiMotorsNorthAmerica);
			
			Building IndonesiaConventionExhibition = new Building(10, 
					"Indonesia Convention Exhibition", "Indonesia", "Bumi Serpong Damai", 
					"220,000 m\u00B2", "IndonesiaConventionExhibition.png");
			largestFootprint.add(IndonesiaConventionExhibition);
			
			
			return largestFootprint;
		}
	
	public ArrayList<Building> getLargestUsableArea(){
		
		largestUsableArea = new ArrayList<Building>();
		
		Building BoeingEverettFactory = new Building(1, "Boeing Everett Factory", "United States", 
				"Everett, Washington", "13.3 million m\u00B3", "BoeingEverettFactory.png");
		largestUsableArea.add(BoeingEverettFactory);
		
		Building GreatMosqueofMecca = new Building(2, 
				"Great Mosque of Mecca", "Saudi Arabia", "Hijaz-Saudi Arabia", 
				"8  million m\u00B3", "GreatMosqueofMecca.png");
		largestUsableArea.add(GreatMosqueofMecca);
		
		Building JeanLucLagardèrePlant = new Building(3, 
				"Jean-Luc Lagardère Plant", "France", "Toulouse-Blagnac", 
				"5.6 million m\u00B3", "JeanLucLagardèrePlant.png");
		largestUsableArea.add(JeanLucLagardèrePlant);
		
		Building BoeingCompositeWingCenter = new Building(4, 
				"Boeing Composite Wing Center", "United States", "Everett, Washington", 
				"3.7 million m\u00B3", "BoeingCompositeWingCenter.png");
		largestUsableArea.add(BoeingCompositeWingCenter);
		
		Building Aerium = new Building(5, 
				"Aerium", "Germany", "Halbe, Brandenburg", "5.2 million m\u00B3", "Aerium.png");
		largestUsableArea.add(Aerium);
		
		Building MeyerWerftDockhalle2 = new Building(6, 
				"Meyer Werft Dockhalle 2", "Germany", "Papenburg, Niedersachsen", 
				"4.72 million m\u00B3", "MeyerWerftDockhalle2.png");
		largestUsableArea.add(MeyerWerftDockhalle2);
		
		Building NASAVehicleAssemblyBuilding = new Building(7, 
				"NASA Vehicle Assembly Building", "United States", "Brevard County, Florida", 
				"3.66 million m\u00B3", "NASAVehicleAssemblyBuilding.png");
		largestUsableArea.add(NASAVehicleAssemblyBuilding);
		
		Building TheO2 = new Building(8, 
				"The O2", "United Kingdom", "London", "2.79 million m\u00B3", "TheO2.png");
		largestUsableArea.add(TheO2);
		
		Building TescoIrelandDistributionCentre = new Building(9, 
				"Tesco Ireland Distribution Centre", "Ireland", "Donabate, Fingal", 
				"1.55 million m\u00B3", "TescoIrelandDistributionCentre.png");
		largestUsableArea.add(TescoIrelandDistributionCentre);
		
		Building TargetImportWarehouse = new Building(10, 
				"Target Import Warehouse", "United States", "Savannah, Georgia", 
				"1.5 million m\u00B3", "TargetImportWarehouse.png");
		largestUsableArea.add(TargetImportWarehouse);
		
		
		return largestUsableArea;
	}
	
}
