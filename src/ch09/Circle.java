/*
 * Class Circle
 */

package ch09;

class Circle 
{
	private double pi = 3.14;
	private double radius;
	private String color;
	
	//Constructor
	public Circle()
	{
		this(1.0, "Green");
		System.out.println("Constructor Circle() called.");
		//this.color = "Green";
		//this.radius = 1.0;
	}
	public Circle(double r) 
	{
		this.radius = r;
	}
	public Circle(double r, String col)
	{
		System.out.println("Constructor Circle(double, String) called.");
		this .radius = r;
		this .color = col;
	}
	
	//Calculate area.
	public double area()
	{
		return pi * Math.pow(radius, 2);
	}
	
	//Show radius and area.
	public void show()
	{
		System.out.println("Radius = " + this.radius + ", Area = " + this.area());
	}
	
	//Show color, radius and area.
	public void show_all()
	{
		System.out.println( "Color = " + this.color + ", Radius = " + this.radius + ", Area = " + this.area());
	}
	
	

}
