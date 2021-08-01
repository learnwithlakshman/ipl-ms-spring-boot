package com.careerit.ipl.playerservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.careerit.ipl.playerservice.domain.Player;
import com.careerit.ipl.playerservice.repo.PlayerRepo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class PlayerServiceImpl implements PlayerService {

	private final PlayerRepo playerRepo;

	@Override
	public List<Player> addPlayers(List<Player> players) {
		log.info("Players list contains :{} players ", players.size());
		players = playerRepo.saveAll(players);
		log.info("Total {} players are added", players.size());
		return players;
	}

	@Override
	public List<Player> getPlayers(String label) {

		log.info("Looking for player of the :{}", label);
		List<Player> list = playerRepo.findByLabel(label);
		log.info("The team with label {} has {} players", label, list.size());
		return list;
	}

}
