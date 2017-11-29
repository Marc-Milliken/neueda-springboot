package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;


@Service
public class DwarfService {

	private ArrayList<Dwarf> disneyDwarfs;
	private ArrayList<Dwarf> tolkienDwarfs;
	
public DwarfService() {
	}

public ArrayList<Dwarf> getDisneyDwarfs(){
		
		ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();
		
		Dwarf Happy = new Dwarf("Happy", "Disney", "Happy.png");
		dwarfs.add(Happy);
		Dwarf Sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
		dwarfs.add(Sleepy);
		Dwarf Dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
		dwarfs.add(Dopey);
		Dwarf Bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
		dwarfs.add(Bashful);
		Dwarf Sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
		dwarfs.add(Sneezy);
		Dwarf Doc = new Dwarf("Doc", "Disney", "Doc.png");
		dwarfs.add(Doc);
		Dwarf Grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
		dwarfs.add(Grumpy);
		
		return dwarfs;
	}
	
public ArrayList<Dwarf> getTolkienDwarfs(){
	
	ArrayList<Dwarf> dwarfs = new ArrayList<Dwarf>();

	Dwarf Thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
	dwarfs.add(Thorin);
	Dwarf Balin = new Dwarf("Balin", "Tolkien", "Balin.png");
	dwarfs.add(Balin);
	Dwarf Dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
	dwarfs.add(Dwalin);
	Dwarf Fíli = new Dwarf("Fíli", "Tolkien", "Fíli.png");
	dwarfs.add(Fíli);
	Dwarf Kíli = new Dwarf("Kíli", "Tolkien", "Kíli.png");
	dwarfs.add(Kíli);
	Dwarf Dori = new Dwarf("Dori", "Tolkien", "Dori.png");
	dwarfs.add(Dori);
	Dwarf Nori = new Dwarf("Nori", "Tolkien", "Nori.png");
	dwarfs.add(Nori);
	Dwarf Ori = new Dwarf("Ori", "Tolkien", "Ori.png");
	dwarfs.add(Ori);
	Dwarf Óin = new Dwarf("Óin", "Tolkien", "Óin.png");
	dwarfs.add(Óin);
	Dwarf Glóin = new Dwarf("Glóin", "Tolkien", "Glóin.png");
	dwarfs.add(Glóin);
	Dwarf Bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
	dwarfs.add(Bifur);
	Dwarf Bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
	dwarfs.add(Bofur);
	Dwarf Bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
	dwarfs.add(Bombur);
	
	return dwarfs;
}

	
}
