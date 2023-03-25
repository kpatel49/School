package model;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import controller.GameException;
import controller.ItemRoom;

public class ItemRoomDB {

	public ItemRoom getItem(int roomID) throws GameException {
		ItemRoom itmRoom = new ItemRoom();
		String sql = "Select Distinct i.itemID, i.itemName, i.Description, "
				+ "r.roomID, r.roomName, r.roomDescription, From Item i, Room r"
				+ "INNER JOIN ItemRoom ir on ir.itemID = i.itemID Where r.roomID = " + roomID + "ORDER BY ir.itemID";
		try {
			SQLiteDB sldb = new SQLiteDB();
			ResultSet set = sldb.queryDB(sql);
			if (set.next()) {
				itmRoom = parseDBData(set);
			} else {
				throw new GameException("No Item's found in room" + roomID);
			}
			sldb.close();
		} catch (ClassNotFoundException | SQLException e) {
			throw new GameException("Problem reading the database");
		}
		return itmRoom;
	}

	public ArrayList<ItemRoom> getAllItems() throws GameException {
		ArrayList<ItemRoom> itemRooms = new ArrayList<ItemRoom>();
		String sql = "SELECT DISTINCT Item.itemID, Item.itemName, Item.itemDescription, "
				+ "Room.roomID, Room.roomName, Room.roomDescription FROM ItemRoom "
				+ "INNER JOIN Room ON ItemRoom.roomID = Room.roomID "
				+ "INNER JOIN Item ON ItemRoom.itemID = Item.itemID";

		try {
			SQLiteDB sldb = new SQLiteDB();
			ResultSet set = sldb.queryDB(sql);
			if (set == null) {
				throw new GameException("No items found");
			}
			while (set.next()) {
				ItemRoom itmRoom = parseDBData(set);
				itemRooms.add(itmRoom);
			}
			sldb.close();

		} catch (ClassNotFoundException | SQLException e) {
			throw new GameException("Unavailable to find the DB");
		}
		return itemRooms;
	}

	private ItemRoom parseDBData(ResultSet set) throws SQLException {
		ItemRoom itmRoom = new ItemRoom();
		itmRoom.setItemID(set.getInt("itemID"));
		itmRoom.setItemName(set.getString("itemName"));
		itmRoom.setItemDescription(set.getString("itemDescription"));
		itmRoom.setRoomID(set.getInt("roomID"));
		itmRoom.setRoomName(set.getString("roomName"));
		itmRoom.setRoomDescription(set.getString("roomDescription"));
		return itmRoom;
	}

}
