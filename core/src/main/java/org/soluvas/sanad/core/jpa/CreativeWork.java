package org.soluvas.sanad.core.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>CreativeWork</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 */
@Entity()
@Table(schema = "sanad", indexes={
		@Index(name="creativework_inlanguage_idx", columnList="inlanguage"),
		@Index(name="creativework_author_idx", columnList="author")
})
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "creativeWork")
	private Set<Transliteration> transliterations = new HashSet<Transliteration>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "creativeWork")
	private Set<Literal> texts = new HashSet<Literal>();

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
	 * Returns the value of '<em><b>transliterations</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>transliterations</b></em>' feature
	 * @generated
	 */
	public Set<Transliteration> getTransliterations() {
		return transliterations;
	}

	/**
	 * Adds to the <em>transliterations</em> feature.
	 *
	 * @param transliterationsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToTransliterations(Transliteration transliterationsValue) {
		if (!transliterations.contains(transliterationsValue)) {
			boolean result = transliterations.add(transliterationsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>transliterations</em> feature.
	 *
	 * @param transliterationsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromTransliterations(
			Transliteration transliterationsValue) {
		if (transliterations.contains(transliterationsValue)) {
			boolean result = transliterations.remove(transliterationsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>transliterations</em> feature.
	 * 
	 * @generated
	 */
	public void clearTransliterations() {
		while (!transliterations.isEmpty()) {
			removeFromTransliterations(transliterations.iterator().next());
		}
	}

	/**
	 * Sets the '{@link CreativeWork#getTransliterations()
	 * <em>transliterations</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTransliterations
	 *            the new value of the '
	 *            {@link CreativeWork#getTransliterations() transliterations}'
	 *            feature.
	 * @generated
	 */
	public void setTransliterations(Set<Transliteration> newTransliterations) {
		transliterations = newTransliterations;
	}

	/**
	 * Returns the value of '<em><b>texts</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>texts</b></em>' feature
	 * @generated
	 */
	public Set<Literal> getTexts() {
		return texts;
	}

	/**
	 * Adds to the <em>texts</em> feature.
	 *
	 * @param textsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToTexts(Literal textsValue) {
		if (!texts.contains(textsValue)) {
			boolean result = texts.add(textsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>texts</em> feature.
	 *
	 * @param textsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromTexts(Literal textsValue) {
		if (texts.contains(textsValue)) {
			boolean result = texts.remove(textsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>texts</em> feature.
	 * 
	 * @generated
	 */
	public void clearTexts() {
		while (!texts.isEmpty()) {
			removeFromTexts(texts.iterator().next());
		}
	}

	/**
	 * Sets the '{@link CreativeWork#getTexts() <em>texts</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newTexts
	 *            the new value of the '{@link CreativeWork#getTexts() texts}'
	 *            feature.
	 * @generated
	 */
	public void setTexts(Set<Literal> newTexts) {
		texts = newTexts;
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
