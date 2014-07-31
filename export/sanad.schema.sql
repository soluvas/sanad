--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.4
-- Dumped by pg_dump version 9.3.4
-- Started on 2014-08-01 04:34:53 WIB

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
-- TOC entry 171 (class 1259 OID 33762)
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
-- TOC entry 172 (class 1259 OID 33770)
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
-- TOC entry 173 (class 1259 OID 33778)
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
-- TOC entry 174 (class 1259 OID 33786)
-- Name: evidence; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE evidence (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255)
);


--
-- TOC entry 175 (class 1259 OID 33794)
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
-- TOC entry 176 (class 1259 OID 33802)
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
-- TOC entry 177 (class 1259 OID 33810)
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
    creativework_id character varying(255),
    articlebodies_thing_id character varying(255),
    names_thing_id character varying(255)
);


--
-- TOC entry 178 (class 1259 OID 33818)
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
-- TOC entry 179 (class 1259 OID 33826)
-- Name: property_claim; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE property_claim (
    property_id character varying(255) NOT NULL,
    claims_id uuid NOT NULL
);


--
-- TOC entry 180 (class 1259 OID 33831)
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
-- TOC entry 181 (class 1259 OID 33839)
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
-- TOC entry 182 (class 1259 OID 33847)
-- Name: scholar; Type: TABLE; Schema: sanad; Owner: -; Tablespace: 
--

CREATE TABLE scholar (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL
);


--
-- TOC entry 183 (class 1259 OID 33855)
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
-- TOC entry 184 (class 1259 OID 33863)
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
-- TOC entry 185 (class 1259 OID 33871)
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
-- TOC entry 188 (class 1259 OID 34002)
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
-- TOC entry 186 (class 1259 OID 33887)
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
-- TOC entry 187 (class 1259 OID 33895)
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
    creativework_id character varying(255)
);


--
-- TOC entry 1957 (class 2606 OID 33769)
-- Name: authenticityproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY authenticityproperty
    ADD CONSTRAINT authenticityproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 1959 (class 2606 OID 33777)
-- Name: claim_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY claim
    ADD CONSTRAINT claim_pkey PRIMARY KEY (id);


--
-- TOC entry 1961 (class 2606 OID 33785)
-- Name: creativework_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY creativework
    ADD CONSTRAINT creativework_pkey PRIMARY KEY (id);


--
-- TOC entry 1967 (class 2606 OID 33793)
-- Name: evidence_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY evidence
    ADD CONSTRAINT evidence_pkey PRIMARY KEY (id);


--
-- TOC entry 1973 (class 2606 OID 33801)
-- Name: hadith_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY hadith
    ADD CONSTRAINT hadith_pkey PRIMARY KEY (id);


--
-- TOC entry 1979 (class 2606 OID 33809)
-- Name: hadithcollection_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY hadithcollection
    ADD CONSTRAINT hadithcollection_pkey PRIMARY KEY (id);


--
-- TOC entry 1985 (class 2606 OID 33817)
-- Name: literal_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY literal
    ADD CONSTRAINT literal_pkey PRIMARY KEY (id);


--
-- TOC entry 1987 (class 2606 OID 33825)
-- Name: personproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY personproperty
    ADD CONSTRAINT personproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 1989 (class 2606 OID 33830)
-- Name: property_claim_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY property_claim
    ADD CONSTRAINT property_claim_pkey PRIMARY KEY (property_id, claims_id);


--
-- TOC entry 1991 (class 2606 OID 33838)
-- Name: quranchapter_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT quranchapter_pkey PRIMARY KEY (id);


--
-- TOC entry 1999 (class 2606 OID 33846)
-- Name: quranverse_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT quranverse_pkey PRIMARY KEY (id);


--
-- TOC entry 2005 (class 2606 OID 33854)
-- Name: scholar_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY scholar
    ADD CONSTRAINT scholar_pkey PRIMARY KEY (id);


--
-- TOC entry 2007 (class 2606 OID 33862)
-- Name: scholarproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY scholarproperty
    ADD CONSTRAINT scholarproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 2009 (class 2606 OID 33870)
-- Name: spellingproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY spellingproperty
    ADD CONSTRAINT spellingproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 2011 (class 2606 OID 33878)
-- Name: successionproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY successionproperty
    ADD CONSTRAINT successionproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 2018 (class 2606 OID 34009)
-- Name: testimony_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY testimony
    ADD CONSTRAINT testimony_pkey PRIMARY KEY (id);


