package fr.treeptik.initiation_JAVA.tp3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Prop {

	public static void main(String[] args) {
		Properties prop = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/home/ic06/formation/Test/in.properties");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(prop.getProperty("jojo"));
		
		

	}

}
