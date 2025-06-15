package gameObjects;

public class Actor extends Entity {
	private int CurrentCell;
	
	public Actor(String name, String description, Cell aCell) {
		super(name, description);
		this.cell = aCell;
		
	}
}
