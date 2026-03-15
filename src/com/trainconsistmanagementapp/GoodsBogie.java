package com.trainconsistmanagementapp;

import com.trainconsistmanagementapp.exception.CargoSafetyException;

/**
 * ======================================================
 * MAIN CLASS - GoodsBogie / CargoAssignment
 * ======================================================
 *
 * Use Case 15: Safe Cargo Assignment Using try-catch-finally
 *
 * Description:
 * This class safely assigns cargo to goods bogies
 * while handling unsafe combinations using structured
 * exception handling blocks.
 *
 * At this stage, the application:
 * - Defines a custom runtime exception
 * - Validates cargo assignment rules
 * - Throws exception for unsafe cargo
 * - Catches and handles the exception
 * - Executes finally block for logging
 *
 * This maps runtime safety handling using try-catch-finally.
 *
 * @author Developer
 * @version 15.0
 */
public class GoodsBogie {

	private String type;
	private String cargo;

	public GoodsBogie(String type, String cargo) {
		this.type = type;
		assignCargo(cargo);
	}

	public String getType() {
		return type;
	}

	public String getCargo() {
		return cargo;
	}

	public void assignCargo(String cargo) {
		if (type != null && cargo != null
				&& type.equalsIgnoreCase("Rectangular")
				&& cargo.equalsIgnoreCase("Petroleum")) {
			throw new CargoSafetyException(
					"Unsafe cargo assignment: Petroleum cannot be stored in Rectangular bogie."
			);
		}
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return type + " -> " + cargo;
	}
}
