package fr.treeptik.initiation_JAVA.tp3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffR {

	public static void main(String[] args) {
		
		File file = new File("/home/ic06/formation/Test/ta.txt");
		BufferedReader bRead = null;
		try {
			bRead = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		String line;
		
		try {
			while (( line = bRead.readLine()) !=null) {
				System.out.println(line);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		try {
			bRead.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