--
-- TOC entry 2013 (class 2606 OID 33894)
-- Name: thingproperty_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY thingproperty
    ADD CONSTRAINT thingproperty_pkey PRIMARY KEY (id);


--
-- TOC entry 2015 (class 2606 OID 33902)
-- Name: transliteration_pkey; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY transliteration
    ADD CONSTRAINT transliteration_pkey PRIMARY KEY (id);


--
-- TOC entry 1971 (class 2606 OID 33908)
-- Name: uk_1a285v3i3gv3ln51vshnqh87o; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY evidence
    ADD CONSTRAINT uk_1a285v3i3gv3ln51vshnqh87o UNIQUE (canonicalslug);


--
-- TOC entry 1977 (class 2606 OID 33912)
-- Name: uk_2wbhxot3fvi29740oicatlox9; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY hadith
    ADD CONSTRAINT uk_2wbhxot3fvi29740oicatlox9 UNIQUE (canonicalslug);


--
-- TOC entry 1965 (class 2606 OID 33904)
-- Name: uk_ayl4u4s9doh791oxyrfbopcdw; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY creativework
    ADD CONSTRAINT uk_ayl4u4s9doh791oxyrfbopcdw UNIQUE (canonicalslug);


--
-- TOC entry 1995 (class 2606 OID 33922)
-- Name: uk_cnkwk5bpkmmp7e8n97k8j3urf; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT uk_cnkwk5bpkmmp7e8n97k8j3urf UNIQUE (chapternum);


--
-- TOC entry 1997 (class 2606 OID 33920)
-- Name: uk_d9eyki9ihy3yf5t7vjpq371w; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT uk_d9eyki9ihy3yf5t7vjpq371w UNIQUE (canonicalslug);


--
-- TOC entry 2003 (class 2606 OID 33926)
-- Name: uk_iql4r2i52rvxyb7s4htdx2dkj; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT uk_iql4r2i52rvxyb7s4htdx2dkj UNIQUE (canonicalslug);


--
-- TOC entry 1983 (class 2606 OID 33916)
-- Name: uk_k9jldvhu5ee76wkryfgsvg3y9; Type: CONSTRAINT; Schema: sanad; Owner: -; Tablespace: 
--

ALTER TABLE ONLY hadithcollection
    ADD CONSTRAINT uk_k9jldvhu5ee76wkryfgsvg3y9 UNIQUE (canonicalslug);


--
-- TOC entry 1962 (class 1259 OID 33905)
-- Name: creativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX creativeworkthing_name_idx ON creativework USING btree (name);


--
-- TOC entry 1963 (class 1259 OID 33906)
-- Name: creativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX creativeworkthing_slug_idx ON creativework USING btree (slug);


--
-- TOC entry 1968 (class 1259 OID 33909)
-- Name: evidencething_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX evidencething_name_idx ON evidence USING btree (name);


--
-- TOC entry 1969 (class 1259 OID 33910)
-- Name: evidencething_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX evidencething_slug_idx ON evidence USING btree (slug);


--
-- TOC entry 1980 (class 1259 OID 33917)
-- Name: hadithcollectioncreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcollectioncreativeworkthing_name_idx ON hadithcollection USING btree (name);


--
-- TOC entry 1981 (class 1259 OID 33918)
-- Name: hadithcollectioncreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcollectioncreativeworkthing_slug_idx ON hadithcollection USING btree (slug);


--
-- TOC entry 1974 (class 1259 OID 33913)
-- Name: hadithcreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcreativeworkthing_name_idx ON hadith USING btree (name);


--
-- TOC entry 1975 (class 1259 OID 33914)
-- Name: hadithcreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX hadithcreativeworkthing_slug_idx ON hadith USING btree (slug);


--
-- TOC entry 1992 (class 1259 OID 33923)
-- Name: quranchaptercreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranchaptercreativeworkthing_name_idx ON quranchapter USING btree (name);


--
-- TOC entry 1993 (class 1259 OID 33924)
-- Name: quranchaptercreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranchaptercreativeworkthing_slug_idx ON quranchapter USING btree (slug);


--
-- TOC entry 2000 (class 1259 OID 33927)
-- Name: quranversecreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranversecreativeworkthing_name_idx ON quranverse USING btree (name);


--
-- TOC entry 2001 (class 1259 OID 33928)
-- Name: quranversecreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX quranversecreativeworkthing_slug_idx ON quranverse USING btree (slug);


