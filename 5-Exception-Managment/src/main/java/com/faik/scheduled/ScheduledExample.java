package com.faik.scheduled;

import java.util.Iterator;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledExample {
	
	@Scheduled(cron = "00 05 15 * * * ")
	public void write1to10() {
		for(int i=1 ; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}
}
