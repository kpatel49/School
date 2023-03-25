package controller;

import java.io.File;
import java.sql.SQLException;

import model.GameDBCreate;
import model.RoomDB;
import controller.GameException;

public class GameController {

	private Commands commands;
	public final static int ROOMONE = 1;
	
	
	public GameController() {
		commands = new Commands();
	}
	
	public void start() throws GameException, ClassNotFoundException, SQLException{
		File databaseFile = new File("Game.db");
		if(!databaseFile.exists()) {
			GameDBCreate gamedbc = new GameDBCreate();
			gamedbc.buildTables();
		}
	}
	
	
	public String showRoomOne() throws GameException{
		return  new Room(ROOMONE).display();
	}
	
	
	public String executeCommand(String command) throws GameException{
		return commands.Commandexec(command);
	}
	
	public String printMap() throws GameException{
		RoomDB rdb = new RoomDB();
		String stringOFmap ="";
		stringOFmap = rdb.getMap();
		commands.addnewPlayer();
		
		return stringOFmap;
	}
	
	public String getPlayerName() {
		return commands.getPlayerName();
		
	}
}
