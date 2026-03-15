package com.trainconsistmanagementapp;

import java.util.*;
import java.util.stream.Collectors;

public class TrainConsistManagementMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("======================================");
		System.out.println("  === Train Consist Management App === ");
		System.out.println("======================================");

		// Store bogies as objects
		List<Bogie> bogies = new ArrayList<>();

		System.out.println("Train initialized successfully...");
		System.out.println("Initial Bogie Count : " + bogies.size());

		System.out.println("\nSystem ready for operations...");

		System.out.println("=========================================");
		System.out.println(" UC7 - Sort Bogies by Capacity ");
		System.out.println("=========================================");

		boolean inMenu = true;
		int choice;

		while (inMenu) {

			System.out.println("1. Add Bogie");
			System.out.println("2. Remove Bogie");
			System.out.println("3. View Bogies");
			System.out.println("4. Check if Bogie exists");
			System.out.println("5. Sort Bogies by Capacity");
			System.out.println("6. Filter High Capacity Bogies (Stream)");
			System.out.println("7. Group Bogies by Type");
			System.out.println("0. Exit");

			System.out.print("Enter your Choice : ");
			choice = sc.nextInt();
			sc.nextLine();

			inMenu = switch (choice) {

			case 1 -> {
				System.out.print("Enter Bogie Name : ");
				String name = sc.nextLine();

				System.out.print("Enter Capacity : ");
				int capacity = sc.nextInt();
				sc.nextLine();

				bogies.add(new Bogie(name, capacity));
				System.out.println("Bogie added successfully!");
				yield true;
			}

			case 2 -> {
				System.out.print("Enter Bogie Name to remove : ");
				String name = sc.nextLine();

				boolean removed = bogies.removeIf(b -> b.getName().equalsIgnoreCase(name));

				if (removed)
					System.out.println("Bogie removed successfully.");
				else
					System.out.println("Bogie not found.");

				yield true;
			}

			case 3 -> {
				System.out.println("Current Bogies:");

				for (Bogie b : bogies) {
					System.out.println(b.getName() + " -> " + b.getCapacity());
				}

				yield true;
			}

			case 4 -> {
				System.out.print("Enter Bogie Name : ");
				String name = sc.nextLine();

				boolean exists = bogies.stream()
						.anyMatch(b -> b.getName().equalsIgnoreCase(name));

				System.out.println("Exists? : " + exists);

				yield true;
			}

			case 5 -> {
				bogies.sort(Comparator.comparingInt(Bogie::getCapacity));
				System.out.println("Bogies sorted by capacity successfully!");
				yield true;
			}

			case 6 -> {
				System.out.println("=========================================");
				System.out.println(" UC8 - Filter Passenger Bogies Using Streams");
				System.out.println("=========================================");

				List<Bogie> filteredBogies = bogies.stream()
						.filter(b -> b.getCapacity() > 60)
						.collect(Collectors.toList());

				if (filteredBogies.isEmpty()) {
					System.out.println("No bogies with capacity greater than 60.");
				} else {
					System.out.println("High Capacity Bogies (>60 seats):");
					for (Bogie b : filteredBogies) {
						System.out.println(b);
					}
				}
				yield true;
			}

			case 7 -> {
				System.out.println("=========================================");
				System.out.println(" UC9 - Group Bogies by Type");
				System.out.println("=========================================");

				if (bogies.isEmpty()) {
					System.out.println("No bogies available to group.");
					yield true;
				}

				Map<String, List<Bogie>> groupedBogies = bogies.stream()
						.collect(Collectors.groupingBy(Bogie::getName));

				for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
					System.out.println(entry.getKey());
					for (Bogie b : entry.getValue()) {
						System.out.println("   " + b);
					}
					System.out.println();
				}
				yield true;
			}

			case 0 -> {
				System.out.println("Thank you for Visiting !!!");
				yield false;
			}

			default -> {
				System.out.println("Invalid Input!!!");
				yield true;
			}
			};
		}

		sc.close();
	}
}