package view;

import java.sql.SQLException;
import java.util.Scanner;
import controller.GameException;
import controller.GameController;

public class FreddysEscape {
private Scanner scanner;
private GameController controller;



public FreddysEscape() throws GameException, ClassNotFoundException, SQLException {
	
	controller = new GameController();
	
	try {
		controller.start();	
		controller.printMap();
	}
	catch(GameException controller) {
		System.out.println(controller.getMessage());
	}
	
	scanner = new Scanner(System.in);
}


private void GameStart() {
	System.out.println("Welcome to Freddy’s Escape Game, where the robotic monster Freddy has trapped you in his maze. This is a text-based adventure where the object of the game is to complete all 5 puzzles within the game while getting the highest score possible. You start with 100HP and 0 points. You explore through 30 rooms where you’ll find items, solve puzzles, and defeat monsters.");
	System.out.println("-	To win the game, you must solve all 5 puzzles, until then, you must keep exploring though the game. Every puzzle you solve you gain 100 points and 25HP. For every incorrect attempt to solving the puzzle you lose 50 points and 25HP. ");
	System.out.println("-	There’s items and weapons that you can pick up and add to your item pack. You can carry only 3 items at a time so choose carefully. Each item you pick up is worth 50 points");
	System.out.println("-	There are rooms where you can gain and lose HP. Tread lightly.");
	System.out.println("-	When your HP reaches 0, you’ll respawn back to the starting point and take a hit of 100 points to your overall score.");
	System.out.println("-	When fighting a monster, only with a weapon you’ll be able to defeat it. When attack and defeat one, you gain 100 points to your HP.");
	System.out.println("-	To display the list of valid commands, enter “HELP” ");
	
	try {
		String showRoom = controller.showRoomOne();
		System.out.println(showRoom);
	}
	catch (GameException ex){
		System.out.println(ex.getMessage());
		
	}
	
	String response ="";
	
	do {
		try {
			String command = getCommand();
			System.out.println(response = controller.executeCommand(command));
		}
		catch(GameException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("\n\n");
	}while(!response.equalsIgnoreCase("Exit"));
	System.out.println("You completed all 5 puzzles in the maze and now you’ve been allowed to escape. Come back again for another go if you dare. \r\n" + 
			"\r\n" + 
			"");
	
	
	}	

private String getCommand() {
	System.out.println(controller.getPlayerName() + ",Your actions?");
	String command = scanner.nextLine().toUpperCase();
	return command;
}

public static void main(String[] args) throws ClassNotFoundException, SQLException {
	FreddysEscape fde = null;
	
	try {
		fde = new FreddysEscape();
		System.out.println(fde.controller.printMap());
		fde.scanner = new Scanner(System.in);
		fde.GameStart();
	}
	catch(GameException controller) {
		System.out.println(controller.getMessage());
		System.out.println("Error loading game. Game terminated");
		
	}
	finally {
		fde.scanner.close();
	}
}
}
