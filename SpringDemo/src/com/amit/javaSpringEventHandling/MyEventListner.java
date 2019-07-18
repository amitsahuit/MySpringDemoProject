package com.amit.javaSpringEventHandling;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

public class MyEventListner implements ApplicationListener{

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("Even Listner called "+ event.toString() + " event.");
		
	}

}
