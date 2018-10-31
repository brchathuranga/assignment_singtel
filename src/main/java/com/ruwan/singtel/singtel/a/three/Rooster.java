package com.ruwan.singtel.singtel.a.three;


public class Rooster extends Bird{
	private SoundBehaviourIF soundBehaviour;
	private FlyBehaviour flyBehaviour;

	public void setSoundBehaviour(SoundBehaviourIF soundBehaviour) {
		this.soundBehaviour = soundBehaviour;
	}

	public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}

	
	public String performSound(){
		return soundBehaviour.sound();
	}
	
	public String performFly(){
		return flyBehaviour.fly();
	}

}
