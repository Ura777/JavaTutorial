/*
 * Circle02 Class
 */

package ch11;

class Circle02 implements IShape2D, IColor
{
	private double radius;
	private String color;

	//Constructor
	public Circle02(double r) 
	{
		radius = r;
	}

	//Override Abstract Method setColor()
	@Override
	public void setColor(String col) 
	{
		color = col;
		System.out.println("Color = " + color);
	}

	//Override Abstract Method area()
	@Override
	public void area() 
	{
		System.out.println("Area = " + PI * radius * radius);
	}

}
