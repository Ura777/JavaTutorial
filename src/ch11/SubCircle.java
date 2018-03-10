/*
 * Sub Class
 */

package ch11;

class SubCircle extends AbstractShape
{
	protected double radius;

	//Constructor
	public SubCircle(double r) 
	{
		radius = r;
	}

	//Method
	public double area()
	{
		return 3.14 * radius * radius;
	}
	
	//Override Abstract Method show()
	@Override
	public void show() 
	{
		System.out.println("color = " + color + ", area = " + area());
	}

}
