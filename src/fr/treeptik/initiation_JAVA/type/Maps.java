package fr.treeptik.initiation_JAVA.type;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {
	
	public static void showMaps(Map<String, String[]> input) {
		
		Set<String> keys = input.keySet();
		
		for (String key : keys) {
			
			String[] value = input.get(key);
			System.out.print("Key : " + key);
			for (String string : value) {
				System.out.print("-" + string);
				
			}
			System.out.println("");
			
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		Map<String, String[]> input = new HashMap<>();
		String[] tabs = {"qsuygdiuqsydg","oqisdgfqpisdf"};
		
		input.put("001", tabs);
		input.put("002", tabs);
		showMaps(input);
		

	}

}
