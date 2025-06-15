package gameObjects;

public class Item extends Entity {
	private boolean hasFunction;
	
	public Item(String itemName, String itemDesc, boolean hasUse) {
		super(itemName, itemDesc);
		this.hasFunction = hasUse;
	}

	/**
	 * @return hasFunction describes whether item has a function
	 */
	public boolean isHasFunction() {
		return hasFunction;
	}

	/**
	 * @param hasFunction the hasFunction to set
	 */
	public void setHasFunction(boolean hasFunction) {
		this.hasFunction = hasFunction;
	}
	
}
