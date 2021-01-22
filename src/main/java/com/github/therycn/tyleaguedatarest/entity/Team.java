package com.github.therycn.tyleaguedatarest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

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
}
