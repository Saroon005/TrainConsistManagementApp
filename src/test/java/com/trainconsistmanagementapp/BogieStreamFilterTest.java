package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.*;

import com.trainconsistmanagementapp.exception.InvalidCapacityException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class BogieStreamFilterTest {

	@Test
	void shouldReturnOnlyHighCapacityBogies() throws InvalidCapacityException {
		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("General", 50));
		bogies.add(new Bogie("Sleeper", 72));
		bogies.add(new Bogie("First Class", 64));

		List<Bogie> filtered = bogies.stream()
				.filter(b -> b.getCapacity() > 60)
				.collect(Collectors.toList());

		assertEquals(2, filtered.size());
		assertTrue(filtered.stream().allMatch(b -> b.getCapacity() > 60));
	}

	@Test
	void shouldReturnEmptyListWhenNoBogieMatches() throws InvalidCapacityException {
		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("General", 60));
		bogies.add(new Bogie("Second", 45));

		List<Bogie> filtered = bogies.stream()
				.filter(b -> b.getCapacity() > 60)
				.collect(Collectors.toList());

		assertTrue(filtered.isEmpty());
	}

	@Test
	void shouldIgnoreLowCapacityBogies() throws InvalidCapacityException {
		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("Low", 10));
		bogies.add(new Bogie("Edge", 60));
		bogies.add(new Bogie("High", 61));

		List<Bogie> filtered = bogies.stream()
				.filter(b -> b.getCapacity() > 60)
				.collect(Collectors.toList());

		assertEquals(1, filtered.size());
		assertTrue(filtered.stream().allMatch(b -> b.getCapacity() > 60));
		assertFalse(filtered.stream().anyMatch(b -> b.getCapacity() <= 60));
	}
}
