package com.trainconsistmanagementapp;

import java.util.*;

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