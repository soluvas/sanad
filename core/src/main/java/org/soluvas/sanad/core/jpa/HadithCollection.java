package org.soluvas.sanad.core.jpa;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>HadithCollection</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
public class HadithCollection extends CreativeWork {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "collection")
	private List<Hadith> hadiths = new ArrayList<Hadith>();

	/**
	 * Returns the value of '<em><b>hadiths</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>hadiths</b></em>' feature
	 * @generated
	 */
	public List<Hadith> getHadiths() {
		return hadiths;
	}

	/**
	 * Adds to the <em>hadiths</em> feature.
	 *
	 * @param hadithsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToHadiths(Hadith hadithsValue) {
		if (!hadiths.contains(hadithsValue)) {
			boolean result = hadiths.add(hadithsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>hadiths</em> feature.
	 *
	 * @param hadithsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromHadiths(Hadith hadithsValue) {
		if (hadiths.contains(hadithsValue)) {
			boolean result = hadiths.remove(hadithsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>hadiths</em> feature.
	 * 
	 * @generated
	 */
	public void clearHadiths() {
		while (!hadiths.isEmpty()) {
			removeFromHadiths(hadiths.iterator().next());
		}
	}

	/**
	 * Sets the '{@link HadithCollection#getHadiths() <em>hadiths</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newHadiths
	 *            the new value of the '{@link HadithCollection#getHadiths()
	 *            hadiths}' feature.
	 * @generated
	 */
	public void setHadiths(List<Hadith> newHadiths) {
		hadiths = newHadiths;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "HadithCollection ";
	}
}
