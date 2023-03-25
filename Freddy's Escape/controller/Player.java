package controller;

import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;

import model.InventoryDB;
import model.PlayerDB;


public class Player {

	private int CurrentRoom;
	private String Name;
	private int playerID;
	private Room room;
	
	
	public Player() {
	     PlayerDB pdb = new PlayerDB();
	     try {
	         playerID = pdb.getNextPlayerID();
	     } catch (SQLException sqe) {
	         System.out.println(sqe.getMessage());
	     }
	 }

	
	 public String getPlayer(int id) throws SQLException, ClassNotFoundException, GameException {
	     PlayerDB idb = new PlayerDB();
	     return idb.getPlayer(id);
	 }

	
	 public ArrayList<Player> getAllPlayers() throws SQLException, ClassNotFoundException {
	     PlayerDB idb = new PlayerDB();
	     return idb.getAllPlayers();
	 }

	public int getCurrentRoom() {
		return CurrentRoom;
	}

	public void setCurrentRoom(int currentRoom) {
		CurrentRoom = currentRoom;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Player [CurrentRoom=" + CurrentRoom + ", Name=" + Name + ", playerID=" + playerID + ", room=" + room
				+ "]";
	}


	public ArrayList<Item> getInventory() throws GameException {
		InventoryDB idb = new InventoryDB();
		return idb.getInventory(this.playerID);
	}
	
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		
	}


	public void removeItem(Item item) {
		// TODO Auto-generated method stub
		
	}


	public String printInventory() throws GameException {
		InventoryDB idb = new InventoryDB();
		return idb.getInventory(this.playerID).toString();
	}
	
	
	
	
	

}