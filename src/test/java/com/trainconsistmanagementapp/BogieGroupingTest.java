package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.*;

import com.trainconsistmanagementapp.exception.InvalidCapacityException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class BogieGroupingTest {

	@Test
	void shouldGroupBogiesByName() throws InvalidCapacityException {
		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("Sleeper", 72));
		bogies.add(new Bogie("Sleeper", 68));
		bogies.add(new Bogie("AC Chair", 56));

		Map<String, List<Bogie>> grouped = bogies.stream()
				.collect(Collectors.groupingBy(Bogie::getName));

		assertTrue(grouped.containsKey("Sleeper"));
		assertEquals(2, grouped.get("Sleeper").size());
		assertTrue(grouped.get("Sleeper").stream().allMatch(b -> b.getName().equals("Sleeper")));
	}

	@Test
	void shouldCreateCorrectNumberOfGroups() throws InvalidCapacityException {
		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("Sleeper", 72));
		bogies.add(new Bogie("Sleeper", 68));
		bogies.add(new Bogie("AC Chair", 56));

		Map<String, List<Bogie>> grouped = bogies.stream()
				.collect(Collectors.groupingBy(Bogie::getName));

		assertEquals(2, grouped.size());
	}

	@Test
	void shouldHandleEmptyList() {
		List<Bogie> bogies = new ArrayList<>();

		Map<String, List<Bogie>> grouped = bogies.stream()
				.collect(Collectors.groupingBy(Bogie::getName));

		assertTrue(grouped.isEmpty());
	}
}
