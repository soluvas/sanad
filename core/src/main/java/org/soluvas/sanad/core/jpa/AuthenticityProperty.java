package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>AuthenticityProperty</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
public class AuthenticityProperty extends Property {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private Authenticity authenticity = null;

	/**
	 * Returns the value of '<em><b>authenticity</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>authenticity</b></em>' feature
	 * @generated
	 */
	public Authenticity getAuthenticity() {
		return authenticity;
	}

	/**
	 * Sets the '{@link AuthenticityProperty#getAuthenticity()
	 * <em>authenticity</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAuthenticity
	 *            the new value of the '
	 *            {@link AuthenticityProperty#getAuthenticity() authenticity}'
	 *            feature.
	 * @generated
	 */
	public void setAuthenticity(Authenticity newAuthenticity) {
		authenticity = newAuthenticity;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "AuthenticityProperty " + " [authenticity: " + getAuthenticity()
				+ "]";
	}

	public AuthenticityProperty() {
		super();
	}

	public AuthenticityProperty(String id, Authenticity authenticity) {
		super();
		setId(id);
		setAuthenticity(authenticity);
	}

}
