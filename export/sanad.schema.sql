--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.4
-- Dumped by pg_dump version 9.3.4
-- Started on 2014-08-01 07:12:37 WIB

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 7 (class 2615 OID 16771)
-- Name: sanad; Type: SCHEMA; Schema: -; Owner: -
--

CREATE SCHEMA sanad;


SET search_path = sanad, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 171 (class 1259 OID 34020)
-- Name: authenticityproperty; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE authenticityproperty (
    id character varying(255) NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    authenticity character varying(255),
    authenticities_thing_id character varying(255)
);


--
-- TOC entry 172 (class 1259 OID 34028)
-- Name: claim; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE claim (
    dtype character varying(31) NOT NULL,
    id uuid NOT NULL,
    succession character varying(255),
    adoc character varying(255),
    html character varying(255),
    spelling character varying(255),
    authenticity character varying(255),
    language character varying(255),
    kind character varying(255),
    grade character varying(255),
    scholarid character varying(255),
    testimony_id uuid NOT NULL
);


--
-- TOC entry 173 (class 1259 OID 34036)
-- Name: creativework; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE creativework (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255),
    author character varying(255),
    inlanguage character varying(255)
);


--
-- TOC entry 174 (class 1259 OID 34044)
-- Name: evidence; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE evidence (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255)
);


--
-- TOC entry 175 (class 1259 OID 34052)
-- Name: hadith; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE hadith (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255),
    author character varying(255),
    inlanguage character varying(255),
    hadithnum integer,
    volumenum integer,
    collection_id character varying(255)
);


--
-- TOC entry 176 (class 1259 OID 34060)
-- Name: hadithcollection; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE hadithcollection (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255),
    author character varying(255),
    inlanguage character varying(255)
);


--
-- TOC entry 177 (class 1259 OID 34068)
-- Name: literal; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE literal (
    id character varying(255) NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    adoc text,
    html text,
    inlanguage character varying(255),
    normalized text,
    numeronym character varying(255),
    translator character varying(255),
    creativework_id character varying(255),
    articlebodies_thing_id character varying(255),
    names_thing_id character varying(255)
);


--
-- TOC entry 178 (class 1259 OID 34076)
-- Name: personproperty; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE personproperty (
    id character varying(255) NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    authors_thing_id character varying(255),
    personid character varying(255) NOT NULL
);


--
-- TOC entry 179 (class 1259 OID 34084)
-- Name: property_claim; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE property_claim (
    property_id character varying(255) NOT NULL,
    claims_id uuid NOT NULL
);


--
-- TOC entry 180 (class 1259 OID 34089)
-- Name: quranchapter; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE quranchapter (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255),
    author character varying(255),
    inlanguage character varying(255),
    chapternum integer,
    namewithtashkeel character varying(255),
    nametransliteration_id character varying(255)
);


--
-- TOC entry 181 (class 1259 OID 34097)
-- Name: quranverse; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE quranverse (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255),
    author character varying(255),
    inlanguage character varying(255),
    versenum integer NOT NULL,
    chapter_id character varying(255) NOT NULL,
    text_id character varying(255),
    textwithouttashkeel_id character varying(255),
    transliteration_id character varying(255)
);


--
-- TOC entry 182 (class 1259 OID 34105)
-- Name: scholar; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE scholar (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL
);


--
-- TOC entry 183 (class 1259 OID 34113)
-- Name: scholarproperty; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE scholarproperty (
    id character varying(255) NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    authors_thing_id character varying(255),
    scholarid character varying(255)
);


--
-- TOC entry 184 (class 1259 OID 34121)
-- Name: spellingproperty; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE spellingproperty (
    id character varying(255) NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    spelling character varying(255),
    transliteration_id character varying(255),
    literal_id character varying(255)
);


--
-- TOC entry 185 (class 1259 OID 34129)
-- Name: successionproperty; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE successionproperty (
    id character varying(255) NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    succession character varying(255),
    successions_thing_id character varying(255)
);


