package com.careerit.ipl.teamservice.repo;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.careerit.ipl.teamservice.domain.Team;

public interface TeamRepo extends MongoRepository<Team,String> {

	Optional<Team> findByLabel(String label);

}
