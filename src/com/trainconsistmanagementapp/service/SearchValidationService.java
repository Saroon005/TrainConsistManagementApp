/**
 * ======================================================
 * MAIN CLASS - SearchValidationService
 * ======================================================
 *
 * Use Case 20: Exception Handling During Search Operations
 *
 * Description:
 * This class prevents searching when no bogies exist
 * by applying fail-fast validation using exceptions.
 *
 * At this stage, the application:
 * - Creates bogie collection
 * - Validates system state
 * - Throws exception if empty
 * - Stops invalid search operation
 * - Displays meaningful message
 *
 * This maps defensive programming using runtime exceptions.
 *
 * @author Developer
 * @version 20.0
 */
package com.trainconsistmanagementapp.service;

import com.trainconsistmanagementapp.Bogie;

import java.util.List;

public class SearchValidationService {

	public static void validateBogieCollection(List<Bogie> bogies) {
		if (bogies == null || bogies.isEmpty()) {
			throw new IllegalStateException(
					"No bogies available. Please add bogies before performing search operations."
			);
		}
	}
}
