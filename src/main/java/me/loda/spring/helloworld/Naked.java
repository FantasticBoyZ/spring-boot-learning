package me.loda.spring.helloworld;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("naked")

public class Naked implements Outfit {

	public void wear() {
		System.out.println("Wear nothing");

	}

}