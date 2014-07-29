package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * A representation of the model object '<em><b>ThingClaim</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
public class ThingClaim extends Claim {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
	 * Thing's kind cannot be revised. To revise a Thing, claim a new Thing
	 * using the new kind then revoke the old Thing. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private ThingKind kind = null;

	/**
	 * Returns the value of '<em><b>kind</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
	 * Thing's kind cannot be revised. To revise a Thing, claim a new Thing
	 * using the new kind then revoke the old Thing. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>kind</b></em>' feature
	 * @generated
	 */
	public ThingKind getKind() {
		return kind;
	}

	/**
	 * Sets the '{@link ThingClaim#getKind() <em>kind</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
	 * Thing's kind cannot be revised. To revise a Thing, claim a new Thing
	 * using the new kind then revoke the old Thing. <!-- end-model-doc -->
	 * 
	 * @param newKind
	 *            the new value of the '{@link ThingClaim#getKind() kind}'
	 *            feature.
	 * @generated
	 */
	public void setKind(ThingKind newKind) {
		kind = newKind;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "ThingClaim " + " [kind: " + getKind() + "]";
	}
}
