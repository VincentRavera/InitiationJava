package fr.treeptik.initiation_JAVA.type;

import java.util.Scanner;

public class Multi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int value1;
        System.out.println("Donnez le premier nombre :");
        value1 = scan.nextInt();
        
        int value2;
        System.out.println("Donner le second entier");
        value2 = scan.nextInt();
        
        long result = value1 * value2;
        
        System.out.println(value1 + " x " + value2 + " = " + result);
        scan.close();
        
		

	}

}
