package controller;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import model.ItemRoomDB;
import model.RoomDB;

public class Room {
    private int roomID;
    private String roomName;
    private String roomDescription; 
    private int healOrDamage;
    private boolean isVisited;
    private ArrayList<Exit> exits;

 
	public Room(int roomID,String roomName, String Desc,int healOrDamage,boolean isVisited) {
    	this.roomID = roomID;
    	this.roomName = roomName;
    	this.roomDescription =Desc;
    	this.healOrDamage = healOrDamage;    
    	this.isVisited = false;
    }
    
  
	/**
     * Constructor: Room
     */
    public Room() {
        RoomDB rdb = new RoomDB();
        try{
            roomID = rdb.getNextRoomID();
            }
        catch(SQLException sqe){
            System.out.println(sqe.getMessage());
        }
    }

    public Room(int roomone) {
		
	}


	/**
     * Method: getRoom
     * Purpose: Retrieves a room based upon the supplied ID
     * @param id
     * @return Room
     * @throws SQLException
     */
    public Room getRoom(int id) throws SQLException, ClassNotFoundException {
        RoomDB rdb = new RoomDB();
        return rdb.getRoom(id);
    }

  
    /**
     * Method: getAllRooms
     * Purpose: gets all rooms from the room table
     * @return ArrayList<Room>
     * @throws SQLException
     */
    
    public ArrayList<Room> getAllRooms() throws SQLException, ClassNotFoundException {
        RoomDB rdb = new RoomDB();
        return rdb.getAllRooms();
    }
    /**
     * Method: getRoomID
     * @return the roomID
     */
    public int getRoomID() {
        return roomID;
    }

    /**
     * Method: setRoomID
     * @param roomID the roomID to set
     */
    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    /**
     * Method: getRoomName
     * @return the roomName
     */
    public String getRoomName() {
        return roomName;
    }

    /**
     * Method: setRoomName
     * @param roomName the roomName to set
     */
    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * Method: getRoomDescription
     * @return the roomDescription
     */
    public String getRoomDescription() {
        return roomDescription;
    }

    /**
     * Method: setRoomDescription
     * @param roomDescription the roomDescription to set
     */
    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

    
    public int getHealOrDamage() {
  		return healOrDamage;
  	}

  	public void setHealOrDamage(int healOrDamage) {
  		this.healOrDamage = healOrDamage;
  	}

    /**
     * Method: Visited
     * @return isVisited
     */
    public boolean Visited()
    {
        return isVisited;
    }

    /**Method setVisited
    * @param visited the visited to set
    */
    public void setVisited(boolean visited)
    {
        this.isVisited = visited;
    }
    
    public ArrayList<Exit> getExits() {
 		return exits;
 	}


 	public void setExits(ArrayList<Exit> arrayList) {
 		this.exits = arrayList;
 	}

    /**
     * Method: toString
     * @return
     */
	@Override
	public String toString() {
		return "Room [roomID=" + roomID + ", roomName=" + roomName + ", roomDescription=" + roomDescription 
				 + ", healOrDamage=" + healOrDamage + ", isVisited=" + isVisited + "]";
	}


	public String display() {		
		return roomID + " " + roomName + "\n" + roomDescription + "\n" + isVisited;
	}


	public void updateRoom() {
		// TODO Auto-generated method stub
		
	}


	public ArrayList<ItemRoom> getRoomItems() throws GameException {
		ItemRoomDB irdb = new ItemRoomDB();
		return irdb.getAllItems();
	}


	public void removeItem(Item item) {
		// TODO Auto-generated method stub
		
	}


	public void dropItem(Item item) {
		// TODO Auto-generated method stub
		
	}


	public int validDirection(char charAt) {
		// TODO Auto-generated method stub
		return 0;
	}

    
 

}