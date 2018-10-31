package com.ruwan.singtel.singtel.a.four;

import org.junit.Test;

import com.ruwan.singtel.singtel.a.four.CatSound;
import com.ruwan.singtel.singtel.a.four.DogSound;
import com.ruwan.singtel.singtel.a.four.DuckSound;
import com.ruwan.singtel.singtel.a.four.Parrot;
import com.ruwan.singtel.singtel.a.four.PhoneSound;
import com.ruwan.singtel.singtel.a.four.RoosterSound;

import junit.framework.Assert;

public class ParrotServiceTest {
	
	@Test
	public void testRoosterSound(){
		Parrot parrot = new Parrot();
		parrot.setSoundBehaviour(new DogSound());
		Assert.assertEquals("Woof, woof", parrot.performSound());
		parrot.setSoundBehaviour(new DuckSound());
		Assert.assertEquals("Quack, quack", parrot.performSound());
		parrot.setSoundBehaviour(new CatSound());
		Assert.assertEquals("Meow", parrot.performSound());
		parrot.setSoundBehaviour(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo", parrot.performSound());
		parrot.setSoundBehaviour(new PhoneSound());
		//Assert.assertEquals("", parrot.performSound());
	}

}
