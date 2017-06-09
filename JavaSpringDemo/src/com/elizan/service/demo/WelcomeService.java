package com.elizan.service.demo;
import java.util.*; 


/*
 * Service Later 
 * Demonstrates separating the "logic" from the view 
 */

// returns an array list to be displayed in the view 
public class WelcomeService {
	
	public List<String> getWelcomeMessage(String name) {
		List<String> myWelcomeMessage = new ArrayList<>(); 
		
		// add data to the list 
		myWelcomeMessage.add("Hello!" ); 
		myWelcomeMessage.add(name); 
		myWelcomeMessage.add(", welcome to the Spring course.");
		
		return myWelcomeMessage; 
	}
}
