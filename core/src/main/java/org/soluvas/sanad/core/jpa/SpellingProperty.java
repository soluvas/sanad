package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>SpellingProperty</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
public class SpellingProperty extends Property {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private Spelling spelling = null;

	/**
	 * Returns the value of '<em><b>spelling</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>spelling</b></em>' feature
	 * @generated
	 */
	public Spelling getSpelling() {
		return spelling;
	}

	/**
	 * Sets the '{@link SpellingProperty#getSpelling() <em>spelling</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSpelling
	 *            the new value of the '{@link SpellingProperty#getSpelling()
	 *            spelling}' feature.
	 * @generated
	 */
	public void setSpelling(Spelling newSpelling) {
		spelling = newSpelling;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "SpellingProperty " + " [spelling: " + getSpelling() + "]";
	}

	public SpellingProperty() {
		super();
	}

	public SpellingProperty(String id, Spelling spelling) {
		super();
		setId(id);
		setSpelling(spelling);
	}

}
