package org.soluvas.sanad.core.jpa;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
 * @generated
 */
@Entity()
@Table(schema = "sanad")
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
	@Basic()
	@Column(columnDefinition = "text")
	private String text = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Verse without tashkeel. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(columnDefinition = "text")
	private String textWithoutTashkeel = null;

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
	public String getText() {
		return text;
	}

	/**
	 * Sets the '{@link QuranVerse#getText() <em>text</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Verse with tashkeel. <!-- end-model-doc -->
	 * 
	 * @param newText
	 *            the new value of the '{@link QuranVerse#getText() text}'
	 *            feature.
	 * @generated
	 */
	public void setText(String newText) {
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
	public String getTextWithoutTashkeel() {
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
	public void setTextWithoutTashkeel(String newTextWithoutTashkeel) {
		textWithoutTashkeel = newTextWithoutTashkeel;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "QuranVerse " + " [verseNum: " + getVerseNum() + "]"
				+ " [text: " + getText() + "]" + " [textWithoutTashkeel: "
				+ getTextWithoutTashkeel() + "]";
	}
}
