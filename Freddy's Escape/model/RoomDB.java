package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.GameException;
import controller.Item;
import controller.Room;

public class RoomDB {
	
	public int getNextRoomID() throws SQLException{
		SQLiteDB sldb = null;
		try {
			sldb = new SQLiteDB();
		}
		catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		int next = sldb.getMaxValue("roomID", "room") + 1;
		
		sldb.close();
		
		return next;
	}
	
	public Room getRoom(int id) throws SQLException, ClassNotFoundException{
		SQLiteDB sldb = new SQLiteDB();
		Room room =new Room();
		String str = "Select * from Room WHERE roomID = " + id;
		ResultSet set = sldb.queryDB(str);
		if(set.next()) {
			System.out.println(set.getInt("roomID"));
			room.setRoomID(set.getInt("roomID"));
			room.setRoomName(set.getString("roomName"));
			room.setRoomDescription(set.getString("roomDescription"));
			room.setHealOrDamage(set.getInt("healOrdamage"));
			boolean visit = (set.getInt("visited") == 1) ? true : false;
			room.setVisited(visit);
			ExitDB edb = new ExitDB();
			room.setExits(edb.getExits(id));
		}
		else {
			throw new SQLException("Room " + id + "not found");
		}
		sldb.close();
		return room;
	}
	
	public ArrayList<Room> getAllRooms() throws SQLException, ClassNotFoundException{
		ArrayList<Room> rooms = new ArrayList<Room>();
		SQLiteDB sldb = new SQLiteDB();
		String str = "Select * from Room";
		
		ResultSet set = sldb.queryDB(str);
		
		while(set.next()) {
			Room room = new Room();
			room.setRoomID(set.getInt("roomID"));
			room.setRoomName(set.getString("roomName"));
			room.setRoomDescription(set.getString("roomDescription"));
			room.setHealOrDamage(set.getInt("healOrdamage"));
			boolean visit = (set.getInt("visited") == 1) ? true : false;
			room.setVisited(visit);
			ExitDB edb = new ExitDB();
			room.setExits(edb.getExits(room.getRoomID()));
			rooms.add(room);
		}
		sldb.close();
		return rooms;
		
	}
	
	public Item getItems(int roomID) throws GameException, ClassNotFoundException, SQLException{
		ItemDB it = new ItemDB();
		Item roomItems = it.getItem(roomID);
		return roomItems;
	}
	
	public String getMap() throws GameException{
		String map = "Rooms\n";
		SQLiteDB sldb = null;
		try {
			sldb = new SQLiteDB();
			String sql = "Select * from Room ORDER BY roomID";
			ResultSet set = sldb.queryDB(sql);
			while(set.next()) {
				Room room = new Room();
				room.setRoomID(set.getInt("roomID"));
				room.setRoomName(set.getString("roomName"));
				room.setRoomDescription(set.getString("roomDescription"));
				room.setHealOrDamage(set.getInt("healOrdamage"));
				boolean visit = (set.getInt("visited") == 1) ? true : false;
				room.setVisited(visit);
				ExitDB edb = new ExitDB();
				room.setExits(edb.getExits(room.getRoomID()));
				map += room.display() + "\n\n";
			}
		}
		catch(SQLException | ClassNotFoundException e) {
			throw new GameException("Error reading Rooms.");
		}
		return map;
	}
	
	
	public void updateRoom(Room room) throws GameException{
		SQLiteDB sldb = null;
		try {
			int visit = (room.Visited() ? 1 : 0);
			sldb = new SQLiteDB();
			String sql = "UPDATE room SET roomID = " + room.getRoomID() + ", roomName = " + room.getRoomName()
			+ ", roomDescription = " + room.getRoomDescription() + ", visted = " + visit + " WHERE roomID = " + room.getRoomID();
			sldb.updateDB(sql);
		}
		catch(SQLException | ClassNotFoundException e) {
			throw new GameException("Room not found for id " + room.getRoomID());
		}
		finally {
			if(sldb != null) {
				try {
					sldb.close();
				}
				catch(SQLException e) {					
				}
			}
		}
	}

}
