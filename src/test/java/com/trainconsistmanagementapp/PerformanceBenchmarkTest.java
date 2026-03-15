package com.trainconsistmanagementapp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PerformanceBenchmarkTest {

	@Test
	void shouldReturnPositiveLoopExecutionTime() {
		List<Bogie> dataset = new ArrayList<>();
		for (int i = 1; i <= 10000; i++) {
			int capacity = (i % 100) + 1;
			dataset.add(new Bogie("Bogie-" + i, capacity));
		}

		long loopTime = PerformanceBenchmarkService.measureLoopExecution(dataset);
		assertTrue(loopTime > 0);
	}

	@Test
	void shouldReturnPositiveStreamExecutionTime() {
		List<Bogie> dataset = new ArrayList<>();
		for (int i = 1; i <= 10000; i++) {
			int capacity = (i % 100) + 1;
			dataset.add(new Bogie("Bogie-" + i, capacity));
		}

		long streamTime = PerformanceBenchmarkService.measureStreamExecution(dataset);
		assertTrue(streamTime > 0);
	}
}
