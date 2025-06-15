package gameObjects;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonTypeInfo(
		use = JsonTypeInfo.Id.NAME,
		include = JsonTypeInfo.As.PROPERTY,
		property = "type"
		)
@JsonSubTypes({
	@JsonSubTypes.Type(value = Cell.class, name = "room"),
	@JsonSubTypes.Type(value = Actor.class, name = "character"),
	@JsonSubTypes.Type(value = Item.class, name = "item")
})
public abstract class Entity {
	@JsonProperty("name")
	protected String name;
	@JsonProperty("description")
	protected String description;

	public Entity( String entityName, String entityDesc) {
		this.name = entityName;
		this.description = entityDesc;
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
	
	
}


