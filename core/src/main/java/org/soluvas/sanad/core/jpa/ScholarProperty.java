package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>ScholarProperty</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
 * property refers to a {@link Scholar} which did not participate in the Sanad
 * system or was already deceased at the time of creation. <!-- end-model-doc
 * -->
 * 
 * @generated
 */
@Entity()
public class ScholarProperty extends Property {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String scholarId = null;

	/**
	 * Returns the value of '<em><b>scholarId</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>scholarId</b></em>' feature
	 * @generated
	 */
	public String getScholarId() {
		return scholarId;
	}

	/**
	 * Sets the '{@link ScholarProperty#getScholarId() <em>scholarId</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newScholarId
	 *            the new value of the '{@link ScholarProperty#getScholarId()
	 *            scholarId}' feature.
	 * @generated
	 */
	public void setScholarId(String newScholarId) {
		scholarId = newScholarId;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ScholarProperty " + " [scholarId: " + getScholarId() + "]";
	}
}
