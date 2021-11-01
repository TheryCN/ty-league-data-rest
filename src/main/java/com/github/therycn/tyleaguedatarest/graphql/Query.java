package com.github.therycn.tyleaguedatarest.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.github.therycn.tyleaguedatarest.entity.League;
import com.github.therycn.tyleaguedatarest.repository.LeagueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class Query implements GraphQLQueryResolver {

    private LeagueRepository leagueRepository;

    public List<League> getLeagues() {
        return leagueRepository.findAll();
    }
}
