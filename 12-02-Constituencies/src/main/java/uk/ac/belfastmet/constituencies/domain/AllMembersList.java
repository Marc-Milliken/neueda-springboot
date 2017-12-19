package uk.ac.belfastmet.constituencies.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembersList {

	@JsonProperty("Member")
	private Member member; 
	
}
