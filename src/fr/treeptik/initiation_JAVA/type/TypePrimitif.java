package fr.treeptik.initiation_JAVA.type;

public class TypePrimitif {

	public static void main(String[] args) { 
		
		char c = 'A';
		char c2 = 65; 					// valeur dans la table ASCII
		
		byte b = 127;
		short s = 3;
		int i = 1;
		long l = 1209876599876L;		// L <- reserve un type long (et pas int) pour en suite pointer dessus
		
		float f = 12.09F;
		double d = 12.00000000005;
		
		boolean bo = true;				//false;nt
		
		
		// type non-primitif dit "wrapper";
		Character ch = 'B';
		Integer it = 56;
		Boolean bool = null; 			//3valeurs : true, false, null
		
		int result = i + it;
		System.out.println(result);
		

	}

}
