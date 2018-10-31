package com.ruwan.singtel.singtel.b.one;

public class SharkBehaviour implements FishBehaviourIF{

	public String color() {
		System.out.println("Sharks are large and grey color");
		return "Sharks are large and grey color";
	}

	public String behaviour() {
		System.out.println("Sharks eat other fish");
		return "Sharks eat other fish";
	}

}
