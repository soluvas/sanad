--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.4
-- Dumped by pg_dump version 9.3.4
-- Started on 2014-08-01 00:08:24 WIB

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 7 (class 2615 OID 16771)
-- Name: sanad; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA sanad;


ALTER SCHEMA sanad OWNER TO postgres;

SET search_path = sanad, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 171 (class 1259 OID 32443)
-- Name: claim; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
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


ALTER TABLE sanad.claim OWNER TO postgres;

--
-- TOC entry 172 (class 1259 OID 32451)
-- Name: creativework; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE creativework (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255),
    author character varying(255),
    inlanguage character varying(255)
);


ALTER TABLE sanad.creativework OWNER TO postgres;

--
-- TOC entry 173 (class 1259 OID 32459)
-- Name: evidence; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE evidence (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255)
);


ALTER TABLE sanad.evidence OWNER TO postgres;

--
-- TOC entry 174 (class 1259 OID 32467)
-- Name: hadith; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
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


ALTER TABLE sanad.hadith OWNER TO postgres;

--
-- TOC entry 175 (class 1259 OID 32475)
-- Name: hadithcollection; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE hadithcollection (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255),
    author character varying(255),
    inlanguage character varying(255)
);


ALTER TABLE sanad.hadithcollection OWNER TO postgres;

--
-- TOC entry 176 (class 1259 OID 32483)
-- Name: literal; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE literal (
    id uuid NOT NULL,
    adoc text,
    html text,
    inlanguage character varying(255),
    normalized text,
    numeronym character varying(255)
);


ALTER TABLE sanad.literal OWNER TO postgres;

--
-- TOC entry 177 (class 1259 OID 32491)
-- Name: property; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE property (
    dtype character varying(31) NOT NULL,
    id uuid NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    adoc character varying(255),
    html character varying(255),
    succession character varying(255),
    scholarid character varying(255),
    authenticity character varying(255),
    personid character varying(255),
    thingkind character varying(255),
    spelling character varying(255),
    thing_id character varying(255),
    transliteration_id uuid,
    literal_id uuid,
    articlebodies_thing_id character varying(255),
    successions_thing_id character varying(255),
    names_thing_id character varying(255),
    authors_thing_id character varying(255),
    authenticities_thing_id character varying(255)
);


ALTER TABLE sanad.property OWNER TO postgres;

--
-- TOC entry 178 (class 1259 OID 32499)
-- Name: property_claim; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE property_claim (
    property_id uuid NOT NULL,
    claims_id uuid NOT NULL
);


ALTER TABLE sanad.property_claim OWNER TO postgres;

--
-- TOC entry 179 (class 1259 OID 32504)
-- Name: quranchapter; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE quranchapter (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255),
    author character varying(255),
    inlanguage character varying(255),
    chapternum integer,
    namewithtashkeel character varying(255)
);


ALTER TABLE sanad.quranchapter OWNER TO postgres;

--
-- TOC entry 180 (class 1259 OID 32512)
-- Name: quranverse; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE quranverse (
    id character varying(255) NOT NULL,
    canonicalslug character varying(255),
    name character varying(255),
    slug character varying(255),
    author character varying(255),
    inlanguage character varying(255),
    text text,
    textwithouttashkeel text,
    versenum integer NOT NULL,
    chapter_id character varying(255) NOT NULL
);


ALTER TABLE sanad.quranverse OWNER TO postgres;

--
-- TOC entry 181 (class 1259 OID 32520)
-- Name: scholar; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE scholar (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL
);


ALTER TABLE sanad.scholar OWNER TO postgres;

--
-- TOC entry 182 (class 1259 OID 32528)
-- Name: testimony; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE testimony (
    id uuid NOT NULL,
    creationtime bytea,
    description character varying(255),
    descriptionhtml character varying(255),
    personid character varying(255),
    schemaversion bigint NOT NULL,
    signatures character varying(255),
    validenddate bytea,
    validendtime bytea,
    validstartdate bytea,
    validstarttime bytea
);


ALTER TABLE sanad.testimony OWNER TO postgres;

--
-- TOC entry 183 (class 1259 OID 32536)
-- Name: transliteration; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE transliteration (
    id uuid NOT NULL,
    adoc text,
    html text,
    normalized text,
    numeronym character varying(255)
);


ALTER TABLE sanad.transliteration OWNER TO postgres;

--
-- TOC entry 1932 (class 2606 OID 32450)
-- Name: claim_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY claim
    ADD CONSTRAINT claim_pkey PRIMARY KEY (id);


--
-- TOC entry 1934 (class 2606 OID 32458)
-- Name: creativework_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY creativework
    ADD CONSTRAINT creativework_pkey PRIMARY KEY (id);


