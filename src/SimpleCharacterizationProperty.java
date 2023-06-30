
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "propertyName", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = SimpleSurface.class, name = "Surface"),
})

public class SimpleCharacterizationProperty {

	String propertyName = "";
	String propertyDisplayName = "";

	public String getPropertyName() {
		return propertyName;
	}
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	public String getPropertyDisplayName() {
		return propertyDisplayName;
	}
	public void setPropertyDisplayName(String propertyDisplayName) {
		this.propertyDisplayName = propertyDisplayName;
	}
}