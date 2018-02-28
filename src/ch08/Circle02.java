/*
 * Class Circle02
 */

package ch08;

class Circle02 
{
	double pi;
	double radius;
	
	//Show pi and area.
	void show_area()
	{
		System.out.println("pi = " + pi);
		System.out.println("area = " + pi * radius * radius);
	}
	
	//Show radius and then Call show_area().
	void show_all()
	{
		System.out.println("radius = " + this.radius);
		this.show_area();
	}
	
	//Set pi and radius.
	void setCircle(double pi, double r)
	{
		this.pi = pi;
		this.radius = r;
	}
	
	//Get radius.
	double getRadius()
	{
		return this.radius;
	}

}
