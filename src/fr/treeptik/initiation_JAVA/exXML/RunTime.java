package fr.treeptik.initiation_JAVA.exXML;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class RunTime {

	public static void main(String[] args) {
		
		Voiture v = new Voiture();
		v.setMarque("Audi");
		v.setModele("A4");
		v.setKilometre(10000);
		
		Voiture v1 = new Voiture();
		v1.setMarque("Audi");
		v1.setModele("A1");
		v1.setKilometre(10000);
		Voiture v2 = new Voiture();
		v2.setMarque("Mercedes");
		v2.setModele("ClassA");
		v2.setKilometre(10000);
		Voiture v3 = new Voiture();
		v3.setMarque("Mercedes");
		v3.setModele("ClassB");
		v3.setKilometre(10000);
		Voiture v4 = new Voiture();
		v4.setMarque("Mercedes");
		v4.setModele("ClassC");
		v4.setKilometre(10000);
		
		Voitures voitures = new Voitures();
		
		List<Voiture> listVoiture = voitures.getVoiture();
		listVoiture.add(v);
		listVoiture.add(v1);
		listVoiture.add(v2);
		listVoiture.add(v3);
		listVoiture.add(v4);
		
		try{
			JAXBContext context = JAXBContext.newInstance(Voitures.class);
			Marshaller marsh = context.createMarshaller();
			marsh.marshal(voitures, new File("voit.xml"));
			
			Unmarshaller umarsh = context.createUnmarshaller();
			
			Voitures vs = (Voitures) umarsh.unmarshal(new File("voit.xml"));
			
			System.out.println("NB Voit :" + vs.getVoiture().size());
			
			System.out.println("FIN");
		}catch(JAXBException e){
			e.printStackTrace();
		}
		
	}

}
