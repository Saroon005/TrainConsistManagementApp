package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.trainconsistmanagementapp.algorithm.ArraysSortUtility;

import org.junit.jupiter.api.Test;

public class ArraysSortUtilityTest {

	@Test
	void shouldSortNamesAlphabetically() {
		String[] names = { "Sleeper", "AC Chair", "First Class" };
		String[] expected = { "AC Chair", "First Class", "Sleeper" };

		String[] result = ArraysSortUtility.sortBogieNames(names);

		assertArrayEquals(expected, result);
	}

	@Test
	void shouldHandleSingleElement() {
		String[] names = { "Sleeper" };
		String[] expected = { "Sleeper" };

		String[] result = ArraysSortUtility.sortBogieNames(names);

		assertArrayEquals(expected, result);
	}

	@Test
	void shouldHandleAlreadySortedArray() {
		String[] names = { "AC Chair", "First Class", "Sleeper" };
		String[] expected = { "AC Chair", "First Class", "Sleeper" };

		String[] result = ArraysSortUtility.sortBogieNames(names);

		assertArrayEquals(expected, result);
	}
}
