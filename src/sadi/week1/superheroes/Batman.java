package sadi.week1.superheroes;
/***
 * 
 * @author wanidala/s3342847
 *
 */
public class Batman extends Superhero{
	
	/**
	 * Subclass constructor that implements super class functionality
	 */
	public Batman()
	{
		super("Batman");
	}
	/**
	 * Overrides default behaviour of Superhero.saveTheWorld()
	 */
	@Override
	public void saveTheWorld()
	{
		System.out.printf("%s saves the world again! Gotham City celebrates!", this.getName());
	}

}
