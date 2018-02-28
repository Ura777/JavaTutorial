package ch09;

class Circle02 
{
	private double pi=3.14;
	private double radius;
	private String color;

	//Private Constructor
	private Circle02() 
	{
		System.out.println("Private Constructor Circle() called.");
	}
	//Public Constructor
	public Circle02(double r, String col)
	{
		this();
		this .radius = r;
		this .color = col;
	}
	
	//Calculate area.
	public double area()
	{
		return pi * Math.pow(radius, 2);
	}
		
	//Show color, radius and area.
	public void show_all()
	{
		System.out.println( "Color = " + this.color + ", Radius = " + this.radius + ", Area = " + this.area());
	}

}
