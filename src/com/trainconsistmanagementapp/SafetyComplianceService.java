package com.trainconsistmanagementapp;

import java.util.List;

public class SafetyComplianceService {

	public static boolean isTrainSafe(List<GoodsBogie> goodsBogies) {
		return goodsBogies.stream()
				.allMatch(b -> !b.getType().equalsIgnoreCase("Cylindrical")
						|| b.getCargo().equalsIgnoreCase("Petroleum"));
	}
}
