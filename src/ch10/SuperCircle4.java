/*
 * SuperClass
 */

package ch10;

class SuperCircle4 
{
	protected static double pi = 3.14;
	protected double radius;
	
	//Constructor
	public SuperCircle4(double r)
	{
		radius = r;
	}
	
	//Method
	public void show()
	{
		System.out.println("radius = " + radius);
	}

}
