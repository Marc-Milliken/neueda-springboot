package uk.ac.belfastmet.constituencies.domain;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembers {

	@JsonProperty("Member")
	private ArrayList<Member> allMembers;
	
	
}
