package org.soluvas.sanad.core.jpa;

import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.AbstractModelFeatureMapEntry;
import org.eclipse.emf.texo.model.AbstractModelObject;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelFeatureMapEntry;
import org.eclipse.emf.texo.model.ModelObject;
import org.eclipse.emf.texo.model.ModelPackage;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.soluvas.jpa.jpa.PersonInfo;

/**
 * The <b>{@link ModelFactory}</b> for the types of this model: sanad-jpa. It
 * contains code to create instances {@link ModelObject} wrappers and instances
 * for EClasses and convert objects back and forth from their String (XML)
 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SanadModelFactory implements ModelFactory {

	/**
	 * Creates an instance for an {@link EClass} <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param eClass
	 *            creates a Object instance for this EClass
	 * @return an object representing the eClass
	 * @generated
	 */
	public Object create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SanadModelPackage.TRANSLITERATION_CLASSIFIER_ID:
			return createTransliteration();
		case SanadModelPackage.LITERAL_CLASSIFIER_ID:
			return createLiteral();
		case SanadModelPackage.HADITH_CLASSIFIER_ID:
			return createHadith();
		case SanadModelPackage.SCHOLAR_CLASSIFIER_ID:
			return createScholar();
		case SanadModelPackage.TESTIMONY_CLASSIFIER_ID:
			return createTestimony();
		case SanadModelPackage.HADITHCOLLECTION_CLASSIFIER_ID:
			return createHadithCollection();
		case SanadModelPackage.QURANCHAPTER_CLASSIFIER_ID:
			return createQuranChapter();
		case SanadModelPackage.QURANVERSE_CLASSIFIER_ID:
			return createQuranVerse();
		case SanadModelPackage.CREATIVEWORK_CLASSIFIER_ID:
			return createCreativeWork();
		case SanadModelPackage.EVIDENCE_CLASSIFIER_ID:
			return createEvidence();
		case SanadModelPackage.AUTHENTICITYPROPERTY_CLASSIFIER_ID:
			return createAuthenticityProperty();
		case SanadModelPackage.PERSONPROPERTY_CLASSIFIER_ID:
			return createPersonProperty();
		case SanadModelPackage.SCHOLARPROPERTY_CLASSIFIER_ID:
			return createScholarProperty();
		case SanadModelPackage.SPELLINGPROPERTY_CLASSIFIER_ID:
			return createSpellingProperty();
		case SanadModelPackage.SUCCESSIONPROPERTY_CLASSIFIER_ID:
			return createSuccessionProperty();
		case SanadModelPackage.THINGPROPERTY_CLASSIFIER_ID:
			return createThingProperty();
		case SanadModelPackage.LITERALCLAIM_CLASSIFIER_ID:
			return createLiteralClaim();
		case SanadModelPackage.THINGCLAIM_CLASSIFIER_ID:
			return createThingClaim();
		case SanadModelPackage.AUTHENTICITYCLAIM_CLASSIFIER_ID:
			return createAuthenticityClaim();
		case SanadModelPackage.SUCCESSIONCLAIM_CLASSIFIER_ID:
			return createSuccessionClaim();
		case SanadModelPackage.NARRATORCLAIM_CLASSIFIER_ID:
			return createNarratorClaim();
		case SanadModelPackage.TRANSLITERATIONCLAIM_CLASSIFIER_ID:
			return createTransliterationClaim();
		default:
			throw new IllegalArgumentException("The EClass '"
					+ eClass.getName()
					+ "' is not a valid EClass for this EPackage");
		}
	}

	/**
	 * Wraps an object in a {@link ModelObject}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param eClass
	 *            the EClass of the object
	 * @param adaptee
	 *            the object being wrapped/adapted
	 * @return the wrapper {@link ModelObject}
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModelObject createModelObject(EClass eClass, Object adaptee) {
		ModelObject<Object> modelObject = null;
		switch (eClass.getClassifierID()) {
		case SanadModelPackage.TRANSLITERATION_CLASSIFIER_ID:
			modelObject = new TransliterationModelObject();
			break;
		case SanadModelPackage.LITERAL_CLASSIFIER_ID:
			modelObject = new LiteralModelObject();
			break;
		case SanadModelPackage.CLAIM_CLASSIFIER_ID:
			modelObject = new ClaimModelObject();
			break;
		case SanadModelPackage.THING_CLASSIFIER_ID:
			modelObject = new ThingModelObject();
			break;
		case SanadModelPackage.HADITH_CLASSIFIER_ID:
			modelObject = new HadithModelObject();
			break;
		case SanadModelPackage.PROPERTY_CLASSIFIER_ID:
			modelObject = new PropertyModelObject();
			break;
		case SanadModelPackage.SCHOLAR_CLASSIFIER_ID:
			modelObject = new ScholarModelObject();
			break;
		case SanadModelPackage.TESTIMONY_CLASSIFIER_ID:
			modelObject = new TestimonyModelObject();
			break;
		case SanadModelPackage.HADITHCOLLECTION_CLASSIFIER_ID:
			modelObject = new HadithCollectionModelObject();
			break;
		case SanadModelPackage.QURANCHAPTER_CLASSIFIER_ID:
			modelObject = new QuranChapterModelObject();
			break;
		case SanadModelPackage.QURANVERSE_CLASSIFIER_ID:
			modelObject = new QuranVerseModelObject();
			break;
		case SanadModelPackage.CREATIVEWORK_CLASSIFIER_ID:
			modelObject = new CreativeWorkModelObject();
			break;
		case SanadModelPackage.EVIDENCE_CLASSIFIER_ID:
			modelObject = new EvidenceModelObject();
			break;
		case SanadModelPackage.AUTHENTICITYPROPERTY_CLASSIFIER_ID:
			modelObject = new AuthenticityPropertyModelObject();
			break;
		case SanadModelPackage.PERSONPROPERTY_CLASSIFIER_ID:
			modelObject = new PersonPropertyModelObject();
			break;
		case SanadModelPackage.SCHOLARPROPERTY_CLASSIFIER_ID:
			modelObject = new ScholarPropertyModelObject();
			break;
		case SanadModelPackage.SPELLINGPROPERTY_CLASSIFIER_ID:
			modelObject = new SpellingPropertyModelObject();
			break;
		case SanadModelPackage.SUCCESSIONPROPERTY_CLASSIFIER_ID:
			modelObject = new SuccessionPropertyModelObject();
			break;
		case SanadModelPackage.THINGPROPERTY_CLASSIFIER_ID:
			modelObject = new ThingPropertyModelObject();
			break;
		case SanadModelPackage.LEGALENTITYPROPERTY_CLASSIFIER_ID:
			modelObject = new LegalEntityPropertyModelObject();
			break;
		case SanadModelPackage.LITERALCLAIM_CLASSIFIER_ID:
			modelObject = new LiteralClaimModelObject();
			break;
		case SanadModelPackage.THINGCLAIM_CLASSIFIER_ID:
			modelObject = new ThingClaimModelObject();
			break;
		case SanadModelPackage.AUTHENTICITYCLAIM_CLASSIFIER_ID:
			modelObject = new AuthenticityClaimModelObject();
			break;
		case SanadModelPackage.SUCCESSIONCLAIM_CLASSIFIER_ID:
			modelObject = new SuccessionClaimModelObject();
			break;
		case SanadModelPackage.NARRATORCLAIM_CLASSIFIER_ID:
			modelObject = new NarratorClaimModelObject();
			break;
		case SanadModelPackage.TRANSLITERATIONCLAIM_CLASSIFIER_ID:
			modelObject = new TransliterationClaimModelObject();
			break;
		default:
			throw new IllegalArgumentException("The EClass '" + eClass
					+ "' is not defined in this EPackage");
		}
		modelObject.setTarget(adaptee);
		return modelObject;
	}

	/**
	 * Creates a feature map entry instance for a certain EStructuralFeature.
	 *
	 * @param eFeature
	 *            the feature map feature
	 * @return the pojo feature map entry
	 * @generated
	 */
	public Object createFeatureMapEntry(EStructuralFeature eFeature) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * Wraps a feature map entry pojo in a {@link AbstractModelFeatureMapEntry}.
	 * If the feature map entry is null then a new one is created and <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param eFeature
	 *            the feature map feature of the object
	 * @param adaptee
	 *            the pojo feature map entry being wrapped/adapted
	 * @return the wrapper {@link ModelFeatureMapEntry}
	 * @generated
	 */
	public ModelFeatureMapEntry<?> createModelFeatureMapEntry(
			EStructuralFeature eFeature, Object adaptee) {
		throw new IllegalArgumentException("The EStructuralFeature '"
				+ eFeature + "' is not a valid feature map in this EPackage");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Testimony
	 * @generated
	 */
	public Testimony createTestimony() {
		return new Testimony();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         HadithCollection
	 * @generated
	 */
	public HadithCollection createHadithCollection() {
		return new HadithCollection();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         AuthenticityProperty
	 * @generated
	 */
	public AuthenticityProperty createAuthenticityProperty() {
		return new AuthenticityProperty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         SuccessionProperty
	 * @generated
	 */
	public SuccessionProperty createSuccessionProperty() {
		return new SuccessionProperty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Literal
	 * @generated
	 */
	public Literal createLiteral() {
		return new Literal();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         SpellingProperty
	 * @generated
	 */
	public SpellingProperty createSpellingProperty() {
		return new SpellingProperty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         LiteralClaim
	 * @generated
	 */
	public LiteralClaim createLiteralClaim() {
		return new LiteralClaim();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         ThingClaim
	 * @generated
	 */
	public ThingClaim createThingClaim() {
		return new ThingClaim();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Evidence
	 * @generated
	 */
	public Evidence createEvidence() {
		return new Evidence();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         ThingProperty
	 * @generated
	 */
	public ThingProperty createThingProperty() {
		return new ThingProperty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         AuthenticityClaim
	 * @generated
	 */
	public AuthenticityClaim createAuthenticityClaim() {
		return new AuthenticityClaim();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         SuccessionClaim
	 * @generated
	 */
	public SuccessionClaim createSuccessionClaim() {
		return new SuccessionClaim();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         NarratorClaim
	 * @generated
	 */
	public NarratorClaim createNarratorClaim() {
		return new NarratorClaim();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Scholar
	 * @generated
	 */
	public Scholar createScholar() {
		return new Scholar();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         PersonProperty
	 * @generated
	 */
	public PersonProperty createPersonProperty() {
		return new PersonProperty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         ScholarProperty
	 * @generated
	 */
	public ScholarProperty createScholarProperty() {
		return new ScholarProperty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         Transliteration
	 * @generated
	 */
	public Transliteration createTransliteration() {
		return new Transliteration();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         TransliterationClaim
	 * @generated
	 */
	public TransliterationClaim createTransliterationClaim() {
		return new TransliterationClaim();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         CreativeWork
	 * @generated
	 */
	public CreativeWork createCreativeWork() {
		return new CreativeWork();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         QuranVerse
	 * @generated
	 */
	public QuranVerse createQuranVerse() {
		return new QuranVerse();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass
	 *         QuranChapter
	 * @generated
	 */
	public QuranChapter createQuranChapter() {
		return new QuranChapter();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the model object representing the EClass Hadith
	 * @generated
	 */
	public Hadith createHadith() {
		return new Hadith();
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if the value is null then null is
	 *            returned.
	 * @generated
	 */
	public Object createFromString(EDataType eDataType, String value) {
		switch (eDataType.getClassifierID()) {
		case SanadModelPackage.UUID_CLASSIFIER_ID:
			return createUUIDFromString(value);
		case SanadModelPackage.SPELLING_CLASSIFIER_ID:
			return createSpellingFromString(value);
		case SanadModelPackage.THINGKIND_CLASSIFIER_ID:
			return createThingKindFromString(value);
		case SanadModelPackage.AUTHENTICITY_CLASSIFIER_ID:
			return createAuthenticityFromString(value);
		case SanadModelPackage.SUCCESSION_CLASSIFIER_ID:
			return createSuccessionFromString(value);
		case SanadModelPackage.NARRATORGRADE_CLASSIFIER_ID:
			return createNarratorGradeFromString(value);
		case SanadModelPackage.CONCEPTKIND_CLASSIFIER_ID:
			return createConceptKindFromString(value);
		case SanadModelPackage.PROPERTYKIND_CLASSIFIER_ID:
			return createPropertyKindFromString(value);
		case SanadModelPackage.PURPOSE_CLASSIFIER_ID:
			return createPurposeFromString(value);
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage");
		}
	}

	/**
	 * Converts an instance of an {@link EDataType} to a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eDataType
	 *            the {@link EDataType} defining the type
	 * @param value
	 *            the object to convert, if value == null then null is returned
	 * @generated
	 */
	public String convertToString(EDataType eDataType, Object value) {
		switch (eDataType.getClassifierID()) {
		case SanadModelPackage.UUID_CLASSIFIER_ID:
			return convertUUIDToString((UUID) value);
		case SanadModelPackage.SPELLING_CLASSIFIER_ID:
			return convertSpellingToString((Spelling) value);
		case SanadModelPackage.THINGKIND_CLASSIFIER_ID:
			return convertThingKindToString((ThingKind) value);
		case SanadModelPackage.AUTHENTICITY_CLASSIFIER_ID:
			return convertAuthenticityToString((Authenticity) value);
		case SanadModelPackage.SUCCESSION_CLASSIFIER_ID:
			return convertSuccessionToString((Succession) value);
		case SanadModelPackage.NARRATORGRADE_CLASSIFIER_ID:
			return convertNarratorGradeToString((NarratorGrade) value);
		case SanadModelPackage.CONCEPTKIND_CLASSIFIER_ID:
			return convertConceptKindToString((ConceptKind) value);
		case SanadModelPackage.PROPERTYKIND_CLASSIFIER_ID:
			return convertPropertyKindToString((PropertyKind) value);
		case SanadModelPackage.PURPOSE_CLASSIFIER_ID:
			return convertPurposeToString((Purpose) value);
		default:
			throw new IllegalArgumentException("The EDatatype '" + eDataType
					+ "' is not defined in this EPackage.");
		}
	}

	/**
	 * Converts the EDataType: UUID to a String. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertUUIDToString(UUID value) {
		if (value == null) {
			return null;
		}
		EDataType eDataType = SanadModelPackage.INSTANCE.getUUIDEDataType();
		throw new UnsupportedOperationException(
				"Operation not support for EDataType " + eDataType.getName()
						+ " converting from value " + value);
	}

	/**
	 * Creates an instance of the EDataType: UUID from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public UUID createUUIDFromString(String value) {
		if (value == null) {
			return null;
		}
		EDataType eDataType = SanadModelPackage.INSTANCE.getUUIDEDataType();
		throw new UnsupportedOperationException(
				"Operation not support for EDataType " + eDataType.getName()
						+ " converting from value " + value);
	}

	/**
	 * Converts the EDataType: Spelling to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertSpellingToString(Spelling value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: Spelling from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public Spelling createSpellingFromString(String value) {
		if (value == null) {
			return null;
		}
		return Spelling.get(value);
	}

	/**
	 * Converts the EDataType: ThingKind to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertThingKindToString(ThingKind value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: ThingKind from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public ThingKind createThingKindFromString(String value) {
		if (value == null) {
			return null;
		}
		return ThingKind.get(value);
	}

	/**
	 * Converts the EDataType: Authenticity to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertAuthenticityToString(Authenticity value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: Authenticity from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public Authenticity createAuthenticityFromString(String value) {
		if (value == null) {
			return null;
		}
		return Authenticity.get(value);
	}

	/**
	 * Converts the EDataType: Succession to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertSuccessionToString(Succession value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: Succession from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public Succession createSuccessionFromString(String value) {
		if (value == null) {
			return null;
		}
		return Succession.get(value);
	}

	/**
	 * Converts the EDataType: NarratorGrade to a String. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertNarratorGradeToString(NarratorGrade value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: NarratorGrade from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public NarratorGrade createNarratorGradeFromString(String value) {
		if (value == null) {
			return null;
		}
		return NarratorGrade.get(value);
	}

	/**
	 * Converts the EDataType: ConceptKind to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertConceptKindToString(ConceptKind value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: ConceptKind from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public ConceptKind createConceptKindFromString(String value) {
		if (value == null) {
			return null;
		}
		return ConceptKind.get(value);
	}

	/**
	 * Converts the EDataType: PropertyKind to a String. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertPropertyKindToString(PropertyKind value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: PropertyKind from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public PropertyKind createPropertyKindFromString(String value) {
		if (value == null) {
			return null;
		}
		return PropertyKind.get(value);
	}

	/**
	 * Converts the EDataType: Purpose to a String. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the object to convert
	 * @return the String representing the value, if value == null then null is
	 *         returned
	 * @generated
	 */
	public String convertPurposeToString(Purpose value) {
		if (value == null) {
			return null;
		}
		return value.toString();
	}

	/**
	 * Creates an instance of the EDataType: Purpose from a String. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the string value to convert to an object
	 * @return the instance of the data type, if value == null then null is
	 *         returned
	 * @generated
	 */
	public Purpose createPurposeFromString(String value) {
		if (value == null) {
			return null;
		}
		return Purpose.get(value);
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Testimony</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class TestimonyModelObject<E extends Testimony> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getTestimonyEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.TESTIMONY_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.TESTIMONY_SCHEMAVERSION_FEATURE_ID:
				return getTarget().getSchemaVersion();
			case SanadModelPackage.TESTIMONY_SIGNATURES_FEATURE_ID:
				return getTarget().getSignatures();
			case SanadModelPackage.TESTIMONY_VALIDSTARTTIME_FEATURE_ID:
				return getTarget().getValidStartTime();
			case SanadModelPackage.TESTIMONY_VALIDENDTIME_FEATURE_ID:
				return getTarget().getValidEndTime();
			case SanadModelPackage.TESTIMONY_VALIDSTARTDATE_FEATURE_ID:
				return getTarget().getValidStartDate();
			case SanadModelPackage.TESTIMONY_VALIDENDDATE_FEATURE_ID:
				return getTarget().getValidEndDate();
			case SanadModelPackage.TESTIMONY_CREATIONTIME_FEATURE_ID:
				return getTarget().getCreationTime();
			case SanadModelPackage.TESTIMONY_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.TESTIMONY_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.TESTIMONY_PERSON_FEATURE_ID:
				return getTarget().getPerson();
			case SanadModelPackage.TESTIMONY_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.TESTIMONY_ID_FEATURE_ID:
				getTarget().setId((UUID) value);
				return;
			case SanadModelPackage.TESTIMONY_SIGNATURES_FEATURE_ID:
				getTarget().setSignatures((String) value);
				return;
			case SanadModelPackage.TESTIMONY_VALIDSTARTTIME_FEATURE_ID:
				getTarget().setValidStartTime((DateTime) value);
				return;
			case SanadModelPackage.TESTIMONY_VALIDENDTIME_FEATURE_ID:
				getTarget().setValidEndTime((DateTime) value);
				return;
			case SanadModelPackage.TESTIMONY_VALIDSTARTDATE_FEATURE_ID:
				getTarget().setValidStartDate((LocalDate) value);
				return;
			case SanadModelPackage.TESTIMONY_VALIDENDDATE_FEATURE_ID:
				getTarget().setValidEndDate((LocalDate) value);
				return;
			case SanadModelPackage.TESTIMONY_CREATIONTIME_FEATURE_ID:
				getTarget().setCreationTime((DateTime) value);
				return;
			case SanadModelPackage.TESTIMONY_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.TESTIMONY_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.TESTIMONY_PERSON_FEATURE_ID:
				getTarget().setPerson((PersonInfo) value);
				return;
			case SanadModelPackage.TESTIMONY_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.TESTIMONY_CLAIMS_FEATURE_ID:
				return getTarget().addToClaims((Claim) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.TESTIMONY_CLAIMS_FEATURE_ID:
				return getTarget().removeFromClaims((Claim) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>HadithCollection</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class HadithCollectionModelObject<E extends HadithCollection>
			extends CreativeWorkModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getHadithCollectionEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.HADITHCOLLECTION_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.HADITHCOLLECTION_SLUG_FEATURE_ID:
				return getTarget().getSlug();
			case SanadModelPackage.HADITHCOLLECTION_CANONICALSLUG_FEATURE_ID:
				return getTarget().getCanonicalSlug();
			case SanadModelPackage.HADITHCOLLECTION_NAMES_FEATURE_ID:
				return getTarget().getNames();
			case SanadModelPackage.HADITHCOLLECTION_AUTHENTICITIES_FEATURE_ID:
				return getTarget().getAuthenticities();
			case SanadModelPackage.HADITHCOLLECTION_SUCCESSIONS_FEATURE_ID:
				return getTarget().getSuccessions();
			case SanadModelPackage.HADITHCOLLECTION_AUTHORS_FEATURE_ID:
				return getTarget().getAuthors();
			case SanadModelPackage.HADITHCOLLECTION_NAME_FEATURE_ID:
				return getTarget().getName();
			case SanadModelPackage.HADITHCOLLECTION_AUTHOR_FEATURE_ID:
				return getTarget().getAuthor();
			case SanadModelPackage.HADITHCOLLECTION_INLANGUAGE_FEATURE_ID:
				return getTarget().getInLanguage();
			case SanadModelPackage.HADITHCOLLECTION_TRANSLITERATIONS_FEATURE_ID:
				return getTarget().getTransliterations();
			case SanadModelPackage.HADITHCOLLECTION_TEXTS_FEATURE_ID:
				return getTarget().getTexts();
			case SanadModelPackage.HADITHCOLLECTION_HADITHS_FEATURE_ID:
				return getTarget().getHadiths();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.HADITHCOLLECTION_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_SLUG_FEATURE_ID:
				getTarget().setSlug((String) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_CANONICALSLUG_FEATURE_ID:
				getTarget().setCanonicalSlug((String) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_NAMES_FEATURE_ID:
				getTarget().setNames((Set<Literal>) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_AUTHENTICITIES_FEATURE_ID:
				getTarget()
						.setAuthenticities((Set<AuthenticityProperty>) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_SUCCESSIONS_FEATURE_ID:
				getTarget().setSuccessions((Set<SuccessionProperty>) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_AUTHORS_FEATURE_ID:
				getTarget().setAuthors((Set<LegalEntityProperty>) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_AUTHOR_FEATURE_ID:
				getTarget().setAuthor((String) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_INLANGUAGE_FEATURE_ID:
				getTarget().setInLanguage((String) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_TRANSLITERATIONS_FEATURE_ID:
				getTarget().setTransliterations((Set<Transliteration>) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_TEXTS_FEATURE_ID:
				getTarget().setTexts((Set<Literal>) value);
				return;
			case SanadModelPackage.HADITHCOLLECTION_HADITHS_FEATURE_ID:
				getTarget().setHadiths((List<Hadith>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.HADITHCOLLECTION_HADITHS_FEATURE_ID:
				return getTarget().addToHadiths((Hadith) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.HADITHCOLLECTION_HADITHS_FEATURE_ID:
				return getTarget().removeFromHadiths((Hadith) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Claim</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ClaimModelObject<E extends Claim> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getClaimEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.CLAIM_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.CLAIM_TESTIMONY_FEATURE_ID:
				return getTarget().getTestimony();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.CLAIM_ID_FEATURE_ID:
				getTarget().setId((UUID) value);
				return;
			case SanadModelPackage.CLAIM_TESTIMONY_FEATURE_ID:
				getTarget().setTestimony((Testimony) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Thing</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ThingModelObject<E extends Thing> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getThingEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.THING_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.THING_SLUG_FEATURE_ID:
				return getTarget().getSlug();
			case SanadModelPackage.THING_CANONICALSLUG_FEATURE_ID:
				return getTarget().getCanonicalSlug();
			case SanadModelPackage.THING_NAMES_FEATURE_ID:
				return getTarget().getNames();
			case SanadModelPackage.THING_AUTHENTICITIES_FEATURE_ID:
				return getTarget().getAuthenticities();
			case SanadModelPackage.THING_SUCCESSIONS_FEATURE_ID:
				return getTarget().getSuccessions();
			case SanadModelPackage.THING_AUTHORS_FEATURE_ID:
				return getTarget().getAuthors();
			case SanadModelPackage.THING_NAME_FEATURE_ID:
				return getTarget().getName();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.THING_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.THING_SLUG_FEATURE_ID:
				getTarget().setSlug((String) value);
				return;
			case SanadModelPackage.THING_CANONICALSLUG_FEATURE_ID:
				getTarget().setCanonicalSlug((String) value);
				return;
			case SanadModelPackage.THING_NAMES_FEATURE_ID:
				getTarget().setNames((Set<Literal>) value);
				return;
			case SanadModelPackage.THING_AUTHENTICITIES_FEATURE_ID:
				getTarget()
						.setAuthenticities((Set<AuthenticityProperty>) value);
				return;
			case SanadModelPackage.THING_SUCCESSIONS_FEATURE_ID:
				getTarget().setSuccessions((Set<SuccessionProperty>) value);
				return;
			case SanadModelPackage.THING_AUTHORS_FEATURE_ID:
				getTarget().setAuthors((Set<LegalEntityProperty>) value);
				return;
			case SanadModelPackage.THING_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.THING_NAMES_FEATURE_ID:
				return getTarget().addToNames((Literal) value);

			case SanadModelPackage.THING_AUTHENTICITIES_FEATURE_ID:
				return getTarget().addToAuthenticities(
						(AuthenticityProperty) value);

			case SanadModelPackage.THING_SUCCESSIONS_FEATURE_ID:
				return getTarget().addToSuccessions((SuccessionProperty) value);

			case SanadModelPackage.THING_AUTHORS_FEATURE_ID:
				return getTarget().addToAuthors((LegalEntityProperty) value);

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.THING_NAMES_FEATURE_ID:
				return getTarget().removeFromNames((Literal) value);

			case SanadModelPackage.THING_AUTHENTICITIES_FEATURE_ID:
				return getTarget().removeFromAuthenticities(
						(AuthenticityProperty) value);

			case SanadModelPackage.THING_SUCCESSIONS_FEATURE_ID:
				return getTarget().removeFromSuccessions(
						(SuccessionProperty) value);

			case SanadModelPackage.THING_AUTHORS_FEATURE_ID:
				return getTarget().removeFromAuthors(
						(LegalEntityProperty) value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Property</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class PropertyModelObject<E extends Property> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getPropertyEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.PROPERTY_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.PROPERTY_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.PROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.PROPERTY_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.PROPERTY_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.PROPERTY_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.PROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.PROPERTY_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.PROPERTY_CLAIMS_FEATURE_ID:
				return getTarget().addToClaims((Claim) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.PROPERTY_CLAIMS_FEATURE_ID:
				return getTarget().removeFromClaims((Claim) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>AuthenticityProperty</b></em>
	 * '.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class AuthenticityPropertyModelObject<E extends AuthenticityProperty>
			extends PropertyModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getAuthenticityPropertyEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.AUTHENTICITYPROPERTY_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.AUTHENTICITYPROPERTY_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.AUTHENTICITYPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.AUTHENTICITYPROPERTY_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			case SanadModelPackage.AUTHENTICITYPROPERTY_AUTHENTICITY_FEATURE_ID:
				return getTarget().getAuthenticity();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.AUTHENTICITYPROPERTY_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.AUTHENTICITYPROPERTY_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.AUTHENTICITYPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.AUTHENTICITYPROPERTY_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			case SanadModelPackage.AUTHENTICITYPROPERTY_AUTHENTICITY_FEATURE_ID:
				getTarget().setAuthenticity((Authenticity) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>SuccessionProperty</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class SuccessionPropertyModelObject<E extends SuccessionProperty>
			extends PropertyModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getSuccessionPropertyEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.SUCCESSIONPROPERTY_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.SUCCESSIONPROPERTY_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.SUCCESSIONPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.SUCCESSIONPROPERTY_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			case SanadModelPackage.SUCCESSIONPROPERTY_SUCCESSION_FEATURE_ID:
				return getTarget().getSuccession();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.SUCCESSIONPROPERTY_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.SUCCESSIONPROPERTY_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.SUCCESSIONPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.SUCCESSIONPROPERTY_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			case SanadModelPackage.SUCCESSIONPROPERTY_SUCCESSION_FEATURE_ID:
				getTarget().setSuccession((Succession) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>LegalEntityProperty</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class LegalEntityPropertyModelObject<E extends LegalEntityProperty>
			extends PropertyModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getLegalEntityPropertyEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.LEGALENTITYPROPERTY_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.LEGALENTITYPROPERTY_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.LEGALENTITYPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.LEGALENTITYPROPERTY_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.LEGALENTITYPROPERTY_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.LEGALENTITYPROPERTY_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.LEGALENTITYPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.LEGALENTITYPROPERTY_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Literal</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class LiteralModelObject<E extends Literal> extends
			PropertyModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getLiteralEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.LITERAL_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.LITERAL_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.LITERAL_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.LITERAL_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			case SanadModelPackage.LITERAL_NORMALIZED_FEATURE_ID:
				return getTarget().getNormalized();
			case SanadModelPackage.LITERAL_NUMERONYM_FEATURE_ID:
				return getTarget().getNumeronym();
			case SanadModelPackage.LITERAL_INLANGUAGE_FEATURE_ID:
				return getTarget().getInLanguage();
			case SanadModelPackage.LITERAL_ADOC_FEATURE_ID:
				return getTarget().getAdoc();
			case SanadModelPackage.LITERAL_HTML_FEATURE_ID:
				return getTarget().getHtml();
			case SanadModelPackage.LITERAL_SPELLINGS_FEATURE_ID:
				return getTarget().getSpellings();
			case SanadModelPackage.LITERAL_CREATIVEWORK_FEATURE_ID:
				return getTarget().getCreativeWork();
			case SanadModelPackage.LITERAL_TRANSLATOR_FEATURE_ID:
				return getTarget().getTranslator();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.LITERAL_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.LITERAL_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.LITERAL_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.LITERAL_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			case SanadModelPackage.LITERAL_NORMALIZED_FEATURE_ID:
				getTarget().setNormalized((String) value);
				return;
			case SanadModelPackage.LITERAL_NUMERONYM_FEATURE_ID:
				getTarget().setNumeronym((String) value);
				return;
			case SanadModelPackage.LITERAL_INLANGUAGE_FEATURE_ID:
				getTarget().setInLanguage((String) value);
				return;
			case SanadModelPackage.LITERAL_ADOC_FEATURE_ID:
				getTarget().setAdoc((String) value);
				return;
			case SanadModelPackage.LITERAL_HTML_FEATURE_ID:
				getTarget().setHtml((String) value);
				return;
			case SanadModelPackage.LITERAL_SPELLINGS_FEATURE_ID:
				getTarget().setSpellings((Set<SpellingProperty>) value);
				return;
			case SanadModelPackage.LITERAL_CREATIVEWORK_FEATURE_ID:
				getTarget().setCreativeWork((CreativeWork) value);
				return;
			case SanadModelPackage.LITERAL_TRANSLATOR_FEATURE_ID:
				getTarget().setTranslator((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.LITERAL_SPELLINGS_FEATURE_ID:
				return getTarget().addToSpellings((SpellingProperty) value);

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.LITERAL_SPELLINGS_FEATURE_ID:
				return getTarget()
						.removeFromSpellings((SpellingProperty) value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>SpellingProperty</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class SpellingPropertyModelObject<E extends SpellingProperty>
			extends PropertyModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getSpellingPropertyEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.SPELLINGPROPERTY_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.SPELLINGPROPERTY_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.SPELLINGPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.SPELLINGPROPERTY_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			case SanadModelPackage.SPELLINGPROPERTY_SPELLING_FEATURE_ID:
				return getTarget().getSpelling();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.SPELLINGPROPERTY_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.SPELLINGPROPERTY_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.SPELLINGPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.SPELLINGPROPERTY_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			case SanadModelPackage.SPELLINGPROPERTY_SPELLING_FEATURE_ID:
				getTarget().setSpelling((Spelling) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>LiteralClaim</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class LiteralClaimModelObject<E extends LiteralClaim> extends
			ClaimModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getLiteralClaimEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.LITERALCLAIM_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.LITERALCLAIM_TESTIMONY_FEATURE_ID:
				return getTarget().getTestimony();
			case SanadModelPackage.LITERALCLAIM_SPELLING_FEATURE_ID:
				return getTarget().getSpelling();
			case SanadModelPackage.LITERALCLAIM_INLANGUAGE_FEATURE_ID:
				return getTarget().getInLanguage();
			case SanadModelPackage.LITERALCLAIM_ADOC_FEATURE_ID:
				return getTarget().getAdoc();
			case SanadModelPackage.LITERALCLAIM_HTML_FEATURE_ID:
				return getTarget().getHtml();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.LITERALCLAIM_ID_FEATURE_ID:
				getTarget().setId((UUID) value);
				return;
			case SanadModelPackage.LITERALCLAIM_TESTIMONY_FEATURE_ID:
				getTarget().setTestimony((Testimony) value);
				return;
			case SanadModelPackage.LITERALCLAIM_SPELLING_FEATURE_ID:
				getTarget().setSpelling((Spelling) value);
				return;
			case SanadModelPackage.LITERALCLAIM_INLANGUAGE_FEATURE_ID:
				getTarget().setInLanguage((String) value);
				return;
			case SanadModelPackage.LITERALCLAIM_ADOC_FEATURE_ID:
				getTarget().setAdoc((String) value);
				return;
			case SanadModelPackage.LITERALCLAIM_HTML_FEATURE_ID:
				getTarget().setHtml((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ThingClaim</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ThingClaimModelObject<E extends ThingClaim> extends
			ClaimModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getThingClaimEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.THINGCLAIM_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.THINGCLAIM_TESTIMONY_FEATURE_ID:
				return getTarget().getTestimony();
			case SanadModelPackage.THINGCLAIM_KIND_FEATURE_ID:
				return getTarget().getKind();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.THINGCLAIM_ID_FEATURE_ID:
				getTarget().setId((UUID) value);
				return;
			case SanadModelPackage.THINGCLAIM_TESTIMONY_FEATURE_ID:
				getTarget().setTestimony((Testimony) value);
				return;
			case SanadModelPackage.THINGCLAIM_KIND_FEATURE_ID:
				getTarget().setKind((ThingKind) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Evidence</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class EvidenceModelObject<E extends Evidence> extends
			ThingModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getEvidenceEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.EVIDENCE_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.EVIDENCE_SLUG_FEATURE_ID:
				return getTarget().getSlug();
			case SanadModelPackage.EVIDENCE_CANONICALSLUG_FEATURE_ID:
				return getTarget().getCanonicalSlug();
			case SanadModelPackage.EVIDENCE_NAMES_FEATURE_ID:
				return getTarget().getNames();
			case SanadModelPackage.EVIDENCE_AUTHENTICITIES_FEATURE_ID:
				return getTarget().getAuthenticities();
			case SanadModelPackage.EVIDENCE_SUCCESSIONS_FEATURE_ID:
				return getTarget().getSuccessions();
			case SanadModelPackage.EVIDENCE_AUTHORS_FEATURE_ID:
				return getTarget().getAuthors();
			case SanadModelPackage.EVIDENCE_NAME_FEATURE_ID:
				return getTarget().getName();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.EVIDENCE_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.EVIDENCE_SLUG_FEATURE_ID:
				getTarget().setSlug((String) value);
				return;
			case SanadModelPackage.EVIDENCE_CANONICALSLUG_FEATURE_ID:
				getTarget().setCanonicalSlug((String) value);
				return;
			case SanadModelPackage.EVIDENCE_NAMES_FEATURE_ID:
				getTarget().setNames((Set<Literal>) value);
				return;
			case SanadModelPackage.EVIDENCE_AUTHENTICITIES_FEATURE_ID:
				getTarget()
						.setAuthenticities((Set<AuthenticityProperty>) value);
				return;
			case SanadModelPackage.EVIDENCE_SUCCESSIONS_FEATURE_ID:
				getTarget().setSuccessions((Set<SuccessionProperty>) value);
				return;
			case SanadModelPackage.EVIDENCE_AUTHORS_FEATURE_ID:
				getTarget().setAuthors((Set<LegalEntityProperty>) value);
				return;
			case SanadModelPackage.EVIDENCE_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ThingProperty</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ThingPropertyModelObject<E extends ThingProperty>
			extends PropertyModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getThingPropertyEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.THINGPROPERTY_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.THINGPROPERTY_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.THINGPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.THINGPROPERTY_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			case SanadModelPackage.THINGPROPERTY_THINGKIND_FEATURE_ID:
				return getTarget().getThingKind();
			case SanadModelPackage.THINGPROPERTY_THING_FEATURE_ID:
				return getTarget().getThing();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.THINGPROPERTY_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.THINGPROPERTY_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.THINGPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.THINGPROPERTY_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			case SanadModelPackage.THINGPROPERTY_THINGKIND_FEATURE_ID:
				getTarget().setThingKind((ThingKind) value);
				return;
			case SanadModelPackage.THINGPROPERTY_THING_FEATURE_ID:
				getTarget().setThing((Thing) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>AuthenticityClaim</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class AuthenticityClaimModelObject<E extends AuthenticityClaim>
			extends ClaimModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getAuthenticityClaimEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.AUTHENTICITYCLAIM_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.AUTHENTICITYCLAIM_TESTIMONY_FEATURE_ID:
				return getTarget().getTestimony();
			case SanadModelPackage.AUTHENTICITYCLAIM_AUTHENTICITY_FEATURE_ID:
				return getTarget().getAuthenticity();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.AUTHENTICITYCLAIM_ID_FEATURE_ID:
				getTarget().setId((UUID) value);
				return;
			case SanadModelPackage.AUTHENTICITYCLAIM_TESTIMONY_FEATURE_ID:
				getTarget().setTestimony((Testimony) value);
				return;
			case SanadModelPackage.AUTHENTICITYCLAIM_AUTHENTICITY_FEATURE_ID:
				getTarget().setAuthenticity((Authenticity) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>SuccessionClaim</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class SuccessionClaimModelObject<E extends SuccessionClaim>
			extends ClaimModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getSuccessionClaimEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.SUCCESSIONCLAIM_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.SUCCESSIONCLAIM_TESTIMONY_FEATURE_ID:
				return getTarget().getTestimony();
			case SanadModelPackage.SUCCESSIONCLAIM_SUCCESSION_FEATURE_ID:
				return getTarget().getSuccession();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.SUCCESSIONCLAIM_ID_FEATURE_ID:
				getTarget().setId((UUID) value);
				return;
			case SanadModelPackage.SUCCESSIONCLAIM_TESTIMONY_FEATURE_ID:
				getTarget().setTestimony((Testimony) value);
				return;
			case SanadModelPackage.SUCCESSIONCLAIM_SUCCESSION_FEATURE_ID:
				getTarget().setSuccession((Succession) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>NarratorClaim</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class NarratorClaimModelObject<E extends NarratorClaim>
			extends ClaimModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getNarratorClaimEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.NARRATORCLAIM_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.NARRATORCLAIM_TESTIMONY_FEATURE_ID:
				return getTarget().getTestimony();
			case SanadModelPackage.NARRATORCLAIM_SCHOLARID_FEATURE_ID:
				return getTarget().getScholarId();
			case SanadModelPackage.NARRATORCLAIM_GRADE_FEATURE_ID:
				return getTarget().getGrade();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.NARRATORCLAIM_ID_FEATURE_ID:
				getTarget().setId((UUID) value);
				return;
			case SanadModelPackage.NARRATORCLAIM_TESTIMONY_FEATURE_ID:
				getTarget().setTestimony((Testimony) value);
				return;
			case SanadModelPackage.NARRATORCLAIM_SCHOLARID_FEATURE_ID:
				getTarget().setScholarId((String) value);
				return;
			case SanadModelPackage.NARRATORCLAIM_GRADE_FEATURE_ID:
				getTarget().setGrade((NarratorGrade) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Scholar</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ScholarModelObject<E extends Scholar> extends
			AbstractModelObject<E> {
		/**
		 * @generated
		 */
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getScholarEClass();
		}

		/**
		 * @generated
		 */
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.SCHOLAR_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.SCHOLAR_NAME_FEATURE_ID:
				return getTarget().getName();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.SCHOLAR_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.SCHOLAR_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>PersonProperty</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class PersonPropertyModelObject<E extends PersonProperty>
			extends LegalEntityPropertyModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getPersonPropertyEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.PERSONPROPERTY_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.PERSONPROPERTY_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.PERSONPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.PERSONPROPERTY_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			case SanadModelPackage.PERSONPROPERTY_PERSONID_FEATURE_ID:
				return getTarget().getPersonId();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.PERSONPROPERTY_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.PERSONPROPERTY_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.PERSONPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.PERSONPROPERTY_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			case SanadModelPackage.PERSONPROPERTY_PERSONID_FEATURE_ID:
				getTarget().setPersonId((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>ScholarProperty</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class ScholarPropertyModelObject<E extends ScholarProperty>
			extends LegalEntityPropertyModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getScholarPropertyEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.SCHOLARPROPERTY_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.SCHOLARPROPERTY_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.SCHOLARPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.SCHOLARPROPERTY_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			case SanadModelPackage.SCHOLARPROPERTY_SCHOLARID_FEATURE_ID:
				return getTarget().getScholarId();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.SCHOLARPROPERTY_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.SCHOLARPROPERTY_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.SCHOLARPROPERTY_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.SCHOLARPROPERTY_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			case SanadModelPackage.SCHOLARPROPERTY_SCHOLARID_FEATURE_ID:
				getTarget().setScholarId((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Transliteration</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class TransliterationModelObject<E extends Transliteration>
			extends PropertyModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getTransliterationEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.TRANSLITERATION_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.TRANSLITERATION_DESCRIPTION_FEATURE_ID:
				return getTarget().getDescription();
			case SanadModelPackage.TRANSLITERATION_DESCRIPTIONHTML_FEATURE_ID:
				return getTarget().getDescriptionHtml();
			case SanadModelPackage.TRANSLITERATION_CLAIMS_FEATURE_ID:
				return getTarget().getClaims();
			case SanadModelPackage.TRANSLITERATION_NORMALIZED_FEATURE_ID:
				return getTarget().getNormalized();
			case SanadModelPackage.TRANSLITERATION_NUMERONYM_FEATURE_ID:
				return getTarget().getNumeronym();
			case SanadModelPackage.TRANSLITERATION_ADOC_FEATURE_ID:
				return getTarget().getAdoc();
			case SanadModelPackage.TRANSLITERATION_HTML_FEATURE_ID:
				return getTarget().getHtml();
			case SanadModelPackage.TRANSLITERATION_SPELLINGS_FEATURE_ID:
				return getTarget().getSpellings();
			case SanadModelPackage.TRANSLITERATION_CREATIVEWORK_FEATURE_ID:
				return getTarget().getCreativeWork();
			case SanadModelPackage.TRANSLITERATION_TRANSLITERATOR_FEATURE_ID:
				return getTarget().getTransliterator();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.TRANSLITERATION_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.TRANSLITERATION_DESCRIPTION_FEATURE_ID:
				getTarget().setDescription((String) value);
				return;
			case SanadModelPackage.TRANSLITERATION_DESCRIPTIONHTML_FEATURE_ID:
				getTarget().setDescriptionHtml((String) value);
				return;
			case SanadModelPackage.TRANSLITERATION_CLAIMS_FEATURE_ID:
				getTarget().setClaims((Set<Claim>) value);
				return;
			case SanadModelPackage.TRANSLITERATION_NORMALIZED_FEATURE_ID:
				getTarget().setNormalized((String) value);
				return;
			case SanadModelPackage.TRANSLITERATION_NUMERONYM_FEATURE_ID:
				getTarget().setNumeronym((String) value);
				return;
			case SanadModelPackage.TRANSLITERATION_ADOC_FEATURE_ID:
				getTarget().setAdoc((String) value);
				return;
			case SanadModelPackage.TRANSLITERATION_HTML_FEATURE_ID:
				getTarget().setHtml((String) value);
				return;
			case SanadModelPackage.TRANSLITERATION_SPELLINGS_FEATURE_ID:
				getTarget().setSpellings((Set<SpellingProperty>) value);
				return;
			case SanadModelPackage.TRANSLITERATION_CREATIVEWORK_FEATURE_ID:
				getTarget().setCreativeWork((CreativeWork) value);
				return;
			case SanadModelPackage.TRANSLITERATION_TRANSLITERATOR_FEATURE_ID:
				getTarget().setTransliterator((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.TRANSLITERATION_SPELLINGS_FEATURE_ID:
				return getTarget().addToSpellings((SpellingProperty) value);

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.TRANSLITERATION_SPELLINGS_FEATURE_ID:
				return getTarget()
						.removeFromSpellings((SpellingProperty) value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>TransliterationClaim</b></em>
	 * '.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class TransliterationClaimModelObject<E extends TransliterationClaim>
			extends ClaimModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getTransliterationClaimEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.TRANSLITERATIONCLAIM_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.TRANSLITERATIONCLAIM_TESTIMONY_FEATURE_ID:
				return getTarget().getTestimony();
			case SanadModelPackage.TRANSLITERATIONCLAIM_ADOC_FEATURE_ID:
				return getTarget().getAdoc();
			case SanadModelPackage.TRANSLITERATIONCLAIM_HTML_FEATURE_ID:
				return getTarget().getHtml();
			case SanadModelPackage.TRANSLITERATIONCLAIM_SPELLING_FEATURE_ID:
				return getTarget().getSpelling();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.TRANSLITERATIONCLAIM_ID_FEATURE_ID:
				getTarget().setId((UUID) value);
				return;
			case SanadModelPackage.TRANSLITERATIONCLAIM_TESTIMONY_FEATURE_ID:
				getTarget().setTestimony((Testimony) value);
				return;
			case SanadModelPackage.TRANSLITERATIONCLAIM_ADOC_FEATURE_ID:
				getTarget().setAdoc((String) value);
				return;
			case SanadModelPackage.TRANSLITERATIONCLAIM_HTML_FEATURE_ID:
				getTarget().setHtml((String) value);
				return;
			case SanadModelPackage.TRANSLITERATIONCLAIM_SPELLING_FEATURE_ID:
				getTarget().setSpelling((Spelling) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>CreativeWork</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class CreativeWorkModelObject<E extends CreativeWork> extends
			ThingModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getCreativeWorkEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.CREATIVEWORK_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.CREATIVEWORK_SLUG_FEATURE_ID:
				return getTarget().getSlug();
			case SanadModelPackage.CREATIVEWORK_CANONICALSLUG_FEATURE_ID:
				return getTarget().getCanonicalSlug();
			case SanadModelPackage.CREATIVEWORK_NAMES_FEATURE_ID:
				return getTarget().getNames();
			case SanadModelPackage.CREATIVEWORK_AUTHENTICITIES_FEATURE_ID:
				return getTarget().getAuthenticities();
			case SanadModelPackage.CREATIVEWORK_SUCCESSIONS_FEATURE_ID:
				return getTarget().getSuccessions();
			case SanadModelPackage.CREATIVEWORK_AUTHORS_FEATURE_ID:
				return getTarget().getAuthors();
			case SanadModelPackage.CREATIVEWORK_NAME_FEATURE_ID:
				return getTarget().getName();
			case SanadModelPackage.CREATIVEWORK_AUTHOR_FEATURE_ID:
				return getTarget().getAuthor();
			case SanadModelPackage.CREATIVEWORK_INLANGUAGE_FEATURE_ID:
				return getTarget().getInLanguage();
			case SanadModelPackage.CREATIVEWORK_TRANSLITERATIONS_FEATURE_ID:
				return getTarget().getTransliterations();
			case SanadModelPackage.CREATIVEWORK_TEXTS_FEATURE_ID:
				return getTarget().getTexts();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.CREATIVEWORK_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.CREATIVEWORK_SLUG_FEATURE_ID:
				getTarget().setSlug((String) value);
				return;
			case SanadModelPackage.CREATIVEWORK_CANONICALSLUG_FEATURE_ID:
				getTarget().setCanonicalSlug((String) value);
				return;
			case SanadModelPackage.CREATIVEWORK_NAMES_FEATURE_ID:
				getTarget().setNames((Set<Literal>) value);
				return;
			case SanadModelPackage.CREATIVEWORK_AUTHENTICITIES_FEATURE_ID:
				getTarget()
						.setAuthenticities((Set<AuthenticityProperty>) value);
				return;
			case SanadModelPackage.CREATIVEWORK_SUCCESSIONS_FEATURE_ID:
				getTarget().setSuccessions((Set<SuccessionProperty>) value);
				return;
			case SanadModelPackage.CREATIVEWORK_AUTHORS_FEATURE_ID:
				getTarget().setAuthors((Set<LegalEntityProperty>) value);
				return;
			case SanadModelPackage.CREATIVEWORK_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case SanadModelPackage.CREATIVEWORK_AUTHOR_FEATURE_ID:
				getTarget().setAuthor((String) value);
				return;
			case SanadModelPackage.CREATIVEWORK_INLANGUAGE_FEATURE_ID:
				getTarget().setInLanguage((String) value);
				return;
			case SanadModelPackage.CREATIVEWORK_TRANSLITERATIONS_FEATURE_ID:
				getTarget().setTransliterations((Set<Transliteration>) value);
				return;
			case SanadModelPackage.CREATIVEWORK_TEXTS_FEATURE_ID:
				getTarget().setTexts((Set<Literal>) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.CREATIVEWORK_TRANSLITERATIONS_FEATURE_ID:
				return getTarget().addToTransliterations(
						(Transliteration) value);

			case SanadModelPackage.CREATIVEWORK_TEXTS_FEATURE_ID:
				return getTarget().addToTexts((Literal) value);
			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.CREATIVEWORK_TRANSLITERATIONS_FEATURE_ID:
				return getTarget().removeFromTransliterations(
						(Transliteration) value);

			case SanadModelPackage.CREATIVEWORK_TEXTS_FEATURE_ID:
				return getTarget().removeFromTexts((Literal) value);
			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>QuranVerse</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class QuranVerseModelObject<E extends QuranVerse> extends
			CreativeWorkModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getQuranVerseEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.QURANVERSE_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.QURANVERSE_SLUG_FEATURE_ID:
				return getTarget().getSlug();
			case SanadModelPackage.QURANVERSE_CANONICALSLUG_FEATURE_ID:
				return getTarget().getCanonicalSlug();
			case SanadModelPackage.QURANVERSE_NAMES_FEATURE_ID:
				return getTarget().getNames();
			case SanadModelPackage.QURANVERSE_AUTHENTICITIES_FEATURE_ID:
				return getTarget().getAuthenticities();
			case SanadModelPackage.QURANVERSE_SUCCESSIONS_FEATURE_ID:
				return getTarget().getSuccessions();
			case SanadModelPackage.QURANVERSE_AUTHORS_FEATURE_ID:
				return getTarget().getAuthors();
			case SanadModelPackage.QURANVERSE_NAME_FEATURE_ID:
				return getTarget().getName();
			case SanadModelPackage.QURANVERSE_AUTHOR_FEATURE_ID:
				return getTarget().getAuthor();
			case SanadModelPackage.QURANVERSE_INLANGUAGE_FEATURE_ID:
				return getTarget().getInLanguage();
			case SanadModelPackage.QURANVERSE_TRANSLITERATIONS_FEATURE_ID:
				return getTarget().getTransliterations();
			case SanadModelPackage.QURANVERSE_TEXTS_FEATURE_ID:
				return getTarget().getTexts();
			case SanadModelPackage.QURANVERSE_CHAPTER_FEATURE_ID:
				return getTarget().getChapter();
			case SanadModelPackage.QURANVERSE_VERSENUM_FEATURE_ID:
				return getTarget().getVerseNum();
			case SanadModelPackage.QURANVERSE_TRANSLITERATION_FEATURE_ID:
				return getTarget().getTransliteration();
			case SanadModelPackage.QURANVERSE_TEXT_FEATURE_ID:
				return getTarget().getText();
			case SanadModelPackage.QURANVERSE_TEXTWITHOUTTASHKEEL_FEATURE_ID:
				return getTarget().getTextWithoutTashkeel();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.QURANVERSE_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.QURANVERSE_SLUG_FEATURE_ID:
				getTarget().setSlug((String) value);
				return;
			case SanadModelPackage.QURANVERSE_CANONICALSLUG_FEATURE_ID:
				getTarget().setCanonicalSlug((String) value);
				return;
			case SanadModelPackage.QURANVERSE_NAMES_FEATURE_ID:
				getTarget().setNames((Set<Literal>) value);
				return;
			case SanadModelPackage.QURANVERSE_AUTHENTICITIES_FEATURE_ID:
				getTarget()
						.setAuthenticities((Set<AuthenticityProperty>) value);
				return;
			case SanadModelPackage.QURANVERSE_SUCCESSIONS_FEATURE_ID:
				getTarget().setSuccessions((Set<SuccessionProperty>) value);
				return;
			case SanadModelPackage.QURANVERSE_AUTHORS_FEATURE_ID:
				getTarget().setAuthors((Set<LegalEntityProperty>) value);
				return;
			case SanadModelPackage.QURANVERSE_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case SanadModelPackage.QURANVERSE_AUTHOR_FEATURE_ID:
				getTarget().setAuthor((String) value);
				return;
			case SanadModelPackage.QURANVERSE_INLANGUAGE_FEATURE_ID:
				getTarget().setInLanguage((String) value);
				return;
			case SanadModelPackage.QURANVERSE_TRANSLITERATIONS_FEATURE_ID:
				getTarget().setTransliterations((Set<Transliteration>) value);
				return;
			case SanadModelPackage.QURANVERSE_TEXTS_FEATURE_ID:
				getTarget().setTexts((Set<Literal>) value);
				return;
			case SanadModelPackage.QURANVERSE_CHAPTER_FEATURE_ID:
				getTarget().setChapter((QuranChapter) value);
				return;
			case SanadModelPackage.QURANVERSE_VERSENUM_FEATURE_ID:
				getTarget().setVerseNum((Integer) value);
				return;
			case SanadModelPackage.QURANVERSE_TRANSLITERATION_FEATURE_ID:
				getTarget().setTransliteration((Transliteration) value);
				return;
			case SanadModelPackage.QURANVERSE_TEXT_FEATURE_ID:
				getTarget().setText((Literal) value);
				return;
			case SanadModelPackage.QURANVERSE_TEXTWITHOUTTASHKEEL_FEATURE_ID:
				getTarget().setTextWithoutTashkeel((Literal) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>QuranChapter</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class QuranChapterModelObject<E extends QuranChapter> extends
			CreativeWorkModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getQuranChapterEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.QURANCHAPTER_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.QURANCHAPTER_SLUG_FEATURE_ID:
				return getTarget().getSlug();
			case SanadModelPackage.QURANCHAPTER_CANONICALSLUG_FEATURE_ID:
				return getTarget().getCanonicalSlug();
			case SanadModelPackage.QURANCHAPTER_NAMES_FEATURE_ID:
				return getTarget().getNames();
			case SanadModelPackage.QURANCHAPTER_AUTHENTICITIES_FEATURE_ID:
				return getTarget().getAuthenticities();
			case SanadModelPackage.QURANCHAPTER_SUCCESSIONS_FEATURE_ID:
				return getTarget().getSuccessions();
			case SanadModelPackage.QURANCHAPTER_AUTHORS_FEATURE_ID:
				return getTarget().getAuthors();
			case SanadModelPackage.QURANCHAPTER_NAME_FEATURE_ID:
				return getTarget().getName();
			case SanadModelPackage.QURANCHAPTER_AUTHOR_FEATURE_ID:
				return getTarget().getAuthor();
			case SanadModelPackage.QURANCHAPTER_INLANGUAGE_FEATURE_ID:
				return getTarget().getInLanguage();
			case SanadModelPackage.QURANCHAPTER_TRANSLITERATIONS_FEATURE_ID:
				return getTarget().getTransliterations();
			case SanadModelPackage.QURANCHAPTER_TEXTS_FEATURE_ID:
				return getTarget().getTexts();
			case SanadModelPackage.QURANCHAPTER_CHAPTERNUM_FEATURE_ID:
				return getTarget().getChapterNum();
			case SanadModelPackage.QURANCHAPTER_NAMEWITHTASHKEEL_FEATURE_ID:
				return getTarget().getNameWithTashkeel();
			case SanadModelPackage.QURANCHAPTER_VERSES_FEATURE_ID:
				return getTarget().getVerses();
			case SanadModelPackage.QURANCHAPTER_NAMETRANSLITERATION_FEATURE_ID:
				return getTarget().getNameTransliteration();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.QURANCHAPTER_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.QURANCHAPTER_SLUG_FEATURE_ID:
				getTarget().setSlug((String) value);
				return;
			case SanadModelPackage.QURANCHAPTER_CANONICALSLUG_FEATURE_ID:
				getTarget().setCanonicalSlug((String) value);
				return;
			case SanadModelPackage.QURANCHAPTER_NAMES_FEATURE_ID:
				getTarget().setNames((Set<Literal>) value);
				return;
			case SanadModelPackage.QURANCHAPTER_AUTHENTICITIES_FEATURE_ID:
				getTarget()
						.setAuthenticities((Set<AuthenticityProperty>) value);
				return;
			case SanadModelPackage.QURANCHAPTER_SUCCESSIONS_FEATURE_ID:
				getTarget().setSuccessions((Set<SuccessionProperty>) value);
				return;
			case SanadModelPackage.QURANCHAPTER_AUTHORS_FEATURE_ID:
				getTarget().setAuthors((Set<LegalEntityProperty>) value);
				return;
			case SanadModelPackage.QURANCHAPTER_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case SanadModelPackage.QURANCHAPTER_AUTHOR_FEATURE_ID:
				getTarget().setAuthor((String) value);
				return;
			case SanadModelPackage.QURANCHAPTER_INLANGUAGE_FEATURE_ID:
				getTarget().setInLanguage((String) value);
				return;
			case SanadModelPackage.QURANCHAPTER_TRANSLITERATIONS_FEATURE_ID:
				getTarget().setTransliterations((Set<Transliteration>) value);
				return;
			case SanadModelPackage.QURANCHAPTER_TEXTS_FEATURE_ID:
				getTarget().setTexts((Set<Literal>) value);
				return;
			case SanadModelPackage.QURANCHAPTER_CHAPTERNUM_FEATURE_ID:
				getTarget().setChapterNum((Integer) value);
				return;
			case SanadModelPackage.QURANCHAPTER_NAMEWITHTASHKEEL_FEATURE_ID:
				getTarget().setNameWithTashkeel((String) value);
				return;
			case SanadModelPackage.QURANCHAPTER_VERSES_FEATURE_ID:
				getTarget().setVerses((List<QuranVerse>) value);
				return;
			case SanadModelPackage.QURANCHAPTER_NAMETRANSLITERATION_FEATURE_ID:
				getTarget().setNameTransliteration((String) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.QURANCHAPTER_VERSES_FEATURE_ID:
				return getTarget().addToVerses((QuranVerse) value);

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.QURANCHAPTER_VERSES_FEATURE_ID:
				return getTarget().removeFromVerses((QuranVerse) value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}

	/**
	 * The adapter/wrapper for the EClass '<em><b>Hadith</b></em>'.
	 *
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param <E>
	 *            the domain model java class
	 *
	 * @generated
	 */
	public static class HadithModelObject<E extends Hadith> extends
			CreativeWorkModelObject<E> {
		/**
		 * @generated
		 */
		@Override
		public EClass eClass() {
			return SanadModelPackage.INSTANCE.getHadithEClass();
		}

		/**
		 * @generated
		 */
		@Override
		public ModelPackage getModelPackage() {
			return SanadModelPackage.INSTANCE;
		}

		/**
		 * @generated
		 */
		@Override
		public Object eGet(EStructuralFeature eStructuralFeature) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.HADITH_ID_FEATURE_ID:
				return getTarget().getId();
			case SanadModelPackage.HADITH_SLUG_FEATURE_ID:
				return getTarget().getSlug();
			case SanadModelPackage.HADITH_CANONICALSLUG_FEATURE_ID:
				return getTarget().getCanonicalSlug();
			case SanadModelPackage.HADITH_NAMES_FEATURE_ID:
				return getTarget().getNames();
			case SanadModelPackage.HADITH_AUTHENTICITIES_FEATURE_ID:
				return getTarget().getAuthenticities();
			case SanadModelPackage.HADITH_SUCCESSIONS_FEATURE_ID:
				return getTarget().getSuccessions();
			case SanadModelPackage.HADITH_AUTHORS_FEATURE_ID:
				return getTarget().getAuthors();
			case SanadModelPackage.HADITH_NAME_FEATURE_ID:
				return getTarget().getName();
			case SanadModelPackage.HADITH_AUTHOR_FEATURE_ID:
				return getTarget().getAuthor();
			case SanadModelPackage.HADITH_INLANGUAGE_FEATURE_ID:
				return getTarget().getInLanguage();
			case SanadModelPackage.HADITH_TRANSLITERATIONS_FEATURE_ID:
				return getTarget().getTransliterations();
			case SanadModelPackage.HADITH_TEXTS_FEATURE_ID:
				return getTarget().getTexts();
			case SanadModelPackage.HADITH_ARTICLEBODIES_FEATURE_ID:
				return getTarget().getArticleBodies();
			case SanadModelPackage.HADITH_COLLECTION_FEATURE_ID:
				return getTarget().getCollection();
			case SanadModelPackage.HADITH_HADITHNUM_FEATURE_ID:
				return getTarget().getHadithNum();
			case SanadModelPackage.HADITH_VOLUMENUM_FEATURE_ID:
				return getTarget().getVolumeNum();
			default:
				return super.eGet(eStructuralFeature);
			}
		}

		/**
		 * @generated
		 */
		@SuppressWarnings("unchecked")
		@Override
		public void eSet(EStructuralFeature eStructuralFeature, Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {
			case SanadModelPackage.HADITH_ID_FEATURE_ID:
				getTarget().setId((String) value);
				return;
			case SanadModelPackage.HADITH_SLUG_FEATURE_ID:
				getTarget().setSlug((String) value);
				return;
			case SanadModelPackage.HADITH_CANONICALSLUG_FEATURE_ID:
				getTarget().setCanonicalSlug((String) value);
				return;
			case SanadModelPackage.HADITH_NAMES_FEATURE_ID:
				getTarget().setNames((Set<Literal>) value);
				return;
			case SanadModelPackage.HADITH_AUTHENTICITIES_FEATURE_ID:
				getTarget()
						.setAuthenticities((Set<AuthenticityProperty>) value);
				return;
			case SanadModelPackage.HADITH_SUCCESSIONS_FEATURE_ID:
				getTarget().setSuccessions((Set<SuccessionProperty>) value);
				return;
			case SanadModelPackage.HADITH_AUTHORS_FEATURE_ID:
				getTarget().setAuthors((Set<LegalEntityProperty>) value);
				return;
			case SanadModelPackage.HADITH_NAME_FEATURE_ID:
				getTarget().setName((String) value);
				return;
			case SanadModelPackage.HADITH_AUTHOR_FEATURE_ID:
				getTarget().setAuthor((String) value);
				return;
			case SanadModelPackage.HADITH_INLANGUAGE_FEATURE_ID:
				getTarget().setInLanguage((String) value);
				return;
			case SanadModelPackage.HADITH_TRANSLITERATIONS_FEATURE_ID:
				getTarget().setTransliterations((Set<Transliteration>) value);
				return;
			case SanadModelPackage.HADITH_TEXTS_FEATURE_ID:
				getTarget().setTexts((Set<Literal>) value);
				return;
			case SanadModelPackage.HADITH_ARTICLEBODIES_FEATURE_ID:
				getTarget().setArticleBodies((Set<Literal>) value);
				return;
			case SanadModelPackage.HADITH_COLLECTION_FEATURE_ID:
				getTarget().setCollection((HadithCollection) value);
				return;
			case SanadModelPackage.HADITH_HADITHNUM_FEATURE_ID:
				getTarget().setHadithNum((Integer) value);
				return;
			case SanadModelPackage.HADITH_VOLUMENUM_FEATURE_ID:
				getTarget().setVolumeNum((Integer) value);
				return;
			default:
				super.eSet(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eAddTo(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.HADITH_ARTICLEBODIES_FEATURE_ID:
				return getTarget().addToArticleBodies((Literal) value);

			default:
				return super.eAddTo(eStructuralFeature, value);
			}
		}

		/**
		 * @generated
		 */
		@Override
		public boolean eRemoveFrom(EStructuralFeature eStructuralFeature,
				Object value) {
			final int featureID = eClass().getFeatureID(eStructuralFeature);
			switch (featureID) {

			case SanadModelPackage.HADITH_ARTICLEBODIES_FEATURE_ID:
				return getTarget().removeFromArticleBodies((Literal) value);

			default:
				return super.eRemoveFrom(eStructuralFeature, value);
			}
		}
	}
}