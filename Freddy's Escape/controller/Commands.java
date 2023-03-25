package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import controller.GameException;
import model.PlayerDB;

public class Commands {
	private static final List<String> DIRECTIONS = Arrays.asList("North", "West", "South", "East");
	private static final List<String> ITEMCOMMANDS = Arrays.asList("Collect", "drop", "attack", "Inventory", "Use");
	private static final int EXITCOMMAND = 5;

	private Player player;

	public Commands() {
		player = new Player();
	}

	protected void addnewPlayer() {
		PlayerDB pdb = new PlayerDB();

		try {
			player.setName(pdb.getPlayer(1));
		}

		catch (GameException error) {
			System.err.println(error.getMessage());
		}
	}

	private int commandsValidation(String command) throws GameException {
		int validcommand = 0;
		String[] sections = command.split("", 2);
		char cod = sections[0].charAt(0);
		if (command.equalsIgnoreCase("Exit")) {
			cod = 'X';
		}
		if (sections.length > 1) {
			if (ITEMCOMMANDS.contains(cod)) {
				validcommand = 2;
			} else {
				throw new GameException("Invalid command ,try again");

			}
		}

		else if (DIRECTIONS.contains(cod)) {
			validcommand = 1;
		} else if (cod == 'E') {
			validcommand = 3;
		}

		else if (cod == 'I') {
			validcommand = 4;
		}

		else if (cod == 'X') {
			validcommand = EXITCOMMAND;
		}
		return validcommand;
	}

	public String Commandexec(String command) throws GameException {
		Room room = new Room(player.getCurrentRoom());

		int validcommand = commandsValidation(command);

		String response = "";
		switch (validcommand) {
		case 1: {
			response = playerMove(command);
			break;
		}

		case 2: {
			response = itemCommand(command);
			break;

		}

		case 3: {

			response = room.display();
			break;

		}

		case 4: {

			response = player.printInventory();
			break;
		}
		case EXITCOMMAND: {
			response = "Exit";
			break;
		}

		default: {
			throw new GameException("Invalid command, Try again");
		}
		}

		return response;
	}

	private String playerMove(String roomCommand) throws GameException {
		Room room = new Room(player.getCurrentRoom());
		int destination = room.validDirection(roomCommand.toUpperCase().charAt(0));
		if (!room.Visited()) {
			room.setVisited(true);
			room.updateRoom();
		}
		Room nextRoom = new Room(destination);
		player.setCurrentRoom(destination);
		return nextRoom.display();

	}

private String itemCommand(String command) throws GameException{
	Room room = new Room(player.getCurrentRoom());
	String[] sections = command.split(" ", 2);
	String response ="";
	if(sections[0].toUpperCase().charAt(0) == 'C') {
		response = addtoInvent(sections[1],room);
		
	}
	
	else if(sections[0].toUpperCase().charAt(0) == 'D') {
		response = remove(sections[1],room);
		
	}
	
	else if (sections[0].toUpperCase().charAt(0) =='I') {
		response = examineItem(sections[1], room);
	}
	else {
		throw new GameException("invalid command");
	}
	response += "\n\n" + room.display();
	return response;
	}

	private String addtoInvent(String command, Room room) throws GameException {
		String response = command + " not in room";
		boolean found = false;
		for (int index = 0; !found && index < room.getRoomItems().size(); index++) {
			if (room.getRoomItems().get(index).getItemName().equalsIgnoreCase(command)) {
				found = true;
				player.addItem(room.getRoomItems().get(index));
				response = (room.getRoomItems().get(index).getItemName() + "added to invetory");
				room.removeItem(room.getRoomItems().get(index));

			}
		}
		return response;
	}

// remove from invent and add to room
	private String remove(String cmd, Room room) throws GameException{
		String response = "You do not have " + cmd + " in your inventory.";
		boolean found = false;
		for(int index = 0; !found && index < player.getInventory().size(); index++ ) {
			if(player.getInventory().get(index).getItemName().equalsIgnoreCase(cmd)) {
				found = true;
				room.dropItem(player.getInventory().get(index));
				player.removeItem(player.getInventory().get(index));
				response = cmd + "has been removed from your inventory";
			}
		}
		return response;
	}
	
	private String examineItem(String cmd, Room room) throws GameException{
		String response = "I don't see " + cmd;
		boolean found = false;
		ArrayList<ItemRoom> items = room.getRoomItems();
		for(int index = 0; !found && index < items.size(); index++) {
			if(items.get(index).getItemName().equalsIgnoreCase(cmd)) {
				response = items.get(index).display();
				found = true;
			}
		}
		items = player.getInventory();
		for(int index = 0; !found && index < items.size(); index++) {
			if(items.get(index).getItemName().equalsIgnoreCase(cmd)) {
				response = items.get(index).display();
				found = true;
			}
		}
		return response;
	}
	
	protected String getPlayerName() {
		return player.getName();
	}
}
