package fr.treeptik.initiation_JAVA.tp3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BuffW {

	public static void main(String[] args) {
		File file = new File("/home/ic06/formation/Test/ta.txt");
		if (file.exists() && !file.isDirectory()) {
			Scanner scan = new Scanner(System.in);
			BufferedWriter bWrite = null;
			try {
				bWrite = new BufferedWriter(new FileWriter(file));
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			String str = new String();
			String exit = new String("quit");
			while(!str.equals(exit)){
				try{
					str = scan.next();
					bWrite.write(str);
					bWrite.newLine();
					
				}catch(IOException e){
					e.printStackTrace();
				}
			}
			
			try{
				scan.close();
				bWrite.close();
			}catch(IOException e){
				e.printStackTrace();
			}
			
			
		}
		else{
			System.out.println("file errors");
		}
		

	}

}
