package sadi.week1;
import java.util.ArrayList;
import java.util.List;

import sadi.week1.interfaces.*;
import sadi.week1.superheroes.*;
import sadi.week1.birds.*;
/**
 * 
 * @author wanidala/s3342847
 * Test harness / driver for model
 */
public class Week1 {
	public static void main(String args[])
	{
		List<ISuperhero> heroes = new ArrayList<ISuperhero>();
		List<IFly> flyers = new ArrayList<IFly>();
		
		heroes.add(new Aquaman());
		heroes.add(new Birdman());
		flyers.add((IFly) heroes.get(1));
		heroes.add(new Batman());
		heroes.add(new Superman());
		flyers.add((IFly) heroes.get(3));
		heroes.add(new WonderWoman());
		flyers.add(new Eagle());
		flyers.add(new Parrot());
		
		for(ISuperhero hero: heroes)
		{
			hero.saveTheWorld();
			System.out.println();
		}
		
		System.out.println();
		
		for(IFly flyer : flyers)
		{
			flyer.fly();
			System.out.println();
		}
	}
}
