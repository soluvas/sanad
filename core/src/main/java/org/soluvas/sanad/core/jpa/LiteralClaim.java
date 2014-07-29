package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * A representation of the model object '<em><b>LiteralClaim</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
public class LiteralClaim extends Claim {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Enumerated(EnumType.STRING)
	private Spelling spelling = Spelling.CASUAL;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Only needed if {@link transliteration} is {@code false}. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String languageTag = null;

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
	 * Sets the '{@link LiteralClaim#getSpelling() <em>spelling</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSpelling
	 *            the new value of the '{@link LiteralClaim#getSpelling()
	 *            spelling}' feature.
	 * @generated
	 */
	public void setSpelling(Spelling newSpelling) {
		spelling = newSpelling;
	}

	/**
	 * Returns the value of '<em><b>languageTag</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Only needed if {@link transliteration} is {@code false}. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of '<em><b>languageTag</b></em>' feature
	 * @generated
	 */
	public String getLanguageTag() {
		return languageTag;
	}

	/**
	 * Sets the '{@link LiteralClaim#getLanguageTag() <em>languageTag</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Only needed if {@link transliteration} is {@code false}. <!--
	 * end-model-doc -->
	 * 
	 * @param newLanguageTag
	 *            the new value of the '{@link LiteralClaim#getLanguageTag()
	 *            languageTag}' feature.
	 * @generated
	 */
	public void setLanguageTag(String newLanguageTag) {
		languageTag = newLanguageTag;
	}

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
	 * Sets the '{@link LiteralClaim#getAdoc() <em>adoc</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in AsciiDoc syntax. <!-- end-model-doc -->
	 * 
	 * @param newAdoc
	 *            the new value of the '{@link LiteralClaim#getAdoc() adoc}'
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
	 * Sets the '{@link LiteralClaim#getHtml() <em>html</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in HTML format. <!-- end-model-doc -->
	 * 
	 * @param newHtml
	 *            the new value of the '{@link LiteralClaim#getHtml() html}'
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
		return "LiteralClaim " + " [spelling: " + getSpelling() + "]"
				+ " [languageTag: " + getLanguageTag() + "]" + " [adoc: "
				+ getAdoc() + "]" + " [html: " + getHtml() + "]";
	}
}
