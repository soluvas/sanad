package org.soluvas.sanad.core.jpa;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.soluvas.jpa.jpa.PersonInfo;

/**
 * A representation of the model object '<em><b>Testimony</b></em>'. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 */
@Entity()
@Table(schema = "sanad", indexes = {
		@javax.persistence.Index(name = "testimony_creationtime_idx", columnList = "creationtime"),
		@javax.persistence.Index(name = "testimony_creationtime_creationtimezone_idx", columnList = "creationtime, creationtimezone"),
		@javax.persistence.Index(name = "testimony_validstarttime_idx", columnList = "validstarttime"),
		@javax.persistence.Index(name = "testimony_validstarttime_validstarttimezone_idx", columnList = "validstarttime, validstarttimezone"),
		@javax.persistence.Index(name = "testimony_validendtime_validendtimezone_idx", columnList = "validendtime, validendtimezone"),
		@javax.persistence.Index(name = "testimony_validstartdate_idx", columnList = "validstartdate"),
		@javax.persistence.Index(name = "testimony_validenddate_idx", columnList = "validenddate") })
public class Testimony implements Serializable {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@OneToMany(cascade = { CascadeType.ALL }, mappedBy = "testimony")
	private Set<Claim> claims = new HashSet<Claim>();
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * GPG signatures of the JSON representation of the testimony, excluding
	 * {@link #signature} field. At least the person and the server must sign
	 * the testimony. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String signatures = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For a zoned date & time-sensitive statement, specify start of validity
	 * (inclusive). <!-- end-model-doc -->
	 * 
	 */
	@Basic()
	@Index(name = "testimony_validstarttime_idx")
	@Columns(columns = { @Column(name = "validstarttime"),
			@Column(name = "validstarttimezone") })
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTimeAndZone")
	private DateTime validStartTime = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For a zoned date & time-sensitive statement, specify end of validity
	 * (inclusive). <!-- end-model-doc -->
	 * 
	 */
	@Basic()
	@Columns(columns = { @Column(name = "validendtime"),
			@Column(name = "validendtimezone") })
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTimeAndZone")
	private DateTime validEndTime = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For a relative/global date-sensitive statement, specify start of validity
	 * (inclusive). If both {@link #validStartTime} and {@link #validStartDate}
	 * is {@code null}, the statement is should be true since the beginning of
	 * time or is irrelevant. <!-- end-model-doc -->
	 * 
	 */
	@Basic()
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate validStartDate = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Basic()
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate")
	private LocalDate validEndDate = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 */
	@Basic()
	@Columns(columns = { @Column(name = "creationtime", nullable = false),
			@Column(name = "creationtimezone", nullable = false) })
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTimeAndZone")
	private DateTime creationTime = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Schema version determines the exact mechanism to produce the signatures.
	 * <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	@Access(AccessType.FIELD)
	private long schemaVersion = 1;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the testimony in AsciiDoc. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String description = null;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the testimony in HTML format. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Basic()
	private String descriptionHtml = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The person who made this testimony, usually a registered user. It's
	 * possible to leave out {@link PersonInfo#setId()} {@code null}, but this
	 * use case is still under consideration. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	@Embedded()
	private PersonInfo person = null;

	/**
	 * Returns the value of '<em><b>claims</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * Sets the '{@link Testimony#getClaims() <em>claims</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newClaims
	 *            the new value of the '{@link Testimony#getClaims() claims}'
	 *            feature.
	 * @generated
	 */
	public void setClaims(Set<Claim> newClaims) {
		claims = newClaims;
	}

	/**
	 * Returns the value of '<em><b>signatures</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * GPG signatures of the JSON representation of the testimony, excluding
	 * {@link #signature} field. At least the person and the server must sign
	 * the testimony. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>signatures</b></em>' feature
	 * @generated
	 */
	public String getSignatures() {
		return signatures;
	}

	/**
	 * Sets the '{@link Testimony#getSignatures() <em>signatures</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * GPG signatures of the JSON representation of the testimony, excluding
	 * {@link #signature} field. At least the person and the server must sign
	 * the testimony. <!-- end-model-doc -->
	 * 
	 * @param newSignatures
	 *            the new value of the '{@link Testimony#getSignatures()
	 *            signatures}' feature.
	 * @generated
	 */
	public void setSignatures(String newSignatures) {
		signatures = newSignatures;
	}

	/**
	 * Returns the value of '<em><b>validStartTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For a zoned date & time-sensitive statement, specify start of validity
	 * (inclusive). <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>validStartTime</b></em>' feature
	 * @generated
	 */
	public DateTime getValidStartTime() {
		return validStartTime;
	}

	/**
	 * Sets the '{@link Testimony#getValidStartTime() <em>validStartTime</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For a zoned date & time-sensitive statement, specify start of validity
	 * (inclusive). <!-- end-model-doc -->
	 * 
	 * @param newValidStartTime
	 *            the new value of the '{@link Testimony#getValidStartTime()
	 *            validStartTime}' feature.
	 * @generated
	 */
	public void setValidStartTime(DateTime newValidStartTime) {
		validStartTime = newValidStartTime;
	}

	/**
	 * Returns the value of '<em><b>validEndTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For a zoned date & time-sensitive statement, specify end of validity
	 * (inclusive). <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>validEndTime</b></em>' feature
	 * @generated
	 */
	public DateTime getValidEndTime() {
		return validEndTime;
	}

	/**
	 * Sets the '{@link Testimony#getValidEndTime() <em>validEndTime</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For a zoned date & time-sensitive statement, specify end of validity
	 * (inclusive). <!-- end-model-doc -->
	 * 
	 * @param newValidEndTime
	 *            the new value of the '{@link Testimony#getValidEndTime()
	 *            validEndTime}' feature.
	 * @generated
	 */
	public void setValidEndTime(DateTime newValidEndTime) {
		validEndTime = newValidEndTime;
	}

	/**
	 * Returns the value of '<em><b>validStartDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For a relative/global date-sensitive statement, specify start of validity
	 * (inclusive). If both {@link #validStartTime} and {@link #validStartDate}
	 * is {@code null}, the statement is should be true since the beginning of
	 * time or is irrelevant. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>validStartDate</b></em>' feature
	 * @generated
	 */
	public LocalDate getValidStartDate() {
		return validStartDate;
	}

	/**
	 * Sets the '{@link Testimony#getValidStartDate() <em>validStartDate</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * For a relative/global date-sensitive statement, specify start of validity
	 * (inclusive). If both {@link #validStartTime} and {@link #validStartDate}
	 * is {@code null}, the statement is should be true since the beginning of
	 * time or is irrelevant. <!-- end-model-doc -->
	 * 
	 * @param newValidStartDate
	 *            the new value of the '{@link Testimony#getValidStartDate()
	 *            validStartDate}' feature.
	 * @generated
	 */
	public void setValidStartDate(LocalDate newValidStartDate) {
		validStartDate = newValidStartDate;
	}

	/**
	 * Returns the value of '<em><b>validEndDate</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>validEndDate</b></em>' feature
	 * @generated
	 */
	public LocalDate getValidEndDate() {
		return validEndDate;
	}

	/**
	 * Sets the '{@link Testimony#getValidEndDate() <em>validEndDate</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newValidEndDate
	 *            the new value of the '{@link Testimony#getValidEndDate()
	 *            validEndDate}' feature.
	 * @generated
	 */
	public void setValidEndDate(LocalDate newValidEndDate) {
		validEndDate = newValidEndDate;
	}

	/**
	 * Returns the value of '<em><b>creationTime</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of '<em><b>creationTime</b></em>' feature
	 * @generated
	 */
	public DateTime getCreationTime() {
		return creationTime;
	}

	/**
	 * Sets the '{@link Testimony#getCreationTime() <em>creationTime</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newCreationTime
	 *            the new value of the '{@link Testimony#getCreationTime()
	 *            creationTime}' feature.
	 * @generated
	 */
	public void setCreationTime(DateTime newCreationTime) {
		creationTime = newCreationTime;
	}

	/**
	 * Returns the value of '<em><b>schemaVersion</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Schema version determines the exact mechanism to produce the signatures.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>schemaVersion</b></em>' feature
	 * @generated
	 */
	public long getSchemaVersion() {
		return schemaVersion;
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
	 * Sets the '{@link Testimony#getId() <em>id</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param newId
	 *            the new value of the '{@link Testimony#getId() id}' feature.
	 * @generated
	 */
	public void setId(UUID newId) {
		id = newId;
	}

	/**
	 * Returns the value of '<em><b>description</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the testimony in AsciiDoc. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>description</b></em>' feature
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the '{@link Testimony#getDescription() <em>description</em>}'
	 * feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the testimony in AsciiDoc. <!-- end-model-doc -->
	 * 
	 * @param newDescription
	 *            the new value of the '{@link Testimony#getDescription()
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
	 * Description of the testimony in HTML format. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>descriptionHtml</b></em>' feature
	 * @generated
	 */
	public String getDescriptionHtml() {
		return descriptionHtml;
	}

	/**
	 * Sets the '{@link Testimony#getDescriptionHtml() <em>descriptionHtml</em>}
	 * ' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * Description of the testimony in HTML format. <!-- end-model-doc -->
	 * 
	 * @param newDescriptionHtml
	 *            the new value of the '{@link Testimony#getDescriptionHtml()
	 *            descriptionHtml}' feature.
	 * @generated
	 */
	public void setDescriptionHtml(String newDescriptionHtml) {
		descriptionHtml = newDescriptionHtml;
	}

	/**
	 * Returns the value of '<em><b>person</b></em>' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The person who made this testimony, usually a registered user. It's
	 * possible to leave out {@link PersonInfo#setId()} {@code null}, but this
	 * use case is still under consideration. <!-- end-model-doc -->
	 * 
	 * @return the value of '<em><b>person</b></em>' feature
	 * @generated
	 */
	public PersonInfo getPerson() {
		return person;
	}

	/**
	 * Sets the '{@link Testimony#getPerson() <em>person</em>}' feature.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * The person who made this testimony, usually a registered user. It's
	 * possible to leave out {@link PersonInfo#setId()} {@code null}, but this
	 * use case is still under consideration. <!-- end-model-doc -->
	 * 
	 * @param newPerson
	 *            the new value of the '{@link Testimony#getPerson() person}'
	 *            feature.
	 * @generated
	 */
	public void setPerson(PersonInfo newPerson) {
		person = newPerson;
	}

	/**
	 * A toString method which prints the values of all EAttributes of this
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		return "Testimony " + " [id: " + getId() + "]" + " [schemaVersion: "
				+ getSchemaVersion() + "]" + " [signatures: " + getSignatures()
				+ "]" + " [validStartTime: " + getValidStartTime() + "]"
				+ " [validEndTime: " + getValidEndTime() + "]"
				+ " [validStartDate: " + getValidStartDate() + "]"
				+ " [validEndDate: " + getValidEndDate() + "]"
				+ " [creationTime: " + getCreationTime() + "]"
				+ " [description: " + getDescription() + "]"
				+ " [descriptionHtml: " + getDescriptionHtml() + "]";
	}
}
