package org.soluvas.sanad.cli.qurandatabase;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Chapter {
	@XmlAttribute(name="ChapterID")
	int chapterId;
	@XmlAttribute(name="ChapterName")
	String chapterName;
	
	@XmlElement(name="Verse")
	List<Verse> verses;
}