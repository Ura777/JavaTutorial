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

	
	//Override Abstract Method show()
	@Override
	public void show() 
	{
		System.out.println("color = " + color + ", area = " + (3.14 * radius * radius));
	}

}
