package com.careerit.ipl.teamservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.careerit.ipl.teamservice.domain.Team;
import com.careerit.ipl.teamservice.repo.TeamRepo;
import com.careerit.ipl.teamservice.service.exception.TeamNotFoundException;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class TeamServiceImpl implements TeamService {

	private final TeamRepo teamRepo;

	public TeamServiceImpl(final TeamRepo teamRepo) {
		this.teamRepo = teamRepo;
	}

	@Override
	public Team addTeam(Team team) {
		Assert.notNull(team, "Team object can't be null or empty");
		log.info("Team with name {} and label {} is going add", team.getName(), team.getLabel());
		team = teamRepo.save(team);
		log.info("Team is added with id :{}", team.getId());
		return team;
	}

	@Override
	public Team getTeam(String label) {
		Assert.hasText(label, "Label can't be empty or null");
		log.info("Looking for team with label :{}", label);
		Optional<Team> optTeam = teamRepo.findByLabel(label);
		Team team = optTeam.orElseThrow(() -> new TeamNotFoundException("Team with label:" + label + " is not found"));
		log.info("Team with label {} is found and team name :{}", label, team.getName());
		return team;
	}

	@Override
	public List<Team> getTeams() {
		List<Team> list = teamRepo.findAll();
		log.info("Total teams found {} in db", list.size());
		return list;
	}

	@Override
	public List<Team> addTeams(List<Team> teams) {
		log.info("Requested add {} teams", teams.size());
		teams = teamRepo.saveAll(teams);
		log.info("Total {} teams are added to the database");
		return teams;
	}

}