--
-- TOC entry 186 (class 1259 OID 34137)
-- Name: testimony; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE testimony (
    id uuid NOT NULL,
    creationtime timestamp without time zone NOT NULL,
    creationtimezone character varying(255) NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    personid character varying(255),
    schemaversion bigint NOT NULL,
    signatures character varying(255),
    validenddate date,
    validendtime timestamp without time zone NOT NULL,
    validendtimezone character varying(255) NOT NULL,
    validstartdate date,
    validstarttime timestamp without time zone NOT NULL,
    validstarttimezone character varying(255) NOT NULL
);


--
-- TOC entry 187 (class 1259 OID 34145)
-- Name: thingproperty; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE thingproperty (
    id character varying(255) NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    thingkind character varying(255),
    thing_id character varying(255) NOT NULL
);


--
-- TOC entry 188 (class 1259 OID 34153)
-- Name: transliteration; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE transliteration (
    id character varying(255) NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    adoc text,
    html text,
    normalized text,
    numeronym character varying(255),
    transliterator character varying(255),
    creativework_id character varying(255)
);


--
-- TOC entry 1957 (class 2606 OID 34027)
-- Name: authenticityproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY authenticityproperty
    ADD CONSTRAINT authenticityproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 1959 (class 2606 OID 34035)
-- Name: claim_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY claim
    ADD CONSTRAINT claim_pkey PRIMARY KEY (id);


--
-- TOC entry 1963 (class 2606 OID 34043)
-- Name: creativework_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY creativework
    ADD CONSTRAINT creativework_pkey PRIMARY KEY (id);


--
-- TOC entry 1969 (class 2606 OID 34051)
-- Name: evidence_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY evidence
    ADD CONSTRAINT evidence_pkey PRIMARY KEY (id);


--
-- TOC entry 1975 (class 2606 OID 34059)
-- Name: hadith_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY hadith
    ADD CONSTRAINT hadith_pkey PRIMARY KEY (id);


--
-- TOC entry 1983 (class 2606 OID 34067)
-- Name: hadithcollection_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY hadithcollection
    ADD CONSTRAINT hadithcollection_pkey PRIMARY KEY (id);


--
-- TOC entry 1994 (class 2606 OID 34075)
-- Name: literal_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY literal
    ADD CONSTRAINT literal_pkey PRIMARY KEY (id);


--
-- TOC entry 1996 (class 2606 OID 34083)
-- Name: personproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY personproperty
    ADD CONSTRAINT personproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 1998 (class 2606 OID 34088)
-- Name: property_claim_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY property_claim
    ADD CONSTRAINT property_claim_pkey PRIMARY KEY (property_id, claims_id);


--
-- TOC entry 2001 (class 2606 OID 34096)
-- Name: quranchapter_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT quranchapter_pkey PRIMARY KEY (id);


--
-- TOC entry 2012 (class 2606 OID 34104)
-- Name: quranverse_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT quranverse_pkey PRIMARY KEY (id);


--
-- TOC entry 2021 (class 2606 OID 34112)
-- Name: scholar_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY scholar
    ADD CONSTRAINT scholar_pkey PRIMARY KEY (id);


--
-- TOC entry 2023 (class 2606 OID 34120)
-- Name: scholarproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY scholarproperty
    ADD CONSTRAINT scholarproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 2025 (class 2606 OID 34128)
-- Name: spellingproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY spellingproperty
    ADD CONSTRAINT spellingproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 2027 (class 2606 OID 34136)
-- Name: successionproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY successionproperty
    ADD CONSTRAINT successionproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 2030 (class 2606 OID 34144)
-- Name: testimony_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY testimony
    ADD CONSTRAINT testimony_pkey PRIMARY KEY (id);


--
-- TOC entry 2036 (class 2606 OID 34152)
-- Name: thingproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY thingproperty
    ADD CONSTRAINT thingproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 2040 (class 2606 OID 34160)
