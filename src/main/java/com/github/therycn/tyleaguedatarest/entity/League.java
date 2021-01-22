package com.github.therycn.tyleaguedatarest.entity;

import com.github.therycn.tyleaguedatarest.event.LeagueStartEvent;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.Set;

/**
 * League.
 */
@Entity
@Getter
@Setter
public class League extends AbstractEntity<Long> {

    private String name;

    private int season;

    private String segment;

    @OneToMany(mappedBy = "league")
    private Set<Team> teams;

    public void init() {
        registerEvent(new LeagueStartEvent(this, new Date()));
    }
}
