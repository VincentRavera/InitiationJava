//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2016.04.28 à 03:16:27 PM CEST 
//


package fr.treeptik.initiation_JAVA.exXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marque" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modele" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kilometre" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="dateMiseEnCirculation" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "marque",
    "modele",
    "kilometre",
    "dateMiseEnCirculation"
})
@XmlRootElement(name = "voiture")
public class Voiture {

    @XmlElement(required = true)
    protected String marque;
    @XmlElement(required = true)
    protected String modele;
    protected int kilometre;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateMiseEnCirculation;

    /**
     * Obtient la valeur de la propriété marque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarque() {
        return marque;
    }

    /**
     * Définit la valeur de la propriété marque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarque(String value) {
        this.marque = value;
    }

    /**
     * Obtient la valeur de la propriété modele.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModele() {
        return modele;
    }

    /**
     * Définit la valeur de la propriété modele.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModele(String value) {
        this.modele = value;
    }

    /**
     * Obtient la valeur de la propriété kilometre.
     * 
     */
    public int getKilometre() {
        return kilometre;
    }

    /**
     * Définit la valeur de la propriété kilometre.
     * 
     */
    public void setKilometre(int value) {
        this.kilometre = value;
    }

    /**
     * Obtient la valeur de la propriété dateMiseEnCirculation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateMiseEnCirculation() {
        return dateMiseEnCirculation;
    }

    /**
     * Définit la valeur de la propriété dateMiseEnCirculation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateMiseEnCirculation(XMLGregorianCalendar value) {
        this.dateMiseEnCirculation = value;
    }

}
