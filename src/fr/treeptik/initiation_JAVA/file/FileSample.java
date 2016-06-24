package fr.treeptik.initiation_JAVA.file;

import java.io.File;

public class FileSample {

	public static void main(String[] args) {
		File folder = new File("/home/ic06/formation/Test");
		readDir(folder);
		}

	public static void readDir(File folder){
		
		if (folder.exists() && folder.isDirectory() && !folder.isHidden()) {
			
			File[] listFile = folder.listFiles();
			for (File file : listFile) {
				if (file.isDirectory()) {
					System.out.println("DirName :"+file.getName());
					readDir(file);
				}else{
					System.out.println("Filename :"+file.getName());
				}
				
			}
		
		}
	}
}

