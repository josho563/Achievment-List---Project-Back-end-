package com.bae.achievement;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import com.bae.achievement.domain.Achievement;
import com.fasterxml.jackson.databind.ObjectMapper;

//boots context (all beans)  - Random port picked to avoid collisions.
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc // Setup for MockMVC object
@Sql(scripts = { "classpath:achievementList.schema.sql", // new table
		"classpath:achievementList-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD) // test setup for
																									// SQL
@ActiveProfiles("test") // the application profile to test.
public class AchievementControllerIntergrationTests {

	@Autowired // pulls MockMVC object from the context
	private MockMvc mvc; // class that peforms the request and captures response (like postman app)
	@Autowired
	private ObjectMapper mapper; // converts java and writes to JSON
//create
	@Test
	void testCreate() throws Exception {
		Achievement testAchievement = new Achievement("This is Dark Souls", "Die for the first time", 10, true);
		String testAchievementAsJSON = this.mapper.writeValueAsString(testAchievement);
		RequestBuilder req = post("/create").contentType(MediaType.APPLICATION_PROBLEM_JSON).content(testAchievementAsJSON); // settingcontenttoJSON
		Achievement testCreatedAchievement = new Achievement(2, "This is Dark Souls", "Die for the first time", 10, true);
		String testCreatedAchievementAsJSON = this.mapper.writeValueAsString(testCreatedAchievement);
		ResultMatcher checkStatus = status().isCreated(); // checking if 201
		ResultMatcher checkBody = content().json(testCreatedAchievementAsJSON); // checks its JSON format

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody); // sends the request - checks the status - // checks the body
	}
//getAll
@Test
void getAllTest() throws Exception {
	List<Achievement> testAchievement = List.of(new Achievement(1, "This is Dark Souls", "Die for the first time", 10, true));
	String json = this.mapper.writeValueAsString(testAchievement);
	RequestBuilder req = get("/getAll");
	ResultMatcher checkStatus = status().isOk();
	ResultMatcher checkBody = content().json(json);
	this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
}
//Update
@Test
void testUpdate() throws Exception {
	Achievement testAchievement = new Achievement(1, "This is Dark Souls", "Die for the first time", 10, true);
	String json = this.mapper.writeValueAsString(testAchievement);
	
	RequestBuilder req = put("/replace/1").contentType(MediaType.APPLICATION_PROBLEM_JSON).content(json);
	ResultMatcher checkStatus = status().isAccepted();
	ResultMatcher checkBody = content().json(json);
	this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
}
//Delete
@Test
void testDelete() throws Exception {
	RequestBuilder req = delete("/remove/1").contentType(MediaType.APPLICATION_PROBLEM_JSON);
	ResultMatcher checkStatus = status().isNoContent();
			
	this.mvc.perform(req).andExpect(checkStatus);
}
}

