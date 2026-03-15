package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.trainconsistmanagementapp.exception.InvalidCapacityException;
import com.trainconsistmanagementapp.service.SearchValidationService;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SearchValidationServiceTest {

	@Test
	void shouldThrowExceptionWhenCollectionIsEmpty() {
		List<Bogie> bogies = new ArrayList<>();

		assertThrows(IllegalStateException.class,
				() -> SearchValidationService.validateBogieCollection(bogies));
	}

	@Test
	void shouldNotThrowExceptionWhenBogiesExist() throws InvalidCapacityException {
		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("BG101", 10));

		assertDoesNotThrow(() -> SearchValidationService.validateBogieCollection(bogies));
	}
}
