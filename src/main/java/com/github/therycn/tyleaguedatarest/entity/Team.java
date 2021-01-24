package com.github.therycn.tyleaguedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Team.
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Team extends AbstractEntity<Long> {

    private String name;

    private String country;

    @ManyToOne
    private League league;

    @OneToMany(mappedBy = "id.teamA")
    private Set<Match> matchASet;

    @OneToMany(mappedBy = "id.teamB")
    private Set<Match> matchBSet;

    public Team(String name, String country, League league) {
        this.name = name;
        this.country = country;
        this.league = league;
    }
}
