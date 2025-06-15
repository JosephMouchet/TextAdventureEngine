package gameObjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Cell extends Entity {
	@JsonProperty("N")
	private int north;
	@JsonProperty("E")
	private int east;
	@JsonProperty("S")
	private int south;
	@JsonProperty("w")
	private int west;
	
	
	public Cell(@JsonProperty("name")String name,
				@JsonProperty("description") String description,
				@JsonProperty("N") int N,
				@JsonProperty("E") int E,
				@JsonProperty("S") int S,
				@JsonProperty("W") int W) {
		super(name, description);
		this.north = N;
		this.east = E;
		this.south = S;
		this.west = W;
	}
	

	public int getNorth() {
		return north;
	}

	public void setNorth(int north) {
		this.north = north;
	}

	public int getEast() {
		return east;
	}

	public void setEast(int east) {
		this.east = east;
	}

	public int getSouth() {
		return south;
	}

	public void setSouth(int south) {
		this.south = south;
	}

	public int getWest() {
		return west;
	}

	public void setWest(int west) {
		this.west = west;
	}

	@Override
	public String toString() {
		return "Cell [north=" + north + ", east=" + east + ", south=" + south + ", west=" + west + ", name=" + name
				+ ", description=" + description + "]";
	}
	
	
}
