package com.github.therycn.tyleaguedatarest.entity.projection;

import com.github.therycn.tyleaguedatarest.entity.Team;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "teamAndLeague", types = { Team.class })
public interface TeamAndLeagueProjection {

	String getName();

	@Value("#{target.league.name}")
	String getLeagueName();

}
