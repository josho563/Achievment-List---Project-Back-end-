package com.bae.achievement.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.achievement.domain.Achievement;

@Repository
public interface AchievementRepo extends JpaRepository<Achievement, Integer> {

	// Spring will auto-generate all the basic CRUD functionality

	List<Achievement> findByAchievementName(String achievementName);

	List<Achievement> findByAchievementDescription(String achievementDescription);

	List<Achievement> findByAchievementValue(Integer achievementValue);

	List<Achievement> findByAchievementUnlocked(Boolean achievementUnlocked);

}
