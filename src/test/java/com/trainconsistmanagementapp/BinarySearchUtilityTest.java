package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.trainconsistmanagementapp.algorithm.BinarySearchUtility;

import org.junit.jupiter.api.Test;

public class BinarySearchUtilityTest {

	@Test
	void shouldReturnTrueWhenElementExists() {
		String[] ids = { "BG101", "BG102", "BG103" };
		assertTrue(BinarySearchUtility.binarySearch(ids, "BG102"));
	}

	@Test
	void shouldReturnFalseWhenElementDoesNotExist() {
		String[] ids = { "BG101", "BG102", "BG103" };
		assertFalse(BinarySearchUtility.binarySearch(ids, "BG999"));
	}

	@Test
	void shouldHandleSingleElementArray() {
		String[] ids = { "BG101" };
		assertTrue(BinarySearchUtility.binarySearch(ids, "BG101"));
		assertFalse(BinarySearchUtility.binarySearch(ids, "BG102"));
	}
}
