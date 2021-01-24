package com.github.therycn.tyleaguedatarest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

/**
 * Match.
 */
@Entity
@Getter
@Setter
public class Match {

    @EmbeddedId
    private MatchId id;

    private Date startDate;

    @Enumerated(value = EnumType.STRING)
    private WinnerType winner;

    enum WinnerType {
        TEAMA, TEAMB
    }

}
