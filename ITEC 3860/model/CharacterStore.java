package model;

import java.util.ArrayList;

import controller.GameCharacter;
import controller.GameDataException;

public class CharacterStore {
	
	private ArrayList<GameCharacter> characters;
	private static CharacterStore inst = null;
	
	private CharacterStore() {
		characters = new ArrayList<GameCharacter>();
	}
	
	public static CharacterStore getInstance() {
		if(inst == null) {
			inst = new CharacterStore();
		}
		return inst;
	}
	
	public void addCharacter(GameCharacter gc) throws GameDataException{
		
		checkUnique(gc.getName());
		characters.add(gc);
	}
	
	public void checkUnique(String name) throws GameDataException{
		for(GameCharacter gc : characters) {
			if(name.equalsIgnoreCase(gc.getName())) {
				throw new GameDataException(name + "already exists") ;
			}
		}
	}
	
	/*
	 * method: to find a character in the store.
	 * 
	 * */
	public GameCharacter findCharacter(String name) throws GameDataException{
		for(GameCharacter gc: characters){
			if(name.equalsIgnoreCase(gc.getName())) {
				return gc;
			}
		}
		
		throw new GameDataException(name + " not found");
	}
	
	/*
	 * method: getCharacters
	 * this method will allow to retrieve all character from the store.
	 * this method will return ArrayList<GameCharacter>
	 * */
	
	public ArrayList<GameCharacter> getCharacters(){
		return characters;
	}
	

}