-- Name: transliteration_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY transliteration
    ADD CONSTRAINT transliteration_pkey PRIMARY KEY (id);


--
-- TOC entry 1973 (class 2606 OID 34166)
-- Name: uk_1a285v3i3gv3ln51vshnqh87o; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY evidence
    ADD CONSTRAINT uk_1a285v3i3gv3ln51vshnqh87o UNIQUE (canonicalslug);


--
-- TOC entry 1981 (class 2606 OID 34170)
-- Name: uk_2wbhxot3fvi29740oicatlox9; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY hadith
    ADD CONSTRAINT uk_2wbhxot3fvi29740oicatlox9 UNIQUE (canonicalslug);


--
-- TOC entry 1967 (class 2606 OID 34162)
-- Name: uk_ayl4u4s9doh791oxyrfbopcdw; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY creativework
    ADD CONSTRAINT uk_ayl4u4s9doh791oxyrfbopcdw UNIQUE (canonicalslug);


--
-- TOC entry 2007 (class 2606 OID 34180)
-- Name: uk_cnkwk5bpkmmp7e8n97k8j3urf; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT uk_cnkwk5bpkmmp7e8n97k8j3urf UNIQUE (chapternum);


--
-- TOC entry 2009 (class 2606 OID 34178)
-- Name: uk_d9eyki9ihy3yf5t7vjpq371w; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT uk_d9eyki9ihy3yf5t7vjpq371w UNIQUE (canonicalslug);


--
-- TOC entry 2019 (class 2606 OID 34184)
-- Name: uk_iql4r2i52rvxyb7s4htdx2dkj; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT uk_iql4r2i52rvxyb7s4htdx2dkj UNIQUE (canonicalslug);


--
-- TOC entry 1989 (class 2606 OID 34174)
-- Name: uk_k9jldvhu5ee76wkryfgsvg3y9; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY hadithcollection
    ADD CONSTRAINT uk_k9jldvhu5ee76wkryfgsvg3y9 UNIQUE (canonicalslug);


--
-- TOC entry 1960 (class 1259 OID 40906)
-- Name: creativework_author_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX creativework_author_idx ON creativework USING btree (author);


--
-- TOC entry 1961 (class 1259 OID 40905)
-- Name: creativework_inlanguage_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX creativework_inlanguage_idx ON creativework USING btree (inlanguage);


--
-- TOC entry 1964 (class 1259 OID 34163)
-- Name: creativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX creativeworkthing_name_idx ON creativework USING btree (name);


--
-- TOC entry 1965 (class 1259 OID 34164)
-- Name: creativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX creativeworkthing_slug_idx ON creativework USING btree (slug);


--
-- TOC entry 1970 (class 1259 OID 34167)
-- Name: evidencething_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX evidencething_name_idx ON evidence USING btree (name);


--
-- TOC entry 1971 (class 1259 OID 34168)
-- Name: evidencething_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX evidencething_slug_idx ON evidence USING btree (slug);


--
-- TOC entry 1984 (class 1259 OID 40910)
-- Name: hadithcollectioncreativework_author_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcollectioncreativework_author_idx ON hadithcollection USING btree (author);


--
-- TOC entry 1985 (class 1259 OID 40909)
-- Name: hadithcollectioncreativework_inlanguage_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcollectioncreativework_inlanguage_idx ON hadithcollection USING btree (inlanguage);


--
-- TOC entry 1986 (class 1259 OID 34175)
-- Name: hadithcollectioncreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcollectioncreativeworkthing_name_idx ON hadithcollection USING btree (name);


--
-- TOC entry 1987 (class 1259 OID 34176)
-- Name: hadithcollectioncreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcollectioncreativeworkthing_slug_idx ON hadithcollection USING btree (slug);


--
-- TOC entry 1976 (class 1259 OID 40908)
-- Name: hadithcreativework_author_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcreativework_author_idx ON hadith USING btree (author);


