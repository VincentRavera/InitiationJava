package fr.treeptik.initiation_JAVA.type;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Timer;


public class ListColl {
	
	public static ArrayList<String> cOrder(ArrayList<String> input) {
		
		ArrayList<String> output = new ArrayList<String>();
		
		for (String string : input) {
			
			output.add(string);
			
		}
		
		return output;

	}
	
	public static void Alpha(ArrayList<String> input) {
		
		String temp;
		
		for (int i = 0; i < input.size()-1; i++) {
			for (int j = i+1; j < input.size(); j++) {
				if (input.get(i).compareToIgnoreCase(input.get(j))>0) {
					temp = input.get(j);
					input.set(j, input.get(i));
					input.set(i, temp);
				}
			}
		}
	}
	public static void cAlpha(ArrayList<String>input){
		Alpha(input);
		input = cOrder(input);
	}
	
	public static void uselesSet(){
		HashSet<Integer> undix = new HashSet<Integer>();
		for (Integer i = 0; i < 10; i++) {
			undix.add(i);
		}
		System.out.println(undix.size());
		for (int i = 0; i < 10; i++) {
			undix.add(i+5);
			
		}
		System.out.println(undix.size());
	}
	
	
	public static void perform() {
		ArrayList<Integer> array = new ArrayList<>();
		LinkedList<Integer> link = new LinkedList<>();
		for (int i = 0; i < 10000000; i++) {
			array.add(i);
			link.add(i);
		}
		long t0;
		long ta;
		long tl;
		t0 = System.nanoTime();
		for (Integer integer : array) {
			
		}
		ta = System.nanoTime();
		System.out.println("Array execution qeuo=");
		for (Integer integer : link) {
			
		}
		tl = System.nanoTime();
		tl = tl - ta;
		ta = ta - t0;
		System.out.println("Array execution ="+ ta);
		System.out.println("Link execution ="+ tl);
		
	}
	
	public static void abstact() {
		
		AbstractList<Integer> abst = new AbstractList<Integer>() {

			@Override
			public Integer get(int index) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
		abst.add(5);
		
		
	}
	
	public static void main(String[] args) {
		
		perform();
		
	}

}
