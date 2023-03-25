package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.GameException;
import controller.Item;

public class ItemDB {

	public int getNextItemID() throws SQLException {
		SQLiteDB sldb = null;
		try {
			sldb = new SQLiteDB();
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		int next = sldb.getMaxValue("itemID", "item") + 1;

		sldb.close();
		return next;
	}
	
	public Item getItem(int id) throws SQLException, ClassNotFoundException{
		SQLiteDB sldb = new SQLiteDB();
		Item item = new Item();
		String sql = "Select * From Item Where itemID = " + id;
		ResultSet set = sldb.queryDB(sql);
		if(set.next()) {
			item.setItemID(set.getInt("itemID"));
			item.setItemName(set.getString("itemName"));
			item.setItemDescription(set.getString("itemDescription"));
		}
		else {
			throw new SQLException("Item " + id + " not found.");
		}
		sldb.close();
		return item;
	}
	
	public ArrayList<Item> getAllItems() throws SQLException, ClassNotFoundException{
		ArrayList<Item> items = new ArrayList<Item>();
		SQLiteDB sldb = new SQLiteDB();
		String sql = "Select * From Item";
		
		ResultSet set = sldb.queryDB(sql);
		
		while(set.next()) {
			Item item = new Item();
			item.setItemID(set.getInt("itemID"));
			item.setItemName(set.getString("itemName"));
			item.setItemDescription(set.getString("itemDescription"));
			items.add(item);			
		}
		sldb.close();
		return items;
	}
	
	protected ArrayList<Item> getRoomItems(int roomID) throws GameException{
		ArrayList<Item> items = new ArrayList<>();
		SQLiteDB sldb = null;
		try {
			sldb = new SQLiteDB();
			String sql = "Select Distinct i.itemID, i.itemName, i.itemDescription From Item i " 
					+ "Inner Join ItemRoom ir on i.itemID = ir.itemID Where ir.roomNumber = " + roomID;

			ResultSet set = sldb.queryDB(sql);
			
			while(set.next()) {
				Item item = new Item();
				item.setItemID(set.getInt("itemID"));
				item.setItemName(set.getString("itemName"));
				item.setItemDescription(set.getString("itemDescription"));
				items.add(item);	
			}
		}
		catch(SQLException | ClassNotFoundException e) {
			throw new GameException("Error reading the item room table.");
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
		return items;
	}

}
