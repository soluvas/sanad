package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>PersonProperty</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> The
 * property refers to a {@link Person}. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
public class PersonProperty extends LegalEntityProperty {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private String personId = null;

	/**
	 * Returns the value of '<em><b>personId</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>personId</b></em>' feature
	 * @generated
	 */
	public String getPersonId() {
		return personId;
	}

	/**
	 * Sets the '{@link PersonProperty#getPersonId() <em>personId</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newPersonId
	 *            the new value of the '{@link PersonProperty#getPersonId()
	 *            personId}' feature.
	 * @generated
	 */
	public void setPersonId(String newPersonId) {
		personId = newPersonId;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "PersonProperty " + " [personId: " + getPersonId() + "]";
	}
}
