--
-- PostgreSQL database dump
--

-- Dumped from database version 9.3.4
-- Dumped by pg_dump version 9.3.4
-- Started on 2014-07-30 06:29:38 WIB

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
-- TOC entry 172 (class 1259 OID 17375)
-- Name: claim; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE claim (
    dtype character varying(31) NOT NULL,
    id uuid NOT NULL,
    authenticity character varying(255),
    adoc character varying(255),
    html character varying(255),
    language character varying(255),
    spelling character varying(255),
    succession character varying(255),
    kind character varying(255),
    grade character varying(255),
    scholarid character varying(255),
    testimony_id uuid NOT NULL
);


ALTER TABLE sanad.claim OWNER TO postgres;

--
-- TOC entry 173 (class 1259 OID 17383)
-- Name: literal; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE literal (
    id uuid NOT NULL,
    adoc character varying(255),
    html character varying(255),
    languagetag character varying(255),
    normalized character varying(255),
    numeronym character varying(255)
);


ALTER TABLE sanad.literal OWNER TO postgres;

--
-- TOC entry 174 (class 1259 OID 17391)
-- Name: property; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE property (
    dtype character varying(31) NOT NULL,
    id uuid NOT NULL,
    description character varying(255),
    descriptionhtml character varying(255),
    personid character varying(255),
    thingkind character varying(255),
    spelling character varying(255),
    adoc character varying(255),
    html character varying(255),
    succession character varying(255),
    scholarid character varying(255),
    authenticity character varying(255),
    thing_id uuid,
    transliteration_id uuid,
    literal_id uuid,
    articlebodies_thing_id uuid,
    successions_thing_id uuid,
    names_thing_id uuid,
    authors_thing_id uuid,
    authenticities_thing_id uuid
);


ALTER TABLE sanad.property OWNER TO postgres;

--
-- TOC entry 175 (class 1259 OID 17399)
-- Name: property_claim; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE property_claim (
    property_id uuid NOT NULL,
    claims_id uuid NOT NULL
);


ALTER TABLE sanad.property_claim OWNER TO postgres;

--
-- TOC entry 176 (class 1259 OID 17404)
-- Name: scholar; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE scholar (
    id character varying(255) NOT NULL,
    name character varying(255) NOT NULL
);


ALTER TABLE sanad.scholar OWNER TO postgres;

--
-- TOC entry 177 (class 1259 OID 17412)
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
-- TOC entry 178 (class 1259 OID 17420)
-- Name: thing; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE thing (
    dtype character varying(31) NOT NULL,
    id uuid NOT NULL,
    canonicalslug character varying(255) NOT NULL,
    slug character varying(255) NOT NULL
);


ALTER TABLE sanad.thing OWNER TO postgres;

--
-- TOC entry 171 (class 1259 OID 17307)
-- Name: transliteration; Type: TABLE; Schema: sanad; Owner: postgres; Tablespace: 
--

CREATE TABLE transliteration (
    id uuid NOT NULL,
    adoc character varying(255) NOT NULL,
    html character varying(255) NOT NULL,
    normalized character varying(255),
    numeronym character varying(255)
);


ALTER TABLE sanad.transliteration OWNER TO postgres;

--
-- TOC entry 1911 (class 2606 OID 17382)
-- Name: claim_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY claim
    ADD CONSTRAINT claim_pkey PRIMARY KEY (id);


--
-- TOC entry 1913 (class 2606 OID 17390)
-- Name: literal_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY literal
    ADD CONSTRAINT literal_pkey PRIMARY KEY (id);


--
-- TOC entry 1919 (class 2606 OID 17403)
-- Name: property_claim_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY property_claim
    ADD CONSTRAINT property_claim_pkey PRIMARY KEY (property_id, claims_id);


--
-- TOC entry 1917 (class 2606 OID 17398)
-- Name: property_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY property
    ADD CONSTRAINT property_pkey PRIMARY KEY (id);


--
-- TOC entry 1921 (class 2606 OID 17411)
-- Name: scholar_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY scholar
    ADD CONSTRAINT scholar_pkey PRIMARY KEY (id);


--
-- TOC entry 1923 (class 2606 OID 17419)
-- Name: testimony_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY testimony
    ADD CONSTRAINT testimony_pkey PRIMARY KEY (id);


