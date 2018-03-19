package com.man.quartz;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ComplexBean {
	public void printMessage() {
		System.out.println("complex task invoked by using CronTriggerFactoryBean" + new Date());
	}

}
