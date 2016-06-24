package fr.treeptik.initiation_JAVA.type;

import java.util.Scanner;

public class StringSample {
	
	public static void upAnDown(){
		Scanner scan = new Scanner(System.in);
		String str = new String();
		System.out.println("Parlez moi :");
		str = scan.nextLine();
		scan.close();
		
		String[] splitStr = str.split(" ");
		
		for (int i = 0; i < splitStr.length; i++) {
			
			if (i%2==0){
				splitStr[i] = splitStr[i].toLowerCase();
			}
			else{
				splitStr[i] = splitStr[i].toUpperCase();
			}
			
			
		}
		//String result = splitStr.toString();
		//System.out.println(result.trim());
		
		for (String string : splitStr) {
			System.out.println(string);
		}
		
	}
	public static void mirror(){
		Scanner scan = new Scanner(System.in);
		String str = new String();
		System.out.println("Parlez moi :");
		str = scan.nextLine();
		scan.close();
		String mirrord = new String();
		
		for (int i = 0; i < str.length(); i++) {
			
			mirrord = mirrord + str.charAt(str.length()-i-1);
			
		}
		System.out.println(mirrord);
		
		
	}
	public static void sBuild(){
		Scanner scan = new Scanner(System.in);
		String str = new String();
		System.out.println("Parlez moi :");
		str = scan.nextLine();
		scan.close();
		StringBuilder strBulid = new StringBuilder();
		
		
		for (int i = 0; i < str.length(); i++) {
			
			strBulid.append(str.charAt(str.length()-i-1));
			
		}
		System.out.println(strBulid.toString());
		
		
	}

	public static void main(String[] args) {
		sBuild();
		mirror();
			
			
		}


}
