package fr.treeptik.initiation_JAVA.RPG;

public class Magicien extends Personnage{
	private Integer mana;

	public Magicien(Integer vie, String nom, Integer mana) {
		super(vie, nom);
		this.mana = mana;
	}

	public Integer getMana() {
		return mana;
	}

	public void setMana(Integer mana) {
		this.mana = mana;
	}
	
	

}
