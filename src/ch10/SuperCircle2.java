/*
 * SuperClass
 */

package ch10;

class SuperCircle2 
{
	private static double pi = 3.14;
	private double radius;

	//Constructor
	public SuperCircle2() 
	{
		System.out.println("SuperCircle() constructor called.");
	}
	
	public SuperCircle2(double r)
	{
		System.out.println("SuperCircle(double r) constructor called.");
		radius = r;
	}
	
	//Method
	public void show()
	{
		System.out.println("area = " + pi * radius * radius);
	}

}
