package org.soluvas.sanad.core;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author ceefour
 *
 */
public class AsciidocUtils {

	static final Pattern NOT_PRINT = Pattern.compile("([\\p{Punct}\\p{Cntrl}\\p{Sc}]|\\P{Print})+", Pattern.UNICODE_CHARACTER_CLASS);
	static final Pattern WHITESPACE = Pattern.compile("\\s+", Pattern.UNICODE_CHARACTER_CLASS);
	
	/**
	 * Normalize with Unicode aware.
	 * @param adoc
	 * @return
	 */
	public static String normalize(String adoc) {
		String normalized = Normalizer.normalize(adoc, Normalizer.Form.NFC);
		normalized = adoc.toLowerCase(Locale.ROOT);
		final Matcher notAlnumMatcher = NOT_PRINT.matcher(adoc);
		if (notAlnumMatcher.matches()) {
			normalized = notAlnumMatcher.replaceAll(" ");
		}
		Matcher whitespaceMatcher = WHITESPACE.matcher(adoc);
		if (whitespaceMatcher.matches()) {
			normalized = whitespaceMatcher.replaceAll(" ");
		}
		normalized = normalized.trim();
		return normalized;
	}
	
}
