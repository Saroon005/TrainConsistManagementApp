/**
 * ======================================================
 * MAIN CLASS - BubbleSortUtility
 * ======================================================
 *
 * Use Case 16: Sort Passenger Bogies by Capacity
 *
 * Description:
 * This class demonstrates manual sorting of passenger
 * bogie capacities using the Bubble Sort algorithm
 * instead of built-in sorting utilities.
 *
 * At this stage, the application:
 * - Creates an array of capacities
 * - Compares adjacent values
 * - Swaps values when required
 * - Repeats passes until sorted
 * - Displays sorted result
 *
 * This maps algorithmic sorting logic using Bubble Sort.
 *
 * @author Developer
 * @version 16.0
 */
package com.trainconsistmanagementapp.algorithm;

public class BubbleSortUtility {

	public static void bubbleSort(int[] capacities) {
		if (capacities == null || capacities.length < 2) {
			return;
		}

		for (int i = 0; i < capacities.length - 1; i++) {
			for (int j = 0; j < capacities.length - i - 1; j++) {
				if (capacities[j] > capacities[j + 1]) {
					int temp = capacities[j];
					capacities[j] = capacities[j + 1];
					capacities[j + 1] = temp;
				}
			}
		}
	}
}
