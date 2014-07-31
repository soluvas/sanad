package org.soluvas.sanad.core.jpa;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>Hadith</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
public class Hadith extends CreativeWork {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "articlebodies_thing_id") })
	private Set<LiteralProperty> articleBodies = new HashSet<LiteralProperty>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinColumns({ @JoinColumn() })
	private HadithCollection collection = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Hadith number in the compendium, e.g. 1-7008 for Sahih Al-Bukhari in
	 * Arabic. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private Integer hadithNum = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Volume number of the HadithCollection, e.g. 1-9 for Sahih Al-Bukhari.
	 * <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private Integer volumeNum = null;

	/**
	 * Returns the value of '<em><b>articleBodies</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>articleBodies</b></em>' feature
	 * @generated
	 */
	public Set<LiteralProperty> getArticleBodies() {
		return articleBodies;
	}

	/**
	 * Adds to the <em>articleBodies</em> feature.
	 *
	 * @param articleBodiesValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToArticleBodies(LiteralProperty articleBodiesValue) {
		if (!articleBodies.contains(articleBodiesValue)) {
			boolean result = articleBodies.add(articleBodiesValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>articleBodies</em> feature.
	 *
	 * @param articleBodiesValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromArticleBodies(LiteralProperty articleBodiesValue) {
		if (articleBodies.contains(articleBodiesValue)) {
			boolean result = articleBodies.remove(articleBodiesValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>articleBodies</em> feature.
	 * 
	 * @generated
	 */
	public void clearArticleBodies() {
		while (!articleBodies.isEmpty()) {
			removeFromArticleBodies(articleBodies.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Hadith#getArticleBodies() <em>articleBodies</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newArticleBodies
	 *            the new value of the '{@link Hadith#getArticleBodies()
	 *            articleBodies}' feature.
	 * @generated
	 */
	public void setArticleBodies(Set<LiteralProperty> newArticleBodies) {
		articleBodies = newArticleBodies;
	}

	/**
	 * Returns the value of '<em><b>collection</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>collection</b></em>' feature
	 * @generated
	 */
	public HadithCollection getCollection() {
		return collection;
	}

	/**
	 * Sets the '{@link Hadith#getCollection() <em>collection</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCollection
	 *            the new value of the '{@link Hadith#getCollection()
	 *            collection}' feature.
	 * @generated
	 */
	public void setCollection(HadithCollection newCollection) {
		collection = newCollection;
	}

	/**
	 * Returns the value of '<em><b>hadithNum</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Hadith number in the compendium, e.g. 1-7008 for Sahih Al-Bukhari in
	 * Arabic. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>hadithNum</b></em>' feature
	 * @generated
	 */
	public Integer getHadithNum() {
		return hadithNum;
	}

	/**
	 * Sets the '{@link Hadith#getHadithNum() <em>hadithNum</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Hadith number in the compendium, e.g. 1-7008 for Sahih Al-Bukhari in
	 * Arabic. <!-- end-model-doc -->
	 * 
	 * @param newHadithNum
	 *            the new value of the '{@link Hadith#getHadithNum() hadithNum}'
	 *            feature.
	 * @generated
	 */
	public void setHadithNum(Integer newHadithNum) {
		hadithNum = newHadithNum;
	}

	/**
	 * Returns the value of '<em><b>volumeNum</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Volume number of the HadithCollection, e.g. 1-9 for Sahih Al-Bukhari.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>volumeNum</b></em>' feature
	 * @generated
	 */
	public Integer getVolumeNum() {
		return volumeNum;
	}

	/**
	 * Sets the '{@link Hadith#getVolumeNum() <em>volumeNum</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Volume number of the HadithCollection, e.g. 1-9 for Sahih Al-Bukhari.
	 * <!-- end-model-doc -->
	 * 
	 * @param newVolumeNum
	 *            the new value of the '{@link Hadith#getVolumeNum() volumeNum}'
	 *            feature.
	 * @generated
	 */
	public void setVolumeNum(Integer newVolumeNum) {
		volumeNum = newVolumeNum;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Hadith " + " [hadithNum: " + getHadithNum() + "]"
				+ " [volumeNum: " + getVolumeNum() + "]";
	}
}
