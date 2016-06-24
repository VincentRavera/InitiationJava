package fr.treeptik.initiation_JAVA.RPG;

public class Personnage {
	protected Integer vie;
	protected String nom;
	protected static Integer nbPerso = 0;
	// STATIC est commun a toute les instances (elles y ont toutes acces.
	
	public static Integer getNbPerso() {
		return nbPerso;
	}

	public Personnage(Integer vie, String nom) {
		nbPerso++;
		this.vie = vie;
		this.nom = nom;
	}

	public Integer getVie() {
		return vie;
	}

	public void setVie(Integer vie) {
		this.vie = vie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.toUpperCase().hashCode()); //toUpper
		result = prime * result + ((vie == null) ? 0 : vie.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personnage other = (Personnage) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equalsIgnoreCase(other.nom)) // IGNORE CASE !
			return false;
		if (vie == null) {
			if (other.vie != null)
				return false;
		} else if (!vie.equals(other.vie))
			return false;
		return true;
	}
	

}
