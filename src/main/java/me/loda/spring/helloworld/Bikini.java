package me.loda.spring.helloworld;

import org.springframework.stereotype.Component;

@Component("bikini")
public class Bikini implements Outfit {

	public void wear() {
		// TODO Auto-generated method stub
		System.out.println("Wear bikini");
	}
	
	
	
}
