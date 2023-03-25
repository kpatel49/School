/*
 * Class: Room
 * @author Kush Patel
 * @version 1.0
 * Course: ITEC 3860 Spring 2022
 * Written: 2/4/2022
 * 
 * This class - initializes the room object.
 * 
 * 
 * */

package MiniGame1;

public class Room {

	private String id;
	private String name;
	private String description;

	public Room(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "id=" + id + " name=" + name + "\n" + description;
	}

}