--
-- TOC entry 2016 (class 1259 OID 34010)
-- Name: testimony_creationtime_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX testimony_creationtime_idx ON testimony USING btree (creationtime, creationtimezone);


--
-- TOC entry 2019 (class 1259 OID 34011)
-- Name: testimony_validenddate_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX testimony_validenddate_idx ON testimony USING btree (validenddate);


--
-- TOC entry 2020 (class 1259 OID 34012)
-- Name: testimony_validendtime_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX testimony_validendtime_idx ON testimony USING btree (validendtime, validendtimezone);


--
-- TOC entry 2021 (class 1259 OID 34013)
-- Name: testimony_validstartdate_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX testimony_validstartdate_idx ON testimony USING btree (validstartdate);


--
-- TOC entry 2022 (class 1259 OID 34014)
-- Name: testimony_validstarttime_idx; Type: INDEX; Schema: sanad; Owner: -; Tablespace: 
--

CREATE INDEX testimony_validstarttime_idx ON testimony USING btree (validstarttime, validstarttimezone);


--
-- TOC entry 2032 (class 2606 OID 33974)
-- Name: fk_4fs8ta8pk8n4s2pugki2rrufk; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY spellingproperty
    ADD CONSTRAINT fk_4fs8ta8pk8n4s2pugki2rrufk FOREIGN KEY (transliteration_id) REFERENCES transliteration(id);


--
-- TOC entry 2025 (class 2606 OID 33939)
-- Name: fk_5ogqxuuipdp5fkv6rwyjw9f1x; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY literal
    ADD CONSTRAINT fk_5ogqxuuipdp5fkv6rwyjw9f1x FOREIGN KEY (articlebodies_thing_id) REFERENCES hadith(id);


--
-- TOC entry 2030 (class 2606 OID 33964)
-- Name: fk_8a8ls4utytb57cmv5qcg39x1a; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT fk_8a8ls4utytb57cmv5qcg39x1a FOREIGN KEY (textwithouttashkeel_id) REFERENCES literal(id);


--
-- TOC entry 2029 (class 2606 OID 33959)
-- Name: fk_96jyqhhi678hednjjwvcke6kf; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT fk_96jyqhhi678hednjjwvcke6kf FOREIGN KEY (text_id) REFERENCES literal(id);


--
-- TOC entry 2024 (class 2606 OID 33934)
-- Name: fk_cm9h74ndkgj1hsh9nhcl3x4hd; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY hadith
    ADD CONSTRAINT fk_cm9h74ndkgj1hsh9nhcl3x4hd FOREIGN KEY (collection_id) REFERENCES hadithcollection(id);


--
-- TOC entry 2031 (class 2606 OID 33969)
-- Name: fk_h88mtit8ywpjiglt47kkmkb3; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT fk_h88mtit8ywpjiglt47kkmkb3 FOREIGN KEY (transliteration_id) REFERENCES transliteration(id);


--
-- TOC entry 2027 (class 2606 OID 33949)
-- Name: fk_nxcps5lijee34n5jkakjcd555; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT fk_nxcps5lijee34n5jkakjcd555 FOREIGN KEY (nametransliteration_id) REFERENCES transliteration(id);


--
-- TOC entry 2033 (class 2606 OID 33979)
-- Name: fk_qc337gwxetwrcp7a8wd258yuy; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY spellingproperty
    ADD CONSTRAINT fk_qc337gwxetwrcp7a8wd258yuy FOREIGN KEY (literal_id) REFERENCES literal(id);


--
-- TOC entry 2028 (class 2606 OID 33954)
-- Name: fk_qvcehjl13j1q7ie20wkhsvv2k; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT fk_qvcehjl13j1q7ie20wkhsvv2k FOREIGN KEY (chapter_id) REFERENCES quranchapter(id);


--
-- TOC entry 2026 (class 2606 OID 33944)
-- Name: fk_t84muc58mlxipw8296o044uc8; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY property_claim
    ADD CONSTRAINT fk_t84muc58mlxipw8296o044uc8 FOREIGN KEY (claims_id) REFERENCES claim(id);


--
-- TOC entry 2023 (class 2606 OID 34015)
-- Name: fk_t9rfahjl4n30x5nrma0g77wig; Type: FK CONSTRAINT; Schema: sanad; Owner: -
--

ALTER TABLE ONLY claim
    ADD CONSTRAINT fk_t9rfahjl4n30x5nrma0g77wig FOREIGN KEY (testimony_id) REFERENCES testimony(id);


-- Completed on 2014-08-01 04:34:53 WIB

--
-- PostgreSQL database dump complete
--

