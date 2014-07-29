package org.soluvas.sanad.core.jpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>ConceptKind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum ConceptKind {

	/**
	 * The enum: ARTICLE <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ARTICLE(0, "article", "article") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isArticle() {
			return true;
		}
	},
	/**
	 * The enum: SCHOLARLY_ARTICLE <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	SCHOLARLY_ARTICLE(0, "scholarly_article", "scholarly_article") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isScholarly_article() {
			return true;
		}
	},
	/**
	 * The enum: HADITH <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	HADITH(0, "hadith", "hadith") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isHadith() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>ConceptKind</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ConceptKind[] VALUES_ARRAY = new ConceptKind[] {
			ARTICLE, SCHOLARLY_ARTICLE, HADITH };

	/**
	 * A public read-only list of all the '<em><b>ConceptKind</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ConceptKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ConceptKind</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the ConceptKind, the literal enum class
	 * @generated
	 */
	public static ConceptKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ConceptKind</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the ConceptKind, the literal enum class
	 * @generated
	 */
	public static ConceptKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConceptKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ConceptKind</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the ConceptKind, the literal enum
	 * @generated
	 */
	public static ConceptKind get(int value) {
		for (ConceptKind enumInstance : VALUES_ARRAY) {
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
	private ConceptKind(int value, String name, String literal) {
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
	public boolean isArticle() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isScholarly_article() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isHadith() {
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
