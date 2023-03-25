package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import controller.GameException;
import model.ItemRoomDB;


public class ItemRoom {
    private Item item;
    private Room room;

    public ItemRoom() {
        item = new Item();
        room = new Room();
    }

   
    public ItemRoom getItem(int roomID) throws GameException {
        ItemRoomDB idb = new ItemRoomDB();
        return idb.getItem(roomID);
    }

    /**
     * Method: getAllMonsters
     * Purpose: gets all mosters and their associated rooms
     * @return ArrayList<MonsterRoom>
     * @throws SQLException
     */
    public ArrayList<ItemRoom> getAllitems() throws GameException {
        ItemRoomDB idb = new ItemRoomDB();
        return idb.getAllItems();
    }

   
    public int getItemNumber() {
        return item.getItemID();
    }

    public void setItemID(int itemNumber) {
        this.item.setItemID(itemNumber);
    }

    /**
     * Method: getMonsterName
     * @return the monsterName
     */
    public String getItemName() {
        return item.getItemName();
    }

    /**
     * Method: setMonsterName
     * @param monsterName the monsterName to set
     */
    public void setItemName(String itemName) {
        this.item.setItemName(itemName);
    }

    /**
     * Method: getMonsterDescription
     * @return the monsterDescription
     */
    public String getItemDescription() {
        return item.getItemDescription();
    }

    /**
     * Method: setMonsterDescription
     * @param monsterDescription the monsterDescription to set
     */
    public void setItemDescription(String itemDescription) {
        this.item.setItemDescription(itemDescription);
    }

   
    /**
     * Method: getRoomNumber
     * @return the roomNumber
     */
    public int getRoomID() {
        return room.getRoomID();
    }

    /**
     * Method: setRoomNumber
     * @param roomNumber the roomNumber to set
     */
    public void setRoomID(int roomNumber) {
    	room.setRoomID(roomNumber);
    }

    /**
     * Method: getRoomName
     * @return the roomName
     */
    public String getRoomName() {
        return room.getRoomName();
    }

    /**
     * Method: setRoomName
     * @param roomName the roomName to set
     */
    public void setRoomName(String roomName) {
        room.setRoomName(roomName);
    }

    /**
     * Method: getRoomDescription
     * @return the roomDescription
     */
    public String getRoomDescription() {
        return room.getRoomDescription();
    }

    /**
     * Method: setRoomDescription
     * @param roomDescription the roomDescription to set
     */
    public void setRoomDescription(String roomDescription) {
        this.room.setRoomDescription(roomDescription);
    }


	@Override
	public String toString() {
		return "ItemRoom [item=" + item + ", room=" + room + ", getItemNumber()=" + getItemNumber() + ", getItemName()="
				+ getItemName() + ", getItemDescription()=" + getItemDescription() + ", getRoomNumber()="
				+ getRoomID() + ", getRoomName()=" + getRoomName() + ", getRoomDescription()="
				+ getRoomDescription() + "]";
	}


	public String display() {
		// TODO Auto-generated method stub
		return null;
	}
    
    
}