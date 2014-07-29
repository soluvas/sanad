package org.soluvas.sanad.core.jpa;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>Thing</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
public abstract class Thing {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "names_thing_id") })
	private Set<LiteralProperty> names = new HashSet<LiteralProperty>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "authenticities_thing_id") })
	private Set<AuthenticityProperty> authenticities = new HashSet<AuthenticityProperty>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "successivities_thing_id") })
	private Set<SuccessivityProperty> successivities = new HashSet<SuccessivityProperty>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "authors_thing_id") })
	private Set<Property> authors = new HashSet<Property>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Id()
	private UUID id = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Slug which is based on initial name. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private String slug = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Canonical slug which is based on initial name. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic(optional = false)
	private String canonicalSlug = null;

	/**
	 * Returns the value of '<em><b>names</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>names</b></em>' feature
	 * @generated
	 */
	public Set<LiteralProperty> getNames() {
		return names;
	}

	/**
	 * Adds to the <em>names</em> feature.
	 *
	 * @param namesValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToNames(LiteralProperty namesValue) {
		if (!names.contains(namesValue)) {
			boolean result = names.add(namesValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>names</em> feature.
	 *
	 * @param namesValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromNames(LiteralProperty namesValue) {
		if (names.contains(namesValue)) {
			boolean result = names.remove(namesValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>names</em> feature.
	 * 
	 * @generated
	 */
	public void clearNames() {
		while (!names.isEmpty()) {
			removeFromNames(names.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Thing#getNames() <em>names</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newNames
	 *            the new value of the '{@link Thing#getNames() names}' feature.
	 * @generated
	 */
	public void setNames(Set<LiteralProperty> newNames) {
		names = newNames;
	}

	/**
	 * Returns the value of '<em><b>authenticities</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>authenticities</b></em>' feature
	 * @generated
	 */
	public Set<AuthenticityProperty> getAuthenticities() {
		return authenticities;
	}

	/**
	 * Adds to the <em>authenticities</em> feature.
	 *
	 * @param authenticitiesValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToAuthenticities(AuthenticityProperty authenticitiesValue) {
		if (!authenticities.contains(authenticitiesValue)) {
			boolean result = authenticities.add(authenticitiesValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>authenticities</em> feature.
	 *
	 * @param authenticitiesValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromAuthenticities(
			AuthenticityProperty authenticitiesValue) {
		if (authenticities.contains(authenticitiesValue)) {
			boolean result = authenticities.remove(authenticitiesValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>authenticities</em> feature.
	 * 
	 * @generated
	 */
	public void clearAuthenticities() {
		while (!authenticities.isEmpty()) {
			removeFromAuthenticities(authenticities.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Thing#getAuthenticities() <em>authenticities</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAuthenticities
	 *            the new value of the '{@link Thing#getAuthenticities()
	 *            authenticities}' feature.
	 * @generated
	 */
	public void setAuthenticities(Set<AuthenticityProperty> newAuthenticities) {
		authenticities = newAuthenticities;
	}

	/**
	 * Returns the value of '<em><b>successivities</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>successivities</b></em>' feature
	 * @generated
	 */
	public Set<SuccessivityProperty> getSuccessivities() {
		return successivities;
	}

	/**
	 * Adds to the <em>successivities</em> feature.
	 *
	 * @param successivitiesValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToSuccessivities(SuccessivityProperty successivitiesValue) {
		if (!successivities.contains(successivitiesValue)) {
			boolean result = successivities.add(successivitiesValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>successivities</em> feature.
	 *
	 * @param successivitiesValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromSuccessivities(
			SuccessivityProperty successivitiesValue) {
		if (successivities.contains(successivitiesValue)) {
			boolean result = successivities.remove(successivitiesValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>successivities</em> feature.
	 * 
	 * @generated
	 */
	public void clearSuccessivities() {
		while (!successivities.isEmpty()) {
			removeFromSuccessivities(successivities.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Thing#getSuccessivities() <em>successivities</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSuccessivities
	 *            the new value of the '{@link Thing#getSuccessivities()
	 *            successivities}' feature.
	 * @generated
	 */
	public void setSuccessivities(Set<SuccessivityProperty> newSuccessivities) {
		successivities = newSuccessivities;
	}

	/**
	 * Returns the value of '<em><b>authors</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>authors</b></em>' feature
	 * @generated
	 */
	public Set<Property> getAuthors() {
		return authors;
	}

	/**
	 * Adds to the <em>authors</em> feature.
	 *
	 * @param authorsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToAuthors(Property authorsValue) {
		if (!authors.contains(authorsValue)) {
			boolean result = authors.add(authorsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>authors</em> feature.
	 *
	 * @param authorsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromAuthors(Property authorsValue) {
		if (authors.contains(authorsValue)) {
			boolean result = authors.remove(authorsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>authors</em> feature.
	 * 
	 * @generated
	 */
	public void clearAuthors() {
		while (!authors.isEmpty()) {
			removeFromAuthors(authors.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Thing#getAuthors() <em>authors</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newAuthors
	 *            the new value of the '{@link Thing#getAuthors() authors}'
	 *            feature.
	 * @generated
	 */
	public void setAuthors(Set<Property> newAuthors) {
		authors = newAuthors;
	}

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public UUID getId() {
		return id;
	}

	/**
	 * Sets the '{@link Thing#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newId
	 *            the new value of the '{@link Thing#getId() id}' feature.
	 * @generated
	 */
	public void setId(UUID newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>slug</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Slug which is based on initial name. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>slug</b></em>' feature
	 * @generated
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Sets the '{@link Thing#getSlug() <em>slug</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Slug which is based on initial name. <!-- end-model-doc -->
	 * 
	 * @param newSlug
	 *            the new value of the '{@link Thing#getSlug() slug}' feature.
	 * @generated
	 */
	public void setSlug(String newSlug) {
		slug = newSlug;
	}

	/**
	 * Returns the value of '<em><b>canonicalSlug</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Canonical slug which is based on initial name. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>canonicalSlug</b></em>' feature
	 * @generated
	 */
	public String getCanonicalSlug() {
		return canonicalSlug;
	}

	/**
	 * Sets the '{@link Thing#getCanonicalSlug() <em>canonicalSlug</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Canonical slug which is based on initial name. <!-- end-model-doc -->
	 * 
	 * @param newCanonicalSlug
	 *            the new value of the '{@link Thing#getCanonicalSlug()
	 *            canonicalSlug}' feature.
	 * @generated
	 */
	public void setCanonicalSlug(String newCanonicalSlug) {
		canonicalSlug = newCanonicalSlug;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Thing " + " [id: " + getId() + "]" + " [slug: " + getSlug()
				+ "]" + " [canonicalSlug: " + getCanonicalSlug() + "]";
	}
}
