package org.soluvas.sanad.core.jpa;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>Thing</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 */
@Entity()
@Table(schema = "sanad", indexes = {
		@Index(name = "thing_slug_idx", columnList = "slug"),
		@Index(name = "thing_name_idx", columnList = "name"), })
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Thing {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "names_thing_id") })
	private Set<Literal> names = new HashSet<Literal>();

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
	@JoinColumns({ @JoinColumn(name = "successions_thing_id") })
	private Set<SuccessionProperty> successions = new HashSet<SuccessionProperty>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumns({ @JoinColumn(name = "authors_thing_id") })
	private Set<LegalEntityProperty> authors = new HashSet<LegalEntityProperty>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Name can change if revised, but only one accepted name. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String name = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
	 * Thing's ID is usually an UUID representation. However, for things that
	 * have a distinct and universal meaning, e.g. Holy Quran Chapters, it's
	 * better to assign distinct human-readable IDs. Human-readable IDs use the
	 * pattern {@code [a-z][a-z0-9_]+}. Note that UUID representations use the
	 * '-' character. IDs need to be unique for all things. <!-- end-model-doc
	 * -->
	 * 
	 * @generated
	 */
	@Id()
	private String id = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Slug which is based on initial name. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String slug = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Canonical slug which is based on initial name. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Column(unique = true)
	private String canonicalSlug = null;

	/**
	 * Returns the value of '<em><b>names</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>names</b></em>' feature
	 * @generated
	 */
	public Set<Literal> getNames() {
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
	public boolean addToNames(Literal namesValue) {
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
	public boolean removeFromNames(Literal namesValue) {
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
	public void setNames(Set<Literal> newNames) {
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
	 * Returns the value of '<em><b>successions</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>successions</b></em>' feature
	 * @generated
	 */
	public Set<SuccessionProperty> getSuccessions() {
		return successions;
	}

	/**
	 * Adds to the <em>successions</em> feature.
	 *
	 * @param successionsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToSuccessions(SuccessionProperty successionsValue) {
		if (!successions.contains(successionsValue)) {
			boolean result = successions.add(successionsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>successions</em> feature.
	 *
	 * @param successionsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromSuccessions(SuccessionProperty successionsValue) {
		if (successions.contains(successionsValue)) {
			boolean result = successions.remove(successionsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>successions</em> feature.
	 * 
	 * @generated
	 */
	public void clearSuccessions() {
		while (!successions.isEmpty()) {
			removeFromSuccessions(successions.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Thing#getSuccessions() <em>successions</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newSuccessions
	 *            the new value of the '{@link Thing#getSuccessions()
	 *            successions}' feature.
	 * @generated
	 */
	public void setSuccessions(Set<SuccessionProperty> newSuccessions) {
		successions = newSuccessions;
	}

	/**
	 * Returns the value of '<em><b>authors</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>authors</b></em>' feature
	 * @generated
	 */
	public Set<LegalEntityProperty> getAuthors() {
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
	public boolean addToAuthors(LegalEntityProperty authorsValue) {
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
	public boolean removeFromAuthors(LegalEntityProperty authorsValue) {
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
	public void setAuthors(Set<LegalEntityProperty> newAuthors) {
		authors = newAuthors;
	}

	/**
	 * Returns the value of '<em><b>name</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Name can change if revised, but only one accepted name. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of '<em><b>name</b></em>' feature
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the '{@link Thing#getName() <em>name</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Name can change if revised, but only one accepted name. <!--
	 * end-model-doc -->
	 * 
	 * @param newName
	 *            the new value of the '{@link Thing#getName() name}' feature.
	 * @generated
	 */
	public void setName(String newName) {
		name = newName;
	}

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
	 * Thing's ID is usually an UUID representation. However, for things that
	 * have a distinct and universal meaning, e.g. Holy Quran Chapters, it's
	 * better to assign distinct human-readable IDs. Human-readable IDs use the
	 * pattern {@code [a-z][a-z0-9_]+}. Note that UUID representations use the
	 * '-' character. IDs need to be unique for all things. <!-- end-model-doc
	 * -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the '{@link Thing#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc --> A
	 * Thing's ID is usually an UUID representation. However, for things that
	 * have a distinct and universal meaning, e.g. Holy Quran Chapters, it's
	 * better to assign distinct human-readable IDs. Human-readable IDs use the
	 * pattern {@code [a-z][a-z0-9_]+}. Note that UUID representations use the
	 * '-' character. IDs need to be unique for all things. <!-- end-model-doc
	 * -->
	 * 
	 * @param newId
	 *            the new value of the '{@link Thing#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
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
				+ "]" + " [canonicalSlug: " + getCanonicalSlug() + "]"
				+ " [name: " + getName() + "]";
	}
}
