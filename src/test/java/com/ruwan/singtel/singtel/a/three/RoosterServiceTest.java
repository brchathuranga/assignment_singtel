package com.ruwan.singtel.singtel.a.three;

import org.junit.Test;

import com.ruwan.singtel.singtel.a.three.FlyWithWings;
import com.ruwan.singtel.singtel.a.three.Rooster;
import com.ruwan.singtel.singtel.a.three.RoosterSound;

import junit.framework.Assert;

public class RoosterServiceTest {
	
	@Test
	public void testRoosterService(){
		Rooster rooster = new Rooster();
		rooster.setFlyBehaviour(new FlyWithWings());
		Assert.assertEquals("I am flying",rooster.performFly());
		
		rooster.setSoundBehaviour(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo",rooster.performSound());
		
		rooster.walk();
	}

}
