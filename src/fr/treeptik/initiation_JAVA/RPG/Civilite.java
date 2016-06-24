package fr.treeptik.initiation_JAVA.RPG;

public enum Civilite {
	M(2), Mlle(5), Mme(7), Doc(19);
	
	private Integer val;
	
	private Civilite(Integer val) {
		this.setVal(val);
	}

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}
	
	

}
