package com.trainconsistmanagementapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * =======================================
 * MAIN CLASS - TrainConsistManagementApp
 * =======================================
 * 
 * Use Case 5: Preserve Insertion Order of Bogies
 * 
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 * 
 * At this stage, the application:
 * - Attaches bogies in order
 * - Preserves insertion sequence
 * - Avoids duplicate bogies
 * - Displays final train formation
 * 
 * This maps ordered uniqueness using LinkedHashSet.
 * 
 * @author Developer
 * @version 5.0
 */

public class TrainConsistManagementMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Display welcome banner
		System.out.println("======================================");
		System.out.println("  === Train Consist Management App === ");
		System.out.println("======================================");

		//Create a dynamic list to store train bogies
		Set<String> formation = new LinkedHashSet<>();

		//Display initial consist information
		System.out.println("Train initialized successfully...");
		System.out.println("Initial Bogie Count : " + formation.size());
		System.out.println("Current Train Consist : " + formation);

		System.out.println("\nSystem ready for operations...");

		System.out.println("=========================================");
		System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
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
				System.out.println("Note:\nLinkedHashSet preserves insertion order and removes duplicates automatically.");
				System.out.println("Enter the Name of the Bogie : ");
				bogieName = sc.nextLine();
				if (!formation.contains(bogieName)) {
					formation.add(bogieName);
					System.out.println("Bogie Added Successfully...");
				} else {
					System.out.println("Bogie already exists!!");
				}
				yield true;
			}
			case 2: {
				System.out.println("Enter the Name of the Bogie to be removed : ");
				bogieName = sc.nextLine();
				if (formation.contains(bogieName)) {
					formation.remove(bogieName);
				} else {
					System.out.println(bogieName + "does not exist!!");
				}
				yield true;
			}
			case 3: {
				System.out.println("Current Passanger Consist : \n" + formation);
				yield true;
			}
			case 4: {
				System.out.print("Enter the Name of the Bogie : ");
				bogieName = sc.nextLine();
				System.out.println("Contains " + bogieName + "? : " + formation.contains(bogieName));
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
