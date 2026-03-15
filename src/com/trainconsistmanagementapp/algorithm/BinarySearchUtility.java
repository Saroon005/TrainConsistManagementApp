/**
 * ======================================================
 * MAIN CLASS - BinarySearchUtility
 * ======================================================
 *
 * Use Case 19: Binary Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using the Binary Search algorithm on sorted data.
 *
 * At this stage, the application:
 * - Creates sorted bogie ID array
 * - Defines search key
 * - Applies binary search logic
 * - Narrows search range each iteration
 * - Displays result
 *
 * This maps optimized searching logic using divide-and-conquer.
 *
 * @author Developer
 * @version 19.0
 */
package com.trainconsistmanagementapp.algorithm;

public class BinarySearchUtility {

	public static boolean binarySearch(String[] ids, String key) {
		if (ids == null || key == null || ids.length == 0) {
			return false;
		}

		int low = 0;
		int high = ids.length - 1;

		while (low <= high) {
			int mid = (low + high) / 2;
			String midValue = ids[mid];

			if (midValue == null) {
				return false;
			}

			if (midValue.equals(key)) {
				return true;
			}

			int comparison = key.compareTo(midValue);
			if (comparison > 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return false;
	}
}
