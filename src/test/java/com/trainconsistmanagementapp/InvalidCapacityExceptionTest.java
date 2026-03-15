package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.*;

import com.trainconsistmanagementapp.exception.InvalidCapacityException;

import org.junit.jupiter.api.Test;

public class InvalidCapacityExceptionTest {

	@Test
	void shouldThrowExceptionForZeroCapacity() {
		assertThrows(InvalidCapacityException.class, () -> new Bogie("Sleeper", 0));
	}

	@Test
	void shouldThrowExceptionForNegativeCapacity() {
		assertThrows(InvalidCapacityException.class, () -> new Bogie("AC Chair", -5));
	}

	@Test
	void shouldCreateBogieForValidCapacity() throws InvalidCapacityException {
		Bogie bogie = new Bogie("Sleeper", 72);
		assertNotNull(bogie);
	}
}
