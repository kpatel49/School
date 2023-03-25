package TicTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class GameBord {

	static ArrayList<Integer> P1Positions = new ArrayList<Integer>();
	static ArrayList<Integer> P2Positions = new ArrayList<Integer>();

	public static void main(String[] args) {

		char[][] gameboard = { { ' ', '|', ' ', '|', ' ' }, { '-', '-', '-', '-', '-' }, { ' ', '|', ' ', '|', ' ' },
				{ '-', '-', '-', '-', '-' }, { ' ', '|', ' ', '|', ' ' } };

		while (true) {
			Scanner input = new Scanner(System.in);
			System.out.println(" P1 Enter placement 1-9");
			int P1pos = input.nextInt();
			while (P1Positions.contains(P1pos) || P2Positions.contains(P1pos)) {
				System.out.println("Position taken enter a correct position.");
				P1pos = input.nextInt();
			}
			place(gameboard, P1pos, "P1");
			String result = Win();

			if (result.length() > 0) {
				System.out.println(result);
				break;
			}

			System.out.println(" P2 Enter placement 1-9");
			int P2pos = input.nextInt();
			while (P1Positions.contains(P2pos) || P2Positions.contains(P2pos)) {
				System.out.println("Position taken enter a correct position.");
				P2pos = input.nextInt();
			}
			place(gameboard, P2pos, "P2");
			Display(gameboard);
			result = Win();
			if (result.length() > 0) {
				System.out.println(result);
				Display(gameboard);
				break;
			}
			
		}

	}

	public static void place(char[][] gameboard, int pos, String user) {
		char symbol = ' ';
		if (user == "P1") {
			symbol = 'X';
			P1Positions.add(pos);
		} else if (user == "P2") {
			symbol = 'O';
			P2Positions.add(pos);
		}

		if (pos == 1) {
			gameboard[0][0] = symbol;
		} else if (pos == 2) {
			gameboard[0][2] = symbol;
		} else if (pos == 3) {
			gameboard[0][4] = symbol;
		} else if (pos == 4) {
			gameboard[2][0] = symbol;
		} else if (pos == 5) {
			gameboard[2][2] = symbol;
		} else if (pos == 6) {
			gameboard[2][4] = symbol;
		} else if (pos == 7) {
			gameboard[4][0] = symbol;
		} else if (pos == 8) {
			gameboard[4][2] = symbol;
		} else if (pos == 9) {
			gameboard[4][4] = symbol;
		}

	}

	public static void Display(char[][] gameboard) {

		for (char[] row : gameboard) {
			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

	public static String Win() {

		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		List leftCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List cross1 = Arrays.asList(1, 5, 9);
		List cross2 = Arrays.asList(7, 5, 3);

		List<List> winning = new ArrayList<List>();
		winning.add(topRow);
		winning.add(midRow);
		winning.add(botRow);
		winning.add(leftCol);
		winning.add(midCol);
		winning.add(rightCol);
		winning.add(cross1);
		winning.add(cross2);

		for (List l : winning) {
			if (P1Positions.containsAll(l)) {
				return "P1 Won!";
			} else if (P2Positions.containsAll(l)) {
				return "P2 Won!";
			} else if (P1Positions.size() + P2Positions.size() == 9) {
				return "Tie!";
			}
		}

		return "";
	}

}
