/*
 * Circle Class
 */

package ch11;

class Circle implements IShape2D
{
	double radius;

	//Constructor
	public Circle(double r) 
	{
		radius = r;
	}

	//Override Abstract Method area()
	@Override
	public void area() 
	{
		System.out.println("Area = " + PI * radius * radius);
	}

}
