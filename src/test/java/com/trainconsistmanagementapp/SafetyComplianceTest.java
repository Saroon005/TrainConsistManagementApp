package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class SafetyComplianceTest {

	@Test
	void shouldReturnTrueWhenAllCargoRulesSatisfied() {
		List<GoodsBogie> goodsBogies = List.of(
				new GoodsBogie("Cylindrical", "Petroleum"),
				new GoodsBogie("Rectangular", "Coal"),
				new GoodsBogie("Cylindrical", "Petroleum"));

		assertTrue(SafetyComplianceService.isTrainSafe(goodsBogies));
	}

	@Test
	void shouldReturnFalseWhenCylindricalCarriesWrongCargo() {
		List<GoodsBogie> goodsBogies = List.of(
				new GoodsBogie("Cylindrical", "Coal"));

		assertFalse(SafetyComplianceService.isTrainSafe(goodsBogies));
	}
}
