package com.github.therycn.tyleaguedatarest.repository;

import com.github.therycn.tyleaguedatarest.entity.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

public interface TeamRepository extends JpaRepository<Team, Long> {

	// Resource will be accessible at `/teams/search/nameStartsWith?name=`
	@RestResource(path = "nameStartsWith", rel = "nameStartsWith")
	Page<?> findByNameStartsWith(@Param("name") String name, Pageable pageable);

}
