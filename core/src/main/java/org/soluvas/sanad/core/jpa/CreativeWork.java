package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>CreativeWork</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
public class CreativeWork extends Thing {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String author = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Language tag as specified by <a
	 * href="http://tools.ietf.org/html/bcp47">IETF BCP 47</a>. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String inLanguage = null;

	/**
	 * Returns the value of '<em><b>author</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>author</b></em>' feature
	 * @generated
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the '{@link CreativeWork#getAuthor() <em>author</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAuthor
	 *            the new value of the '{@link CreativeWork#getAuthor() author}'
	 *            feature.
	 * @generated
	 */
	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}

	/**
	 * Returns the value of '<em><b>inLanguage</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Language tag as specified by <a
	 * href="http://tools.ietf.org/html/bcp47">IETF BCP 47</a>. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of '<em><b>inLanguage</b></em>' feature
	 * @generated
	 */
	public String getInLanguage() {
		return inLanguage;
	}

	/**
	 * Sets the '{@link CreativeWork#getInLanguage() <em>inLanguage</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Language tag as specified by <a
	 * href="http://tools.ietf.org/html/bcp47">IETF BCP 47</a>. <!--
	 * end-model-doc -->
	 * 
	 * @param newInLanguage
	 *            the new value of the '{@link CreativeWork#getInLanguage()
	 *            inLanguage}' feature.
	 * @generated
	 */
	public void setInLanguage(String newInLanguage) {
		inLanguage = newInLanguage;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "CreativeWork " + " [author: " + getAuthor() + "]"
				+ " [inLanguage: " + getInLanguage() + "]";
	}
}
