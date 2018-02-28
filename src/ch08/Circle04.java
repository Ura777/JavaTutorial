/*
 * Class circle04
 */

package ch08;

class Circle04 
{
	//定義資料成員
	private double pi = 3.14;
	private double radius;
	
	//Get pi.
	public double getPI()
	{
		return this.pi;
	}
	
	//Radius's Getter and Setter
	public void setRadius(double r)
	{
		//Radius必須要大於0才行
		if(r > 0)
		{
			this.radius = r;
			System.out.println("Radius = " + this.radius);
		}
		else
		{
			System.out.println("Input Error!!!");
		}
	}
	public double getRadius()
	{
		return this.radius;
	}
	
	//Calculate area.
	private double area()
	{
		return this.pi * Math.pow(radius, 2);
	}
	
	//Show area.
	public void show_area()
	{
		System.out.println("Area = " + this.area());
	}

}
