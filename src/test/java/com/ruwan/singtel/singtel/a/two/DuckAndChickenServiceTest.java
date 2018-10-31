package com.ruwan.singtel.singtel.a.two;

import org.junit.Test;

import com.ruwan.singtel.singtel.a.two.Chicken;
import com.ruwan.singtel.singtel.a.two.ChickenSound;
import com.ruwan.singtel.singtel.a.two.ChickenSwim;
import com.ruwan.singtel.singtel.a.two.Duck;
import com.ruwan.singtel.singtel.a.two.DuckSound;
import com.ruwan.singtel.singtel.a.two.DuckSwim;
import com.ruwan.singtel.singtel.a.two.FlyWithWings;
import com.ruwan.singtel.singtel.a.two.FlyWithoutWings;

import junit.framework.Assert;

public class DuckAndChickenServiceTest {

	@Test
	public void test(){
		//Duck
		Duck duck = new Duck();
		duck.setFlyBehaviour(new FlyWithWings());
		Assert.assertEquals("I am flying",duck.performFly());

		duck.setSoundBehaviour(new DuckSound());
		Assert.assertEquals("Quack, quack",duck.performSound());

		duck.setSwimBehaviour(new DuckSwim());
		Assert.assertEquals("Duck can Swim",duck.performSwim());

		//Chicken
		Chicken chicken = new Chicken();
		chicken.setFlyBehaviour(new FlyWithoutWings());
		Assert.assertEquals("I am not flying",chicken.performFly());

		chicken.setSoundBehaviour(new ChickenSound());
		Assert.assertEquals("Cluck, cluck",chicken.performSound());

		chicken.setSwimBehaviour(new ChickenSwim());
		Assert.assertEquals("Chicken can't swim",chicken.performSwim());
	}

}
