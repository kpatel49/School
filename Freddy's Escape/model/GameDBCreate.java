package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLException;
import java.util.Scanner;

import controller.GameException;

/**
 * Class: GameDBCreate
 * 
 * @author Kush Patel
 * @version: 1.0 Course: ITEC 3860 This class creates the game database if it
 *           does not exist Purpose: the game test program can create a database
 *           if there is not one.
 */

public class GameDBCreate {
	SQLiteDB sldb;

	public void buildTables() throws SQLException, ClassNotFoundException, GameException {
		buildRoom();
		buildItem();
		buildItemRoom();
		buildMonster();
		buildMonsterRoom();
		buildExit();
		buildPlayer();
		buildInventory();
		buildPuzzle();
		buildPuzzleRoom();
	}

	public void buildRoom() throws SQLException, ClassNotFoundException, GameException {
		sldb = new SQLiteDB();

		try {
			FileReader file = new FileReader("C:\\Users\\kjp25\\eclipse-workspace\\Freddy's Escape\\src\\Freddy's Room.txt");
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
				String str = read.nextLine();
				sldb.updateDB(str);
			}
			read.close();
		} catch (FileNotFoundException e) {
			throw new GameException("Freddy's Room file was not found");
		}

		sldb.close();

	}

	public void buildItem() throws SQLException, ClassNotFoundException, GameException {
		sldb = new SQLiteDB();

		try {
			FileReader file = new FileReader("scr\\Item.txt");
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
				String str = read.nextLine();
				sldb.updateDB(str);
			}
			read.close();
		} catch (FileNotFoundException e) {
			throw new GameException("Item file was not found");
		}

		sldb.close();
	}

	public void buildItemRoom() throws SQLException, ClassNotFoundException, GameException {
		sldb = new SQLiteDB();

		try {
			FileReader file = new FileReader("scr\\ItemRoom.txt");
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
				String str = read.nextLine();
				sldb.updateDB(str);
			}
			read.close();
		} catch (FileNotFoundException e) {
			throw new GameException("ItemRoom file was not found");
		}

		sldb.close();

	}

	public void buildMonster() throws SQLException, ClassNotFoundException, GameException {
		sldb = new SQLiteDB();

		try {
			FileReader file = new FileReader("scr\\Monster.txt");
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
				String str = read.nextLine();
				sldb.updateDB(str);
			}
			read.close();
		} catch (FileNotFoundException e) {
			throw new GameException("Monster file was not found");
		}

		sldb.close();

	}

	public void buildMonsterRoom() throws SQLException, ClassNotFoundException, GameException {
		sldb = new SQLiteDB();

		try {
			FileReader file = new FileReader("scr\\MonsterRoom.txt");
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
				String str = read.nextLine();
				sldb.updateDB(str);
			}
			read.close();
		} catch (FileNotFoundException e) {
			throw new GameException("MonsterRoom file was not found");
		}

		sldb.close();
	}

	public void buildExit() throws SQLException, ClassNotFoundException, GameException {
		sldb = new SQLiteDB();

		try {
			FileReader file = new FileReader("scr\\Exit.txt");
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
				String str = read.nextLine();
				sldb.updateDB(str);
			}
			read.close();
		} catch (FileNotFoundException e) {
			throw new GameException("Exit file was not found");
		}

		sldb.close();

	}

	public void buildPlayer() throws GameException {
		try {
			sldb = new SQLiteDB();
			String sql = "Create Table Player(playerID int not Null , playerName text not Null, currentRoom int not Null)";
			sldb.updateDB(sql);
			sql = "Insert Into Player(playerID, playerName, currentRoom) Values(1, 'Fred', 1)";
			sldb.updateDB(sql);
		} catch (SQLException | ClassNotFoundException e) {
			throw new GameException("Error creating Player table");
		} finally {
			if (sldb != null) {
				try {
					sldb.close();
				} catch (SQLException e) {
				}
			}
		}
	}

	public void buildInventory() throws GameException {
		try {
			sldb = new SQLiteDB();
			String sql = "Create Table Inventory(playerID int, itemID int)";
			sldb.updateDB(sql);
		} catch (SQLException | ClassNotFoundException e) {
			throw new GameException("Error creating Inventory table");
		} finally {
			if (sldb != null) {
				try {
					sldb.close();
				} catch (SQLException e) {
				}
			}
		}

	}

	public void buildPuzzle() throws SQLException, ClassNotFoundException, GameException {
		sldb = new SQLiteDB();

		try {
			FileReader file = new FileReader("src\\Puzzle.txt");
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
				String str = read.nextLine();
				sldb.updateDB(str);
			}
			read.close();
		} catch (FileNotFoundException e) {
			throw new GameException("Puzzle file was not found");
		}

		sldb.close();

	}

	public void buildPuzzleRoom() throws SQLException, ClassNotFoundException, GameException {
		sldb = new SQLiteDB();

		try {
			FileReader file = new FileReader("src\\PuzzleRoom.txt");
			Scanner read = new Scanner(file);
			while (read.hasNextLine()) {
				String str = read.nextLine();
				sldb.updateDB(str);
			}
			read.close();
		} catch (FileNotFoundException e) {
			throw new GameException("PuzzleRoom file was not found");
		}

		sldb.close();

	}

}
