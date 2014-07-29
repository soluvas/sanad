package org.soluvas.sanad.core.jpa;

import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>Evidence</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> i.e. book
 * cover, screenshot. An evidence can still be faked, so an evidence's
 * authenticity can be proven independently. An evidence can be used to support
 * one or more claims. <!-- end-model-doc -->
 * 
 * @generated
 */
@Entity()
public class Evidence extends Thing {

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Evidence ";
	}
}
