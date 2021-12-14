package com.bae.achievement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bae.achievement.domain.Achievement;
import com.bae.achievement.service.AchievementService;

@RestController // Spring is told this is a controller
public class AchievementController {

	private AchievementService service;

	@Autowired // spring to fetch the service

	public AchievementController(AchievementService service) {
		super();
		this.service = service;
	}

//create
	@PostMapping("/create") // 201 Created
	public ResponseEntity<Achievement> createAchievement(@RequestBody Achievement achievement) {
		this.service.createAchievement(achievement);
		Achievement created = this.service.createAchievement(achievement);
		ResponseEntity<Achievement> response = new ResponseEntity<Achievement>(created, HttpStatus.CREATED);
		return response;
	}

//read
	@GetMapping("/getAll") // 200
	public ResponseEntity<List<Achievement>> getAllAchievements() {
		return ResponseEntity.ok(this.service.getAllAchievements());
	}

//update
	@PutMapping("/replace/{id}") // 202 - accepted
	public ResponseEntity<Achievement> replaceAchievement(@PathVariable Integer id,
			@RequestBody Achievement newAchievement) {
		Achievement body = this.service.replaceAchievement(id, newAchievement);
		ResponseEntity<Achievement> response = new ResponseEntity<Achievement>(body, HttpStatus.ACCEPTED);
		return response;
	}

//delete
	@DeleteMapping("/remove/{id}") // 204
	public ResponseEntity<?> removeAchievement(@PathVariable Integer id) {
		this.service.removeAchievement(id.intValue());
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}