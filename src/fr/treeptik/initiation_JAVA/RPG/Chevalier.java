package fr.treeptik.initiation_JAVA.RPG;

public class Chevalier extends Personnage{
	
	private String nomCheval;
	
	public Chevalier(Integer vie, String nom, String nomCheval) {
		super(vie, nom);
		this.nomCheval = nomCheval;
	}

	public String getNomCheval() {
		return nomCheval;
	}

	public void setNomCheval(String nomCheval) {
		this.nomCheval = nomCheval;
	}

	@Override
	public String toString() {
		return "Chevalier [nomCheval=" + nomCheval + ", vie=" + vie + ", nom=" + nom + "]";
	}
	
	
	
	

}
