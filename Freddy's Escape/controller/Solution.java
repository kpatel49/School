package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.PuzzleDB;
import model.SolutionDB;

public class Solution {
	private Puzzle puzzle;
	private Item item;
		
	
	public Solution() {
		puzzle = new Puzzle();
		item = new Item();
	}


	/**
	 * Method: getPuzzle Purpose: Gets a specified puzzle from the puzzle table
	 * 
	 * @param id
	 * @return Puzzle
	 * @throws SQLException
	 * @throws GameException 
	 */
	public Solution getSolution(int id) throws SQLException, ClassNotFoundException, GameException {
		SolutionDB pdb = new SolutionDB();
		return pdb.getSolution(id);
	}

	/**
	 * Method: getAllPuzzle Purpose: gets all puzzle from the Puzzle table
	 * 
	 * @return ArrayList<Puzzle>
	 * @throws SQLException
	 * @throws GameException
	 */
	public ArrayList<Solution> getAllSolutions() throws SQLException, ClassNotFoundException, GameException {
		SolutionDB pdb = new SolutionDB();
		return pdb.getAllSolutions();
	}

	public int getPuzzleID() {
		return puzzle.getPuzzleID();
	}

	public void setPuzzleID(int puzzleID) {
		this.puzzle.setPuzzleID(puzzleID);;
	}

	public int getItemID() {
		return item.getItemID();
	}

	public void setItemID(int itemID) {
		this.item.setItemID(itemID);;
	}

	public String getPuzzleDescription() {
		return puzzle.getPuzzleDescription();
	}

	public void setPuzzleDescription(String puzzleDescription) {
		this.puzzle.setPuzzleDescription(puzzleDescription);
	}

	public String getItemName() {
		return item.getItemName();
	}

	public void setItemName(String itemName) {
		this.item.setItemName(itemName);;
	}

	public String getItemDescription() {
		return item.getItemDescription();
	}

	public void setItemDescription(String itemDescription) {
		this.item.setItemDescription(itemDescription);
	}

}