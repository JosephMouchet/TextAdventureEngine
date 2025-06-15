package gameEngine;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import gameObjects.Cell;
import gameObjects.Entity;
import gameObjects.Actor;
import global.Directions;


@SuppressWarnings("unused")
public class Game {
	private static  ArrayList <Cell> roomList = new ArrayList<Cell>();
	private Actor player;
	private Map<Integer, Cell> gameMap; 
		//creates list of rooms in intermediary arraylist to later be placed into hashmap
		public static void createRoomList() {
			File roomJson = new File("C:\\Room.JSON");
			ObjectMapper roomMaker = new ObjectMapper();
			//instantiates objects to list, places objects from list into arraylist
			try {
				List<Entity> cells = roomMaker.readValue(roomJson, new TypeReference<List<Entity>>(){});
				for (Entity entity : cells) {
					if (entity instanceof Cell) {
						Cell cell = (Cell) entity;
						roomList.add(cell);
					}
				}
		//catches exception thrown when attempting to create objects from json		
		}catch (IOException e) {
			System.err.println("Error deserializing JSON file: " + e.getMessage());
			e.printStackTrace();
		}
			//test block; prints contents of each room objects
		for (int i = 0; i < roomList.size(); i++) {
			System.out.println(roomList.get(i).toString());
		}
	}
}
		
		
		
	

	

		
			
	
	
