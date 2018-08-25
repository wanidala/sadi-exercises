package sadi.week1.superheroes;

import sadi.week1.interfaces.IFly;
/***
 * 
 * @author wanidala/s3342847
 *
 */
public class Birdman extends Superhero implements IFly {

	/**
	 * Implements IFly's fly method
	 */
	@Override
	public void fly() {
		System.out.printf("%s is flying close to the sun!", this.getName());
	}

}
