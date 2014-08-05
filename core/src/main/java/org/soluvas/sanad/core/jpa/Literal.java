package org.soluvas.sanad.core.jpa;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.soluvas.sanad.core.AsciidocUtils;
import com.google.common.html.HtmlEscapers;

/**
 * A representation of the model object '<em><b>Literal</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 */
@Entity()
@Table(schema = "sanad", indexes = {
		// normalized cannot be indexed because too large
		@Index(name = "literal_creativework_id_idx", columnList = "creativework_id"),
		@Index(name = "literal_numeronym_idx", columnList = "numeronym"),
		@Index(name = "literal_inlanguage_idx", columnList = "inlanguage") })
public class Literal extends Property {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in AsciiDoc syntax. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(columnDefinition = "text")
	private String adoc = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in HTML format. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(columnDefinition = "text")
	private String html = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "literal_id") })
	private Set<SpellingProperty> spellings = new HashSet<SpellingProperty>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private CreativeWork creativeWork = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For translated literals, specify the person or organization name of the
	 * translator. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String translator = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Normalized text. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(columnDefinition = "text")
	private String normalized = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Numeronym of the text, in order to improve privacy during query. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String numeronym = null;

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
	 * Sets the '{@link Literal#getAdoc() <em>adoc</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in AsciiDoc syntax. <!-- end-model-doc -->
	 * 
	 * @param newAdoc
	 *            the new value of the '{@link Literal#getAdoc() adoc}' feature.
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
	 * Sets the '{@link Literal#getHtml() <em>html</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> If
	 * a literal/translation, in HTML format. <!-- end-model-doc -->
	 * 
	 * @param newHtml
	 *            the new value of the '{@link Literal#getHtml() html}' feature.
	 * @generated
	 */
	public void setHtml(String newHtml) {
		html = newHtml;
	}

	/**
	 * Returns the value of '<em><b>spellings</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>spellings</b></em>' feature
	 * @generated
	 */
	public Set<SpellingProperty> getSpellings() {
		return spellings;
	}

	/**
	 * Adds to the <em>spellings</em> feature.
	 *
	 * @param spellingsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToSpellings(SpellingProperty spellingsValue) {
		if (!spellings.contains(spellingsValue)) {
			boolean result = spellings.add(spellingsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>spellings</em> feature.
	 *
	 * @param spellingsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromSpellings(SpellingProperty spellingsValue) {
		if (spellings.contains(spellingsValue)) {
			boolean result = spellings.remove(spellingsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>spellings</em> feature.
	 * 
	 * @generated
	 */
	public void clearSpellings() {
		while (!spellings.isEmpty()) {
			removeFromSpellings(spellings.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Literal#getSpellings() <em>spellings</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSpellings
	 *            the new value of the '{@link Literal#getSpellings() spellings}
	 *            ' feature.
	 * @generated
	 */
	public void setSpellings(Set<SpellingProperty> newSpellings) {
		spellings = newSpellings;
	}

	/**
	 * Returns the value of '<em><b>creativeWork</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>creativeWork</b></em>' feature
	 * @generated
	 */
	public CreativeWork getCreativeWork() {
		return creativeWork;
	}

	/**
	 * Sets the '{@link Literal#getCreativeWork() <em>creativeWork</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCreativeWork
	 *            the new value of the '{@link Literal#getCreativeWork()
	 *            creativeWork}' feature.
	 * @generated
	 */
	public void setCreativeWork(CreativeWork newCreativeWork) {
		creativeWork = newCreativeWork;
	}

	/**
	 * Returns the value of '<em><b>translator</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For translated literals, specify the person or organization name of the
	 * translator. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>translator</b></em>' feature
	 * @generated
	 */
	public String getTranslator() {
		return translator;
	}

	/**
	 * Sets the '{@link Literal#getTranslator() <em>translator</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For translated literals, specify the person or organization name of the
	 * translator. <!-- end-model-doc -->
	 * 
	 * @param newTranslator
	 *            the new value of the '{@link Literal#getTranslator()
	 *            translator}' feature.
	 * @generated
	 */
	public void setTranslator(String newTranslator) {
		translator = newTranslator;
	}

	/**
	 * Returns the value of '<em><b>normalized</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Normalized text. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>normalized</b></em>' feature
	 * @generated
	 */
	public String getNormalized() {
		return normalized;
	}

	/**
	 * Sets the '{@link Literal#getNormalized() <em>normalized</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Normalized text. <!-- end-model-doc -->
	 * 
	 * @param newNormalized
	 *            the new value of the '{@link Literal#getNormalized()
	 *            normalized}' feature.
	 * @generated
	 */
	public void setNormalized(String newNormalized) {
		normalized = newNormalized;
	}

	/**
	 * Returns the value of '<em><b>numeronym</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Numeronym of the text, in order to improve privacy during query. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of '<em><b>numeronym</b></em>' feature
	 * @generated
	 */
	public String getNumeronym() {
		return numeronym;
	}

	/**
	 * Sets the '{@link Literal#getNumeronym() <em>numeronym</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Numeronym of the text, in order to improve privacy during query. <!--
	 * end-model-doc -->
	 * 
	 * @param newNumeronym
	 *            the new value of the '{@link Literal#getNumeronym() numeronym}
	 *            ' feature.
	 * @generated
	 */
	public void setNumeronym(String newNumeronym) {
		numeronym = newNumeronym;
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
	 * Sets the '{@link Literal#getInLanguage() <em>inLanguage</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Language tag as specified by <a
	 * href="http://tools.ietf.org/html/bcp47">IETF BCP 47</a>. <!--
	 * end-model-doc -->
	 * 
	 * @param newInLanguage
	 *            the new value of the '{@link Literal#getInLanguage()
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
		return "Literal " + " [normalized: " + getNormalized() + "]"
				+ " [numeronym: " + getNumeronym() + "]" + " [inLanguage: "
				+ getInLanguage() + "]" + " [adoc: " + getAdoc() + "]"
				+ " [html: " + getHtml() + "]" + " [translator: "
				+ getTranslator() + "]";
	}

	public void assignAdoc(String adoc) {
		setAdoc(adoc);
		setHtml(HtmlEscapers.htmlEscaper().escape(adoc));
		setNormalized(AsciidocUtils.normalize(adoc));
	}

}
