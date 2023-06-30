

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("Surface")
public class SimpleSurface extends SimpleCharacterizationProperty {
	String isHydrophobic;  //user doesn't have to choose yes/no. could be empty
	
	List<String> isHydrophobicOptions = new ArrayList<String>();

	public String getIsHydrophobic() {
		return isHydrophobic;
	}

	public void setIsHydrophobic(String isHydrophobic) {
		this.isHydrophobic = isHydrophobic;
	}

	public List<String> getIsHydrophobicOptions() {
		return isHydrophobicOptions;
	}

	public void setIsHydrophobicOptions(List<String> isHydrophobicOptions) {
		this.isHydrophobicOptions = isHydrophobicOptions;
	}

}
