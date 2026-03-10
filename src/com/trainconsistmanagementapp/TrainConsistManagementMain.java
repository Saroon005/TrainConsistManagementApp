package com.trainconsistmanagementapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - UseCase2TrainConsistMgmt
 * ============================================================
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * At this stage, the application:
 * - Adds new bogies to the train
 * - Removes existing bogies
 * - Checks for bogie availability
 * - Displays the final consist
 *
 * This maps CRUD operations using ArrayList.
 *
 * @author Developer
 * @version 2.0
 */

public class TrainConsistManagementMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Display welcome banner
		System.out.println("======================================");
		System.out.println("  === Train Consist Management App === ");
		System.out.println("======================================");
		
		//Create a dynamic list to store train bogies
		List<String> trainConsist = new ArrayList<>();
		
		//Display initial consist information
		System.out.println("Train initialized successfully...");
		System.out.println("Initial Bogie Count : " + trainConsist.size());
		System.out.println("Consist Train Consist : " + trainConsist);
		
		System.out.println("\nSystem ready for operations...");
		
		System.out.println("======================================");
		System.out.println(" UC2 - Add Passeneger Bogies to Train");
		System.out.println("======================================");
		
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
				trainConsist.add(bogieName);
				yield true;
			}
			case 2: {
				System.out.println("Enter the Name of the Bogie to be removed : ");
				bogieName = sc.nextLine();
				trainConsist.remove(bogieName);
				yield true;
			}
			case 3: {
				System.out.println("Current Passanger Consist : \n" + trainConsist);
				yield true;
			}
			case 4: {
				System.out.print("Enter the Name of the Bogie : ");
				bogieName = sc.nextLine();
				System.out.println("Contains " + bogieName + "? : " + trainConsist.contains(bogieName));
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
	}
}
