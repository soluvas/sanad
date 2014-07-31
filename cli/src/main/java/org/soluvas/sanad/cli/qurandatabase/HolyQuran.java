package org.soluvas.sanad.cli.qurandatabase;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="HolyQuran")
public class HolyQuran {
	@XmlAttribute(name="TranslationID")
	int translationId;
	@XmlAttribute(name="Writer")
	String writer;
	@XmlAttribute(name="Language")
	String language;
	@XmlAttribute(name="LanguageIsoCode")
	String languageIsoCode;
	
	@XmlElement(name="Chapter")
	List<Chapter> chapters;
}