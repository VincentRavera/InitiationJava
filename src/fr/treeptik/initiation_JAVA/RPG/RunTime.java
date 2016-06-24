package fr.treeptik.initiation_JAVA.RPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class RunTime {

	public static void main(String[] args) {
		
		Chevalier ch1 = new Chevalier(10, "Rob", "Jolly");
		Chevalier ch2 = new Chevalier(20, "Roby", "Jumper");
		Chevalier ch3 = new Chevalier(30, "Robo", "Jonna");
		
		List<Chevalier> personnages = new ArrayList<Chevalier>();
		
		personnages.add(ch1);
		personnages.add(ch2);
		personnages.add(ch3);
		
		Collections.sort(personnages, new ChevalierNomComperator());
		
		Chevalier ch2b = new Chevalier(20, "roby", "Jumper");
		
		System.out.println(ch2.equals(ch2b));
		
		TreeSet<Chevalier> treeSet = new TreeSet<Chevalier>(new ChevalierNomComperator());
		treeSet.addAll(personnages);
		for (Chevalier chevalier : treeSet) {
			
			System.out.println(chevalier);
			
		}
		
		System.out.println(Personnage.getNbPerso());
		

	}

}
