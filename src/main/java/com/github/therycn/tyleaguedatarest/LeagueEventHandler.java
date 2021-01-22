package com.github.therycn.tyleaguedatarest;

import com.github.therycn.tyleaguedatarest.entity.League;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

/**
 * LeagueEventHandler.
 */
@RepositoryEventHandler
public class LeagueEventHandler {

    @HandleBeforeCreate
    public void handleBeforeCreateLeague(League league) {
        league.init();
    }

}
