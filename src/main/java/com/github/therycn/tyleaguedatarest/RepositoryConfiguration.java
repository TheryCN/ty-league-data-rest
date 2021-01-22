package com.github.therycn.tyleaguedatarest;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RepositoryConfiguration {

    @Bean
    LeagueEventHandler leagueEventHandler(ApplicationEventPublisher applicationEventPublisher) {
        return new LeagueEventHandler(applicationEventPublisher);
    }
}
