/*
 * Circle03 Class
 */

package ch11;

class Circle03 implements ISubShape2D
{
	private double radius;
	private String color;

	//Constructor
	public Circle03(double r) 
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
