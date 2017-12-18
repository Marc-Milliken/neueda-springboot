package uk.ac.belfastmet.animal;

import java.util.ArrayList;

public class WhaleWatcher {

	public static void main(String[] args) {

		ArrayList<Whale> whales = new ArrayList<Whale>();

		Whale right = new Whale("Right", "Atlantic", 2001, 21, 16);
		
		if(right.getName() == "") {
			System.out.println("You must input a name");
			return;
		}
		else if(right.getMainOcean() == "") {
			System.out.println("You must input a Main Ocean");
			return;
		}
		else if(right.getWeight() < 1) {
			System.out.println("Weight must be greater than 0");
			return;
		}
		
		else if(right.getMaxSpeed() < 1) {
			System.out.println("Max Speed must be greater than 0");
			return;
		}
		else if(right.getLength() < 1) {
			System.out.println("Length must be greater than 0");
			return;
		}

		whales.add(right);
		Whale blue = new Whale("Blue", "Pacific", 2001, 23, 16);
		whales.add(blue);
		Whale sperm = new Whale("Sperm", "Atlantic", 1900, 20, 40);
		whales.add(sperm);
		Whale humpback = new Whale("Humpback", "Antarctic", 919, 13, 13);
		whales.add(humpback);

		System.out.println(right);
		System.out.println(blue);
		System.out.println(sperm);
		System.out.println(humpback);

		getAtlanticWhales(whales);
		getFastestWhales(whales);
		getAverageWhaleLength(whales);
		getHeaviestWhale(whales);
		
	}
	

	public static String getAtlanticWhales(ArrayList<Whale> whales) {

		System.out.println("\nWhales that swim mostly in the Atlantic Ocean are: ");

		String atlanticWhales = "";
		for (int i = 0; i < whales.size(); i++) {

			Whale currentWhale = whales.get(i);
			if (currentWhale.getMainOcean() == "Atlantic") {
				atlanticWhales = currentWhale.getName();
				System.out.println("\n" + atlanticWhales);

			}

		}

		return atlanticWhales;

	}

	public static String getFastestWhales(ArrayList<Whale> whales) {

		System.out.println("\nThe Fastest Whale(s): ");

		int maxSpeed = 0;
		String fastestWhale = "";
		for (int i = 0; i < whales.size(); i++) {

			Whale currentWhale = whales.get(i);
			if (currentWhale.getMaxSpeed() > maxSpeed) {
				maxSpeed = currentWhale.getMaxSpeed();
				fastestWhale = currentWhale.getName();
			}

		}

		System.out.println("\n" + fastestWhale);

		return fastestWhale;

	}
	
	public static double getAverageWhaleLength(ArrayList<Whale> whales) {

		System.out.println("\nThe Average Length of the Whales is: ");

		double averageLength = 0;
		int currentWhaleLength;
		for (int i = 0; i < whales.size(); i++) {

			Whale currentWhale = whales.get(i);
			currentWhaleLength = currentWhale.getLength();
			averageLength = averageLength + currentWhaleLength;

		}

		averageLength = averageLength / 4;
		System.out.println("\n" + averageLength + " meters");
		
		return averageLength;

	}
	
	public static String getHeaviestWhale(ArrayList<Whale> whales) {

		System.out.println("\nThe Heaviest Whale(s): ");

		int maxWeight = 0;
		String heaviestWhale = "";
		for (int i = 0; i < whales.size(); i++) {

			Whale currentWhale = whales.get(i);
			if (currentWhale.getWeight() >= maxWeight) {
				maxWeight = currentWhale.getWeight();
				heaviestWhale = currentWhale.getName();
				System.out.println("\n" + heaviestWhale);
			}

		}

		return heaviestWhale;

	}

}
