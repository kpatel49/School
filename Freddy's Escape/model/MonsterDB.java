package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import controller.Monster;

public class MonsterDB {

	public int getNextMonsterID() throws SQLException {
		SQLiteDB sldb = null;
		try {
			sldb = new SQLiteDB();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		int next = sldb.getMaxValue("monsterID", "Monster") + 1;

		sldb.close();
		return next;
	}

	public Monster getMonster(int id) throws SQLException, ClassNotFoundException {
		SQLiteDB sldb = new SQLiteDB();
		Monster monster = new Monster();
		String sql = "Select * from Monster WHERE monsterID = " + id;
		ResultSet set = sldb.queryDB(sql);
		if (set.next()) {
			monster.setMonsterID(set.getInt("monsterID"));
			monster.setMonsterName(set.getString("monsterName"));
			monster.setMonsterDescription(set.getString("monsterDescription"));
		} else {
			throw new SQLException("Monster " + id + " not found.");
		}
		sldb.close();
		return monster;
	}
	
	  public ArrayList<Monster> getAllMonsters() throws SQLException, ClassNotFoundException {
	        ArrayList<Monster> monsters = new ArrayList<Monster>();
	        SQLiteDB sldb = new SQLiteDB();
	        String str = "Select * from Monster";

	        ResultSet set = sldb.queryDB(str);

	        while (set.next()) {
	            Monster monster = new Monster();
	            monster.setMonsterID(set.getInt("monsterID"));
	            monster.setMonsterName(set.getString("monsterName"));
	            monster.setMonsterDescription(set.getString("monsterDescription"));     
	            monsters.add(monster);
	        }
	        
	        sldb.close();
	        return monsters;
	  }

}