--
-- TOC entry 1940 (class 2606 OID 32466)
-- Name: evidence_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY evidence
    ADD CONSTRAINT evidence_pkey PRIMARY KEY (id);


--
-- TOC entry 1946 (class 2606 OID 32474)
-- Name: hadith_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY hadith
    ADD CONSTRAINT hadith_pkey PRIMARY KEY (id);


--
-- TOC entry 1952 (class 2606 OID 32482)
-- Name: hadithcollection_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY hadithcollection
    ADD CONSTRAINT hadithcollection_pkey PRIMARY KEY (id);


--
-- TOC entry 1958 (class 2606 OID 32490)
-- Name: literal_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY literal
    ADD CONSTRAINT literal_pkey PRIMARY KEY (id);


--
-- TOC entry 1964 (class 2606 OID 32503)
-- Name: property_claim_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY property_claim
    ADD CONSTRAINT property_claim_pkey PRIMARY KEY (property_id, claims_id);


--
-- TOC entry 1962 (class 2606 OID 32498)
-- Name: property_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY property
    ADD CONSTRAINT property_pkey PRIMARY KEY (id);


--
-- TOC entry 1966 (class 2606 OID 32511)
-- Name: quranchapter_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT quranchapter_pkey PRIMARY KEY (id);


--
-- TOC entry 1974 (class 2606 OID 32519)
-- Name: quranverse_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT quranverse_pkey PRIMARY KEY (id);


--
-- TOC entry 1980 (class 2606 OID 32527)
-- Name: scholar_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY scholar
    ADD CONSTRAINT scholar_pkey PRIMARY KEY (id);


--
-- TOC entry 1982 (class 2606 OID 32535)
-- Name: testimony_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY testimony
    ADD CONSTRAINT testimony_pkey PRIMARY KEY (id);


--
-- TOC entry 1984 (class 2606 OID 32543)
-- Name: transliteration_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY transliteration
    ADD CONSTRAINT transliteration_pkey PRIMARY KEY (id);


--
-- TOC entry 1944 (class 2606 OID 32549)
-- Name: uk_1a285v3i3gv3ln51vshnqh87o; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY evidence
    ADD CONSTRAINT uk_1a285v3i3gv3ln51vshnqh87o UNIQUE (canonicalslug);


--
-- TOC entry 1950 (class 2606 OID 32553)
-- Name: uk_2wbhxot3fvi29740oicatlox9; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY hadith
    ADD CONSTRAINT uk_2wbhxot3fvi29740oicatlox9 UNIQUE (canonicalslug);


--
-- TOC entry 1960 (class 2606 OID 32561)
-- Name: uk_6k1t6n18eonhmc1breh1v5ul8; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY literal
    ADD CONSTRAINT uk_6k1t6n18eonhmc1breh1v5ul8 UNIQUE (normalized);


--
-- TOC entry 1938 (class 2606 OID 32545)
-- Name: uk_ayl4u4s9doh791oxyrfbopcdw; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY creativework
    ADD CONSTRAINT uk_ayl4u4s9doh791oxyrfbopcdw UNIQUE (canonicalslug);


--
-- TOC entry 1970 (class 2606 OID 32565)
-- Name: uk_cnkwk5bpkmmp7e8n97k8j3urf; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT uk_cnkwk5bpkmmp7e8n97k8j3urf UNIQUE (chapternum);


--
-- TOC entry 1972 (class 2606 OID 32563)
-- Name: uk_d9eyki9ihy3yf5t7vjpq371w; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY quranchapter
    ADD CONSTRAINT uk_d9eyki9ihy3yf5t7vjpq371w UNIQUE (canonicalslug);


--
-- TOC entry 1986 (class 2606 OID 32574)
-- Name: uk_hi421u15qh6e51f6cv1uheirx; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY transliteration
    ADD CONSTRAINT uk_hi421u15qh6e51f6cv1uheirx UNIQUE (normalized);


--
-- TOC entry 1978 (class 2606 OID 32569)
-- Name: uk_iql4r2i52rvxyb7s4htdx2dkj; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT uk_iql4r2i52rvxyb7s4htdx2dkj UNIQUE (canonicalslug);


--
-- TOC entry 1956 (class 2606 OID 32557)
-- Name: uk_k9jldvhu5ee76wkryfgsvg3y9; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY hadithcollection
    ADD CONSTRAINT uk_k9jldvhu5ee76wkryfgsvg3y9 UNIQUE (canonicalslug);


