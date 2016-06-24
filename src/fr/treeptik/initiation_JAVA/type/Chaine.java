package fr.treeptik.initiation_JAVA.type;

public class Chaine {

	public static void main(String[] args) {
		
		String chaine = "Ma super chaine" ;
		String chaine2 = "Ma super chaine" ;
		
		System.out.println(chaine.charAt(3));
		System.out.println(chaine.equals("Ma super chaine"));
		System.out.println(chaine.equals("ma super chaine"));
		System.out.println(chaine.equalsIgnoreCase("ma super chaine"));
		System.out.println(chaine == chaine2);							// ne marche pas pour les longues chaines !!
		chaine.trim();									// supprime les espaces du début et a la fin (pas au milieu)
		
		String chaine3 = chaine + chaine2 + 42; 				//Concataination, a éviter surtout pour itération
		System.out.println(chaine3);
		
		
		StringBuilder builder = new StringBuilder();
		builder.append(chaine);
		builder.append(chaine2).append(42).append("hello");
		String resultBuilder = builder.toString();
		
		

	}

}
