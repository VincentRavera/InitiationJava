package fr.treeptik.initiation_JAVA.type;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class RunTimeMuMap {

	public static void main(String[] args) {
		MuMap<String, String> multMap = new MuMap<String, String>();
		
		multMap.put("01", "1");
		multMap.put("02", "1");
		multMap.put("02", "2");
		multMap.put("01", "1");
		multMap.put("01", "2");
		
		Set<Entry<String, List<String>>> entrySetMuMap = multMap.entrySetMuMap();
		
		for (Entry<String, List<String>> entry : entrySetMuMap) {
			System.out.print("Cle :"+entry.getKey()+" ");
			for (String v : entry.getValue()) {
				System.out.print(v + " ");
				
			}
			System.out.println(" ");
			
		}
		

	}

}
