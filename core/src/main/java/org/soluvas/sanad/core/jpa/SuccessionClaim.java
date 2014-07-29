package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * A representation of the model object '<em><b>SuccessionClaim</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Claims that
 * specified Concept has the specified succession (sanad/isnad).
 * mashhur/aziz/gharib implies "singular" ahaad (آحاد) <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity()
public class SuccessionClaim extends Claim {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private Succession succession = Succession.WORDING;

	/**
	 * Returns the value of '<em><b>succession</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>succession</b></em>' feature
	 * @generated
	 */
	public Succession getSuccession() {
		return succession;
	}

	/**
	 * Sets the '{@link SuccessionClaim#getSuccession() <em>succession</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSuccession
	 *            the new value of the '{@link SuccessionClaim#getSuccession()
	 *            succession}' feature.
	 * @generated
	 */
	public void setSuccession(Succession newSuccession) {
		succession = newSuccession;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "SuccessionClaim " + " [succession: " + getSuccession() + "]";
	}
}
