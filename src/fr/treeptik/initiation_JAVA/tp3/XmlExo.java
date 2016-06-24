package fr.treeptik.initiation_JAVA.tp3;

import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlExo {
	public static void main(String[] args) {
		//Doit changer le nom d'une voiture et compter le nombre de voiture
		DocumentBuilder b=null;
		String out = null;
		try {
			b = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document doc = b.parse(new FileInputStream("voit.xml"));
			XPath xPath = XPathFactory.newInstance().newXPath();
			out = xPath.compile("//voiture/kilometre").evaluate(doc);
			System.out.println(out);
			System.out.println("ici");
			
			//contage
			NodeList nodeListNb = (NodeList) xPath.compile("//voitures/voiture").evaluate(doc, XPathConstants.NODESET);
			System.out.println("Nombre de voitures : "+nodeListNb.getLength());
			
			NodeList nodeList = (NodeList) xPath.compile("//voitures/voiture/kilometre").evaluate(doc, XPathConstants.NODESET);
			//MODIFY
			nodeList.item(2).setTextContent("2");
			
			for (int i = 0; i < nodeList.getLength(); i++) {
				Node nNode = nodeList.item(i);
				System.out.println("Voiture "+i+" a "+nNode.getTextContent()+" km");
			}
			

			
		} catch (ParserConfigurationException | SAXException | IOException | XPathExpressionException e1) {
			e1.printStackTrace();
		}
		
	}
	
	
	
}
