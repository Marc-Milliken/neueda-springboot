import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
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
		Dwarf F�li = new Dwarf("F�li", "Tolkien", "F�li.png");
		dwarfs.add(F�li);
		Dwarf K�li = new Dwarf("K�li", "Tolkien", "K�li.png");
		dwarfs.add(K�li);
		Dwarf Dori = new Dwarf("Dori", "Tolkien", "Dori.png");
		dwarfs.add(Dori);
		Dwarf Nori = new Dwarf("Nori", "Tolkien", "Nori.png");
		dwarfs.add(Nori);
		Dwarf Ori = new Dwarf("Ori", "Tolkien", "Ori.png");
		dwarfs.add(Ori);
		Dwarf �in = new Dwarf("�in", "Tolkien", "�in.png");
		dwarfs.add(�in);
		Dwarf Gl�in = new Dwarf("Gl�in", "Tolkien", "Gl�in.png");
		dwarfs.add(Gl�in);
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
