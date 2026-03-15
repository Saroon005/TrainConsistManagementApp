package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

public class RegexValidationTest {

	@Test
	void shouldValidateCorrectTrainId() {
		Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
		Matcher matcher = trainPattern.matcher("TRN-1234");
		assertTrue(matcher.matches());
	}

	@Test
	void shouldRejectInvalidTrainId() {
		Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
		Matcher matcher = trainPattern.matcher("TRAIN12");
		assertFalse(matcher.matches());
	}

	@Test
	void shouldValidateCargoCode() {
		Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");
		Matcher matcher = cargoPattern.matcher("PET-AA");
		assertTrue(matcher.matches());
	}

	@Test
	void shouldRejectInvalidCargoCode() {
		Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");
		Matcher matcher = cargoPattern.matcher("PET-123");
		assertFalse(matcher.matches());
	}
}
