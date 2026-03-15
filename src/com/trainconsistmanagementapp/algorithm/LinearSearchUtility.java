/**
 * ======================================================
 * MAIN CLASS - LinearSearchUtility
 * ======================================================
 *
 * Use Case 18: Linear Search for Bogie ID
 *
 * Description:
 * This class demonstrates searching for a specific bogie ID
 * using a simple Linear Search algorithm.
 *
 * At this stage, the application:
 * - Creates an array of bogie IDs
 * - Accepts a search key
 * - Traverses array sequentially
 * - Stops when match is found
 * - Displays search result
 *
 * This maps basic searching logic using sequential traversal.
 *
 * @author Developer
 * @version 18.0
 */
package com.trainconsistmanagementapp.algorithm;

public class LinearSearchUtility {

	public static boolean searchBogieId(String[] bogieIds, String searchKey) {
		if (bogieIds == null || searchKey == null) {
			return false;
		}

		for (String id : bogieIds) {
			if (id != null && id.equals(searchKey)) {
				return true;
			}
		}
		return false;
	}
}
