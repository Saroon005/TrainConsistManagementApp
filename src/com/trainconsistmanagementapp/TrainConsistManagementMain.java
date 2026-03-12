package com.trainconsistmanagementapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * =======================================
 * MAIN CLASS - TrainConsistManagementApp
 * =======================================
 * 
 * Use Case 4: Maintain Ordered Bogie Consist
 * 
 * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 * 
 * At this stage, the application:
 * - Adds bogies in a sequence
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 * 
 * This maps positional operations using LinkedList.
 * 
 * @author Developer
 * @version 4.0
 */

public class TrainConsistManagementMain {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//Display welcome banner
		System.out.println("======================================");
		System.out.println("  === Train Consist Management App === ");
		System.out.println("======================================");

		//Create a dynamic list to store train bogies
		List<String> trainConsist = new LinkedList<>();

		//Display initial consist information
		System.out.println("Train initialized successfully...");
		System.out.println("Initial Bogie Count : " + trainConsist.size());
		System.out.println("Current Train Consist : " + trainConsist);

		System.out.println("\nSystem ready for operations...");

		System.out.println("======================================");
		System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
		System.out.println("======================================");

		boolean inMenu = true;
		int choice;
		String bogieName;

		while(inMenu) {
			System.out.println("1. Add Bogies at specific position");
			System.out.println("2. Add Bogies at the start");
			System.out.println("3. Add Bogies at the end");
			System.out.println("4. Remove Bogies from the front");
			System.out.println("5. Remove Bogies from the rear");
			System.out.println("6. View Bogies");
			System.out.println("7. Check if Bogie exists");
			System.out.println("0. Exit");
			System.out.print("Enter your Choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			inMenu = switch (choice) {
			case 1: {
				System.out.println("Enter the Name of the Bogie : ");
				bogieName = sc.nextLine();
				System.out.println("Enter the position at which you would like to enter it :");
				int position = sc.nextInt();
				trainConsist.add(position, bogieName);
				System.out.println("Bogie Added Successfully...");
				yield true;
			}
			case 2: {
				System.out.println("Enter the Name of the Bogie : ");
				bogieName = sc.nextLine();
				trainConsist.addFirst(bogieName);
				System.out.println("Bogie Added Successfully...");
				yield true;
			}
			case 3: {
				System.out.println("Enter the Name of the Bogie : ");
				bogieName = sc.nextLine();
				trainConsist.addLast(bogieName);
				System.out.println("Bogie Added Successfully...");
				yield true;
			}
			case 4: {
				String removedBogie = trainConsist.removeFirst();
				System.out.println(removedBogie + " removed from the front");
				yield true;
			}
			case 5: {
				String removedBogie = trainConsist.removeLast();
				System.out.println(removedBogie + " removed from the rear");
				yield true;
			}
			case 6: {
				System.out.println("Current Passanger Consist : \n" + trainConsist);
				yield true;
			}
			case 7: {
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
		sc.close();
	}
}
