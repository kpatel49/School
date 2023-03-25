package controller;

import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.InputMismatchException;
import java.util.List;

import model.ExitDB;

public class Exit {
	private int ExitID;
	private int roomID;
	private String direction;
	private int destination;
	private final List<String> DIRECTIONS = Arrays.asList(new String [] {"North", "East", "South","West"});
	
	
	

	 public Exit() {
	     ExitDB idb = new ExitDB();
	     try {
	         ExitID = idb.getNextExitID();
	     } catch (SQLException sqe) {
	         System.out.println(sqe.getMessage());
	     }
	 }

	
	 public ArrayList<Exit> getExit(int id) throws SQLException, ClassNotFoundException {
	     ExitDB edb = new ExitDB();
	     return edb.getExits(id);
	 }

	 
	public int getExitID() {
        return ExitID;
    }

    public void setExitID(int exitID) {
        this.ExitID = exitID;
    }
	
	public int getRoomID() {
		return roomID;
	}
	
	
	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}
	
	
	public String getDirection() {
		return direction;
	}
	
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public int getDestination() {
		return destination;
	}
	public void setDestination(int destination) {
		this.destination = destination;
	}


	@Override
	public String toString() {
		return "Exit [direction=" + direction + ", destination=" + destination + "]";
	}
	
	
	/**
	 * build exit
	 * gameexception for invalid direction commands
	 */
	
	public void buildExit(String exit) throws GameException{
		String[] section = exit.split("");
		if(!DIRECTIONS.contains(section[0].toUpperCase().trim())) {
			throw new GameException(section[0] + "is not a valid direction ");
		}
		
		direction = section[0];
		try {
			destination = Integer.parseInt(section[1].trim());
		}
		catch(InputMismatchException mis) {
			throw new GameException(section[1] + "is not a valid room ID");
		}
	}
		
	}
