package fr.treeptik.initiation_JAVA.type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class Collection {
	
	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<>();
		List<String> listString = new LinkedList<>();
		// permet le cast en ArrayList
		strings.add("EL0");
		strings.add("EL1");
		strings.add("EL2");
		strings.add("EL3");
		
		System.out.println("List size = " + strings.size());
		System.out.println("El2 = " + strings.get(2));
		
		for (String string : strings) {
			System.out.println(string);
		}
		
		System.out.println(strings.contains("EL2"));
		
		LinkedList<String> list2 = (LinkedList<String>) listString;
		//Cast array en linked
		ArrayList<String> arrayList = new ArrayList<String>(list2);
		//copie de la liste
		
		//
		
		List<String> l = Arrays.asList("O","A");
		
		//l.remove(1);
		//asList ne permet pas la suppression et la modification
		
		/*
		 * Set
		 * Doublons impossible
		 */
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("El1");
		hSet.add("El0");
		hSet.add("El9");
		hSet.add("El1");
		hSet.add("El1");
		//il n'y a pas d'ordre !!!!
		System.out.println("NB el = " + hSet.size());
		
		for (String string : hSet) {

			System.out.println("Set :"+ string);
			
		}
		
		Set<String> hhset = new TreeSet<String>();
		hhset.add("A");
		hhset.add("C");
		hhset.add("X");
		hhset.add("T");
		hhset.add("D");
		hhset.add("D");
		//tri automatique
		
		for (String string : hhset) {
			System.out.println("tree :" + string);
		}
		
		//Iterarors
		//sens inverse possible pour Linked*
		for (Iterator iterator = hhset.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			
		}
		
		/*
		 * MAP
		 */
		
		Map<String, String> map = new HashMap<>();
		map.put("key1", "Val1");
		map.put("key2", "Val2");
		map.put("key3", "Val3");
		map.put("key1", "Val4");
		
		String result = map.get("key1");
		System.out.println(result);
		
		Set<String> cle = map.keySet();
		// rend un Set formaté HashSet car HashMap
		
		for (String string : cle) {
			System.out.println(string + map.get(string));
			
		}
		
		
		
		
	}
}
