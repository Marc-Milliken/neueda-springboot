package uk.ac.belfastmet.nir.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class StationBoard {
	
	@JsonProperty("@name")
	private String stationName;
	@JsonProperty("@Timestamp")
	@JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	private Date timeStamp;
	@JsonProperty("Service")
	private ArrayList<HashMap<String, Object>> service;

}
