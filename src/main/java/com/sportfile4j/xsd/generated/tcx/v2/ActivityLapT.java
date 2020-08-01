//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2020.07.31 � 09:33:44 PM EDT 
//


package com.sportfile4j.xsd.generated.tcx.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour ActivityLap_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ActivityLap_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalTimeSeconds" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="DistanceMeters" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="MaximumSpeed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Calories" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/>
 *         &lt;element name="AverageHeartRateBpm" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateInBeatsPerMinute_t" minOccurs="0"/>
 *         &lt;element name="MaximumHeartRateBpm" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}HeartRateInBeatsPerMinute_t" minOccurs="0"/>
 *         &lt;element name="Intensity" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Intensity_t"/>
 *         &lt;element name="Cadence" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CadenceValue_t" minOccurs="0"/>
 *         &lt;element name="TriggerMethod" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}TriggerMethod_t"/>
 *         &lt;element name="Track" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Track_t" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Extensions" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Extensions_t" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StartTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityLap_t", propOrder = {
    "totalTimeSeconds",
    "distanceMeters",
    "maximumSpeed",
    "calories",
    "averageHeartRateBpm",
    "maximumHeartRateBpm",
    "intensity",
    "cadence",
    "triggerMethod",
    "track",
    "notes",
    "extensions"
})
public class ActivityLapT {

    @XmlElement(name = "TotalTimeSeconds")
    protected double totalTimeSeconds;
    @XmlElement(name = "DistanceMeters")
    protected double distanceMeters;
    @XmlElement(name = "MaximumSpeed")
    protected Double maximumSpeed;
    @XmlElement(name = "Calories")
    @XmlSchemaType(name = "unsignedShort")
    protected int calories;
    @XmlElement(name = "AverageHeartRateBpm")
    protected HeartRateInBeatsPerMinuteT averageHeartRateBpm;
    @XmlElement(name = "MaximumHeartRateBpm")
    protected HeartRateInBeatsPerMinuteT maximumHeartRateBpm;
    @XmlElement(name = "Intensity", required = true)
    @XmlSchemaType(name = "token")
    protected IntensityT intensity;
    @XmlElement(name = "Cadence")
    @XmlSchemaType(name = "unsignedByte")
    protected Short cadence;
    @XmlElement(name = "TriggerMethod", required = true)
    @XmlSchemaType(name = "token")
    protected TriggerMethodT triggerMethod;
    @XmlElement(name = "Track")
    protected List<TrackT> track;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;
    @XmlAttribute(name = "StartTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;

    /**
     * Obtient la valeur de la propri�t� totalTimeSeconds.
     * 
     */
    public double getTotalTimeSeconds() {
        return totalTimeSeconds;
    }

    /**
     * D�finit la valeur de la propri�t� totalTimeSeconds.
     * 
     */
    public void setTotalTimeSeconds(double value) {
        this.totalTimeSeconds = value;
    }

    /**
     * Obtient la valeur de la propri�t� distanceMeters.
     * 
     */
    public double getDistanceMeters() {
        return distanceMeters;
    }

    /**
     * D�finit la valeur de la propri�t� distanceMeters.
     * 
     */
    public void setDistanceMeters(double value) {
        this.distanceMeters = value;
    }

    /**
     * Obtient la valeur de la propri�t� maximumSpeed.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumSpeed() {
        return maximumSpeed;
    }

    /**
     * D�finit la valeur de la propri�t� maximumSpeed.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumSpeed(Double value) {
        this.maximumSpeed = value;
    }

    /**
     * Obtient la valeur de la propri�t� calories.
     * 
     */
    public int getCalories() {
        return calories;
    }

    /**
     * D�finit la valeur de la propri�t� calories.
     * 
     */
    public void setCalories(int value) {
        this.calories = value;
    }

    /**
     * Obtient la valeur de la propri�t� averageHeartRateBpm.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public HeartRateInBeatsPerMinuteT getAverageHeartRateBpm() {
        return averageHeartRateBpm;
    }

    /**
     * D�finit la valeur de la propri�t� averageHeartRateBpm.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public void setAverageHeartRateBpm(HeartRateInBeatsPerMinuteT value) {
        this.averageHeartRateBpm = value;
    }

    /**
     * Obtient la valeur de la propri�t� maximumHeartRateBpm.
     * 
     * @return
     *     possible object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public HeartRateInBeatsPerMinuteT getMaximumHeartRateBpm() {
        return maximumHeartRateBpm;
    }

    /**
     * D�finit la valeur de la propri�t� maximumHeartRateBpm.
     * 
     * @param value
     *     allowed object is
     *     {@link HeartRateInBeatsPerMinuteT }
     *     
     */
    public void setMaximumHeartRateBpm(HeartRateInBeatsPerMinuteT value) {
        this.maximumHeartRateBpm = value;
    }

    /**
     * Obtient la valeur de la propri�t� intensity.
     * 
     * @return
     *     possible object is
     *     {@link IntensityT }
     *     
     */
    public IntensityT getIntensity() {
        return intensity;
    }

    /**
     * D�finit la valeur de la propri�t� intensity.
     * 
     * @param value
     *     allowed object is
     *     {@link IntensityT }
     *     
     */
    public void setIntensity(IntensityT value) {
        this.intensity = value;
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
     * Obtient la valeur de la propri�t� triggerMethod.
     * 
     * @return
     *     possible object is
     *     {@link TriggerMethodT }
     *     
     */
    public TriggerMethodT getTriggerMethod() {
        return triggerMethod;
    }

    /**
     * D�finit la valeur de la propri�t� triggerMethod.
     * 
     * @param value
     *     allowed object is
     *     {@link TriggerMethodT }
     *     
     */
    public void setTriggerMethod(TriggerMethodT value) {
        this.triggerMethod = value;
    }

    /**
     * Gets the value of the track property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the track property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackT }
     * 
     * 
     */
    public List<TrackT> getTrack() {
        if (track == null) {
            track = new ArrayList<TrackT>();
        }
        return this.track;
    }

    /**
     * Obtient la valeur de la propri�t� notes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * D�finit la valeur de la propri�t� notes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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

    /**
     * Obtient la valeur de la propri�t� startTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * D�finit la valeur de la propri�t� startTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

	@Override
	public String toString() {
		return "ActivityLapT [totalTimeSeconds=" + totalTimeSeconds + ", distanceMeters=" + distanceMeters
				+ ", maximumSpeed=" + maximumSpeed + ", calories=" + calories + ", averageHeartRateBpm="
				+ averageHeartRateBpm + ", maximumHeartRateBpm=" + maximumHeartRateBpm + ", intensity=" + intensity
				+ ", cadence=" + cadence + ", triggerMethod=" + triggerMethod + ", track=" + track + ", notes=" + notes
				+ ", extensions=" + extensions + ", startTime=" + startTime + "]";
	}

}
