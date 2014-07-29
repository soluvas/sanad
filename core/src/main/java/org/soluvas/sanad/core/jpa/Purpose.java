package org.soluvas.sanad.core.jpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>Purpose</b></em>
 * '. <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
 * Matan. <!-- end-model-doc -->
 * 
 * @generated
 */
public enum Purpose {

	/**
	 * The enum: GOOD <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	GOOD(0, "good", "good") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isGood() {
			return true;
		}
	},
	/**
	 * The enum: BAD <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	BAD(0, "bad", "bad") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isBad() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>Purpose</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Purpose[] VALUES_ARRAY = new Purpose[] { GOOD, BAD };

	/**
	 * A public read-only list of all the '<em><b>Purpose</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<Purpose> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Purpose</b></em>' literal with the specified literal
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the Purpose, the literal enum class
	 * @generated
	 */
	public static Purpose get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Purpose result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Purpose</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the Purpose, the literal enum class
	 * @generated
	 */
	public static Purpose getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Purpose result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Purpose</b></em>' literal with the specified integer
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the Purpose, the literal enum
	 * @generated
	 */
	public static Purpose get(int value) {
		for (Purpose enumInstance : VALUES_ARRAY) {
			if (enumInstance.getValue() == value) {
				return enumInstance;
			}
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	private Purpose(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isGood() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isBad() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the name
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the literal of this enum instance
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the literal value of the enumerator, which is its string
	 *         representation.
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
