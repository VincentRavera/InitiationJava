package fr.treeptik.initiation_JAVA.exception;

public class UseEx {

	public static void main(String[] args) {
		DemoException demoEx = new DemoException();
		try{
			demoEx.throwEx2();
		} catch (Exception1 | Exception2 e){
			e.printStackTrace();
			//l'un ou l'autre c'est le même traitement
		} catch (Exception e) {
			e.printStackTrace();
			// le reste des exeptions
		} finally {
			//tjrs éxécuté erreur ou pas
			//ici on ferme le reste des resources
			System.out.println("FINALITY");
			
		}
		System.out.println("#######RUNTIME##############");
		demoEx.throwRunTimeEx();
		System.out.println("FIN !!!!!!!!!!!");

	}

}
