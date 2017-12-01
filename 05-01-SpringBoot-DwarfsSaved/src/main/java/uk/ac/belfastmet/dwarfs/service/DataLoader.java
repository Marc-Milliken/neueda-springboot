package uk.ac.belfastmet.dwarfs.service;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;
import uk.ac.belfastmet.dwarfs.repositories.DwarfRepository;

@Service
public class DataLoader {

	
	@Autowired
	private DwarfRepository dwarfRepository;
	
	public DataLoader(DwarfRepository dwarfRepository) {
		super();
		this.dwarfRepository = dwarfRepository;
	}
	
	//@PostConstruct
	public void loadData() {
		
	
	Dwarf Happy = new Dwarf("Happy", "Disney", "Happy.png");
	dwarfRepository.save(Happy);
	Dwarf Sleepy = new Dwarf("Sleepy", "Disney", "Sleepy.png");
	dwarfRepository.save(Sleepy);
	Dwarf Dopey = new Dwarf("Dopey", "Disney", "Dopey.png");
	dwarfRepository.save(Dopey);
	Dwarf Bashful = new Dwarf("Bashful", "Disney", "Bashful.png");
	dwarfRepository.save(Bashful);
	Dwarf Sneezy = new Dwarf("Sneezy", "Disney", "Sneezy.png");
	dwarfRepository.save(Sneezy);
	Dwarf Doc = new Dwarf("Doc", "Disney", "Doc.png");
	dwarfRepository.save(Doc);
	Dwarf Grumpy = new Dwarf("Grumpy", "Disney", "Grumpy.png");
	dwarfRepository.save(Grumpy);

	Dwarf Thorin = new Dwarf("Thorin", "Tolkien", "Thorin.png");
	dwarfRepository.save(Thorin);
	Dwarf Balin = new Dwarf("Balin", "Tolkien", "Balin.png");
	dwarfRepository.save(Balin);
	Dwarf Dwalin = new Dwarf("Dwalin", "Tolkien", "Dwalin.png");
	dwarfRepository.save(Dwalin);
	Dwarf Fíli = new Dwarf("Fíli", "Tolkien", "Fíli.png");
	dwarfRepository.save(Fíli);
	Dwarf Kíli = new Dwarf("Kíli", "Tolkien", "Kíli.png");
	dwarfRepository.save(Kíli);
	Dwarf Dori = new Dwarf("Dori", "Tolkien", "Dori.png");
	dwarfRepository.save(Dori);
	Dwarf Nori = new Dwarf("Nori", "Tolkien", "Nori.png");
	dwarfRepository.save(Nori);
	Dwarf Ori = new Dwarf("Ori", "Tolkien", "Ori.png");
	dwarfRepository.save(Ori);
	Dwarf Óin = new Dwarf("Óin", "Tolkien", "Óin.png");
	dwarfRepository.save(Óin);
	Dwarf Glóin = new Dwarf("Glóin", "Tolkien", "Glóin.png");
	dwarfRepository.save(Glóin);
	Dwarf Bifur = new Dwarf("Bifur", "Tolkien", "Bifur.png");
	dwarfRepository.save(Bifur);
	Dwarf Bofur = new Dwarf("Bofur", "Tolkien", "Bofur.png");
	dwarfRepository.save(Bofur);
	Dwarf Bombur = new Dwarf("Bombur", "Tolkien", "Bombur.png");
	dwarfRepository.save(Bombur);
	
}
	
}
	
	
	

