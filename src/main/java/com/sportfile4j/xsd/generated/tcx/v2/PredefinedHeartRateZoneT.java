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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour PredefinedHeartRateZone_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="PredefinedHeartRateZone_t">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Zone_t">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateZoneNumbers_t"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PredefinedHeartRateZone_t", propOrder = {
    "number"
})
public class PredefinedHeartRateZoneT
    extends ZoneT
{

    @XmlElement(name = "Number")
    @XmlSchemaType(name = "positiveInteger")
    protected int number;

    /**
     * Obtient la valeur de la propri�t� number.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * D�finit la valeur de la propri�t� number.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

}
