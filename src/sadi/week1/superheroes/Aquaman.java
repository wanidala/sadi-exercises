package sadi.week1.superheroes;
/***
 * 
 * @author wanidala/s3342847
 *
 */
public class Aquaman extends Superhero{

	/**
	 * Subclass constructor that implements super class functionality
	 */
	public Aquaman()
	{
		super("Aquaman");
	}
	/**
	 * Overrides default behaviour of Superhero.saveTheWorld()
	 */
	@Override
	public void saveTheWorld() {
		System.out.printf("%s saves the world again! Atlantis rejoices!", this.getName());
	}
}
