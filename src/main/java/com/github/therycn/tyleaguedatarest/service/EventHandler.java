package com.github.therycn.tyleaguedatarest.service;

import com.github.therycn.tyleaguedatarest.entity.League;
import com.github.therycn.tyleaguedatarest.entity.Team;
import com.github.therycn.tyleaguedatarest.event.LeagueStartEvent;
import com.github.therycn.tyleaguedatarest.repository.TeamRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
@Slf4j
public class EventHandler {

    private final TeamRepository teamRepository;

    @EventListener
    public void handle(LeagueStartEvent leagueStartEvent) {
        League league = leagueStartEvent.getLeague();
        log.info("League {} will be initialized on {}", league.getName(), leagueStartEvent.getDate());

        Stream.of(new Team("Vitality", "France", league),
                new Team("G2", "Spain", league)).forEach(teamRepository::save);

    }
}
