package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * A representation of the model object '<em><b>NarratorClaim</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Claims the
 * article is narrated by a {@link Scholar}. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity()
public class NarratorClaim extends Claim {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String scholarId = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private NarratorGrade grade = NarratorGrade.UNKNOWN;

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
	 * Sets the '{@link NarratorClaim#getScholarId() <em>scholarId</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newScholarId
	 *            the new value of the '{@link NarratorClaim#getScholarId()
	 *            scholarId}' feature.
	 * @generated
	 */
	public void setScholarId(String newScholarId) {
		scholarId = newScholarId;
	}

	/**
	 * Returns the value of '<em><b>grade</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>grade</b></em>' feature
	 * @generated
	 */
	public NarratorGrade getGrade() {
		return grade;
	}

	/**
	 * Sets the '{@link NarratorClaim#getGrade() <em>grade</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newGrade
	 *            the new value of the '{@link NarratorClaim#getGrade() grade}'
	 *            feature.
	 * @generated
	 */
	public void setGrade(NarratorGrade newGrade) {
		grade = newGrade;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "NarratorClaim " + " [scholarId: " + getScholarId() + "]"
				+ " [grade: " + getGrade() + "]";
	}
}
