package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * A representation of the model object '<em><b>LiteralProperty</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
public class LiteralProperty extends Property {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in AsciiDoc syntax. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String adoc = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in HTML format. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String html = null;

	/**
	 * Returns the value of '<em><b>adoc</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in AsciiDoc syntax. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>adoc</b></em>' feature
	 * @generated
	 */
	public String getAdoc() {
		return adoc;
	}

	/**
	 * Sets the '{@link LiteralProperty#getAdoc() <em>adoc</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in AsciiDoc syntax. <!-- end-model-doc -->
	 * 
	 * @param newAdoc
	 *            the new value of the '{@link LiteralProperty#getAdoc() adoc}'
	 *            feature.
	 * @generated
	 */
	public void setAdoc(String newAdoc) {
		adoc = newAdoc;
	}

	/**
	 * Returns the value of '<em><b>html</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in HTML format. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>html</b></em>' feature
	 * @generated
	 */
	public String getHtml() {
		return html;
	}

	/**
	 * Sets the '{@link LiteralProperty#getHtml() <em>html</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in HTML format. <!-- end-model-doc -->
	 * 
	 * @param newHtml
	 *            the new value of the '{@link LiteralProperty#getHtml() html}'
	 *            feature.
	 * @generated
	 */
	public void setHtml(String newHtml) {
		html = newHtml;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "LiteralProperty " + " [adoc: " + getAdoc() + "]" + " [html: "
				+ getHtml() + "]";
	}
}
