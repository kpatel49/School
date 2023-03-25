package model;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import controller.Puzzle;

public class PuzzleDB {

	public int getNextPuzzleID() throws SQLException {
		SQLiteDB sldb = null;
		try {
			sldb = new SQLiteDB();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		int next = sldb.getMaxValue("puzzleID", "Puzzle") + 1;

		sldb.close();
		return next;
	}

	public Puzzle getPuzzle(int id) throws SQLException, ClassNotFoundException {
		SQLiteDB sldb = new SQLiteDB();
		Puzzle puzzle = new Puzzle();
		String sql = "Select * From Puzzle Where puzzleID = " + id;
		ResultSet set = sldb.queryDB(sql);
		if (set.next()) {
			puzzle.setPuzzleID(set.getInt("puzzleID"));
			puzzle.setPuzzleDescription(set.getString("puzzleDescription"));
		} else {
			throw new SQLException("Puzzle " + id + " not found.");
		}
		sldb.close();
		return puzzle;
	}

	public ArrayList<Puzzle> getAllPuzzle() throws SQLException, ClassNotFoundException {
		ArrayList<Puzzle> puzzles = new ArrayList<Puzzle>();
		SQLiteDB sldb = new SQLiteDB();
		String sql = "Select * From Puzzle";
		ResultSet set = sldb.queryDB(sql);

		while (set.next()) {
			Puzzle puzzle = new Puzzle();
			puzzle.setPuzzleID(set.getInt("puzzleID"));
			puzzle.setPuzzleDescription(set.getString("puzzleDescription"));
			puzzles.add(puzzle);
		}
		sldb.close();
		return puzzles;

	}

}
