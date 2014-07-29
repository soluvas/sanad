package org.soluvas.sanad.core.jpa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '
 * <em><b>ThingKind</b></em>'. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public enum ThingKind {

	/**
	 * The enum: CREATIVE_WORK <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	CREATIVE_WORK(0, "creative_work", "creative_work") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isCreative_work() {
			return true;
		}
	},
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
	 * The enum: BLOG_POSTING <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	BLOG_POSTING(0, "blog_posting", "blog_posting") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isBlog_posting() {
			return true;
		}
	},
	/**
	 * The enum: NEWS_ARTICLE <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	NEWS_ARTICLE(0, "news_article", "news_article") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isNews_article() {
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
	 * The enum: MEDICAL_SCHOLARLY_ARTICLE <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	MEDICAL_SCHOLARLY_ARTICLE(0, "medical_scholarly_article",
			"medical_scholarly_article") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isMedical_scholarly_article() {
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
	},
	/**
	 * The enum: TECH_ARTICLE <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	TECH_ARTICLE(0, "tech_article", "tech_article") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isTech_article() {
			return true;
		}
	},
	/**
	 * The enum: API_REFERENCE <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	API_REFERENCE(0, "api_reference", "api_reference") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isApi_reference() {
			return true;
		}
	},
	/**
	 * The enum: ANSWER <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	ANSWER(0, "answer", "answer") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isAnswer() {
			return true;
		}
	},
	/**
	 * The enum: BLOG <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	BLOG(0, "blog", "blog") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isBlog() {
			return true;
		}
	},
	/**
	 * The enum: BOOK <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	BOOK(0, "book", "book") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isBook() {
			return true;
		}
	},
	/**
	 * The enum: COMMENT <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	COMMENT(0, "comment", "comment") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isComment() {
			return true;
		}
	},
	/**
	 * The enum: QUESTION <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	QUESTION(0, "question", "question") {

		/**
		 * @return always true for this instance
		 * @generated
		 */
		@Override
		public boolean isQuestion() {
			return true;
		}
	};

	/**
	 * An array of all the '<em><b>ThingKind</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static final ThingKind[] VALUES_ARRAY = new ThingKind[] {
			CREATIVE_WORK, ARTICLE, BLOG_POSTING, NEWS_ARTICLE,
			SCHOLARLY_ARTICLE, MEDICAL_SCHOLARLY_ARTICLE, HADITH, TECH_ARTICLE,
			API_REFERENCE, ANSWER, BLOG, BOOK, COMMENT, QUESTION };

	/**
	 * A public read-only list of all the '<em><b>ThingKind</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final List<ThingKind> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ThingKind</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal to use to get the enum instance
	 * @return the ThingKind, the literal enum class
	 * @generated
	 */
	public static ThingKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThingKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ThingKind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param name
	 *            the name to use to get the enum instance
	 * @return the ThingKind, the literal enum class
	 * @generated
	 */
	public static ThingKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThingKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ThingKind</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the value to use to get the enum instance
	 * @return the ThingKind, the literal enum
	 * @generated
	 */
	public static ThingKind get(int value) {
		for (ThingKind enumInstance : VALUES_ARRAY) {
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
	private ThingKind(int value, String name, String literal) {
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
	public boolean isCreative_work() {
		return false;
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
	public boolean isBlog_posting() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isNews_article() {
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
	public boolean isMedical_scholarly_article() {
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
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isTech_article() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isApi_reference() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isAnswer() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isBlog() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isBook() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isComment() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return false, is overridden by actual enum types.
	 * @generated
	 */
	public boolean isQuestion() {
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
