package com.careerit.ipl.dto.service;

import java.util.List;

import com.careerit.ipl.dto.PlayerRolCountAndAmountDto;
import com.careerit.ipl.dto.TeamStatDto;

public interface TeamStatService {

	public List<TeamStatDto> getTeamsStats();

	public PlayerRolCountAndAmountDto getPlayerCountAndAmount(String label);
}
