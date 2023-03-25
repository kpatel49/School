package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import controller.GameException;
import controller.Solution;

public class SolutionDB {
	
	public Solution getSolution(int puzzleID) throws GameException {
		Solution sol = new Solution();
		String sql = "Select Distinct p.puzzleID, p.puzzleDescription, "
				+ "i.itemID, i.itemName, i.Description, From Puzzle p, Item i"
				+ "INNER JOIN Solution sol on sol.itemID = i.itemID Where p.puzzleID = " + puzzleID + "ORDER BY sol.itemID";
		try {
			SQLiteDB sldb = new SQLiteDB();
			ResultSet set = sldb.queryDB(sql);
			if (set.next()) {
				sol = parseDBData(set);
			} else {
				throw new GameException("Solution not found" + puzzleID);
			}
			sldb.close();
		} catch (ClassNotFoundException | SQLException e) {
			throw new GameException("Problem reading the database");
		}
		return sol;
	}

	public ArrayList<Solution> getAllSolutions() throws GameException {
		ArrayList<Solution> solutions = new ArrayList<Solution>();
		String sql = "SELECT DISTINCT Puzzle.puzzleID, Puzzle.puzzleDescription, "
				+ "Item.itemID, Item.itemName, Item.itemDescription FROM Solution "
				+ "INNER JOIN Puzzle ON Solution.puzzleID = Puzzle.puzzleID "
				+ "INNER JOIN Item ON Solution.itemID = Item.itemID";

		try {
			SQLiteDB sldb = new SQLiteDB();
			ResultSet set = sldb.queryDB(sql);
			if (set == null) {
				throw new GameException("No solution found");
			}
			while (set.next()) {
				Solution solution = parseDBData(set);
				solutions.add(solution);
			}
			sldb.close();

		} catch (ClassNotFoundException | SQLException e) {
			throw new GameException("Unavailable to find the DB");
		}
		return solutions;
	}

	private Solution parseDBData(ResultSet set) throws SQLException {
		Solution sol = new Solution();
		sol.setPuzzleID(set.getInt("puzzleID"));
		sol.setPuzzleDescription(set.getString("puzzleDescription"));
		sol.setItemID(set.getInt("itemID"));
		sol.setItemName(set.getString("itemName"));
		sol.setItemDescription(set.getString("itemDescription"));
		return sol;
	}

}
