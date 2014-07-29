package org.soluvas.sanad.core.jpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>Spelling</b></em>
 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum Spelling {

	/**
	 * The enum: OFFICIAL <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Officially supported spelling by authority. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	OFFICIAL(0, "official", "official") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isOfficial() {
			return true;
		}
	},
	/**
	 * The enum: FORMAL <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Formal spelling, but not officially endorsed. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	FORMAL(0, "formal", "formal") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isFormal() {
			return true;
		}
	},
	/**
	 * The enum: CASUAL <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Casual spelling which is understandable. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	CASUAL(0, "casual", "casual") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isCasual() {
			return true;
		}
	},
	/**
	 * The enum: WRONG <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Wrong spelling, but with same intended meaning. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	WRONG(0, "wrong", "wrong") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isWrong() {
			return true;
		}
	},
	/**
	 * The enum: MISLEADING <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> The spelling conveys an antonym or a contrary idea.
	 * <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	MISLEADING(0, "misleading", "misleading") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isMisleading() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>Spelling</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final Spelling[] VALUES_ARRAY = new Spelling[] { OFFICIAL,
			FORMAL, CASUAL, WRONG, MISLEADING };

	/**
	 * A public read-only list of all the '<em><b>Spelling</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<Spelling> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spelling</b></em>' literal with the specified literal
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the Spelling, the literal enum class
	 * @generated
	 */
	public static Spelling get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Spelling result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spelling</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the Spelling, the literal enum class
	 * @generated
	 */
	public static Spelling getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Spelling result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spelling</b></em>' literal with the specified integer
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the Spelling, the literal enum
	 * @generated
	 */
	public static Spelling get(int value) {
		for (Spelling enumInstance : VALUES_ARRAY) {
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
	private Spelling(int value, String name, String literal) {
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
	public boolean isOfficial() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isFormal() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isCasual() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isWrong() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isMisleading() {
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
