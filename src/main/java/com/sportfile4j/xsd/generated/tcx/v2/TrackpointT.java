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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour Trackpoint_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="Trackpoint_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Position" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Position_t" minOccurs="0"/>
 *         &lt;element name="AltitudeMeters" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="DistanceMeters" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="HeartRateBpm" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateInBeatsPerMinute_t" minOccurs="0"/>
 *         &lt;element name="Cadence" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CadenceValue_t" minOccurs="0"/>
 *         &lt;element name="SensorState" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}SensorState_t" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trackpoint_t", propOrder = {
    "time",
    "position",
    "altitudeMeters",
    "distanceMeters",
    "heartRateBpm",
    "cadence",
    "sensorState",
    "extensions"
})
public class TrackpointT {

    @XmlElement(name = "Time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "Position")
    protected PositionT position;
    @XmlElement(name = "AltitudeMeters")
    protected Double altitudeMeters;
    @XmlElement(name = "DistanceMeters")
    protected Double distanceMeters;
    @XmlElement(name = "HeartRateBpm")
    protected HeartRateInBeatsPerMinuteT heartRateBpm;
    @XmlElement(name = "Cadence")
    @XmlSchemaType(name = "unsignedByte")
    protected Short cadence;
    @XmlElement(name = "SensorState")
    @XmlSchemaType(name = "token")
    protected SensorStateT sensorState;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

    /**
     * Obtient la valeur de la propri�t� time.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * D�finit la valeur de la propri�t� time.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Obtient la valeur de la propri�t� position.
     * 
     * @return
     *     possible object is
     *     {@link PositionT }
     *     
     */
    public PositionT getPosition() {
        return position;
    }

    /**
     * D�finit la valeur de la propri�t� position.
     * 
     * @param value
     *     allowed object is
     *     {@link PositionT }
     *     
     */
    public void setPosition(PositionT value) {
        this.position = value;
    }

    /**
     * Obtient la valeur de la propri�t� altitudeMeters.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAltitudeMeters() {
        return altitudeMeters;
    }

    /**
     * D�finit la valeur de la propri�t� altitudeMeters.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAltitudeMeters(Double value) {
        this.altitudeMeters = value;
    }

    /**
     * Obtient la valeur de la propri�t� distanceMeters.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDistanceMeters() {
        return distanceMeters;
    }

    /**
     * D�finit la valeur de la propri�t� distanceMeters.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDistanceMeters(Double value) {
        this.distanceMeters = value;
    }

    /**
     * Obtient la valeur de la propri�t� heartRateBpm.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public HeartRateInBeatsPerMinuteT getHeartRateBpm() {
        return heartRateBpm;
    }

    /**
     * D�finit la valeur de la propri�t� heartRateBpm.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public void setHeartRateBpm(HeartRateInBeatsPerMinuteT value) {
        this.heartRateBpm = value;
    }

    /**
     * Obtient la valeur de la propri�t� cadence.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getCadence() {
        return cadence;
    }

    /**
     * D�finit la valeur de la propri�t� cadence.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setCadence(Short value) {
        this.cadence = value;
    }

    /**
     * Obtient la valeur de la propri�t� sensorState.
     * 
     * @return
     *     possible object is
     *     {@link SensorStateT }
     *     
     */
    public SensorStateT getSensorState() {
        return sensorState;
    }

    /**
     * D�finit la valeur de la propri�t� sensorState.
     * 
     * @param value
     *     allowed object is
     *     {@link SensorStateT }
     *     
     */
    public void setSensorState(SensorStateT value) {
        this.sensorState = value;
    }

    /**
     * Obtient la valeur de la propri�t� extensions.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsT }
     *     
     */
    public ExtensionsT getExtensions() {
        return extensions;
    }

    /**
     * D�finit la valeur de la propri�t� extensions.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsT }
     *     
     */
    public void setExtensions(ExtensionsT value) {
        this.extensions = value;
    }

	@Override
	public String toString() {
		return "TrackpointT [time=" + time + ", position=" + position + ", altitudeMeters=" + altitudeMeters
				+ ", distanceMeters=" + distanceMeters + ", heartRateBpm=" + heartRateBpm + ", cadence=" + cadence
				+ ", sensorState=" + sensorState + ", extensions=" + extensions + "]";
	}

}
