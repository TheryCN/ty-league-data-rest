package com.github.therycn.tyleaguedatarest.graphql;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.github.therycn.tyleaguedatarest.entity.League;
import com.github.therycn.tyleaguedatarest.entity.Team;
import com.github.therycn.tyleaguedatarest.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class LeagueResolver implements GraphQLResolver<League> {

    private TeamRepository teamRepository;

    public Set<Team> getTeams(League league) {
        return teamRepository.findByLeague(league);
    }
}
