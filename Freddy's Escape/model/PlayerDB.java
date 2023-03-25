package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.GameException;
import controller.Player;

public class PlayerDB {
	
	private SQLiteDB sldb = null;
	
	public String getPlayer(int playerID) throws GameException{
		String sql = "Select playerName from Player where playerID = " + playerID;
		ResultSet set = null;
		String name = "";
		try {
			sldb = new SQLiteDB();
			set = sldb.queryDB(sql);
			if(set.next()) {
				name = set.getString("playerName");
				
			}
			else {
				throw new GameException("Player with id " + playerID + "not found");
			} 
		}
		catch(ClassNotFoundException | SQLException e) {
			throw new GameException("Error reading Player table");
		}
		finally {
			if(sldb != null) {
				try {
					sldb.close();
					sldb = null;
				}
				catch(SQLException e) {
					throw new GameException("Error closing Player table.");
				}
			}
		}
		return name;
	}
	
	public int getNextPlayerID() throws SQLException {
		SQLiteDB sldb = null;
		try {
			sldb = new SQLiteDB();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		int next = sldb.getMaxValue("playerID", "Player") + 1;

		sldb.close();
		return next;
	}
	
	public ArrayList<Player> getAllPlayers() throws SQLException, ClassNotFoundException {
		ArrayList<Player> players = new ArrayList<Player>();
		SQLiteDB sldb = new SQLiteDB();
		String sql = "Select * From Player";
		ResultSet set = sldb.queryDB(sql);
		
		while(set.next()) {
			Player player = new Player();
			player.setPlayerID(set.getInt("playerID"));
			player.setName(set.getString("playerName"));
			players.add(player);
		}
		sldb.close();
		return players;
	}

}
