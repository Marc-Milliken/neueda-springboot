package uk.ac.belfastmet.constituencies.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class AllMembers {

	@JsonProperty("AllMembersList")
	AllMembersList allMembersList;

}
