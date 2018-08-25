package sadi.week1.birds;
/***
 * 
 * @author wanidala/s3342847
 *
 */
public abstract class Bird {
	private String name;
	
	/***
	 * Default constructor. Remember to set the name if used
	 */
	public Bird()
	{
		this.setName("Undefined");
	}
	
	/***
	 * Constructor. Sets name to param parsed
	 * @param name Name of the bird
	 */
	public Bird(String name)
	{
		this.setName(name);
	}
	
	/***
	 * Sets the name of the bird
	 * @param name desired name of bird
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/***
	 * Get the name of this bird
	 * @return The name of the bird
	 */
	public String getName()
	{
		return this.name;
	}
}
