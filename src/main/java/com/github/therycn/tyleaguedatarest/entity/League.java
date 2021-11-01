package com.github.therycn.tyleaguedatarest.entity;

import com.github.therycn.tyleaguedatarest.event.LeagueStartEvent;
import lombok.*;

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
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
