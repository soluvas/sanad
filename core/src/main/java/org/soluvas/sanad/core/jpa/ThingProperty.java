package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>ThingProperty</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
public class ThingProperty extends Property {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private ThingKind thingKind = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, optional = false)
	private Thing thing = null;

	/**
	 * Returns the value of '<em><b>thingKind</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>thingKind</b></em>' feature
	 * @generated
	 */
	public ThingKind getThingKind() {
		return thingKind;
	}

	/**
	 * Sets the '{@link ThingProperty#getThingKind() <em>thingKind</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newThingKind
	 *            the new value of the '{@link ThingProperty#getThingKind()
	 *            thingKind}' feature.
	 * @generated
	 */
	public void setThingKind(ThingKind newThingKind) {
		thingKind = newThingKind;
	}

	/**
	 * Returns the value of '<em><b>thing</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>thing</b></em>' feature
	 * @generated
	 */
	public Thing getThing() {
		return thing;
	}

	/**
	 * Sets the '{@link ThingProperty#getThing() <em>thing</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newThing
	 *            the new value of the '{@link ThingProperty#getThing() thing}'
	 *            feature.
	 * @generated
	 */
	public void setThing(Thing newThing) {
		thing = newThing;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ThingProperty " + " [thingKind: " + getThingKind() + "]";
	}
}
