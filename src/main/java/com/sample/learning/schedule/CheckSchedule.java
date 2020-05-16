package com.sample.learning.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CheckSchedule {

	@Scheduled(fixedRate = 1000)
	public void check() {
		System.out.println("Nitin : 1234567");
	}
	
}
