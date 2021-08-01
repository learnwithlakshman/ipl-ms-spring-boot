package com.careerit.ipl.teamservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.ipl.teamservice.domain.Team;
import com.careerit.ipl.teamservice.service.TeamService;

@RestController
@RequestMapping("/api")
public class TeamController {

	private final TeamService teamService;

	public TeamController(TeamService teamService) {
		this.teamService = teamService;
	}

	@PostMapping("/addteams")
	public List<Team> addTeams(@RequestBody List<Team> teams) {

		return teamService.addTeams(teams);
	}

	@PostMapping("/addteam")
	public Team addTeam(@RequestBody Team team) {
		return teamService.addTeam(team);
	}

	@GetMapping("/team/{label}")
	public Team getTeam(@PathVariable("label") String label) {
		return teamService.getTeam(label);
	}

	@GetMapping("/all")
	public List<Team> getTeams() {
		return teamService.getTeams();
	}

}
