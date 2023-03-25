package controller;

import java.util.ArrayList;

import model.CharacterStore;

public class GameCharacter {

	private String name;
	private String type;
	private int hp;
	private int ac;

	private static CharacterStore cs; // remember this cs is static. this is to 
	// share 

	// create a constructor
	public GameCharacter() {
		if (cs == null) {
			cs = CharacterStore.getInstance();
		}
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) throws GameDataException{
		if(name.length() < 4) {
			throw new GameDataException("Name must be at least 4 characters");
		}
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) throws GameDataException {
		// Fighter, Wizard, Warrior, Cleric

		switch (type.toUpperCase()) {
		default:
			throw new GameDataException("Unknown Type. Type must be " + "Fighter, Wizard, Warrior, or Cleric");
		case "FIGHTER", "WIZARD", "WARRIOR", "CLERIC":
			break;
		}
		this.type = type;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) throws GameDataException {
		if (hp < 0 || hp > 100) {
			throw new GameDataException("Hit points most be between 0 and 100 inclusively.");
		}
		this.hp = hp;
	}

	public int getAc() {
		return ac;
	}

	public void setAc(int ac) throws GameDataException {
		if (ac < 0 || ac > 10) {
			throw new GameDataException("Armor class must be between 0 and 10 inclusively.");
		}
		this.ac = ac;
	}
	
/**
 * method to save the object and this method will call CharacterStore
 * this method will throw GameDataException 
 */
	public void save() throws GameDataException{
		cs.addCharacter(this);
		
	}
	
/**
 * this method is going to return all of characters in the CharaacterStore.
 * this will return String of all characters.
 * */

	public String getAll() {
		StringBuffer sb = new StringBuffer();
		/**
		 * StringBuffer is .. we can call it as a thread safe.
		 * This means that two threads cannot call the method of StringBuffer at the same time.
		 * */
		
		ArrayList<GameCharacter> characters = cs.getCharacters();
		
		for(GameCharacter gc: characters) {
			sb.append(gc.toString() + '\n');
		}
		return sb.toString();
	}
	
	@Override
	public String toString() {
		return name + '\t' + type + '\t' + hp + '\t' + ac;
		
	}
}
