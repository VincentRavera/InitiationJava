package fr.treeptik.initiation_JAVA.tp3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class CopyMyFile {
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("/home/ic06/formation/Test/ta.txt");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("/home/ic06/formation/Test/to.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileChannel titi = fis.getChannel();
		FileChannel toto = fos.getChannel();
		try {
			titi.transferTo(0,titi.size(), toto);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("FATALA ERROR :(");
		}
		
	}
	

}