--
-- TOC entry 1977 (class 1259 OID 40907)
-- Name: hadithcreativework_inlanguage_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcreativework_inlanguage_idx ON hadith USING btree (inlanguage);


--
-- TOC entry 1978 (class 1259 OID 34171)
-- Name: hadithcreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcreativeworkthing_name_idx ON hadith USING btree (name);


--
-- TOC entry 1979 (class 1259 OID 34172)
-- Name: hadithcreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcreativeworkthing_slug_idx ON hadith USING btree (slug);


--
-- TOC entry 1990 (class 1259 OID 40911)
-- Name: literal_creativework_id_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX literal_creativework_id_idx ON literal USING btree (creativework_id);


--
-- TOC entry 1991 (class 1259 OID 40914)
-- Name: literal_inlanguage_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX literal_inlanguage_idx ON literal USING btree (inlanguage);


--
-- TOC entry 1992 (class 1259 OID 40913)
-- Name: literal_numeronym_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX literal_numeronym_idx ON literal USING btree (numeronym);


--
-- TOC entry 1999 (class 1259 OID 40917)
-- Name: quranchapter_chapternum_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranchapter_chapternum_idx ON quranchapter USING btree (chapternum);


--
-- TOC entry 2002 (class 1259 OID 40916)
-- Name: quranchaptercreativework_author_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranchaptercreativework_author_idx ON quranchapter USING btree (author);


--
-- TOC entry 2003 (class 1259 OID 40915)
-- Name: quranchaptercreativework_inlanguage_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranchaptercreativework_inlanguage_idx ON quranchapter USING btree (inlanguage);


--
-- TOC entry 2004 (class 1259 OID 34181)
-- Name: quranchaptercreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranchaptercreativeworkthing_name_idx ON quranchapter USING btree (name);


--
-- TOC entry 2005 (class 1259 OID 34182)
-- Name: quranchaptercreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranchaptercreativeworkthing_slug_idx ON quranchapter USING btree (slug);


--
-- TOC entry 2010 (class 1259 OID 40920)
-- Name: quranverse_chapter_id_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranverse_chapter_id_idx ON quranverse USING btree (chapter_id);


--
-- TOC entry 2013 (class 1259 OID 40921)
-- Name: quranverse_versenum_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranverse_versenum_idx ON quranverse USING btree (versenum);


--
-- TOC entry 2014 (class 1259 OID 40919)
-- Name: quranversecreativework_author_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranversecreativework_author_idx ON quranverse USING btree (author);


--
-- TOC entry 2015 (class 1259 OID 40918)
-- Name: quranversecreativework_inlanguage_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranversecreativework_inlanguage_idx ON quranverse USING btree (inlanguage);


--
-- TOC entry 2016 (class 1259 OID 34185)
-- Name: quranversecreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranversecreativeworkthing_name_idx ON quranverse USING btree (name);


--
-- TOC entry 2017 (class 1259 OID 34186)
-- Name: quranversecreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranversecreativeworkthing_slug_idx ON quranverse USING btree (slug);


--
-- TOC entry 2028 (class 1259 OID 34187)
-- Name: testimony_creationtime_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX testimony_creationtime_idx ON testimony USING btree (creationtime, creationtimezone);


--
-- TOC entry 2031 (class 1259 OID 34188)
-- Name: testimony_validenddate_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX testimony_validenddate_idx ON testimony USING btree (validenddate);


--
-- TOC entry 2032 (class 1259 OID 34189)
-- Name: testimony_validendtime_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX testimony_validendtime_idx ON testimony USING btree (validendtime, validendtimezone);


--
-- TOC entry 2033 (class 1259 OID 34190)
-- Name: testimony_validstartdate_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX testimony_validstartdate_idx ON testimony USING btree (validstartdate);


--
-- TOC entry 2034 (class 1259 OID 34191)
-- Name: testimony_validstarttime_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX testimony_validstarttime_idx ON testimony USING btree (validstarttime, validstarttimezone);


