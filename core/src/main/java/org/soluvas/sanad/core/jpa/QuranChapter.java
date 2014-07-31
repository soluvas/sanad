package org.soluvas.sanad.core.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>QuranChapter</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> Slug is
 * quran-{positioner}. Name is with arabic without tashkeel, as in Tanzil.net.
 * <!-- end-model-doc -->
 * 
 */
@Entity()
@Table(schema = "sanad", indexes={
		@Index(name="quranchapter_chapternum_idx", columnList="chapternum"),
})
public class QuranChapter extends CreativeWork {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Chapter number (1..114). <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(unique = true)
	private int chapterNum = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Chapter name with tashkeel. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String nameWithTashkeel = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "chapter")
	@OrderColumn(name = "verseNum")
	private List<QuranVerse> verses = new ArrayList<QuranVerse>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Official English transliteration of the name. Having it as a reference to
	 * a {@link Transliteration} allows comparison between incorrect/misleading
	 * spellings. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.ALL })
	private Transliteration nameTransliteration = null;

	/**
	 * Returns the value of '<em><b>chapterNum</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Chapter number (1..114). <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>chapterNum</b></em>' feature
	 * @generated
	 */
	public int getChapterNum() {
		return chapterNum;
	}

	/**
	 * Sets the '{@link QuranChapter#getChapterNum() <em>chapterNum</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Chapter number (1..114). <!-- end-model-doc -->
	 * 
	 * @param newChapterNum
	 *            the new value of the '{@link QuranChapter#getChapterNum()
	 *            chapterNum}' feature.
	 * @generated
	 */
	public void setChapterNum(int newChapterNum) {
		chapterNum = newChapterNum;
	}

	/**
	 * Returns the value of '<em><b>nameWithTashkeel</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Chapter name with tashkeel. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>nameWithTashkeel</b></em>' feature
	 * @generated
	 */
	public String getNameWithTashkeel() {
		return nameWithTashkeel;
	}

	/**
	 * Sets the '{@link QuranChapter#getNameWithTashkeel()
	 * <em>nameWithTashkeel</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Chapter name with tashkeel. <!-- end-model-doc -->
	 * 
	 * @param newNameWithTashkeel
	 *            the new value of the '
	 *            {@link QuranChapter#getNameWithTashkeel() nameWithTashkeel}'
	 *            feature.
	 * @generated
	 */
	public void setNameWithTashkeel(String newNameWithTashkeel) {
		nameWithTashkeel = newNameWithTashkeel;
	}

	/**
	 * Returns the value of '<em><b>verses</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>verses</b></em>' feature
	 * @generated
	 */
	public List<QuranVerse> getVerses() {
		return verses;
	}

	/**
	 * Adds to the <em>verses</em> feature.
	 *
	 * @param versesValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToVerses(QuranVerse versesValue) {
		if (!verses.contains(versesValue)) {
			boolean result = verses.add(versesValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>verses</em> feature.
	 *
	 * @param versesValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromVerses(QuranVerse versesValue) {
		if (verses.contains(versesValue)) {
			boolean result = verses.remove(versesValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>verses</em> feature.
	 * 
	 * @generated
	 */
	public void clearVerses() {
		while (!verses.isEmpty()) {
			removeFromVerses(verses.iterator().next());
		}
	}

	/**
	 * Sets the '{@link QuranChapter#getVerses() <em>verses</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newVerses
	 *            the new value of the '{@link QuranChapter#getVerses() verses}'
	 *            feature.
	 * @generated
	 */
	public void setVerses(List<QuranVerse> newVerses) {
		verses = newVerses;
	}

	/**
	 * Returns the value of '<em><b>nameTransliteration</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Official English transliteration of the name. Having it as a reference to
	 * a {@link Transliteration} allows comparison between incorrect/misleading
	 * spellings. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>nameTransliteration</b></em>' feature
	 * @generated
	 */
	public Transliteration getNameTransliteration() {
		return nameTransliteration;
	}

	/**
	 * Sets the '{@link QuranChapter#getNameTransliteration()
	 * <em>nameTransliteration</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Official English transliteration of the name. Having it as a reference to
	 * a {@link Transliteration} allows comparison between incorrect/misleading
	 * spellings. <!-- end-model-doc -->
	 * 
	 * @param newNameTransliteration
	 *            the new value of the '
	 *            {@link QuranChapter#getNameTransliteration()
	 *            nameTransliteration}' feature.
	 * @generated
	 */
	public void setNameTransliteration(Transliteration newNameTransliteration) {
		nameTransliteration = newNameTransliteration;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "QuranChapter " + " [chapterNum: " + getChapterNum() + "]"
				+ " [nameWithTashkeel: " + getNameWithTashkeel() + "]";
	}
}
