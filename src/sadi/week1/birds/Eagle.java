package sadi.week1.birds;

import sadi.week1.interfaces.IFly;
/***
 * 
 * @author wanidala/s3342847
 *
 */
public class Eagle extends Bird implements IFly {

	/**
	 * Subclass constructor that implements super class functionality
	 */
	public Eagle()
	{
		super("Eagle");
	}
	/**
	 * Implements IFly's fly method
	 */
	@Override
	public void fly() {
		System.out.printf("The %s is soaring", this.getName());
	}

}
