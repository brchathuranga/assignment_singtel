package com.ruwan.singtel.singtel.b.one;

import org.junit.Test;

import com.ruwan.singtel.singtel.b.one.Clownfish;
import com.ruwan.singtel.singtel.b.one.ClownfishBehaviour;
import com.ruwan.singtel.singtel.b.one.Dolphin;
import com.ruwan.singtel.singtel.b.one.Fish;
import com.ruwan.singtel.singtel.b.one.Shark;
import com.ruwan.singtel.singtel.b.one.SharkBehaviour;
import com.ruwan.singtel.singtel.b.one.SwimBehaviourIF;

import junit.framework.Assert;

public class FishServiceTest {
	
	@Test
	public void testFishService(){
		Fish shark = new Shark();
		Assert.assertEquals("Sharks don’t sing", shark.sing());
		Assert.assertEquals("Sharks can swim",shark.swim());
		Assert.assertEquals("Sharks don't walk",shark.walk());

		Shark s = new Shark();
		s.setFishBehaviour(new SharkBehaviour());
		s.getFishBehaviour();
		Assert.assertEquals("Sharks are large and grey color",s.getFishColor());
		
		Fish clownfish = new Clownfish();
		Assert.assertEquals("Clownfish don’t sing",clownfish.sing());
		Assert.assertEquals("Clownfish can swim",clownfish.swim());
		Assert.assertEquals("Clownfish don't walk",clownfish.walk());
		
		Clownfish c = new Clownfish();
		c.setFishBehaviour(new ClownfishBehaviour());
		Assert.assertEquals("Clownfish make jokes",c.getFishBehaviour());
		Assert.assertEquals("Clownfish are small and colorful",c.getFishColor());

		SwimBehaviourIF d = new Dolphin();
		Assert.assertEquals("Dolphins are good swimmers",d.swim());
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
