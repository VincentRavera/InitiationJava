package fr.treeptik.initiation_JAVA.type;

import java.util.Scanner;

public class jeuneOuVieux {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		System.out.println("Quel est votre age ?");
		scan.close();
		
		age = scan.nextInt();
		
		if (age < 20){
			System.out.println("Tu es jeune");
		}
		else{
			System.out.println("Tu es Vieux !!");
		}
		
	}

}
