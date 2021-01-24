package com.github.therycn.tyleaguedatarest.repository;

import com.github.therycn.tyleaguedatarest.entity.Match;
import com.github.therycn.tyleaguedatarest.entity.MatchId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match, MatchId> {
}
