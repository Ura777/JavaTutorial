/*
 * Abstract Class
 */

package ch11;

abstract class AbstractShape 
{
	//Data Member
	protected String color;
	
	//Function Member
	public void setColor(String str)
	{
		color = str;
	}
	
	//Abstract Method
	public abstract void show();

}
