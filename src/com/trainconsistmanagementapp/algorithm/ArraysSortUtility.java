/**
 * ======================================================
 * MAIN CLASS - ArraysSortUtility
 * ======================================================
 *
 * Use Case 17: Sort Bogie Names Using Arrays.sort()
 *
 * Description:
 * This class demonstrates sorting of bogie type names
 * alphabetically using Java's built-in Arrays.sort() method.
 *
 * At this stage, the application:
 * - Creates an array of bogie names
 * - Uses Arrays.sort() for sorting
 * - Displays sorted results
 *
 * This maps optimized sorting using Java library utilities.
 *
 * @author Developer
 * @version 17.0
 */
package com.trainconsistmanagementapp.algorithm;

import java.util.Arrays;

public class ArraysSortUtility {

	public static String[] sortBogieNames(String[] bogieNames) {
		if (bogieNames == null || bogieNames.length < 2) {
			return bogieNames;
		}

		Arrays.sort(bogieNames);
		return bogieNames;
	}
}
