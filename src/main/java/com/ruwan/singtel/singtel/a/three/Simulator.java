package com.ruwan.singtel.singtel.a.three;

public class Simulator {

	public static void main(String args[]){
		Rooster rooster = new Rooster();
		rooster.setFlyBehaviour(new FlyWithWings());
		rooster.performFly();

		rooster.setSoundBehaviour(new RoosterSound());
		rooster.performSound();
		
		rooster.walk();

	}
}