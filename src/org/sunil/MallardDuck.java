package org.sunil;

public class MallardDuck extends Duck{

	@Override
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;

	}

	@Override
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;

	}

	@Override
	public void display() {
		System.out.println("I am Mallard duck!");

	}

}
