package org.soluvas.sanad.core.jpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>NarratorGrade</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * <!-- begin-model-doc --> The narrators of ahadith were broken up into <a
 * href="http://muslimscholars.info/faq.htm">different grades, ranks or
 * levels</a> based on whether or not ahadith could be accepted from them. Ibn
 * Hajar al-'Asqalani placed the narrators into twelve ranks. The ranks as named
 * and categorized by Ibn Hajar are widely accepted but not universal. <!--
 * end-model-doc -->
 * 
 * @generated
 */
public enum NarratorGrade {

	/**
	 * The enum: COMPANION <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Companions: The first generation of Muslims did not
	 * need testimony to their knowledge or character as Allah the Most High has
	 * already done so in the Qur'an. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	COMPANION(0, "companion", "companion") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isCompanion() {
			return true;
		}
	},
	/**
	 * The enum: TRUSTWORTHIEST <!-- begin-user-doc --> <!-- end-user-doc -->
	 * <!-- begin-model-doc --> Awthaqun Nas (Thiqa Thiqa): These are the
	 * trustworthiest of people outside of the first generation of Muslims and
	 * this is the highest rank. They were learned scholars who were also of the
	 * most upright moral characters. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	TRUSTWORTHIEST(0, "trustworthiest", "trustworthiest") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isTrustworthiest() {
			return true;
		}
	},
	/**
	 * The enum: TRUSTWORTHY <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Thiqat: These narrators are trustworthy in all areas
	 * including good retentive memory, but not to a superlative degree like
	 * those in the second rank. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	TRUSTWORTHY(0, "trustworthy", "trustworthy") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isTrustworthy() {
			return true;
		}
	},
	/**
	 * The enum: TRUTHFUL <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Saduq: truthful but less than rank three. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	TRUTHFUL(0, "truthful", "truthful") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isTruthful() {
			return true;
		}
	},
	/**
	 * The enum: HONEST <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Saduq Yahim: Those who are trustworthy but who
	 * sometimes made mistakes in narrating ahadith, or have some delusion. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	HONEST(0, "honest", "honest") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isHonest() {
			return true;
		}
	},
	/**
	 * The enum: ACCEPTABLE <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Maqbool/Layyin: Those who are accepted or acceptable.
	 * They transmitted a smaller number of ahadith, and we do not have proof
	 * against their reliability (or for them to be extraordinarily sound). <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	ACCEPTABLE(0, "acceptable", "acceptable") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isAcceptable() {
			return true;
		}
	},
	/**
	 * The enum: UNCERTAIN <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Majhool al-haal/Mastur (not Thiqa): Those whose
	 * situation is not precisely known. He had students who transmitted ahadith
	 * from him, but he does not have tawtheeq, or a testimony of
	 * trustworthiness, from the scholars of ahadith. There is nothing wrong
	 * with him from that which is apparent, but we don't really know anything
	 * about him. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	UNCERTAIN(0, "uncertain", "uncertain") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isUncertain() {
			return true;
		}
	},
	/**
	 * The enum: WEAK <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Da'eef or weak: This means that there is nobody
	 * speaking positively on his behalf, and some of the scholars have spoken
	 * against him. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	WEAK(0, "weak", "weak") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isWeak() {
			return true;
		}
	},
	/**
	 * The enum: UNKNOWN <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Majhool or unknown: This is not the same as majhool
	 * al-haal. The majhool al-haal had more than one student narrate from him;
	 * the majhool is narrated from by only one individual, and we know nothing
	 * of him or his honesty. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	UNKNOWN(0, "unknown", "unknown") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isUnknown() {
			return true;
		}
	},
	/**
	 * The enum: ABANDONED <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Matruk or abandoned: This rank covers a few
	 * categories of narrators. This includes the one who committed many
	 * mistakes, the one who has detailed criticisms against him from the
	 * scholars, or one who did not meet the requirement for moral character.
	 * Also included here are the ones upon major sins (the fasiq) and the one
	 * who is unintelligent. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	ABANDONED(0, "abandoned", "abandoned") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isAbandoned() {
			return true;
		}
	},
	/**
	 * The enum: ACCUSED <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Muttaham bi'l kadhib: The one who was accused of
	 * lying and/or making up fake ahadith. The ahadith he narrates are
	 * considered batil. <!-- end-model-doc -->
	 * 
	 * @generated
	 */
	ACCUSED(0, "accused", "accused") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isAccused() {
			return true;
		}
	},
	/**
	 * The enum: LIAR <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Kadhdhaab, waddaa': This is the one who is actually
	 * called a liar or fabricator. Being labeled with such a title is not the
	 * same as merely being accused of committing those acts in some instances.
	 * The ahadith he narrates are considered mawdu' or fabricated. <!--
	 * end-model-doc -->
	 * 
	 * @generated
	 */
	LIAR(0, "liar", "liar") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isLiar() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>NarratorGrade</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final NarratorGrade[] VALUES_ARRAY = new NarratorGrade[] {
			COMPANION, TRUSTWORTHIEST, TRUSTWORTHY, TRUTHFUL, HONEST,
			ACCEPTABLE, UNCERTAIN, WEAK, UNKNOWN, ABANDONED, ACCUSED, LIAR };

	/**
	 * A public read-only list of all the '<em><b>NarratorGrade</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<NarratorGrade> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>NarratorGrade</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the NarratorGrade, the literal enum class
	 * @generated
	 */
	public static NarratorGrade get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NarratorGrade result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NarratorGrade</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the NarratorGrade, the literal enum class
	 * @generated
	 */
	public static NarratorGrade getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NarratorGrade result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>NarratorGrade</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the NarratorGrade, the literal enum
	 * @generated
	 */
	public static NarratorGrade get(int value) {
		for (NarratorGrade enumInstance : VALUES_ARRAY) {
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
	private NarratorGrade(int value, String name, String literal) {
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
	public boolean isCompanion() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isTrustworthiest() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isTrustworthy() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isTruthful() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isHonest() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isAcceptable() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isUncertain() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isWeak() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isUnknown() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isAbandoned() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isAccused() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isLiar() {
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
