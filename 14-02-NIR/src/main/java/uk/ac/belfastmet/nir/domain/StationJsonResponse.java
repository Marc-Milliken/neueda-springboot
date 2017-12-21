package uk.ac.belfastmet.nir.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class StationJsonResponse {

	@JsonProperty("StationBoard")
	private StationBoard stationBoard;
	
	
}
