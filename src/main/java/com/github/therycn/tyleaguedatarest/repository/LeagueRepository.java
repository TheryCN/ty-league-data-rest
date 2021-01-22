package com.github.therycn.tyleaguedatarest.repository;

import com.github.therycn.tyleaguedatarest.entity.League;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeagueRepository extends JpaRepository<League, Long> {
}
