Sanad
=====

Supervised Authenticity Preservation Assistant

## Use Case

Initial use case is for [preservation of Quranic verses and Islamic hadiths](http://hendyirawan.tumblr.com/post/92964403911/sanad).
However, the platform is sufficiently generic for preservation of general textual content in multiple languages with Unicode encoding.

## Discussion Group

Please join [Sanad Facebook Group](https://www.facebook.com/groups/1442601139336294/).

## App Page

Please like [Sanad on Facebook](https://www.facebook.com/pages/Sanad-Muslim-Assistant/592122294241462).

## Planned

1. Firefox add-on
2. Java API service and web-based UI
3. Chrome extension
4. Firefox for Android add-on
5. Facebook application that can annotate posts and comments, and comment with annotations on posts

## Universal Collections

Universal collections are not debatable because of their universal usage.

1. Arabic Quran with tashkeel (114 chapters), Quran transliteration English style, several English translation, Indonesian translation

   * Source: [QuranDatabase.org](http://qurandatabase.org/)
   * Signed XML files available from https://github.com/ceefour/qurandatabase
   * These can be imported using `org.soluvas.sanad.cli.qurandatabase.ImportQuranDatabase`
   * Ready-made PostgreSQL TSV dumps are available at https://github.com/ceefour/sanad-quran

2. The following universal collections are sourced from [Islam Ware](https://www.islamware.com/app/downloads), use the files from https://github.com/ceefour/hadith-islamware :

   * [Sahih Bukhari, Arabic, with tashkeel (7008 ahadith)](https://www.islamware.com/download/Hadith-Sahih-Bukhari.zip)
   * [Sahih Muslim, Arabic, with tashkeel (5362 ahadith)](https://www.islamware.com/download/Hadith-Sahih-Muslim.zip)
   * [Sunan At-Tirmidhi](https://www.islamware.com/download/Hadith-Sunan-al-Tirmidhi.zip)
   * [Sunan An-Nasai](https://www.islamware.com/download/Hadith-Sunan-al-Nasai.zip)
   * [Sunan Abu Dawud](https://www.islamware.com/download/Hadith-Sunan-Abu-Dawud.zip)
   * [Sunan Ibn Maja](https://www.islamware.com/download/Hadith-Sunan-Ibn-Maja.zip)
   * [Musnad Ahmad ibn Hanbal](https://www.islamware.com/download/Hadith-Musnad-Ahmad-ibn-Hanbal.zip)
   * [Malik's Muwatta](https://www.islamware.com/download/Hadith-Maliks-Muwatta.zip)
   * [Sunan Ad-Darimi](https://www.islamware.com/download/Hadith-Sunan-al-Darami.zip)
   
   To import from Islam Ware files:
   Download and extract these files then run `org.soluvas.sanad.cli.islamware.ImportHadithDatabase`.

   To import from PostgreSQL TSV dumps:
   See https://github.com/ceefour/sanad-quran
   
3. TODO: from [Islam Ware](https://www.islamware.com/app/downloads):
   * TODO: Arabic Quran without tashkeel (114 chapters)   

## Schema Dump

To generate the SQL schema dump:

	pg_dump -v -hlocalhost -Upostgres --schema=sanad --schema-only --no-owner -f export/sanad.schema.sql sanad_sanad_dev

## Credits

* Stamp icon 1: [License: 	Creative Commons (Attribution 3.0 Unported) - Valera Zvonko](https://www.iconfinder.com/iconsets/free-mobile-icon-kit#readme)
* Stamp icon 2: [Free for commercial use (Include link to authors website) - by Aha-Soft](https://www.iconfinder.com/iconsets/free-silver-button-icons#readme)
