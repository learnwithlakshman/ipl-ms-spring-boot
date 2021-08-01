package com.careerit.ipl.playerservice.service;

import java.util.List;

import com.careerit.ipl.playerservice.domain.Player;

public interface PlayerService {

	public List<Player> addPlayers(List<Player> players);

	public List<Player> getPlayers(String label);
}
