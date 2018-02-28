/*
 * SuperClass
 */

package ch10;

class SuperCircle 
{
	private static double pi = 3.14;
	private double radius;

	//Constructor
	public SuperCircle() 
	{
		System.out.println("SuperCircle() constructor called.");
	}
	
	//Method
	public void setRadius(double r)
	{
		radius = r;
		System.out.println("radius = " + radius);
	}
	
	public void show()
	{
		System.out.println("area = " + pi * radius * radius);
	}

}
