package fr.treeptik.initiation_JAVA.type;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;


public class CorrectionAbstList extends AbstractList<String>{

	
	private List<String> data;
	
	public CorrectionAbstList(List<String> data) {
		this.data = new ArrayList<String>(data);
	}
		
	
	
	@Override
	public String get(int index) {
		
		return data.get(index);
	}

	@Override
	public int size() {
		return data.size();
	}
	
	

}
