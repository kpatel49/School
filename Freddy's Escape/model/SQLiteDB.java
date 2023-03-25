package model;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLiteDB extends DB {

	public SQLiteDB() throws SQLException, ClassNotFoundException {
		jdbc = "jdbc:sqlite";
		driverName = "org.sqlite.JDBC";
		Class.forName(driverName);
		sDbUrl = jdbc + ":" + dbName;
		conn = DriverManager.getConnection(sDbUrl);
	}
	
	public SQLiteDB(String dbName) throws SQLException, ClassNotFoundException{
		jdbc = "jdbc:sqlite";
		driverName = "org.sqlite.JDBC";
		Class.forName(driverName);
		sDbUrl = jdbc + ":" + dbName;
		this.dbName = dbName;
		conn = DriverManager.getConnection(sDbUrl);
	}
	
	 public void close() throws SQLException {
	        conn.close();
	    }

}
