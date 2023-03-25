package view;

import java.util.InputMismatchException;
import java.util.Scanner;
import controller.GameCharacter;
import controller.GameDataException;

public class CharacterEntry {
	private Scanner input;
	GameCharacter gc;

	////// ONCE YOU COMPLETE remove commended part

	/**
	 * Method: main Entry point for the GameCharacter program Allows the user to
	 * enter as many characters as desired and calls for them to be stored.
	 * 
	 * @param args command line parameters for this program
	 */

	public static void main(String[] args) {
		CharacterEntry ce = new CharacterEntry();
		ce.input = new Scanner(System.in);
		boolean again = true;
		do {
			ce.entry();
			System.out.println("Do you want to enter another character? (Y/N)");
			char another = ce.input.nextLine().toUpperCase().charAt(0);
			if (another == 'N') {
				again = false;
			}
		} while (again);
		System.out.println(ce.gc.getAll());
		ce.input.close();
	}

	/**
	 * Method: entry Allows the user to enter the character information. Creates a
	 * new GameCharacter object
	 */
	private void entry() {
		gc = new GameCharacter();
		enterName(gc);
		enterType(gc);
		enterHP(gc);
		enterAC(gc);
		try {
			gc.save();
		} catch (GameDataException ge) {
			System.out.println(ge.getMessage());
		}

	}

	/**
	 * Method: enterName Allows the user to enter the character name. Handles the
	 * GameException if an invalid name entered.
	 */
	private void enterName(GameCharacter gc) {
		boolean valid;
		do {
			try {
				System.out.println("Please enter the name for your character");
				gc.setName(input.nextLine());
				valid = true;
			} catch (GameDataException ge) {
				System.out.println(ge.getMessage());
				valid = false;
			}
		} while (!valid);

	}

	/**
	 * Method: enterType Allows the user to enter the character type. Handles the
	 * GameException if an invalid name entered.
	 * 
	 * @param gc the GameCharacter that is being created.
	 */
	private void enterType(GameCharacter gc) {
		boolean valid;
		do {
			try {
				System.out.println("Please enter the type for " + gc.getName());
				gc.setType(input.nextLine());
				valid = true;
			} catch (GameDataException ge) {
				System.out.println(ge.getMessage());
				valid = false;
			}
		} while (!valid);

	}

	/**
	 * Method: enterHP Allows the user to enter the character hit points. Handles
	 * the GameException if an invalid name entered.
	 * 
	 * @param gc the GameCharacter that is being created.
	 */
	private void enterHP(GameCharacter gc) {
		boolean valid;
		do {
			try {
				System.out.println("Please enter the hit points for " + gc.getName());
				gc.setHp(input.nextInt());
				valid = true;
			} catch (GameDataException ge) {
				System.out.println(ge.getMessage());
				valid = false;
			} catch (InputMismatchException ime) {
				System.out.println("You must enter an int for hit points.");
				valid = false;
			} finally {
				input.nextLine();
			}
		} while (!valid);

	}

	/**
	 * Method: enterAC Allows the user to enter the character armor class. Handles
	 * the GameException if an invalid name entered.
	 * 
	 * @param gc the GameCharacter that is being created.
	 */
	private void enterAC(GameCharacter gc) {
		boolean valid;
		do {
			try {
				System.out.println("Please enter the armor class for " + gc.getName());
				gc.setAc(input.nextInt());
				valid = true;
			} catch (GameDataException ge) {
				System.out.println(ge.getMessage());
				valid = false;
			} catch (InputMismatchException ime) {
				System.out.println("You must enter an int for armor class.");
				valid = false;
			} finally {
				input.nextLine();
			}
		} while (!valid);

	}

}