--
-- TOC entry 1925 (class 2606 OID 17427)
-- Name: thing_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY thing
    ADD CONSTRAINT thing_pkey PRIMARY KEY (id);


--
-- TOC entry 1907 (class 2606 OID 17314)
-- Name: transliteration_pkey; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY transliteration
    ADD CONSTRAINT transliteration_pkey PRIMARY KEY (id);


--
-- TOC entry 1915 (class 2606 OID 17429)
-- Name: uk_6k1t6n18eonhmc1breh1v5ul8; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY literal
    ADD CONSTRAINT uk_6k1t6n18eonhmc1breh1v5ul8 UNIQUE (normalized);


--
-- TOC entry 1909 (class 2606 OID 17318)
-- Name: uk_hi421u15qh6e51f6cv1uheirx; Type: CONSTRAINT; Schema: sanad; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY transliteration
    ADD CONSTRAINT uk_hi421u15qh6e51f6cv1uheirx UNIQUE (normalized);


--
-- TOC entry 1929 (class 2606 OID 17445)
-- Name: fk_2dq801313t4lascfhh4kqgeic; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_2dq801313t4lascfhh4kqgeic FOREIGN KEY (literal_id) REFERENCES literal(id);


--
-- TOC entry 1934 (class 2606 OID 17470)
-- Name: fk_60y74mwgnltxycmja0x9voi97; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_60y74mwgnltxycmja0x9voi97 FOREIGN KEY (authenticities_thing_id) REFERENCES thing(id);


--
-- TOC entry 1930 (class 2606 OID 17450)
-- Name: fk_b6a5jxrd9yeqnstygtv8dm026; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_b6a5jxrd9yeqnstygtv8dm026 FOREIGN KEY (articlebodies_thing_id) REFERENCES thing(id);


--
-- TOC entry 1928 (class 2606 OID 17440)
-- Name: fk_ey4nwj44mfvkelmo6lr2wx87o; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_ey4nwj44mfvkelmo6lr2wx87o FOREIGN KEY (transliteration_id) REFERENCES transliteration(id);


--
-- TOC entry 1931 (class 2606 OID 17455)
-- Name: fk_fv8vds6ki0am683jgigpbax11; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_fv8vds6ki0am683jgigpbax11 FOREIGN KEY (successions_thing_id) REFERENCES thing(id);


--
-- TOC entry 1927 (class 2606 OID 17435)
-- Name: fk_k34oc9563in3vgitcdjp5oat6; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_k34oc9563in3vgitcdjp5oat6 FOREIGN KEY (thing_id) REFERENCES thing(id);


--
-- TOC entry 1933 (class 2606 OID 17465)
-- Name: fk_ki7bf1fn52uwnfe4e0nggcq1c; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_ki7bf1fn52uwnfe4e0nggcq1c FOREIGN KEY (authors_thing_id) REFERENCES thing(id);


--
-- TOC entry 1932 (class 2606 OID 17460)
-- Name: fk_p6qoelwm0erc0h0wrgsqvtpkx; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property
    ADD CONSTRAINT fk_p6qoelwm0erc0h0wrgsqvtpkx FOREIGN KEY (names_thing_id) REFERENCES thing(id);


--
-- TOC entry 1936 (class 2606 OID 17480)
-- Name: fk_r4bd81y83aa101v4vt41o44d7; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property_claim
    ADD CONSTRAINT fk_r4bd81y83aa101v4vt41o44d7 FOREIGN KEY (property_id) REFERENCES property(id);


--
-- TOC entry 1935 (class 2606 OID 17475)
-- Name: fk_t84muc58mlxipw8296o044uc8; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY property_claim
    ADD CONSTRAINT fk_t84muc58mlxipw8296o044uc8 FOREIGN KEY (claims_id) REFERENCES claim(id);


--
-- TOC entry 1926 (class 2606 OID 17430)
-- Name: fk_t9rfahjl4n30x5nrma0g77wig; Type: FK CONSTRAINT; Schema: sanad; Owner: postgres
--

ALTER TABLE ONLY claim
    ADD CONSTRAINT fk_t9rfahjl4n30x5nrma0g77wig FOREIGN KEY (testimony_id) REFERENCES testimony(id);


-- Completed on 2014-07-30 06:29:38 WIB

--
-- PostgreSQL database dump complete
--

