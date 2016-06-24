package fr.treeptik.initiation_JAVA.uml;

public class Livre extends Article{
	
	private String auteur;
	private int nbPages;
	private int isbn;
	
	
	public int getNbPages(){
		return this.nbPages;
	}
	public int getisbn(){
		return this.isbn;
	}

}
