package fr.treeptik.initiation_JAVA.type;

import java.util.Scanner;

public class Perroquet {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = new String();
		String exit = new String("quit");
		boolean bolExit = true;
		
		do{
			str = scan.next();
			if (str.equalsIgnoreCase(exit)){
				bolExit = false;
			}
			System.out.println(str);
			
		}while(bolExit);
		
		scan.close();
	}

}
