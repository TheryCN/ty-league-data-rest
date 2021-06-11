package com.github.therycn.tyleaguedatarest;

import com.github.therycn.tyleaguedatarest.entity.Team;
import com.github.therycn.tyleaguedatarest.repository.TeamRepository;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;
import java.util.Objects;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Integration tests for /teams.
 */
@SpringBootTest
@AutoConfigureMockMvc
public class TeamRepositoryTests {

	@Autowired
	private TeamRepository teamRepository;

	@Test
	void whenFind_thenReturnTeams(@Autowired MockMvc mvc) throws Exception {
		// Given
		Team grenobleTeam = new Team("Grenoble", "France", null, null, null);
		teamRepository.save(grenobleTeam);

		String expectedTeams = IOUtils.toString(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("expected_teams.json")),
				Charset.defaultCharset());

		// When + Then
		mvc.perform(get("/teams"))
				.andExpect(status().isOk())
				.andExpect(content().string(expectedTeams));
	}

}
