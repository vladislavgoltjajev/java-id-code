package com.github.vladislavgoltjajev.personalcode.locale.latvia;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class LatvianPersonalCodeValidatorTest {

    @ParameterizedTest
    @ValueSource(strings = {
            "180565-05610",
            "061193-06460",
            "280638-19406",
            "290212-29381",
            "211244-14874",
            "290156-11605",
            "060287-06450",
            "140761-19428",
            "120768-18764",
            "325442-49548",
            "329174-26924",
            "32550128526",
            "32220316612",
            "323989-74020",
            "32744759186",
            "322589-41469",
            "329294-80588",
            "32240310721"
    })
    public void validateValidPersonalCode(String personalCode) {
        LatvianPersonalCodeValidator validator = new LatvianPersonalCodeValidator();
        assertThat(validator.isValid(personalCode)).isTrue();
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {
            "37605030291",
            "77605030291",
            "60319113016",
            "99999999999",
            "999999-99999",
            "39912310173",
            "39002310001",
            "50102290005",
            "501022900051",
            "325-442-49548",
            "335442-49548",
            "315442-49548",
            "290213-29381",
            "180565-05611"
    })
    public void validateInvalidPersonalCode(String personalCode) {
        LatvianPersonalCodeValidator validator = new LatvianPersonalCodeValidator();
        assertThat(validator.isValid(personalCode)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "325442-49548",
            "329174-26924",
            "32550128526",
            "32220316612",
            "323989-74020",
            "32744759186",
            "322589-41469",
            "329294-80588",
            "32240310721"
    })
    public void validateValidUpdatedPersonalCode(String personalCode) {
        LatvianPersonalCodeValidator validator = new LatvianPersonalCodeValidator();
        assertThat(validator.isValidUpdatedPersonalCode(personalCode)).isTrue();
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {
            "37605030291",
            "77605030291",
            "60319113016",
            "99999999999",
            "999999-99999",
            "39912310173",
            "39002310001",
            "50102290005",
            "501022900051",
            "325-442-49548",
            "335442-49548",
            "315442-49548",
            "290213-29381",
            "180565-05611",
            "180565-05610",
            "061193-06460",
            "280638-19406",
            "290212-29381",
            "211244-14874",
            "290156-11605",
            "060287-06450",
            "140761-19428",
            "120768-18764"
    })
    public void validateInvalidUpdatedPersonalCode(String personalCode) {
        LatvianPersonalCodeValidator validator = new LatvianPersonalCodeValidator();
        assertThat(validator.isValidUpdatedPersonalCode(personalCode)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "180565-05610",
            "061193-06460",
            "280638-19406",
            "290212-29381",
            "211244-14874",
            "290156-11605",
            "060287-06450",
            "140761-19428",
            "120768-18764"
    })
    public void validateValidLegacyPersonalCode(String personalCode) {
        LatvianPersonalCodeValidator validator = new LatvianPersonalCodeValidator();
        assertThat(validator.isValidLegacyPersonalCode(personalCode)).isTrue();
    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {
            "37605030291",
            "77605030291",
            "60319113016",
            "99999999999",
            "999999-99999",
            "39912310173",
            "39002310001",
            "50102290005",
            "501022900051",
            "325-442-49548",
            "335442-49548",
            "315442-49548",
            "290213-29381",
            "180565-05611",
            "32744759186",
            "322589-41469",
            "329294-80588",
            "32240310721"
    })
    public void validateInvalidLegacyPersonalCode(String personalCode) {
        LatvianPersonalCodeValidator validator = new LatvianPersonalCodeValidator();
        assertThat(validator.isValidLegacyPersonalCode(personalCode)).isFalse();
    }
}