package org.soluvas.sanad.core.jpa;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * A representation of the model object '<em><b>Property</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
@Entity()
@Table(schema = "sanad")
public abstract class Property {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The set of Claims which proves this property. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private Set<Claim> claims = new HashSet<Claim>();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Id()
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid2")
	@Type(type = "org.hibernate.type.PostgresUUIDType")
	private UUID id = null;

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
	public UUID getId() {
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
	public void setId(UUID newId) {
		id = newId;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Property " + " [id: " + getId() + "]";
	}
}
