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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour AbstractStep_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="AbstractStep_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StepId" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}StepId_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractStep_t", propOrder = {
    "stepId"
})
@XmlSeeAlso({
    RepeatT.class,
    StepT.class
})
public abstract class AbstractStepT {

    @XmlElement(name = "StepId")
    @XmlSchemaType(name = "positiveInteger")
    protected int stepId;

    /**
     * Obtient la valeur de la propri�t� stepId.
     * 
     */
    public int getStepId() {
        return stepId;
    }

    /**
     * D�finit la valeur de la propri�t� stepId.
     * 
     */
    public void setStepId(int value) {
        this.stepId = value;
    }

}
