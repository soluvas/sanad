package org.soluvas.sanad.core.jpa;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 * A representation of the model object '<em><b>Hadith</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
public class Hadith extends Thing {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	private Set<LiteralProperty> articleBodies = new HashSet<LiteralProperty>();

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
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Hadith ";
	}
}
