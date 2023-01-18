package tech.tresearchgroup.schemas.mediainfo;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaInfoOutput{

	@SerializedName("creatingLibrary")
	private CreatingLibrary creatingLibrary;

	@SerializedName("media")
	private Media media;
}