package fr.treeptik.initiation_JAVA.RPG;

import java.util.Comparator;

public class ChevalierNomComperator implements Comparator<Chevalier> {

	@Override
	public int compare(Chevalier o1, Chevalier o2) {
		return o1.getNom().compareToIgnoreCase(o2.getNom());
	}
	
	

}
