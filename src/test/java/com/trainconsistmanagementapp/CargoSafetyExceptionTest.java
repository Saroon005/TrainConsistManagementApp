package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.*;

import com.trainconsistmanagementapp.exception.CargoSafetyException;

import org.junit.jupiter.api.Test;

public class CargoSafetyExceptionTest {

	@Test
	void shouldThrowExceptionForUnsafeCargo() {
		GoodsBogie goodsBogie = new GoodsBogie("Rectangular", "Coal");
		assertThrows(CargoSafetyException.class, () -> goodsBogie.assignCargo("Petroleum"));
	}

	@Test
	void shouldAllowSafeCargoAssignment() {
		GoodsBogie goodsBogie = new GoodsBogie("Cylindrical", "");
		assertDoesNotThrow(() -> goodsBogie.assignCargo("Petroleum"));
	}
}
