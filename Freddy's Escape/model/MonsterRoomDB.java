package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import controller.GameException;
import controller.MonsterRoom;

public class MonsterRoomDB {

	public MonsterRoom getMonster(int roomID) throws GameException {
		MonsterRoom monRoom = new MonsterRoom();
		String sql = "SELECT DISTINCT m.monsterID, m.monsterName, m.monsterDescription, "
				+ "r.roomID, r.roomName, r.roomDescription, FROM Monster m, Room r"
				+ "INNER JOIN MonsterRoom mr on mr.monsterID = m.monsterID where r.roomID = " + roomID
				+ "ORDER BY mr.monsterID";
		try {
			SQLiteDB sldb = new SQLiteDB();
			ResultSet set = sldb.queryDB(sql);
			if (set.next()) {
				monRoom = parseDBData(set);
			} else {
				throw new GameException("No monster's found in room" + roomID);
			}
			sldb.close();
		} catch (ClassNotFoundException | SQLException e) {
			throw new GameException("Problem reading the database");
		}
		return monRoom;
	}

	public ArrayList<MonsterRoom> getAllMonsters() throws GameException {
		ArrayList<MonsterRoom> monsterRooms = new ArrayList<MonsterRoom>();
		String sql = "SELECT DISTINCT Monster.monsterID, Monster.monsterName, Monster.monsterDescription, "
				+ "Room.roomID, Room.roomName, Room.roomDescription FROM MonsterRoom "
				+ "INNER JOIN Room ON MonsterRoom.roomID = Room.roomID "
				+ "INNER JOIN Monster ON MonsterRoom.monsterID = Monster.monsterID";

		try {
			SQLiteDB sldb = new SQLiteDB();
			ResultSet set = sldb.queryDB(sql);
			if (set == null) {
				throw new GameException("No monsters found");
			}
			while (set.next()) {
				MonsterRoom monRoom = parseDBData(set);
				monsterRooms.add(monRoom);
			}
			sldb.close();

		} catch (ClassNotFoundException | SQLException e) {
			throw new GameException("Unavailable to find the DB");
		}
		return monsterRooms;
	}

	private MonsterRoom parseDBData(ResultSet set) throws SQLException {
		MonsterRoom monRoom = new MonsterRoom();
		monRoom.setMonsterID(set.getInt("monsterID"));
		monRoom.setMonsterName(set.getString("monsterName"));
		monRoom.setMonsterDescription(set.getString("monsterDescription"));
		monRoom.setRoomID(set.getInt("roomID"));
		monRoom.setRoomName(set.getString("roomName"));
		monRoom.setRoomDescription(set.getString("roomDescription"));
		return monRoom;
	}

}
