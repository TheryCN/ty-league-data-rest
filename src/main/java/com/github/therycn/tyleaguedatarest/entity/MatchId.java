package com.github.therycn.tyleaguedatarest.entity;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import java.io.Serializable;

/**
 * Match Id.
 */
@Embeddable
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MatchId implements Serializable {

    @ManyToOne
    private Team teamA;

    @ManyToOne
    private Team teamB;

}
