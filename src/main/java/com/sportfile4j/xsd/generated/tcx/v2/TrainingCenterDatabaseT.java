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
 * <p>Classe Java pour TrainingCenterDatabase_t complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="TrainingCenterDatabase_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Folders" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}Folders_t" minOccurs="0"/>
 *         &lt;element name="Activities" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}ActivityList_t" minOccurs="0"/>
 *         &lt;element name="Workouts" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}WorkoutList_t" minOccurs="0"/>
 *         &lt;element name="Courses" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}CourseList_t" minOccurs="0"/>
 *         &lt;element name="Author" type="{http://www.garmin.com/xmlschemas/TrainingCenterDatabase/v2}AbstractSource_t" minOccurs="0"/>
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
@XmlType(name = "TrainingCenterDatabase_t", propOrder = {
    "folders",
    "activities",
    "workouts",
    "courses",
    "author",
    "extensions"
})
public class TrainingCenterDatabaseT {

    @XmlElement(name = "Folders")
    protected FoldersT folders;
    @XmlElement(name = "Activities")
    protected ActivityListT activities;
    @XmlElement(name = "Workouts")
    protected WorkoutListT workouts;
    @XmlElement(name = "Courses")
    protected CourseListT courses;
    @XmlElement(name = "Author")
    protected AbstractSourceT author;
    @XmlElement(name = "Extensions")
    protected ExtensionsT extensions;

    /**
     * Obtient la valeur de la propri�t� folders.
     * 
     * @return
     *     possible object is
     *     {@link FoldersT }
     *     
     */
    public FoldersT getFolders() {
        return folders;
    }

    /**
     * D�finit la valeur de la propri�t� folders.
     * 
     * @param value
     *     allowed object is
     *     {@link FoldersT }
     *     
     */
    public void setFolders(FoldersT value) {
        this.folders = value;
    }

    /**
     * Obtient la valeur de la propri�t� activities.
     * 
     * @return
     *     possible object is
     *     {@link ActivityListT }
     *     
     */
    public ActivityListT getActivities() {
        return activities;
    }

    /**
     * D�finit la valeur de la propri�t� activities.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityListT }
     *     
     */
    public void setActivities(ActivityListT value) {
        this.activities = value;
    }

    /**
     * Obtient la valeur de la propri�t� workouts.
     * 
     * @return
     *     possible object is
     *     {@link WorkoutListT }
     *     
     */
    public WorkoutListT getWorkouts() {
        return workouts;
    }

    /**
     * D�finit la valeur de la propri�t� workouts.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkoutListT }
     *     
     */
    public void setWorkouts(WorkoutListT value) {
        this.workouts = value;
    }

    /**
     * Obtient la valeur de la propri�t� courses.
     * 
     * @return
     *     possible object is
     *     {@link CourseListT }
     *     
     */
    public CourseListT getCourses() {
        return courses;
    }

    /**
     * D�finit la valeur de la propri�t� courses.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseListT }
     *     
     */
    public void setCourses(CourseListT value) {
        this.courses = value;
    }

    /**
     * Obtient la valeur de la propri�t� author.
     * 
     * @return
     *     possible object is
     *     {@link AbstractSourceT }
     *     
     */
    public AbstractSourceT getAuthor() {
        return author;
    }

    /**
     * D�finit la valeur de la propri�t� author.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractSourceT }
     *     
     */
    public void setAuthor(AbstractSourceT value) {
        this.author = value;
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
		return "TrainingCenterDatabaseT [folders=" + folders + ", activities=" + activities + ", workouts=" + workouts
				+ ", courses=" + courses + ", author=" + author + ", extensions=" + extensions + "]";
	}
    
    

}
