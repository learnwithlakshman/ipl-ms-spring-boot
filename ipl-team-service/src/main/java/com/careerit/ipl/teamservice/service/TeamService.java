package com.careerit.ipl.teamservice.service;

import java.util.List;

import com.careerit.ipl.teamservice.domain.Team;

public interface TeamService {

			public Team addTeam(Team team);
			public Team getTeam(String label);
			public List<Team> getTeams();
			public List<Team> addTeams(List<Team> team);
}
