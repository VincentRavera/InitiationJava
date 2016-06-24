package fr.treeptik.initiation_JAVA.type;

public class TriangleEtoile {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder();
		String etoile = new String("*");
		for (int i = 0; i < 10; i++) {
			
			builder.append(etoile);
			
			System.out.println(builder.toString());
			
		}
		

	}

}
