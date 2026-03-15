package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import com.trainconsistmanagementapp.algorithm.BubbleSortUtility;

import org.junit.jupiter.api.Test;

public class BubbleSortUtilityTest {

	@Test
	void shouldSortCapacitiesCorrectly() {
		int[] capacities = { 72, 56, 64 };
		int[] expected = { 56, 64, 72 };

		BubbleSortUtility.bubbleSort(capacities);

		assertArrayEquals(expected, capacities);
	}

	@Test
	void shouldHandleSingleElementArray() {
		int[] capacities = { 42 };
		int[] expected = { 42 };

		BubbleSortUtility.bubbleSort(capacities);

		assertArrayEquals(expected, capacities);
	}

	@Test
	void shouldHandleAlreadySortedArray() {
		int[] capacities = { 10, 20, 30, 40 };
		int[] expected = { 10, 20, 30, 40 };

		BubbleSortUtility.bubbleSort(capacities);

		assertArrayEquals(expected, capacities);
	}
}
