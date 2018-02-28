/*
 * Class Circle03
 */

package ch08;

class Circle03 
{
	double pi = 3.14;
	double radius;
	String color;
	
	//Set radius.
	void setCircle(double r)
	{
		this.radius = r;
	}
	
	//Set color.
	void setCircle(String col)
	{
		this.color = col;
	}
	
	//Set radius and color.
	void setCircle(double r, String col)
	{
		this.radius = r;
		this.color = col;
	}
	
	//Calculate area.
	double area()
	{
		return this.pi * Math.pow(radius, 2);
	}
	
	//Show color, radius and area.
	void show()
	{
		System.out.println("color = " + color + ", radius = " + radius + ", area = " + this.area());
	}

}
