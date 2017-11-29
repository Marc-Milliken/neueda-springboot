package uk.ac.belfastmet.dwarfs;

import java.util.ArrayList;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.ac.belfastmet.dwarfs.domain.Dwarf;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@PostConstruct
	public void createDwarfs() {
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
		
		System.out.println("Snow White's Dwarfs are: ");
		for(Dwarf dwarf : dwarfs) {
			if(dwarf.getAuthor().equals("Disney")) {
				System.out.println("\t" + dwarf.getName() + ": " + dwarf.getImage());
			}
		}
		
		System.out.println("\nThe Company of Thorin are: ");
		for(Dwarf dwarf : dwarfs) {
			if(dwarf.getAuthor().equals("Tolkien")) {
				System.out.println("\t" + dwarf.getName() + ": " + dwarf.getImage());
			}
		}
		
		

	}
		
		
	}
