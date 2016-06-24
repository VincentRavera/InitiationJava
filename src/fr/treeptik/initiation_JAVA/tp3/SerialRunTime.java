package fr.treeptik.initiation_JAVA.tp3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialRunTime {

	public static void main(String[] args) {
		
		Serial toto = new Serial();
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("todel.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			ObjectOutputStream tata = new ObjectOutputStream(fos);
			tata.writeObject(toto);
			tata.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Instance suvegardee");
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("todel.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		ObjectInputStream titi;
		Serial caca = null;
		try {
			titi = new ObjectInputStream(fis);
			caca = (Serial) titi.readObject();
			System.out.println(caca.equals(toto));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
