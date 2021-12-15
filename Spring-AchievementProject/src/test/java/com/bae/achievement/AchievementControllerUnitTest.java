package com.bae.achievement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.bae.achievement.controller.AchievementController;
import com.bae.achievement.domain.Achievement;
import com.bae.achievement.service.AchievementService;


@RunWith(MockitoJUnitRunner.class)
public class AchievementControllerUnitTest {
	
	@Mock
	private AchievementService mockService;
	
	//injects all the mocks into customer controller
	@InjectMocks
	private AchievementController controller;
	
	@Test
	public void createTest() {
		// Setup
		Achievement inputAchievement = new Achievement("tutorial", "complete tutorial", 10, true);
		Achievement savedAchievement = new Achievement(1,"tutorial", "complete tutorial", 10, true);		

		// Define mocks
		Mockito.when(mockService.createAchievement(inputAchievement)).thenReturn(savedAchievement);
		
		
		// Actually call the code we want to test
		ResponseEntity<Achievement> response = controller.createAchievement(inputAchievement);
		
		
		assertEquals(response.getBody(), savedAchievement);
		assertEquals(response.getStatusCode(), HttpStatus.CREATED);
		Mockito.verify(mockService, Mockito.times(1)).createAchievement(inputAchievement);
		
	}
	
}
