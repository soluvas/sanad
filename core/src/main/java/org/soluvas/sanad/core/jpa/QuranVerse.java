package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>QuranVerse</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Slug is
 * quran-{chapterNum}-verse-{verseNum} ("verse" to avoid canonicalSlug
 * conflict). Name is "{chapterNameWithoutTashkeel} {verseNum}". <!--
 * end-model-doc -->
 * 
 */
@Entity()
@Table(schema = "sanad", indexes={
		@Index(name="quranverse_chapter_id_idx", columnList="chapter_id"),
		@Index(name="quranverse_versenum_idx", columnList="versenum"),
})
public class QuranVerse extends CreativeWork {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH }, optional = false)
	@JoinColumns({ @JoinColumn() })
	private QuranChapter chapter = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private int verseNum = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Verse with tashkeel. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.ALL })
	private Literal text = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Verse without tashkeel. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.ALL })
	private Literal textWithoutTashkeel = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Official English transliteration of the verse. Having it as a reference
	 * to a {@link Transliteration} allows comparison between
	 * incorrect/misleading spellings. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.ALL })
	private Transliteration transliteration = null;

	/**
	 * Returns the value of '<em><b>chapter</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>chapter</b></em>' feature
	 * @generated
	 */
	public QuranChapter getChapter() {
		return chapter;
	}

	/**
	 * Sets the '{@link QuranVerse#getChapter() <em>chapter</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newChapter
	 *            the new value of the '{@link QuranVerse#getChapter() chapter}'
	 *            feature.
	 * @generated
	 */
	public void setChapter(QuranChapter newChapter) {
		chapter = newChapter;
	}

	/**
	 * Returns the value of '<em><b>verseNum</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>verseNum</b></em>' feature
	 * @generated
	 */
	public int getVerseNum() {
		return verseNum;
	}

	/**
	 * Sets the '{@link QuranVerse#getVerseNum() <em>verseNum</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newVerseNum
	 *            the new value of the '{@link QuranVerse#getVerseNum()
	 *            verseNum}' feature.
	 * @generated
	 */
	public void setVerseNum(int newVerseNum) {
		verseNum = newVerseNum;
	}

	/**
	 * Returns the value of '<em><b>text</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Verse with tashkeel. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>text</b></em>' feature
	 * @generated
	 */
	public Literal getText() {
		return text;
	}

	/**
	 * Sets the '{@link QuranVerse#getText() <em>text</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Verse in official Arabic with tashkeel. <!-- end-model-doc -->
	 * 
	 * @param newText
	 *            the new value of the '{@link QuranVerse#getText() text}'
	 *            feature.
	 * @generated
	 */
	public void setText(Literal newText) {
		text = newText;
	}

	/**
	 * Returns the value of '<em><b>textWithoutTashkeel</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Verse without tashkeel. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>textWithoutTashkeel</b></em>' feature
	 * @generated
	 */
	public Literal getTextWithoutTashkeel() {
		return textWithoutTashkeel;
	}

	/**
	 * Sets the '{@link QuranVerse#getTextWithoutTashkeel()
	 * <em>textWithoutTashkeel</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Verse without tashkeel. <!-- end-model-doc -->
	 * 
	 * @param newTextWithoutTashkeel
	 *            the new value of the '
	 *            {@link QuranVerse#getTextWithoutTashkeel()
	 *            textWithoutTashkeel}' feature.
	 * @generated
	 */
	public void setTextWithoutTashkeel(Literal newTextWithoutTashkeel) {
		textWithoutTashkeel = newTextWithoutTashkeel;
	}

	/**
	 * Returns the value of '<em><b>transliteration</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Official English transliteration of the verse. Having it as a reference
	 * to a {@link Transliteration} allows comparison between
	 * incorrect/misleading spellings. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>transliteration</b></em>' feature
	 * @generated
	 */
	public Transliteration getTransliteration() {
		return transliteration;
	}

	/**
	 * Sets the '{@link QuranVerse#getTransliteration()
	 * <em>transliteration</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Official English transliteration of the verse. Having it as a reference
	 * to a {@link Transliteration} allows comparison between
	 * incorrect/misleading spellings. <!-- end-model-doc -->
	 * 
	 * @param newTransliteration
	 *            the new value of the '{@link QuranVerse#getTransliteration()
	 *            transliteration}' feature.
	 * @generated
	 */
	public void setTransliteration(Transliteration newTransliteration) {
		transliteration = newTransliteration;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "QuranVerse " + " [verseNum: " + getVerseNum() + "]";
	}
}
