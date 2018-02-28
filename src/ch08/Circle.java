/*
 * Class Circle
 */

package ch08;

class Circle 
{
	double pi = 3.14;
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
	
	//Set radius.
	void setRadius(double r)
	{
		this.radius = r;
	}
	
}
