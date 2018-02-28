/*
 * SubClass
 */

package ch10;

class SubCircle extends SuperShape
{
	private static double pi = 3.14;
	private double radius;

	//Constructor
	public SubCircle(double r) 
	{
		radius = r;
	}

	//Method
	@Override
	public double area() 
	{
		return pi * Math.pow(radius, 2);
	}
	
}
