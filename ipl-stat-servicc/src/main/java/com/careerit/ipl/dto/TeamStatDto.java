package com.careerit.ipl.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TeamStatDto {

	private String teamName;
	private String coachName;
	private int playerCount;
	private double totalAmount;
}
