package com.github.therycn.tyleaguedatarest.repository;

import com.github.therycn.tyleaguedatarest.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
