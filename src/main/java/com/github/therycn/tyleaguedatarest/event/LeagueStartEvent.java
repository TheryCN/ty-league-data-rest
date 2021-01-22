package com.github.therycn.tyleaguedatarest.event;

import com.github.therycn.tyleaguedatarest.entity.League;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * League StartEvent.
 */
@Data
@AllArgsConstructor
public class LeagueStartEvent {

    private League league;

    private Date date;
}
