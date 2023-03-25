package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.PuzzleDB;

public class Puzzle {
	private int puzzleID;
	private String puzzleDescription;
	
	
	
	
public Puzzle(int puzzleID, String puzzleDescription) {
	this.puzzleID = puzzleID;
	this.puzzleDescription= puzzleDescription;
	
}
	public Puzzle() {
        PuzzleDB pdb = new PuzzleDB();
        try {
            puzzleID = pdb.getNextPuzzleID();
        } catch (SQLException sqe) {
            System.out.println(sqe.getMessage());
        }
    }

    /**
     * Method: getPuzzle
     * Purpose: Gets a specified puzzle from the puzzle table
     * @param id
     * @return Puzzle
     * @throws SQLException
     */
    public Puzzle getPuzzle(int id) throws SQLException, ClassNotFoundException {
        PuzzleDB pdb = new PuzzleDB();
        return pdb.getPuzzle(id);
    }

    /**
     * Method: getAllPuzzle
     * Purpose: gets all puzzle from the Puzzle table
     * @return ArrayList<Puzzle>
     * @throws SQLException
     */
    public ArrayList<Puzzle> getAllPuzzles() throws SQLException, ClassNotFoundException {
        PuzzleDB pdb = new PuzzleDB();
        return pdb.getAllPuzzle();
    }
    
    

public int getPuzzleID() {
	return puzzleID;
}

/**
 * Method: setPuzzleID
 * @param puzzle the puzzle to set
 */

public void setPuzzleID(int puzzleID) {
	this.puzzleID = puzzleID;
}

/**
 * Method: setPuzzleDescription
 * @return puzzleDescription
 */


public String getPuzzleDescription() {
	return puzzleDescription;
}

/**
 * Method: setPuzzleDescription
 * @param puzzleDescription the puzzleDescrption to set
 */
public void setPuzzleDescription(String puzzleDescription) {
	this.puzzleDescription = puzzleDescription;
}
@Override
public String toString() {
	return "Puzzle [puzzleID=" + puzzleID + ", puzzleDescription=" + puzzleDescription + "]";
}



}