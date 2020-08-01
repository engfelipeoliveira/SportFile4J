//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.07.31 � 09:33:44 PM EDT 
//


package com.sportfile4j.xsd.generated.tcx.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour Position_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Position_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatitudeDegrees" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}DegreesLatitude_t"/>
 *         &lt;element name="LongitudeDegrees" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}DegreesLongitude_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Position_t", propOrder = {
    "latitudeDegrees",
    "longitudeDegrees"
})
public class PositionT {

    @XmlElement(name = "LatitudeDegrees")
    protected double latitudeDegrees;
    @XmlElement(name = "LongitudeDegrees")
    protected double longitudeDegrees;

    /**
     * Obtient la valeur de la propri�t� latitudeDegrees.
     * 
     */
    public double getLatitudeDegrees() {
        return latitudeDegrees;
    }

    /**
     * D�finit la valeur de la propri�t� latitudeDegrees.
     * 
     */
    public void setLatitudeDegrees(double value) {
        this.latitudeDegrees = value;
    }

    /**
     * Obtient la valeur de la propri�t� longitudeDegrees.
     * 
     */
    public double getLongitudeDegrees() {
        return longitudeDegrees;
    }

    /**
     * D�finit la valeur de la propri�t� longitudeDegrees.
     * 
     */
    public void setLongitudeDegrees(double value) {
        this.longitudeDegrees = value;
    }

	@Override
	public String toString() {
		return "PositionT [latitudeDegrees=" + latitudeDegrees + ", longitudeDegrees=" + longitudeDegrees + "]";
	}

}
