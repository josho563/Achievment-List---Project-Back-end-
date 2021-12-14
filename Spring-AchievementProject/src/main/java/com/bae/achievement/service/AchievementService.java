package com.bae.achievement.service;

import java.util.List;

import com.bae.achievement.domain.Achievement;

public interface AchievementService {

	//Create
	Achievement createAchievement(Achievement achievement);

	//Read All
	List<Achievement> getAllAchievements();

	// Update
	Achievement replaceAchievement(Integer id, Achievement newAchievement);

	// Delete
	void removeAchievement(Integer id);
}

