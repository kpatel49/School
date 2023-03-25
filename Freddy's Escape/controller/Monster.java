package controller;

import java.sql.SQLException;

import java.util.ArrayList;

import model.MonsterDB;

public class Monster {
    private int monsterID;
    private String monsterName;
    private String monsterDescription;
    
    
   
    
    public Monster(int monsterID, String monsterName,String monsterDescription) {
    	this.monsterID = monsterID;
    	this.monsterName= monsterName;
    	this.monsterDescription = monsterDescription;
    }
    
    
    public Monster() {
        MonsterDB mdb = new MonsterDB();
        try {
            monsterID = mdb.getNextMonsterID();
        } catch (SQLException sqe) {
            System.out.println(sqe.getMessage());
        }
    }

    /**
     * Method: getMonster
     * Purpose: Gets a specified monster from the Monster table
     * @param id
     * @return Monster
     * @throws SQLException
     */
    public Monster getMonster(int id) throws SQLException, ClassNotFoundException {
        MonsterDB mdb = new MonsterDB();
        return mdb.getMonster(id);
    }

    /**
     * Method: getAllMonsters
     * Purpose: gets all monsters from the Monster table
     * @return ArrayList<Monster>
     * @throws SQLException
     */
    public ArrayList<Monster> getAllMonsters() throws SQLException, ClassNotFoundException {
        MonsterDB mdb = new MonsterDB();
        return mdb.getAllMonsters();
    }
    /**
     * Method: getMonsterID
     * @return the monsterID
     */
    public int getMonsterID() {
        return monsterID;
    }

    /**
     * Method: setMonsterID
     *
     * @param monsterID the monsterID to set
     */
    public void setMonsterID(int monsterID) {
        this.monsterID = monsterID;
    }

    /**
     * Method: getMonsterName
     * @return the monsterName
     */
    public String getMonsterName() {
        return monsterName;
    }

    /**
     * Method: setMonsterName
     * @param monsterName the monsterName to set
     */
    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    /**
     * Method: getMonsterDescription
     * @return the monsterDescription
     */
    public String getMonsterDescription() {
        return monsterDescription;
    }

    /**
     * Method: setMonsterDescription
     * @param monsterDescription the monsterDescription to set
     */
    public void setMonsterDescription(String monsterDescription) {
        this.monsterDescription = monsterDescription;
    }

	@Override
	public String toString() {
		return "Monster [monsterID=" + monsterID + ", monsterName=" + monsterName + ", monsterDescription="
				+ monsterDescription + "]";
	}

   

}