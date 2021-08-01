package com.careerit.ipl.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.ipl.dto.PlayerRolCountAndAmountDto;
import com.careerit.ipl.dto.TeamStatDto;
import com.careerit.ipl.dto.service.TeamStatService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class TeamStatController {

	private final TeamStatService teamStatService;

	@GetMapping("/all")
	public List<TeamStatDto> getTeamStats() {
		return teamStatService.getTeamsStats();
	}

	@GetMapping("/playerstat/{label}")
	public PlayerRolCountAndAmountDto getPlayerStats(@PathVariable("label") String label) {
		return teamStatService.getPlayerCountAndAmount(label);
	}
}
