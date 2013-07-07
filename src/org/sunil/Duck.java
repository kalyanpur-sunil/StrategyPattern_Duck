package org.sunil;

public abstract class Duck {
	FlyBehavior flyBehavior;

	QuackBehavior quackBehavior;

	public Duck(){ 
		super();	
	}

	public void performFly(){
		flyBehavior.fly();
	}

	public void performQuack(){
		quackBehavior.quack();
	}
	public abstract void setFlyBehavior(FlyBehavior flyBehavior);

	public abstract void setQuackBehavior(QuackBehavior quackBehavior);

	public abstract void display();
}
