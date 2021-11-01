package com.github.therycn.tyleaguedatarest.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.github.therycn.tyleaguedatarest.entity.League;
import com.github.therycn.tyleaguedatarest.graphql.exception.LeagueAlreadyExistsException;
import com.github.therycn.tyleaguedatarest.repository.LeagueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Mutation.
 */
@Service
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {

    private LeagueRepository leagueRepository;

    public League createLeague(LeagueAdd leagueAdd) {
        // Check unicity
        if (leagueRepository.existsByNameAndSeason(leagueAdd.getName(), leagueAdd.getSeason())) {
            throw new LeagueAlreadyExistsException(leagueAdd.getName(), leagueAdd.getSeason());
        }

        League league = League.builder().name(leagueAdd.getName())
                .segment(leagueAdd.getSegment())
                .season(leagueAdd.getSeason())
                .build();
        return leagueRepository.save(league);
    }


}
