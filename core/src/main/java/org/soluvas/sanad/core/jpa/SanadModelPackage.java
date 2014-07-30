package org.soluvas.sanad.core.jpa;

import java.util.UUID;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.texo.model.ModelFactory;
import org.eclipse.emf.texo.model.ModelPackage;
import org.eclipse.emf.texo.model.ModelResolver;
import org.eclipse.emf.texo.utils.ModelUtils;
import org.soluvas.jpa.jpa.JpaModelPackage;

/**
 * The <b>Package</b> for the model '<em><b>sanad-jpa</b></em>'. It contains
 * initialization code and access to the Factory to instantiate types of this
 * package.
 *
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class SanadModelPackage extends ModelPackage {

	/**
	 * Is set when the package has been initialized.
	 * 
	 * @generated
	 */
	private static boolean isInitialized = false;

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String NS_URI = "http://www.soluvas.org/sanad/jpa/";

	/**
	 * The {@link ModelFactory} for this package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static final SanadModelFactory MODELFACTORY = new SanadModelFactory();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int UUID_CLASSIFIER_ID = 29;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPELLING_CLASSIFIER_ID = 24;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGKIND_CLASSIFIER_ID = 26;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITY_CLASSIFIER_ID = 27;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSION_CLASSIFIER_ID = 28;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NARRATORGRADE_CLASSIFIER_ID = 31;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CONCEPTKIND_CLASSIFIER_ID = 23;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROPERTYKIND_CLASSIFIER_ID = 25;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PURPOSE_CLASSIFIER_ID = 30;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_CLASSIFIER_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_CLAIMS_FEATURE_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_SIGNATURES_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_VALIDSTARTTIME_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_VALIDENDTIME_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_VALIDSTARTDATE_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_VALIDENDDATE_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_PERSONID_FEATURE_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_CREATIONTIME_FEATURE_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_SCHEMAVERSION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_DESCRIPTION_FEATURE_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TESTIMONY_DESCRIPTIONHTML_FEATURE_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLAIM_CLASSIFIER_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLAIM_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CLAIM_TESTIMONY_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THING_CLASSIFIER_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THING_NAMES_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THING_AUTHENTICITIES_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THING_SUCCESSIONS_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THING_AUTHORS_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THING_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THING_SLUG_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THING_CANONICALSLUG_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALPROPERTY_CLASSIFIER_ID = 7;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALPROPERTY_ADOC_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALPROPERTY_HTML_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALPROPERTY_CLAIMS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALPROPERTY_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALPROPERTY_DESCRIPTION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALPROPERTY_DESCRIPTIONHTML_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROPERTY_CLASSIFIER_ID = 8;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROPERTY_CLAIMS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROPERTY_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROPERTY_DESCRIPTION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PROPERTY_DESCRIPTIONHTML_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITYPROPERTY_CLASSIFIER_ID = 12;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITYPROPERTY_AUTHENTICITY_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSIONPROPERTY_CLASSIFIER_ID = 13;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSIONPROPERTY_CLAIMS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSIONPROPERTY_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSIONPROPERTY_DESCRIPTION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSIONPROPERTY_DESCRIPTIONHTML_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSIONPROPERTY_SUCCESSION_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITYPROPERTY_CLAIMS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITYPROPERTY_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITYPROPERTY_DESCRIPTION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITYPROPERTY_DESCRIPTIONHTML_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERAL_CLASSIFIER_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERAL_LANGUAGETAG_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERAL_ADOC_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERAL_HTML_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERAL_SPELLINGS_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERAL_NORMALIZED_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERAL_NUMERONYM_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERAL_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPELLINGPROPERTY_CLASSIFIER_ID = 20;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPELLINGPROPERTY_SPELLING_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPELLINGPROPERTY_CLAIMS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPELLINGPROPERTY_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPELLINGPROPERTY_DESCRIPTION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SPELLINGPROPERTY_DESCRIPTIONHTML_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALCLAIM_CLASSIFIER_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALCLAIM_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALCLAIM_TESTIMONY_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALCLAIM_SPELLING_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALCLAIM_LANGUAGE_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALCLAIM_ADOC_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int LITERALCLAIM_HTML_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGCLAIM_CLASSIFIER_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGCLAIM_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGCLAIM_TESTIMONY_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGCLAIM_KIND_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EVIDENCE_CLASSIFIER_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EVIDENCE_NAMES_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EVIDENCE_AUTHENTICITIES_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EVIDENCE_SUCCESSIONS_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EVIDENCE_AUTHORS_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EVIDENCE_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EVIDENCE_SLUG_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int EVIDENCE_CANONICALSLUG_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGPROPERTY_CLASSIFIER_ID = 9;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGPROPERTY_THINGKIND_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGPROPERTY_THING_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGPROPERTY_CLAIMS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGPROPERTY_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGPROPERTY_DESCRIPTION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int THINGPROPERTY_DESCRIPTIONHTML_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITYCLAIM_CLASSIFIER_ID = 10;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITYCLAIM_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITYCLAIM_TESTIMONY_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int AUTHENTICITYCLAIM_AUTHENTICITY_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSIONCLAIM_CLASSIFIER_ID = 11;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSIONCLAIM_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSIONCLAIM_TESTIMONY_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SUCCESSIONCLAIM_SUCCESSION_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NARRATORCLAIM_CLASSIFIER_ID = 14;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NARRATORCLAIM_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NARRATORCLAIM_TESTIMONY_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NARRATORCLAIM_SCHOLARID_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int NARRATORCLAIM_GRADE_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHOLAR_CLASSIFIER_ID = 15;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHOLAR_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHOLAR_NAME_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONPROPERTY_CLASSIFIER_ID = 16;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONPROPERTY_PERSONID_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONPROPERTY_CLAIMS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONPROPERTY_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONPROPERTY_DESCRIPTION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int PERSONPROPERTY_DESCRIPTIONHTML_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHOLARPROPERTY_CLASSIFIER_ID = 17;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHOLARPROPERTY_SCHOLARID_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHOLARPROPERTY_CLAIMS_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHOLARPROPERTY_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHOLARPROPERTY_DESCRIPTION_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int SCHOLARPROPERTY_DESCRIPTIONHTML_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATION_CLASSIFIER_ID = 18;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATION_ADOC_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATION_HTML_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATION_SPELLINGS_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATION_NORMALIZED_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATION_NUMERONYM_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATION_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATIONCLAIM_CLASSIFIER_ID = 19;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATIONCLAIM_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATIONCLAIM_TESTIMONY_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATIONCLAIM_ADOC_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATIONCLAIM_HTML_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int TRANSLITERATIONCLAIM_SPELLING_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATIVEWORK_CLASSIFIER_ID = 21;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATIVEWORK_NAMES_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATIVEWORK_AUTHENTICITIES_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATIVEWORK_SUCCESSIONS_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATIVEWORK_AUTHORS_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATIVEWORK_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATIVEWORK_SLUG_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int CREATIVEWORK_CANONICALSLUG_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HADITH_CLASSIFIER_ID = 22;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HADITH_NAMES_FEATURE_ID = 3;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HADITH_AUTHENTICITIES_FEATURE_ID = 4;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HADITH_SUCCESSIONS_FEATURE_ID = 5;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HADITH_AUTHORS_FEATURE_ID = 6;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HADITH_ID_FEATURE_ID = 0;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HADITH_SLUG_FEATURE_ID = 1;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HADITH_CANONICALSLUG_FEATURE_ID = 2;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final int HADITH_ARTICLEBODIES_FEATURE_ID = 7;

	/**
	 * The static member with the instance of this {@link ModelPackage}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final SanadModelPackage INSTANCE = initialize();

	/**
	 * Initializes this {@link ModelPackage}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return an initialized instance of this class
	 *
	 * @generated
	 */
	public static SanadModelPackage initialize() {

		if (isInitialized) {
			return (SanadModelPackage) ModelResolver.getInstance()
					.getModelPackage(NS_URI);
		}

		final SanadModelPackage modelPackage = new SanadModelPackage();

		ModelResolver.getInstance().registerModelPackage(modelPackage);

		// read the model from the ecore file, the EPackage is registered in the
		// EPackage.Registry
		// see the ModelResolver getEPackageRegistry method
		ModelUtils.readEPackagesFromFile(modelPackage);

		isInitialized = true;

		JpaModelPackage.initialize();

		// force the initialization of the EFactory proxy
		modelPackage.getEPackage();

		// register the relation between a Class and its EClassifier
		ModelResolver.getInstance().registerClassModelMapping(
				Transliteration.class, modelPackage.getTransliterationEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Claim.class,
				modelPackage.getClaimEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Thing.class,
				modelPackage.getThingEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Hadith.class,
				modelPackage.getHadithEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Property.class,
				modelPackage.getPropertyEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Scholar.class,
				modelPackage.getScholarEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Literal.class,
				modelPackage.getLiteralEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Testimony.class,
				modelPackage.getTestimonyEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				LiteralProperty.class, modelPackage.getLiteralPropertyEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				AuthenticityProperty.class,
				modelPackage.getAuthenticityPropertyEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				SuccessionProperty.class,
				modelPackage.getSuccessionPropertyEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				SpellingProperty.class,
				modelPackage.getSpellingPropertyEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				LiteralClaim.class, modelPackage.getLiteralClaimEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(ThingClaim.class,
				modelPackage.getThingClaimEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Evidence.class,
				modelPackage.getEvidenceEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ThingProperty.class, modelPackage.getThingPropertyEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				AuthenticityClaim.class,
				modelPackage.getAuthenticityClaimEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				SuccessionClaim.class, modelPackage.getSuccessionClaimEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				NarratorClaim.class, modelPackage.getNarratorClaimEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				PersonProperty.class, modelPackage.getPersonPropertyEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ScholarProperty.class, modelPackage.getScholarPropertyEClass(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				TransliterationClaim.class,
				modelPackage.getTransliterationClaimEClass(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				CreativeWork.class, modelPackage.getCreativeWorkEClass(),
				modelPackage);

		ModelResolver.getInstance().registerClassModelMapping(Spelling.class,
				modelPackage.getSpellingEEnum(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(ThingKind.class,
				modelPackage.getThingKindEEnum(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				Authenticity.class, modelPackage.getAuthenticityEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Succession.class,
				modelPackage.getSuccessionEEnum(), modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				NarratorGrade.class, modelPackage.getNarratorGradeEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				ConceptKind.class, modelPackage.getConceptKindEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(
				PropertyKind.class, modelPackage.getPropertyKindEEnum(),
				modelPackage);
		ModelResolver.getInstance().registerClassModelMapping(Purpose.class,
				modelPackage.getPurposeEEnum(), modelPackage);

		// and return ourselves
		return modelPackage;
	}

	/**
	 * Returns the {@link ModelFactory} of this ModelPackage. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the {@link SanadModelFactory} instance.
	 * @generated
	 */
	@Override
	public SanadModelFactory getModelFactory() {
		return MODELFACTORY;
	}

	/**
	 * Returns the nsUri of the {@link EPackage} managed by this Package
	 * instance. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the nsUri of the EPackage
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return NS_URI;
	}

	/**
	 * Returns the name of the ecore file containing the ecore model of the
	 * {@link EPackage} managed here. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return the name of the ecore file
	 * @generated
	 */
	@Override
	public String getEcoreFileName() {
		return "sanad-jpa.ecore";
	}

	/**
	 * Returns the {@link EClass} '<em><b>Testimony</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Testimony</b></em>'
	 * @generated
	 */
	public EClass getTestimonyEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				TESTIMONY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Testimony.claims</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.claims</b></em>'.
	 * @generated
	 */
	public EReference getTestimony_Claims() {
		return (EReference) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_CLAIMS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Testimony.signatures</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.signatures</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_Signatures() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_SIGNATURES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Testimony.validStartTime</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.validStartTime</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_ValidStartTime() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_VALIDSTARTTIME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Testimony.validEndTime</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.validEndTime</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_ValidEndTime() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_VALIDENDTIME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Testimony.validStartDate</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.validStartDate</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_ValidStartDate() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_VALIDSTARTDATE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Testimony.validEndDate</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.validEndDate</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_ValidEndDate() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_VALIDENDDATE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Testimony.personId</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.personId</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_PersonId() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_PERSONID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Testimony.creationTime</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.creationTime</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_CreationTime() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_CREATIONTIME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Testimony.schemaVersion</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.schemaVersion</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_SchemaVersion() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_SCHEMAVERSION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Testimony.id</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.id</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_Id() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Testimony.description</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.description</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_Description() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_DESCRIPTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Testimony.descriptionHtml</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Testimony.descriptionHtml</b></em>'.
	 * @generated
	 */
	public EAttribute getTestimony_DescriptionHtml() {
		return (EAttribute) getTestimonyEClass().getEAllStructuralFeatures()
				.get(TESTIMONY_DESCRIPTIONHTML_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Claim</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Claim</b></em>'
	 * @generated
	 */
	public EClass getClaimEClass() {
		return (EClass) getEPackage().getEClassifiers()
				.get(CLAIM_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Claim.id</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Claim.id</b></em>'.
	 * @generated
	 */
	public EAttribute getClaim_Id() {
		return (EAttribute) getClaimEClass().getEAllStructuralFeatures().get(
				CLAIM_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Claim.testimony</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Claim.testimony</b></em>'.
	 * @generated
	 */
	public EReference getClaim_Testimony() {
		return (EReference) getClaimEClass().getEAllStructuralFeatures().get(
				CLAIM_TESTIMONY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Thing</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Thing</b></em>'
	 * @generated
	 */
	public EClass getThingEClass() {
		return (EClass) getEPackage().getEClassifiers()
				.get(THING_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Thing.names</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Thing.names</b></em>'.
	 * @generated
	 */
	public EReference getThing_Names() {
		return (EReference) getThingEClass().getEAllStructuralFeatures().get(
				THING_NAMES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Thing.authenticities</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Thing.authenticities</b></em>'.
	 * @generated
	 */
	public EReference getThing_Authenticities() {
		return (EReference) getThingEClass().getEAllStructuralFeatures().get(
				THING_AUTHENTICITIES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Thing.successions</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Thing.successions</b></em>'.
	 * @generated
	 */
	public EReference getThing_Successions() {
		return (EReference) getThingEClass().getEAllStructuralFeatures().get(
				THING_SUCCESSIONS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Thing.authors</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Thing.authors</b></em>'.
	 * @generated
	 */
	public EReference getThing_Authors() {
		return (EReference) getThingEClass().getEAllStructuralFeatures().get(
				THING_AUTHORS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Thing.id</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Thing.id</b></em>'.
	 * @generated
	 */
	public EAttribute getThing_Id() {
		return (EAttribute) getThingEClass().getEAllStructuralFeatures().get(
				THING_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Thing.slug</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Thing.slug</b></em>'.
	 * @generated
	 */
	public EAttribute getThing_Slug() {
		return (EAttribute) getThingEClass().getEAllStructuralFeatures().get(
				THING_SLUG_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Thing.canonicalSlug</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Thing.canonicalSlug</b></em>'.
	 * @generated
	 */
	public EAttribute getThing_CanonicalSlug() {
		return (EAttribute) getThingEClass().getEAllStructuralFeatures().get(
				THING_CANONICALSLUG_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>LiteralProperty</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>LiteralProperty</b></em>'
	 * @generated
	 */
	public EClass getLiteralPropertyEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				LITERALPROPERTY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>LiteralProperty.adoc</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>LiteralProperty.adoc</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteralProperty_Adoc() {
		return (EAttribute) getLiteralPropertyEClass()
				.getEAllStructuralFeatures().get(
						LITERALPROPERTY_ADOC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>LiteralProperty.html</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>LiteralProperty.html</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteralProperty_Html() {
		return (EAttribute) getLiteralPropertyEClass()
				.getEAllStructuralFeatures().get(
						LITERALPROPERTY_HTML_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Property</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Property</b></em>'
	 * @generated
	 */
	public EClass getPropertyEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PROPERTY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Property.claims</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Property.claims</b></em>'.
	 * @generated
	 */
	public EReference getProperty_Claims() {
		return (EReference) getPropertyEClass().getEAllStructuralFeatures()
				.get(PROPERTY_CLAIMS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Property.id</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Property.id</b></em>'.
	 * @generated
	 */
	public EAttribute getProperty_Id() {
		return (EAttribute) getPropertyEClass().getEAllStructuralFeatures()
				.get(PROPERTY_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Property.description</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Property.description</b></em>'.
	 * @generated
	 */
	public EAttribute getProperty_Description() {
		return (EAttribute) getPropertyEClass().getEAllStructuralFeatures()
				.get(PROPERTY_DESCRIPTION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Property.descriptionHtml</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Property.descriptionHtml</b></em>'.
	 * @generated
	 */
	public EAttribute getProperty_DescriptionHtml() {
		return (EAttribute) getPropertyEClass().getEAllStructuralFeatures()
				.get(PROPERTY_DESCRIPTIONHTML_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>AuthenticityProperty</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>AuthenticityProperty</b></em>'
	 * @generated
	 */
	public EClass getAuthenticityPropertyEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				AUTHENTICITYPROPERTY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AuthenticityProperty.authenticity</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AuthenticityProperty.authenticity</b></em>'.
	 * @generated
	 */
	public EAttribute getAuthenticityProperty_Authenticity() {
		return (EAttribute) getAuthenticityPropertyEClass()
				.getEAllStructuralFeatures().get(
						AUTHENTICITYPROPERTY_AUTHENTICITY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>SuccessionProperty</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>SuccessionProperty</b></em>'
	 * @generated
	 */
	public EClass getSuccessionPropertyEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SUCCESSIONPROPERTY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>SuccessionProperty.succession</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SuccessionProperty.succession</b></em>'.
	 * @generated
	 */
	public EAttribute getSuccessionProperty_Succession() {
		return (EAttribute) getSuccessionPropertyEClass()
				.getEAllStructuralFeatures().get(
						SUCCESSIONPROPERTY_SUCCESSION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Literal</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Literal</b></em>'
	 * @generated
	 */
	public EClass getLiteralEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				LITERAL_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Literal.languageTag</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Literal.languageTag</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteral_LanguageTag() {
		return (EAttribute) getLiteralEClass().getEAllStructuralFeatures().get(
				LITERAL_LANGUAGETAG_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Literal.adoc</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Literal.adoc</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteral_Adoc() {
		return (EAttribute) getLiteralEClass().getEAllStructuralFeatures().get(
				LITERAL_ADOC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Literal.html</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Literal.html</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteral_Html() {
		return (EAttribute) getLiteralEClass().getEAllStructuralFeatures().get(
				LITERAL_HTML_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Literal.spellings</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Literal.spellings</b></em>'.
	 * @generated
	 */
	public EReference getLiteral_Spellings() {
		return (EReference) getLiteralEClass().getEAllStructuralFeatures().get(
				LITERAL_SPELLINGS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Literal.normalized</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Literal.normalized</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteral_Normalized() {
		return (EAttribute) getLiteralEClass().getEAllStructuralFeatures().get(
				LITERAL_NORMALIZED_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Literal.numeronym</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Literal.numeronym</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteral_Numeronym() {
		return (EAttribute) getLiteralEClass().getEAllStructuralFeatures().get(
				LITERAL_NUMERONYM_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Literal.id</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Literal.id</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteral_Id() {
		return (EAttribute) getLiteralEClass().getEAllStructuralFeatures().get(
				LITERAL_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>SpellingProperty</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>SpellingProperty</b></em>'
	 * @generated
	 */
	public EClass getSpellingPropertyEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SPELLINGPROPERTY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>SpellingProperty.spelling</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SpellingProperty.spelling</b></em>'.
	 * @generated
	 */
	public EAttribute getSpellingProperty_Spelling() {
		return (EAttribute) getSpellingPropertyEClass()
				.getEAllStructuralFeatures().get(
						SPELLINGPROPERTY_SPELLING_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>LiteralClaim</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>LiteralClaim</b></em>'
	 * @generated
	 */
	public EClass getLiteralClaimEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				LITERALCLAIM_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>LiteralClaim.spelling</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>LiteralClaim.spelling</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteralClaim_Spelling() {
		return (EAttribute) getLiteralClaimEClass().getEAllStructuralFeatures()
				.get(LITERALCLAIM_SPELLING_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>LiteralClaim.language</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>LiteralClaim.language</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteralClaim_Language() {
		return (EAttribute) getLiteralClaimEClass().getEAllStructuralFeatures()
				.get(LITERALCLAIM_LANGUAGE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>LiteralClaim.adoc</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>LiteralClaim.adoc</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteralClaim_Adoc() {
		return (EAttribute) getLiteralClaimEClass().getEAllStructuralFeatures()
				.get(LITERALCLAIM_ADOC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>LiteralClaim.html</b></em>
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>LiteralClaim.html</b></em>'.
	 * @generated
	 */
	public EAttribute getLiteralClaim_Html() {
		return (EAttribute) getLiteralClaimEClass().getEAllStructuralFeatures()
				.get(LITERALCLAIM_HTML_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ThingClaim</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>ThingClaim</b></em>'
	 * @generated
	 */
	public EClass getThingClaimEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				THINGCLAIM_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>ThingClaim.kind</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ThingClaim.kind</b></em>'.
	 * @generated
	 */
	public EAttribute getThingClaim_Kind() {
		return (EAttribute) getThingClaimEClass().getEAllStructuralFeatures()
				.get(THINGCLAIM_KIND_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Evidence</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Evidence</b></em>'
	 * @generated
	 */
	public EClass getEvidenceEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				EVIDENCE_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ThingProperty</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>ThingProperty</b></em>'
	 * @generated
	 */
	public EClass getThingPropertyEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				THINGPROPERTY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ThingProperty.thingKind</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ThingProperty.thingKind</b></em>'.
	 * @generated
	 */
	public EAttribute getThingProperty_ThingKind() {
		return (EAttribute) getThingPropertyEClass()
				.getEAllStructuralFeatures().get(
						THINGPROPERTY_THINGKIND_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ThingProperty.thing</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ThingProperty.thing</b></em>'.
	 * @generated
	 */
	public EReference getThingProperty_Thing() {
		return (EReference) getThingPropertyEClass()
				.getEAllStructuralFeatures()
				.get(THINGPROPERTY_THING_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>AuthenticityClaim</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>AuthenticityClaim</b></em>'
	 * @generated
	 */
	public EClass getAuthenticityClaimEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				AUTHENTICITYCLAIM_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>AuthenticityClaim.authenticity</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>AuthenticityClaim.authenticity</b></em>'.
	 * @generated
	 */
	public EAttribute getAuthenticityClaim_Authenticity() {
		return (EAttribute) getAuthenticityClaimEClass()
				.getEAllStructuralFeatures().get(
						AUTHENTICITYCLAIM_AUTHENTICITY_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>SuccessionClaim</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>SuccessionClaim</b></em>'
	 * @generated
	 */
	public EClass getSuccessionClaimEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SUCCESSIONCLAIM_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>SuccessionClaim.succession</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>SuccessionClaim.succession</b></em>'.
	 * @generated
	 */
	public EAttribute getSuccessionClaim_Succession() {
		return (EAttribute) getSuccessionClaimEClass()
				.getEAllStructuralFeatures().get(
						SUCCESSIONCLAIM_SUCCESSION_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>NarratorClaim</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>NarratorClaim</b></em>'
	 * @generated
	 */
	public EClass getNarratorClaimEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				NARRATORCLAIM_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>NarratorClaim.scholarId</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>NarratorClaim.scholarId</b></em>'.
	 * @generated
	 */
	public EAttribute getNarratorClaim_ScholarId() {
		return (EAttribute) getNarratorClaimEClass()
				.getEAllStructuralFeatures().get(
						NARRATORCLAIM_SCHOLARID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>NarratorClaim.grade</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>NarratorClaim.grade</b></em>'.
	 * @generated
	 */
	public EAttribute getNarratorClaim_Grade() {
		return (EAttribute) getNarratorClaimEClass()
				.getEAllStructuralFeatures()
				.get(NARRATORCLAIM_GRADE_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Scholar</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Scholar</b></em>'
	 * @generated
	 */
	public EClass getScholarEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SCHOLAR_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Scholar.id</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Scholar.id</b></em>'.
	 * @generated
	 */
	public EAttribute getScholar_Id() {
		return (EAttribute) getScholarEClass().getEAllStructuralFeatures().get(
				SCHOLAR_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '<em><b>Scholar.name</b></em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Scholar.name</b></em>'.
	 * @generated
	 */
	public EAttribute getScholar_Name() {
		return (EAttribute) getScholarEClass().getEAllStructuralFeatures().get(
				SCHOLAR_NAME_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>PersonProperty</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>PersonProperty</b></em>
	 *         '
	 * @generated
	 */
	public EClass getPersonPropertyEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				PERSONPROPERTY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>PersonProperty.personId</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>PersonProperty.personId</b></em>'.
	 * @generated
	 */
	public EAttribute getPersonProperty_PersonId() {
		return (EAttribute) getPersonPropertyEClass()
				.getEAllStructuralFeatures().get(
						PERSONPROPERTY_PERSONID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>ScholarProperty</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>ScholarProperty</b></em>'
	 * @generated
	 */
	public EClass getScholarPropertyEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				SCHOLARPROPERTY_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>ScholarProperty.scholarId</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>ScholarProperty.scholarId</b></em>'.
	 * @generated
	 */
	public EAttribute getScholarProperty_ScholarId() {
		return (EAttribute) getScholarPropertyEClass()
				.getEAllStructuralFeatures().get(
						SCHOLARPROPERTY_SCHOLARID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Transliteration</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>Transliteration</b></em>'
	 * @generated
	 */
	public EClass getTransliterationEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				TRANSLITERATION_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Transliteration.adoc</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Transliteration.adoc</b></em>'.
	 * @generated
	 */
	public EAttribute getTransliteration_Adoc() {
		return (EAttribute) getTransliterationEClass()
				.getEAllStructuralFeatures().get(
						TRANSLITERATION_ADOC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Transliteration.html</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Transliteration.html</b></em>'.
	 * @generated
	 */
	public EAttribute getTransliteration_Html() {
		return (EAttribute) getTransliterationEClass()
				.getEAllStructuralFeatures().get(
						TRANSLITERATION_HTML_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Transliteration.spellings</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Transliteration.spellings</b></em>'.
	 * @generated
	 */
	public EReference getTransliteration_Spellings() {
		return (EReference) getTransliterationEClass()
				.getEAllStructuralFeatures().get(
						TRANSLITERATION_SPELLINGS_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Transliteration.normalized</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Transliteration.normalized</b></em>'.
	 * @generated
	 */
	public EAttribute getTransliteration_Normalized() {
		return (EAttribute) getTransliterationEClass()
				.getEAllStructuralFeatures().get(
						TRANSLITERATION_NORMALIZED_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Transliteration.numeronym</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Transliteration.numeronym</b></em>'.
	 * @generated
	 */
	public EAttribute getTransliteration_Numeronym() {
		return (EAttribute) getTransliterationEClass()
				.getEAllStructuralFeatures().get(
						TRANSLITERATION_NUMERONYM_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Transliteration.id</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Transliteration.id</b></em>'.
	 * @generated
	 */
	public EAttribute getTransliteration_Id() {
		return (EAttribute) getTransliterationEClass()
				.getEAllStructuralFeatures().get(TRANSLITERATION_ID_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>TransliterationClaim</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '
	 *         <em><b>TransliterationClaim</b></em>'
	 * @generated
	 */
	public EClass getTransliterationClaimEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				TRANSLITERATIONCLAIM_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TransliterationClaim.adoc</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TransliterationClaim.adoc</b></em>'.
	 * @generated
	 */
	public EAttribute getTransliterationClaim_Adoc() {
		return (EAttribute) getTransliterationClaimEClass()
				.getEAllStructuralFeatures().get(
						TRANSLITERATIONCLAIM_ADOC_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TransliterationClaim.html</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TransliterationClaim.html</b></em>'.
	 * @generated
	 */
	public EAttribute getTransliterationClaim_Html() {
		return (EAttribute) getTransliterationClaimEClass()
				.getEAllStructuralFeatures().get(
						TRANSLITERATIONCLAIM_HTML_FEATURE_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>TransliterationClaim.spelling</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>TransliterationClaim.spelling</b></em>'.
	 * @generated
	 */
	public EAttribute getTransliterationClaim_Spelling() {
		return (EAttribute) getTransliterationClaimEClass()
				.getEAllStructuralFeatures().get(
						TRANSLITERATIONCLAIM_SPELLING_FEATURE_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>CreativeWork</b></em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>CreativeWork</b></em>'
	 * @generated
	 */
	public EClass getCreativeWorkEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				CREATIVEWORK_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EClass} '<em><b>Hadith</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EClass} '<em><b>Hadith</b></em>'
	 * @generated
	 */
	public EClass getHadithEClass() {
		return (EClass) getEPackage().getEClassifiers().get(
				HADITH_CLASSIFIER_ID);
	}

	/**
	 * Returns the {@link EStructuralFeature} '
	 * <em><b>Hadith.articleBodies</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the {@link EStructuralFeature}: '
	 *         <em><b>Hadith.articleBodies</b></em>'.
	 * @generated
	 */
	public EReference getHadith_ArticleBodies() {
		return (EReference) getHadithEClass().getEAllStructuralFeatures().get(
				HADITH_ARTICLEBODIES_FEATURE_ID);
	}

	/**
	 * Returns the {@link EDataType} '<em><b>UUID</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the {@link EDataType} representing '
	 *         <em><b>UUID</b></em>'
	 * @generated
	 */
	public EDataType getUUIDEDataType() {
		return (EDataType) getEPackage().getEClassifiers().get(
				UUID_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>Spelling</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '<em><b>Spelling</b></em>'
	 * @generated
	 */
	public EEnum getSpellingEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				SPELLING_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>ThingKind</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '<em><b>ThingKind</b></em>'
	 * @generated
	 */
	public EEnum getThingKindEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				THINGKIND_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>Authenticity</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>Authenticity</b></em>'
	 * @generated
	 */
	public EEnum getAuthenticityEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				AUTHENTICITY_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>Succession</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '<em><b>Succession</b></em>
	 *         '
	 * @generated
	 */
	public EEnum getSuccessionEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				SUCCESSION_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>NarratorGrade</b></em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>NarratorGrade</b></em>'
	 * @generated
	 */
	public EEnum getNarratorGradeEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				NARRATORGRADE_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>ConceptKind</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>ConceptKind</b></em>'
	 * @generated
	 */
	public EEnum getConceptKindEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				CONCEPTKIND_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>PropertyKind</b></em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '
	 *         <em><b>PropertyKind</b></em>'
	 * @generated
	 */
	public EEnum getPropertyKindEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				PROPERTYKIND_CLASSIFIER_ID);
	}

	/**
	 * Returns the EEnum '<em><b>Purpose</b></em>'. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return an instance of the EEnum representing '<em><b>Purpose</b></em>'
	 * @generated
	 */
	public EEnum getPurposeEEnum() {
		return (EEnum) getEPackage().getEClassifiers().get(
				PURPOSE_CLASSIFIER_ID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param eClassifier
	 *            the {@link EClassifier}
	 * @return the class implementing a specific {@link EClass}.
	 * @generated
	 */
	@Override
	public Class<?> getEClassifierClass(EClassifier eClassifier) {
		switch (eClassifier.getClassifierID()) {
		case TRANSLITERATION_CLASSIFIER_ID:
			return Transliteration.class;
		case CLAIM_CLASSIFIER_ID:
			return Claim.class;
		case THING_CLASSIFIER_ID:
			return Thing.class;
		case HADITH_CLASSIFIER_ID:
			return Hadith.class;
		case PROPERTY_CLASSIFIER_ID:
			return Property.class;
		case SCHOLAR_CLASSIFIER_ID:
			return Scholar.class;
		case LITERAL_CLASSIFIER_ID:
			return Literal.class;
		case TESTIMONY_CLASSIFIER_ID:
			return Testimony.class;
		case LITERALPROPERTY_CLASSIFIER_ID:
			return LiteralProperty.class;
		case AUTHENTICITYPROPERTY_CLASSIFIER_ID:
			return AuthenticityProperty.class;
		case SUCCESSIONPROPERTY_CLASSIFIER_ID:
			return SuccessionProperty.class;
		case SPELLINGPROPERTY_CLASSIFIER_ID:
			return SpellingProperty.class;
		case LITERALCLAIM_CLASSIFIER_ID:
			return LiteralClaim.class;
		case THINGCLAIM_CLASSIFIER_ID:
			return ThingClaim.class;
		case EVIDENCE_CLASSIFIER_ID:
			return Evidence.class;
		case THINGPROPERTY_CLASSIFIER_ID:
			return ThingProperty.class;
		case AUTHENTICITYCLAIM_CLASSIFIER_ID:
			return AuthenticityClaim.class;
		case SUCCESSIONCLAIM_CLASSIFIER_ID:
			return SuccessionClaim.class;
		case NARRATORCLAIM_CLASSIFIER_ID:
			return NarratorClaim.class;
		case PERSONPROPERTY_CLASSIFIER_ID:
			return PersonProperty.class;
		case SCHOLARPROPERTY_CLASSIFIER_ID:
			return ScholarProperty.class;
		case TRANSLITERATIONCLAIM_CLASSIFIER_ID:
			return TransliterationClaim.class;
		case CREATIVEWORK_CLASSIFIER_ID:
			return CreativeWork.class;
		case UUID_CLASSIFIER_ID:
			return UUID.class;
		case SPELLING_CLASSIFIER_ID:
			return Spelling.class;
		case THINGKIND_CLASSIFIER_ID:
			return ThingKind.class;
		case AUTHENTICITY_CLASSIFIER_ID:
			return Authenticity.class;
		case SUCCESSION_CLASSIFIER_ID:
			return Succession.class;
		case NARRATORGRADE_CLASSIFIER_ID:
			return NarratorGrade.class;
		case CONCEPTKIND_CLASSIFIER_ID:
			return ConceptKind.class;
		case PROPERTYKIND_CLASSIFIER_ID:
			return PropertyKind.class;
		case PURPOSE_CLASSIFIER_ID:
			return Purpose.class;
		default:
			throw new IllegalArgumentException("The EClassifier '"
					+ eClassifier + "' is not defined in this EPackage");
		}
	}
}
