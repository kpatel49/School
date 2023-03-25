package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.ItemDB;

public class Item {
 private int itemID;
 private String itemDescription;
 private String itemName;
 
 
 
 
 
 private Item(int itemID,String itemName,String itemDescription) {
	 this.itemID = itemID;
	 this.itemName = itemName;
 }

 public Item() {
     ItemDB idb = new ItemDB();
     try {
         itemID = idb.getNextItemID();
     } catch (SQLException sqe) {
         System.out.println(sqe.getMessage());
     }
 }

 /**
  * Method: getItem
  * Purpose: Gets a specified item from the item table
  * @param id
  * @return Item
  * @throws SQLException
  */
 public Item getItem(int id) throws SQLException, ClassNotFoundException {
     ItemDB idb = new ItemDB();
     return idb.getItem(id);
 }

 /**
  * Method: getAllItems
  * Purpose: gets all items from the item table
  * @return ArrayList<Item>
  * @throws SQLException
  */
 public ArrayList<Item> getAllItems() throws SQLException, ClassNotFoundException {
     ItemDB idb = new ItemDB();
     return idb.getAllItems();
 }

 
 /**
  * Method: getItemID
  * @return the itemD
  */
 
public int getItemID() {
	return itemID;
}

/**
 * Method: setItemID
 * @param item the item to set
 */

public void setItemID(int itemID) {
	this.itemID = itemID;
}

/**
 * Method: getItemDescription
 * @return the itemDescription
 */
public String getItemDescription() {
	return itemDescription;
}

/**
 * Method: setItemDescritption
 * @param itemDescription the itemDescription to set
 */

public void setItemDescription(String itemDescription) {
	this.itemDescription = itemDescription;
}

/**
 * Method: getItemName
 * @return the itemName
 */
public String getItemName() {
	return itemName;
}

/**
 * Method: setItemName
 * @param item the item to set
 */
public void setItemName(String itemName) {
	this.itemName = itemName;
}


@Override
public String toString() {
	return "Item [itemID=" + itemID + ", itemDescription=" + itemDescription + ", itemName=" + itemName + "]";
}

public String display() {
	return itemName + ": " + itemDescription;
}
 
 
 
}