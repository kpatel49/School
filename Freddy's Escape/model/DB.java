package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Class: DB
 * @author Kush Patel
 * @version: 1.0
 * Course: ITEC 3860
 * This class updates the database
 */

public abstract class DB {
	protected String dbName = "Game.db";
	protected String driverName;
	protected String sDbUrl;
	protected String jdbc;
	protected Connection conn;
	protected int wait = 5;
	
	
	
	/**
	 * Method: updateDB
	 * Purpose: updates the database
	 * @param SQLite
	 * @throws SQLException
	 */
	public boolean updateDB(String SQL) throws SQLException{
		Statement stat = conn.createStatement();
		boolean success = stat.execute(SQL);
		return success;
	} 
	
	/**
	 * Method: queryDB
	 * Purpose: read data from the database
	 * @param SQLite
	 * @throws SQLException
	 */
	public ResultSet queryDB(String SQL) throws SQLException{
		ResultSet set = null;
		Statement stat = conn.createStatement();
		stat.setQueryTimeout(wait);
		set = stat.executeQuery(SQL);
		return set;
	}
	
    /**
     * Method: count
     * Purpose: Gets the count of records from a table
     * @param table     
     */
	public int count(String table) {
		int count = 0;
		try {
			Statement stat = conn.createStatement();
			String sql = "Select count(*) as count from\"" + table + "\"";
			ResultSet set = stat.executeQuery(sql);
			count = set.getInt(1);
		}
		catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return count;
	}
	
	public int getMaxValue(String columnName, String table) {
		int max = 0;
		try {
			Statement stat = conn.createStatement();
			String str = "Select MAX(" + columnName + ") from " + table;
			ResultSet set= stat.executeQuery(str);
			max = set.getInt(1);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		return max;
	}
	
	
	/** 
	 * Method: close
	 * Purpose: closes the connection to the database
	 * @throws SQLException
	 */
	public void close() throws SQLException{
		conn.close();
	}
	
}
