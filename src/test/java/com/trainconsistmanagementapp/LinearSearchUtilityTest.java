package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.trainconsistmanagementapp.algorithm.LinearSearchUtility;

import org.junit.jupiter.api.Test;

public class LinearSearchUtilityTest {

	@Test
	void shouldReturnTrueWhenIdExists() {
		String[] ids = { "BG101", "BG102", "BG103" };
		boolean found = LinearSearchUtility.searchBogieId(ids, "BG102");
		assertTrue(found);
	}

	@Test
	void shouldReturnFalseWhenIdNotFound() {
		String[] ids = { "BG101", "BG102", "BG103" };
		boolean found = LinearSearchUtility.searchBogieId(ids, "BG999");
		assertFalse(found);
	}

	@Test
	void shouldHandleSingleElementArray() {
		String[] ids = { "BG101" };
		assertTrue(LinearSearchUtility.searchBogieId(ids, "BG101"));
		assertFalse(LinearSearchUtility.searchBogieId(ids, "BG102"));
	}
}
