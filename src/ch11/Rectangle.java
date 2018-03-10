/*
 * Rectangle Class
 */

package ch11;

class Rectangle implements IShape2D
{
	int length, width;
	
	//Constructor
	public Rectangle(int len, int wid) 
	{
		length = len;
		width = wid;
	}

	//Override Abstract Method area()
	@Override
	public void area() 
	{
		System.out.println("Area = " + length * width);
		
	}

}
