package org.soluvas.sanad.core.jpa;

import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>LegalEntityProperty</b></em>'.
 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
 * Property that refers to legal/accountable entity such as person, scholar
 * (including deceased ones), or organization (including historical
 * organizations). <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity()
public abstract class LegalEntityProperty extends Property {

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "LegalEntityProperty ";
	}
}
