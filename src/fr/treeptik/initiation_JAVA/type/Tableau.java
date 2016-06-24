package fr.treeptik.initiation_JAVA.type;

import java.util.Arrays;

public class Tableau {

	public static void main(String[] args) {
		
		int[] tabInt = new int[5];
		
		tabInt[0] = 1;
		tabInt[1] = 1;
		tabInt[2] = 1;
		tabInt[3] = 1;
		tabInt[4] = 1;
		
		tabInt = Arrays.copyOf(tabInt, 10);
		
		tabInt[5] = 5;
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		
		String[] sTab = new String[10];
		String[][] sTab2 = new String[10][10];
		String[][][] sTab3 = new String[10][10][3];
		
		int[] tabInt2 = {1, 2, 3, 5, 7};
		
		for (int i = 0; i < tabInt.length; i++){
			
			System.out.println("Value =" + tabInt[i]);
			
		}
		
		Integer[] tab = new Integer[10];
		
		int nbElement = 0;
		
		for (int i = 0; i < tab.length; i++){
			
			if (tab[i] != null){
				nbElement++;
			}
			
			System.out.println("Value =" + tab[i]);
			
		}
		System.out.println("nbE =" + nbElement);
		
		
		//pour tableau 1D "for each"
		for( int element : tabInt){
			
			System.out.println("Value =" + element);
		}
		//pour tableau 2D "for each"
		for( String[] element2 : sTab2){
			System.out.println("Value =" + element2);
		}
		
		int z = 0;
		
		while(z < tabInt.length){
			
			System.out.println(z++);		//z++ va d'abord passer z puis l'incémenter
											//++z va incrémenter puis donner la valeur
		}
		
		z = 0;
		do{
			System.out.println("Do =" + z++);
			
		}while(z<10);
		
		System.out.println("Do ! =" + z);

	}

}
