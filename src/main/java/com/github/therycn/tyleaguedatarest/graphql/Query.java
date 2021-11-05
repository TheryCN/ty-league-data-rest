package com.github.therycn.tyleaguedatarest.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.therycn.tyleaguedatarest.entity.League;
import com.github.therycn.tyleaguedatarest.entity.Team;
import com.github.therycn.tyleaguedatarest.repository.LeagueRepository;
import com.github.therycn.tyleaguedatarest.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

	private LeagueRepository leagueRepository;

	private TeamRepository teamRepository;

	public List<League> getLeagues() {
		return leagueRepository.findAll();
	}

	public Optional<League> getLeagueById(long id) {
		return leagueRepository.findById(id);
	}

	public List<Team> getTeams() {
		return teamRepository.findAll();
	}
}
