package org.soluvas.sanad.cli.qurandatabase;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Verse {
	@XmlAttribute(name="VerseID")
	int verseId;
	
	@XmlValue
	String text;

	@Override
	public String toString() {
		return "Verse [verseId=" + verseId + ", text=" + text + "]";
	}
}