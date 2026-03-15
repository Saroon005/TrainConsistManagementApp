package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TrainSeatAggregationTest {

	@Test
	void shouldCalculateTotalCapacity() {
		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("Sleeper", 72));
		bogies.add(new Bogie("AC Chair", 56));
		bogies.add(new Bogie("First Class", 64));

		int totalSeats = bogies.stream()
				.map(Bogie::getCapacity)
				.reduce(0, Integer::sum);

		assertEquals(192, totalSeats);
	}

	@Test
	void shouldReturnZeroWhenListIsEmpty() {
		List<Bogie> bogies = new ArrayList<>();

		int totalSeats = bogies.stream()
				.map(Bogie::getCapacity)
				.reduce(0, Integer::sum);

		assertEquals(0, totalSeats);
	}

	@Test
	void shouldHandleSingleBogie() {
		List<Bogie> bogies = new ArrayList<>();
		bogies.add(new Bogie("Sleeper", 72));

		int totalSeats = bogies.stream()
				.map(Bogie::getCapacity)
				.reduce(0, Integer::sum);

		assertEquals(72, totalSeats);
	}
}
