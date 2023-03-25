/*
 * Class: ExtraHmwk_KushPatel_Dictionary
 * @author Kush Patel
 * Course: ITEC 3150 Spring 2021
 * 
 * Collaboration: I worked on the homework assignment alone, using this semester's course
 * materials.
 * 
 * This Class: has a main method that calls the menu() which has a user interface. 
 * Then there is a method CreateDictionary that creates a CarTerm object which is stored
 * in an array. There is a print method that displays the dictionary, and a sort method
 * that sort the objects by the rank. And a search method that searches the array for the 
 * name of the car. 
 * 
 * */

import java.util.Scanner;

public class ExtraHmwk_KushPatel_Dictionary {

	public static void main(String[] args) {
		menu();

	}

	public static Extrahmwk_Kush_CarTerm[] CreateDictionary() {
		Extrahmwk_Kush_CarTerm[] arr = new Extrahmwk_Kush_CarTerm[10];

		arr[0] = new Extrahmwk_Kush_CarTerm(1, "Civic", 13);
		arr[1] = new Extrahmwk_Kush_CarTerm(2, "RAV4", 11);
		arr[2] = new Extrahmwk_Kush_CarTerm(3, "CR-V", 34);
		arr[3] = new Extrahmwk_Kush_CarTerm(4, "HR-V", 45);
		arr[4] = new Extrahmwk_Kush_CarTerm(5, "Golf", 64);
		arr[5] = new Extrahmwk_Kush_CarTerm(6, "Accord", 1);
		arr[6] = new Extrahmwk_Kush_CarTerm(7, "Camry", 4);
		arr[7] = new Extrahmwk_Kush_CarTerm(8, "Camaro", 43);
		arr[8] = new Extrahmwk_Kush_CarTerm(9, "Odyssey", 54);
		arr[9] = new Extrahmwk_Kush_CarTerm(10, "F-150", 96);

		return arr;
	}

	public static void Print(Extrahmwk_Kush_CarTerm arr[]) {

		System.out.println("Object" + " | " + "Term" + " | " + "Rank");
		System.out.println("--------------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d%7s%6s%2s%3d\n", arr[i].getObjNum(), "|", arr[i].getName(), "|", arr[i].getRank());
		}

	}

	public static Extrahmwk_Kush_CarTerm[] Sort(Extrahmwk_Kush_CarTerm arr[]) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (((arr[j].getRank()) > ((arr[j + 1].getRank())))) {
					Extrahmwk_Kush_CarTerm temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static boolean searchByTerm(String term, Extrahmwk_Kush_CarTerm[] arr) {
		boolean value = false;

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i].capitalize()).contains(term.toUpperCase())) {
				value = true;
			}
		}
		return value;
	}

	public static void menu() {
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Dictionary of car names");
		boolean done = false;
		while (!done) {
			System.out.println("Would you like to :");
			System.out.println("1. View an unsorted dictionary");
			System.out.println("2. View a sorted dictionary");
			System.out.println("3. Search for a car");
			System.out.println("4. Exit");
			String tp = input.nextLine();
			int userInput = Integer.parseInt(tp);

			if (userInput == 1) {
				Print(CreateDictionary());
			} else if (userInput == 2) {
				Print(Sort(CreateDictionary()));
			} else if (userInput == 3) {
				System.out.println("Please enter car name");
				String str = input.nextLine();
				boolean temp = searchByTerm(str, CreateDictionary());
				if (temp) {
					System.out.println("Term found!");
				} else {
					System.out.println("Term not found!");
				}
			} else {
				done = true;
			}
		}
	}

}
