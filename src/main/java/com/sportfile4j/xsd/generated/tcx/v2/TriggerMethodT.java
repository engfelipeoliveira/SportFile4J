//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.07.31 � 09:33:44 PM EDT 
//


package com.sportfile4j.xsd.generated.tcx.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour TriggerMethod_t.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="TriggerMethod_t">
 *   &lt;restriction base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t">
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Distance"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Time"/>
 *     &lt;enumeration value="HeartRate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TriggerMethod_t")
@XmlEnum
public enum TriggerMethodT {

    @XmlEnumValue("Manual")
    MANUAL("Manual"),
    @XmlEnumValue("Distance")
    DISTANCE("Distance"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("HeartRate")
    HEART_RATE("HeartRate");
    private final String value;

    TriggerMethodT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TriggerMethodT fromValue(String v) {
        for (TriggerMethodT c: TriggerMethodT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
