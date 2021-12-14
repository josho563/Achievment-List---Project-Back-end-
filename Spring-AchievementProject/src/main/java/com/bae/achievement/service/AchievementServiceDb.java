package com.bae.achievement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.bae.achievement.domain.Achievement;
import com.bae.achievement.repo.AchievementRepo;


public class AchievementServiceDb {

	private AchievementRepo repo;

	@Autowired
	public AchievementServiceDB(AchievementRepo repo) { //injection via constructor
		super();
		this.repo = repo;
	}
//create
	public Achievement createAchievement(Achievement achievement) {
		Achievement created = this.repo.save(achievement);
		return created;
	}

//read
	public List<Achievement> getAllAchievements() {
		return this.repo.findAll();
	}

//update
	public Achievement replaceAchievement(Integer id, Achievement newAchievement) {
		Achievement existing = this.repo.findById(id).get();
		existing.setName(newAchievement.getAchievementName());
		existing.setGame(newAchievement.getAchievementDescription());
		existing.setWeapon(newAchievement.getAchievementValue());
		existing.setNumberOfGames(newAchievement.getAchievementUnlocked());
		Achievement updated = this.repo.save(existing);
		return updated;
	}
//delete
	public void removeAchievement(Integer id) {
		this.repo.deleteById(id);
	}
}

