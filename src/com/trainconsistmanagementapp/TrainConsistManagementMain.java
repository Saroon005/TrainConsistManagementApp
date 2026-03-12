package com.trainconsistmanagementapp;

import java.util.*;
import java.util.Map.Entry;

/**
 * =======================================
 * MAIN CLASS - TrainConsistManagementApp
 * =======================================
 * 
 * Use Case 6: Map Bogie to Capacity (HashMap)
 * 
 * Description:
 * This class associates each bogie with its seating or 
 * load capacity using a key-value mapping structure.
 * 
 * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values for each bogie
 * - Iterates through map entries
 * - Displays  bogie and capacity information
 * 
 * This maps lookup-based access using HashMap.
 * 
 * @author Developer
 * @version 6.0
 */

public class TrainConsistManagementMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Display welcome banner
		System.out.println("======================================");
		System.out.println("  === Train Consist Management App === ");
		System.out.println("======================================");

		//Create a dynamic list to store train bogies
		Map<String, Integer> capacityMap = new HashMap<>();

		//Display initial consist information
		System.out.println("Train initialized successfully...");
		System.out.println("Initial Bogie Count : " + capacityMap.size());
		System.out.println("Current Train Consist : " + capacityMap.keySet());

		System.out.println("\nSystem ready for operations...");

		System.out.println("=========================================");
		System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
		System.out.println("=========================================");

		boolean inMenu = true;
		int choice;
		String bogieName;

		while(inMenu) {
			System.out.println("1. Add Bogies");
			System.out.println("2. Remove Bogies");
			System.out.println("3. View Bogies");
			System.out.println("4. Check if Bogie exists");
			System.out.println("0. Exit");
			System.out.print("Enter your Choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			inMenu = switch (choice) {
			case 1: {
				System.out.println("Enter the Name of the Bogie : ");
				bogieName = sc.nextLine();
				System.out.println("Enter the capacity of the Bogie : ");
				int capacity = sc.nextInt();
				capacityMap.put(bogieName, capacity);
				System.out.println(bogieName + " added successfully!!");
				yield true;
			}
			case 2: {
				System.out.println("Enter the Name of the Bogie to be removed : ");
				bogieName = sc.nextLine();
				if (capacityMap.containsKey(bogieName)) {
					capacityMap.remove(bogieName);
				} else {
					System.out.println(bogieName + "does not exist!!");
				}
				yield true;
			}
			case 3: {
				System.out.println("===========================");
				System.out.println("Bogie Capacity Details:");
				for (Entry<String, Integer> entry : capacityMap.entrySet()) {
					System.out.println(entry.getKey() + " -> " + entry.getValue());
				}
				System.out.println("===========================");
				yield true;
			}
			case 4: {
				System.out.print("Enter the Name of the Bogie : ");
				bogieName = sc.nextLine();
				System.out.println("Contains " + bogieName + "? : " + capacityMap.containsKey(bogieName));
				yield true;
			}
			case 0: {
				System.out.println("Thank you for Visiting !!!");
				yield false;
			}
			default:
				System.out.println("Invalid Input!!!");

				yield true;
			};
		}
		sc.close();
	}
}
