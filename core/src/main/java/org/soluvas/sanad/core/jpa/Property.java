package org.soluvas.sanad.core.jpa;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * A representation of the model object '<em><b>Property</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Property {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The set of Claims which proves this property. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	@JoinTable(schema = "sanad")
	private Set<Claim> claims = new HashSet<Claim>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Id()
	private String id = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the property in AsciiDoc. It is derived from the
	 * {@link Claim} or {@link Testimony}'s description. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String description = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the property in HTML format. It is derived from the
	 * {@link Claim} or {@link Testimony}'s {@code descriptionHtml}. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String descriptionHtml = null;

	/**
	 * Returns the value of '<em><b>claims</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The set of Claims which proves this property. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>claims</b></em>' feature
	 * @generated
	 */
	public Set<Claim> getClaims() {
		return claims;
	}

	/**
	 * Adds to the <em>claims</em> feature.
	 *
	 * @param claimsValue
	 *            the value to add
	 * @return true if the value is added to the collection (it was not yet
	 *         present in the collection), false otherwise
	 * @generated
	 */
	public boolean addToClaims(Claim claimsValue) {
		if (!claims.contains(claimsValue)) {
			boolean result = claims.add(claimsValue);
			return result;
		}
		return false;
	}

	/**
	 * Removes from the <em>claims</em> feature.
	 *
	 * @param claimsValue
	 *            the value to remove
	 * @return true if the value is removed from the collection (it existed in
	 *         the collection before removing), false otherwise
	 *
	 * @generated
	 */
	public boolean removeFromClaims(Claim claimsValue) {
		if (claims.contains(claimsValue)) {
			boolean result = claims.remove(claimsValue);
			return result;
		}
		return false;
	}

	/**
	 * Clears the <em>claims</em> feature.
	 * 
	 * @generated
	 */
	public void clearClaims() {
		while (!claims.isEmpty()) {
			removeFromClaims(claims.iterator().next());
		}
	}

	/**
	 * Sets the '{@link Property#getClaims() <em>claims</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The set of Claims which proves this property. <!-- end-model-doc -->
	 * 
	 * @param newClaims
	 *            the new value of the '{@link Property#getClaims() claims}'
	 *            feature.
	 * @generated
	 */
	public void setClaims(Set<Claim> newClaims) {
		claims = newClaims;
	}

	/**
	 * Returns the value of '<em><b>id</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>id</b></em>' feature
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the '{@link Property#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newId
	 *            the new value of the '{@link Property#getId() id}' feature.
	 * @generated
	 */
	public void setId(String newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>description</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the property in AsciiDoc. It is derived from the
	 * {@link Claim} or {@link Testimony}'s description. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>description</b></em>' feature
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the '{@link Property#getDescription() <em>description</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the property in AsciiDoc. It is derived from the
	 * {@link Claim} or {@link Testimony}'s description. <!-- end-model-doc -->
	 * 
	 * @param newDescription
	 *            the new value of the '{@link Property#getDescription()
	 *            description}' feature.
	 * @generated
	 */
	public void setDescription(String newDescription) {
		description = newDescription;
	}

	/**
	 * Returns the value of '<em><b>descriptionHtml</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the property in HTML format. It is derived from the
	 * {@link Claim} or {@link Testimony}'s {@code descriptionHtml}. <!--
	 * end-model-doc -->
	 * 
	 * @return the value of '<em><b>descriptionHtml</b></em>' feature
	 * @generated
	 */
	public String getDescriptionHtml() {
		return descriptionHtml;
	}

	/**
	 * Sets the '{@link Property#getDescriptionHtml() <em>descriptionHtml</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the property in HTML format. It is derived from the
	 * {@link Claim} or {@link Testimony}'s {@code descriptionHtml}. <!--
	 * end-model-doc -->
	 * 
	 * @param newDescriptionHtml
	 *            the new value of the '{@link Property#getDescriptionHtml()
	 *            descriptionHtml}' feature.
	 * @generated
	 */
	public void setDescriptionHtml(String newDescriptionHtml) {
		descriptionHtml = newDescriptionHtml;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Property " + " [id: " + getId() + "]" + " [description: "
				+ getDescription() + "]" + " [descriptionHtml: "
				+ getDescriptionHtml() + "]";
	}
}
