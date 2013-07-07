package org.sunil.test;

import org.sunil.Duck;
import org.sunil.FlyWithWings;
import org.sunil.MallardDuck;
import org.sunil.Quack;

public class Test {
	public static void main(String []args){
		Duck mallardDuck = new MallardDuck();
		mallardDuck.setFlyBehavior(new FlyWithWings());
		mallardDuck.setQuackBehavior(new Quack());
		
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
	}
}
