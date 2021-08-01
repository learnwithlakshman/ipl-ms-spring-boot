package com.careerit.ipl.dto.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.careerit.ipl.domain.Player;
import com.careerit.ipl.domain.Team;
import com.careerit.ipl.dto.PlayerRolCountAndAmountDto;
import com.careerit.ipl.dto.TeamStatDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@RequiredArgsConstructor
public class TeamStatServiceImpl implements TeamStatService {

	private final RestTemplate restTemplate;
	
	private String TEAM_API = "http://TEAM-SERVICE/teams/api/all";
	private String PLAYER_API = "http://PLAYER-SERVICE/players/api/team/";

	@Override
	public List<TeamStatDto> getTeamsStats() {
		ResponseEntity<List<Team>> teamResponse = restTemplate.exchange(TEAM_API,
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Team>>() {
				});
		List<Team> teams = teamResponse.getBody();
		List<TeamStatDto> teamStatList = new ArrayList<TeamStatDto>();
		for (Team team : teams) {
			log.info("Looking for player of {}", team.getLabel());
			ResponseEntity<List<Player>> playerResponse = restTemplate.exchange(
					PLAYER_API + team.getLabel(), HttpMethod.GET, null,
					new ParameterizedTypeReference<List<Player>>() {
					});
			List<Player> players = playerResponse.getBody();

			double totalAmount = players.stream().mapToDouble(player -> player.getAmount()).sum();
			log.info("The team {} has total {} players and total amount is :{}", team.getLabel(), players.size(),
					totalAmount);
			TeamStatDto teamStatDto = TeamStatDto.builder().teamName(team.getName()).coachName(team.getCoach())
					.playerCount(players.size()).totalAmount(totalAmount).build();
			teamStatList.add(teamStatDto);
		}

		return teamStatList;
	}

	@Override
	public PlayerRolCountAndAmountDto getPlayerCountAndAmount(String label) {
		// TODO Auto-generated method stub
		return null;
	}

}
