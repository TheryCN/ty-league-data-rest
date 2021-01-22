package com.github.therycn.tyleaguedatarest;

import com.github.therycn.tyleaguedatarest.entity.League;
import com.github.therycn.tyleaguedatarest.event.LogEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.data.rest.core.annotation.HandleBeforeCreate;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

import java.util.Date;

/**
 * LeagueEventHandler.
 */
@RepositoryEventHandler
@RequiredArgsConstructor
public class LeagueEventHandler {

    private final ApplicationEventPublisher applicationEventPublisher;

    @HandleBeforeCreate
    public void handleBeforeCreateLeague(League league) {
        league.init();
    }

    @HandleBeforeSave
    public void handleBeforeSaveLeague(League league) {
        applicationEventPublisher.publishEvent(new LogEvent("Unhandled event for league " + league.getName(), new Date()));
    }

}
