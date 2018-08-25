package sadi.week1.superheroes;

import sadi.week1.interfaces.ISuperhero;
/***
 * 
 * @author wanidala/s3342847
 *
 */
public abstract class Superhero implements ISuperhero {

	private String name;
	
	/**
	 * Implementation of ISuperhero's saveTheWorld()
	 * Prints the message [Character Name] saves the world again
	 */
	@Override
	public void saveTheWorld() {
		System.out.printf("%s saves the world again!", this.name);
	}
	
	/**
	 * Default constructor. Remember to set name if used.
	 */
	public Superhero()
	{
		setName("Undefined");
	}
	
	/***
	 * Constructor. Sets name to param parsed
	 * @param name Name of the Superhero
	 */
	public Superhero(String name)
	{
		setName(name);
	}
	
	/***
	 * Sets the name of the Superhero
	 * @param name desired name of Superhero
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/***
	 * Get the name of this Superhero
	 * @return The name of the Superhero
	 */
	public String getName()
	{
		return this.name;
	}
}