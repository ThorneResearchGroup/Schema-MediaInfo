package tech.tresearchgroup.schemas.mediainfo;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Media{

	@SerializedName("track")
	private List<TrackItem> track;

	@SerializedName("@ref")
	private String ref;
}