--
-- TOC entry 1935 (class 1259 OID 32546)
-- Name: creativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX creativeworkthing_name_idx ON creativework USING btree (name);


--
-- TOC entry 1936 (class 1259 OID 32547)
-- Name: creativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX creativeworkthing_slug_idx ON creativework USING btree (slug);


--
-- TOC entry 1941 (class 1259 OID 32550)
-- Name: evidencething_name_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX evidencething_name_idx ON evidence USING btree (name);


--
-- TOC entry 1942 (class 1259 OID 32551)
-- Name: evidencething_slug_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX evidencething_slug_idx ON evidence USING btree (slug);


--
-- TOC entry 1953 (class 1259 OID 32558)
-- Name: hadithcollectioncreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX hadithcollectioncreativeworkthing_name_idx ON hadithcollection USING btree (name);


--
-- TOC entry 1954 (class 1259 OID 32559)
-- Name: hadithcollectioncreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX hadithcollectioncreativeworkthing_slug_idx ON hadithcollection USING btree (slug);


--
-- TOC entry 1947 (class 1259 OID 32554)
-- Name: hadithcreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX hadithcreativeworkthing_name_idx ON hadith USING btree (name);


--
-- TOC entry 1948 (class 1259 OID 32555)
-- Name: hadithcreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX hadithcreativeworkthing_slug_idx ON hadith USING btree (slug);


--
-- TOC entry 1967 (class 1259 OID 32566)
-- Name: quranchaptercreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX quranchaptercreativeworkthing_name_idx ON quranchapter USING btree (name);


--
-- TOC entry 1968 (class 1259 OID 32567)
-- Name: quranchaptercreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX quranchaptercreativeworkthing_slug_idx ON quranchapter USING btree (slug);


--
-- TOC entry 1975 (class 1259 OID 32570)
-- Name: quranversecreativeworkthing_name_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX quranversecreativeworkthing_name_idx ON quranverse USING btree (name);


--
-- TOC entry 1976 (class 1259 OID 32571)
-- Name: quranversecreativeworkthing_slug_idx; Type: INDEX; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE INDEX quranversecreativeworkthing_slug_idx ON quranverse USING btree (slug);


--
-- TOC entry 1990 (class 2606 OID 32590)
-- Name: fk_2dq801313t4lascfhh4kqgeic; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_2dq801313t4lascfhh4kqgeic FOREIGN KEY (literal_id) REFERENCES literal(id);


--
-- TOC entry 1991 (class 2606 OID 32595)
-- Name: fk_b6a5jxrd9yeqnstygtv8dm026; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_b6a5jxrd9yeqnstygtv8dm026 FOREIGN KEY (articlebodies_thing_id) REFERENCES hadith(id);


--
-- TOC entry 1988 (class 2606 OID 32580)
-- Name: fk_cm9h74ndkgj1hsh9nhcl3x4hd; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY hadith
    ADD CONSTRAINT fk_cm9h74ndkgj1hsh9nhcl3x4hd FOREIGN KEY (collection_id) REFERENCES hadithcollection(id);


--
-- TOC entry 1989 (class 2606 OID 32585)
-- Name: fk_ey4nwj44mfvkelmo6lr2wx87o; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_ey4nwj44mfvkelmo6lr2wx87o FOREIGN KEY (transliteration_id) REFERENCES transliteration(id);


--
-- TOC entry 1994 (class 2606 OID 32610)
-- Name: fk_qvcehjl13j1q7ie20wkhsvv2k; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY quranverse
    ADD CONSTRAINT fk_qvcehjl13j1q7ie20wkhsvv2k FOREIGN KEY (chapter_id) REFERENCES quranchapter(id);


--
-- TOC entry 1993 (class 2606 OID 32605)
-- Name: fk_r4bd81y83aa101v4vt41o44d7; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property_claim
    ADD CONSTRAINT fk_r4bd81y83aa101v4vt41o44d7 FOREIGN KEY (property_id) REFERENCES property(id);


--
-- TOC entry 1992 (class 2606 OID 32600)
-- Name: fk_t84muc58mlxipw8296o044uc8; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property_claim
    ADD CONSTRAINT fk_t84muc58mlxipw8296o044uc8 FOREIGN KEY (claims_id) REFERENCES claim(id);


--
-- TOC entry 1987 (class 2606 OID 32575)
-- Name: fk_t9rfahjl4n30x5nrma0g77wig; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY claim
    ADD CONSTRAINT fk_t9rfahjl4n30x5nrma0g77wig FOREIGN KEY (testimony_id) REFERENCES testimony(id);


-- Completed on 2014-08-01 00:08:25 WIB

--
-- PostgreSQL database dump complete
--

