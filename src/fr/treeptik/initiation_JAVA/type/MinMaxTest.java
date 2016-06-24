package fr.treeptik.initiation_JAVA.type;

import java.util.Scanner;

public class MinMaxTest {

	public static int max(int a, int b) {
		
		int result;
		
		if (a>b){
			result = a;
		}
		else{
			result = b;
		}
		return result;
		

	}
	public static int min(int a, int b) {
		
		int result;
		
		if (a>b){
			result = b;
		}
		else{
			result = a;
		}
		return result;
		

	}
	public static void main(String[] args) {
		int a;
		int b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Entré votre premier nombre :");
		a = scan.nextInt();
		System.out.println("Entré votre second nombre :");
		b = scan.nextInt();
		System.out.println("Le plus grand est :"+ max(a,b));
		System.out.println("Le plus petit est :"+ min(a,b));
		
		scan.close();
		
		
	}

}
