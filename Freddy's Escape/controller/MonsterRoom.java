package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.MonsterRoomDB;


public class MonsterRoom {
    private Monster monster;
    private Room room;

    public MonsterRoom() {
        monster = new Monster();
        room = new Room();
    }

    /**
     * Method: getMonster
     * Purpose: Get the monster in a specific room
     * @param roomID
     * @return MonsterRoom
     * @throws SQLException
     */
    public MonsterRoom getMonster(int roomID) throws GameException {
        MonsterRoomDB mdb = new MonsterRoomDB();
        return mdb.getMonster(roomID);
    }

    /**
     * Method: getAllMonsters
     * Purpose: gets all monsters and their associated rooms
     * @return ArrayList<MonsterRoom>
     * @throws SQLException
     */
    public ArrayList<MonsterRoom> getAllMonsters() throws GameException {
        MonsterRoomDB mdb = new MonsterRoomDB();
        return mdb.getAllMonsters();
    }

    /**
     * Method: getMonsterNumber
     * @return the monsterNumber
     */
    public int getMonsterID() {
        return monster.getMonsterID();
    }

    /**
     * Method: setMonsterNumber
     * @param monsterNumber the monsterNumber to set
     */
    public void setMonsterID(int monsterNumber) {
        this.monster.setMonsterID(monsterNumber);
    }

    /**
     * Method: getMonsterName
     * @return the monsterName
     */
    public String getMonsterName() {
        return monster.getMonsterName();
    }

    /**
     * Method: setMonsterName
     * @param monsterName the monsterName to set
     */
    public void setMonsterName(String monsterName) {
        this.monster.setMonsterName(monsterName);
    }

    /**
     * Method: getMonsterDescription
     * @return the monsterDescription
     */
    public String getMonsterDescription() {
        return monster.getMonsterDescription();
    }

    /**
     * Method: setMonsterDescription
     * @param monsterDescription the monsterDescription to set
     */
    public void setMonsterDescription(String monsterDescription) {
        this.monster.setMonsterDescription(monsterDescription);
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
    public void setRoomID(int roomNumber) {room.setRoomID(roomNumber);
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
		return "MonsterRoom [monster=" + monster + ", room=" + room + ", getMonsterNumber()=" + getMonsterID()
				+ ", getMonsterName()=" + getMonsterName() + ", getMonsterDescription()=" + getMonsterDescription()
				+ ", getRoomNumber()=" + getRoomID() + ", getRoomName()=" + getRoomName()
				+ ", getRoomDescription()=" + getRoomDescription() + "]";
	}
    
    

}
    