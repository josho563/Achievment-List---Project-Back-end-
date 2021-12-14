package com.bae.achievement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //tells my class it will go table to spring data
public class Achievement {

	@Id // Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMEMENT
	private Integer id;
	private String achievementName;
	private String achievementDescription;
	private Integer achievementValue;
	private Boolean achievementUnlocked;
	
	
	
	public Achievement(String achievementName, String achievementDescription, Integer achievementValue,
			Boolean achievementUnlocked) {
		super();
		this.achievementName = achievementName;
		this.achievementDescription = achievementDescription;
		this.achievementValue = achievementValue;
		this.achievementUnlocked = achievementUnlocked;
	}

	public Achievement(Integer id, String achievementName, String achievementDescription, Integer achievementValue,
			Boolean achievementUnlocked) {
		super();
		this.id = id;
		this.achievementName = achievementName;
		this.achievementDescription = achievementDescription;
		this.achievementValue = achievementValue;
		this.achievementUnlocked = achievementUnlocked;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAchievementName() {
		return achievementName;
	}

	public void setAchievementName(String achievementName) {
		this.achievementName = achievementName;
	}

	public String getAchievementDescription() {
		return achievementDescription;
	}

	public void setAchievementDescription(String achievementDescription) {
		this.achievementDescription = achievementDescription;
	}

	public Integer getAchievementValue() {
		return achievementValue;
	}

	public void setAchievementValue(Integer achievementValue) {
		this.achievementValue = achievementValue;
	}

	public Boolean getAchievementUnlocked() {
		return achievementUnlocked;
	}

	public void setAchievementUnlocked(Boolean achievementUnlocked) {
		this.achievementUnlocked = achievementUnlocked;
	}
	
}