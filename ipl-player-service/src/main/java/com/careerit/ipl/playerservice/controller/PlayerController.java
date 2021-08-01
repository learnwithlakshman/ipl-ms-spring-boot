package com.careerit.ipl.playerservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.ipl.playerservice.domain.Player;
import com.careerit.ipl.playerservice.service.PlayerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PlayerController {

	private final PlayerService playerService;

	@PostMapping("/addall")
	public List<Player> addPlayers(@RequestBody List<Player> players) {
		return playerService.addPlayers(players);
	}
	
	@GetMapping("/team/{label}")
	public List<Player> getPlayers(@PathVariable("label") String label) {
		return playerService.getPlayers(label);
	}
}
