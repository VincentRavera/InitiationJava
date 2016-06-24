package fr.treeptik.initiation_JAVA.tp3;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Serial implements Serializable{
	private int nb;
	private double dou;
	
	public Serial() {
		setNb(5);
		setDou(5.02);
	}

	public double getDou() {
		return dou;
	}

	public void setDou(double dou) {
		this.dou = dou;
	}

	public int getNb() {
		return nb;
	}

	public void setNb(int nb) {
		this.nb = nb;
	}
	public boolean equals(Serial input) {
		boolean out=false;
		if ((this.nb==input.nb) && (this.dou == input.dou)) {
			out=true;
			
		}
		return out;
		
		
	}
	
	

}
