package com.careerit.ipl.playerservice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.careerit.ipl.playerservice.domain.Player;

public interface PlayerRepo extends MongoRepository<Player,String> {

	List<Player> findByLabel(String label);

}
