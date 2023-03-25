package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import controller.Exit;

public class ExitDB {

	public int getNextExitID() throws SQLException {
		SQLiteDB sldb = null;
		try {
			sldb = new SQLiteDB();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		int next = sldb.getMaxValue("exitID", "exit") + 1;

		sldb.close();
		return next;
	}

	public ArrayList<Exit> getExits(int roomID) throws SQLException, ClassNotFoundException {
		ArrayList<Exit> exits = new ArrayList<Exit>();
		SQLiteDB sldb = new SQLiteDB();
		String sql = "Select Distinct * From Exit Where exitID = " + roomID;

		ResultSet set = sldb.queryDB(sql);

		while (set.next()) {
			Exit exit = new Exit();
			exit.setRoomID(set.getInt("roomID"));
			exit.setDirection(set.getString("exitDirection"));
			exit.setDestination(set.getInt("exitDestination"));
			exits.add(exit);
		}
		sldb.close();
		return exits;
	}

}
