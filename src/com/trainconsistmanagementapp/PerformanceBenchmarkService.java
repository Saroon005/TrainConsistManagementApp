package com.trainconsistmanagementapp;

import java.util.ArrayList;
import java.util.List;

public class PerformanceBenchmarkService {

	public static long measureLoopExecution(List<Bogie> bogies) {
		long start = System.nanoTime();

		List<Bogie> filtered = new ArrayList<>();
		for (Bogie b : bogies) {
			if (b.getCapacity() > 60) {
				filtered.add(b);
			}
		}

		long end = System.nanoTime();
		return end - start;
	}

	public static long measureStreamExecution(List<Bogie> bogies) {
		long start = System.nanoTime();

		bogies.stream()
				.filter(b -> b.getCapacity() > 60)
				.toList();

		long end = System.nanoTime();
		return end - start;
	}
}
