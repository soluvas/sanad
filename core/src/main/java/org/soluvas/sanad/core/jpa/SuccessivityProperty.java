package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * A representation of the model object '<em><b>SuccessivityProperty</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
public class SuccessivityProperty extends Property {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private Successivity successivity = null;

	/**
	 * Returns the value of '<em><b>successivity</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>successivity</b></em>' feature
	 * @generated
	 */
	public Successivity getSuccessivity() {
		return successivity;
	}

	/**
	 * Sets the '{@link SuccessivityProperty#getSuccessivity()
	 * <em>successivity</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSuccessivity
	 *            the new value of the '
	 *            {@link SuccessivityProperty#getSuccessivity() successivity}'
	 *            feature.
	 * @generated
	 */
	public void setSuccessivity(Successivity newSuccessivity) {
		successivity = newSuccessivity;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "SuccessivityProperty " + " [successivity: " + getSuccessivity()
				+ "]";
	}
}