--
-- TOC entry 2037 (class 1259 OID 40922)
-- Name: transliteration_creativework_id_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX transliteration_creativework_id_idx ON transliteration USING btree (creativework_id);


--
-- TOC entry 2038 (class 1259 OID 40924)
-- Name: transliteration_numeronym_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX transliteration_numeronym_idx ON transliteration USING btree (numeronym);


--
-- TOC entry 2050 (class 2606 OID 34237)
-- Name: fk_4fs8ta8pk8n4s2pugki2rrufk; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY spellingproperty
    ADD CONSTRAINT fk_4fs8ta8pk8n4s2pugki2rrufk FOREIGN KEY (transliteration_id) REFERENCES transliteration(id);


--
-- TOC entry 2043 (class 2606 OID 34202)
-- Name: fk_5ogqxuuipdp5fkv6rwyjw9f1x; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY literal
    ADD CONSTRAINT fk_5ogqxuuipdp5fkv6rwyjw9f1x FOREIGN KEY (articlebodies_thing_id) REFERENCES hadith(id);


--
-- TOC entry 2048 (class 2606 OID 34227)
-- Name: fk_8a8ls4utytb57cmv5qcg39x1a; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT fk_8a8ls4utytb57cmv5qcg39x1a FOREIGN KEY (textwithouttashkeel_id) REFERENCES literal(id);


--
-- TOC entry 2047 (class 2606 OID 34222)
-- Name: fk_96jyqhhi678hednjjwvcke6kf; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT fk_96jyqhhi678hednjjwvcke6kf FOREIGN KEY (text_id) REFERENCES literal(id);


--
-- TOC entry 2042 (class 2606 OID 34197)
-- Name: fk_cm9h74ndkgj1hsh9nhcl3x4hd; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY hadith
    ADD CONSTRAINT fk_cm9h74ndkgj1hsh9nhcl3x4hd FOREIGN KEY (collection_id) REFERENCES hadithcollection(id);


--
-- TOC entry 2049 (class 2606 OID 34232)
-- Name: fk_h88mtit8ywpjiglt47kkmkb3; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT fk_h88mtit8ywpjiglt47kkmkb3 FOREIGN KEY (transliteration_id) REFERENCES transliteration(id);


--
-- TOC entry 2045 (class 2606 OID 34212)
-- Name: fk_nxcps5lijee34n5jkakjcd555; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT fk_nxcps5lijee34n5jkakjcd555 FOREIGN KEY (nametransliteration_id) REFERENCES transliteration(id);


--
-- TOC entry 2051 (class 2606 OID 34242)
-- Name: fk_qc337gwxetwrcp7a8wd258yuy; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY spellingproperty
    ADD CONSTRAINT fk_qc337gwxetwrcp7a8wd258yuy FOREIGN KEY (literal_id) REFERENCES literal(id);


--
-- TOC entry 2046 (class 2606 OID 34217)
-- Name: fk_qvcehjl13j1q7ie20wkhsvv2k; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT fk_qvcehjl13j1q7ie20wkhsvv2k FOREIGN KEY (chapter_id) REFERENCES quranchapter(id);


--
-- TOC entry 2044 (class 2606 OID 34207)
-- Name: fk_t84muc58mlxipw8296o044uc8; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY property_claim
    ADD CONSTRAINT fk_t84muc58mlxipw8296o044uc8 FOREIGN KEY (claims_id) REFERENCES claim(id);


--
-- TOC entry 2041 (class 2606 OID 34192)
-- Name: fk_t9rfahjl4n30x5nrma0g77wig; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY claim
    ADD CONSTRAINT fk_t9rfahjl4n30x5nrma0g77wig FOREIGN KEY (testimony_id) REFERENCES testimony(id);


-- Completed on 2014-08-01 07:12:38 WIB

--
-- PostgreSQL database dump complete
--

