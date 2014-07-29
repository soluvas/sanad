package org.soluvas.sanad.core.jpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>Succession</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> sanad/isnād. mashhur/aziz/gharib implies "singular"
 * ahaad (آحاد) <!-- end-model-doc -->
 * 
 * @generated
 */
public enum Succession {

	/**
	 * The enum: WORDING <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> mutawatir (مُتَواتِر) in wording <!-- end-model-doc
	 * -->
	 * 
	 * @generated
	 */
	WORDING(0, "wording", "wording") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isWording() {
			return true;
		}
	},
	/**
	 * The enum: MEANING <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> mutawatir only in meaning, not wording <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	MEANING(0, "meaning", "meaning") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isMeaning() {
			return true;
		}
	},
	/**
	 * The enum: TRIPLE <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> mashhur (مَشْهُوْر) <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	TRIPLE(0, "triple", "triple") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isTriple() {
			return true;
		}
	},
	/**
	 * The enum: DOUBLE <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> aziz (عَزِيْز) <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	DOUBLE(0, "double", "double") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isDouble() {
			return true;
		}
	},
	/**
	 * The enum: SINGLE <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> gharib (غَرِيْب) <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	SINGLE(0, "single", "single") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isSingle() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>Succession</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Succession[] VALUES_ARRAY = new Succession[] {
			WORDING, MEANING, TRIPLE, DOUBLE, SINGLE };

	/**
	 * A public read-only list of all the '<em><b>Succession</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<Succession> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Succession</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the Succession, the literal enum class
	 * @generated
	 */
	public static Succession get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Succession result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Succession</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the Succession, the literal enum class
	 * @generated
	 */
	public static Succession getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Succession result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Succession</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the Succession, the literal enum
	 * @generated
	 */
	public static Succession get(int value) {
		for (Succession enumInstance : VALUES_ARRAY) {
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
	private Succession(int value, String name, String literal) {
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
	public boolean isWording() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isMeaning() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isTriple() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isDouble() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isSingle() {
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
