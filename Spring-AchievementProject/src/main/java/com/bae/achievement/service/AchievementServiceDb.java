package com.bae.achievement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.achievement.domain.Achievement;
import com.bae.achievement.repo.AchievementRepo;
@Service
public class AchievementServiceDb implements AchievementService{

	private AchievementRepo repo;

	@Autowired
	public AchievementServiceDb(AchievementRepo repo) {
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
		existing.setAchievementName(newAchievement.getAchievementName());
		existing.setAchievementDescription(newAchievement.getAchievementDescription());
		existing.setAchievementValue(newAchievement.getAchievementValue());
		existing.setAchievementUnlocked(newAchievement.getAchievementUnlocked());
		Achievement updated = this.repo.save(existing);
		return updated;
	}

//delete
	public void removeAchievement(Integer id) {
		this.repo.deleteById(id);
	}
}
