//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2020.07.31 à 09:33:44 PM EDT 
//


package com.sportfile4j.xsd.generated.tcx.v2;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SpeedType_t.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="SpeedType_t">
 *   &lt;restriction base="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Token_t">
 *     &lt;enumeration value="Pace"/>
 *     &lt;enumeration value="Speed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SpeedType_t")
@XmlEnum
public enum SpeedTypeT {

    @XmlEnumValue("Pace")
    PACE("Pace"),
    @XmlEnumValue("Speed")
    SPEED("Speed");
    private final String value;

    SpeedTypeT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedTypeT fromValue(String v) {
        for (SpeedTypeT c: SpeedTypeT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
