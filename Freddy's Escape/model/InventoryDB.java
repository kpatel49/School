package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.GameException;
import controller.Item;

public class InventoryDB {
	
	private SQLiteDB sldb = null;
	
	public void addItemToInventory(int playerID, Item item) throws GameException{
		try {
			sldb = new SQLiteDB();
			String sql = "Insert Into Inventory (playerID, itemID) Valuse(" + playerID + ", " + item.getItemID() + ")";
			sldb.updateDB(sql);
		}
		catch(ClassNotFoundException | SQLException e) {
			throw new GameException("Error adding item " + item.getItemName() + "to players inventory.");
		}
		finally {
			if(sldb != null) {
				try {
					sldb.close();
					sldb = null;
				}
				catch(SQLException e) {
					throw new GameException("Error closing Inventory table.");
				}
			}
		}
	}
	
	public void removeItemFromInventory(Item item) throws GameException{
		try {
			sldb = new SQLiteDB();
			String sql = "Delete From Inventory where itemID = " + item.getItemID();
			sldb.updateDB(sql);
		}
		catch(ClassNotFoundException | SQLException e) {
			throw new GameException("Error removing item " + item.getItemName() + "from the players inventory.");
		}
		finally {
			if(sldb != null) {
				try {
					sldb.close();
					sldb = null;
				}
				catch(SQLException e) {
					throw new GameException("Error closing Inventory table.");
				}
			}
		}
	}
	
	public ArrayList<Item> getInventory(int playerID) throws GameException{
		ArrayList<Item> items = new ArrayList<>();
		try {
			sldb = new SQLiteDB();
			String sql = "Select Distinct i.itemID, i.itemName, i.itemDescription From Item i "
					+ "Inner Join Inventory iy on i.itemID = iy.itemID Where iy.playerId = " + playerID;
			ResultSet set = sldb.queryDB(sql);
			while(set.next()) {
				Item it = new Item();
				it.setItemID(set.getInt("itemID"));
				it.setItemName(set.getString("itemName"));
				it.setItemDescription(set.getString("itemDescription"));
				items.add(it);
			}
		}
		catch(ClassNotFoundException | SQLException e) {
			throw new GameException("Error reading the item room table.");
		}
		finally {
			if(sldb != null) {
				try {
					sldb.close();
					sldb = null;
				}
				catch(SQLException e) {
					throw new GameException("Error closing Inventory table.");
				}
			}
		}
		return items;
	}

}
