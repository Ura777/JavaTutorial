/*
 * Circle03
 */

package ch09;

class Circle03 
{
	private static double pi = 3.14;
	private static int count = 0;
	private double radius;

	//Constructor
	public Circle03() 
	{
		this(1.0);
	}

	public Circle03(double radius) 
	{
		this.radius = radius;
		count++; //count+1
	}
	
	//Calculate area.
	public double area()
	{
		return pi * Math.pow(radius, 2);
	}
		
	//Show radius and area.
	public void show()
	{
		System.out.println("Radius = " + this.radius + ", Area = " + this.area());
	}
	
	//Static method, show count.
	public static void show_count()
	{
		System.out.println(count + " object(s) created.");
	}
	
	//Compare radius
		public void compare_radius(Circle03 cir)
		{
			if(this.radius == cir.radius)
			{
				System.out.println("Radius are equal.");
			}
			else
			{
				System.out.println("Radius are not equal."); 
			}
		}
		
		//Compare radius and return.
		public Circle03 compare_radius_with_return(Circle03 cir)
		{
			if(this.radius > cir.radius)
			{
				return this; //回傳「呼叫」compare_radius_with_return()的物件
			}
			else
			{
				return cir; //回傳「傳入」compare_radius_with_return()的物件
			}
		}
		
		//Compare radius in Circle03 Array.
		public static double compare_radius_with_static(Circle03 cir[])
		{
			double maxRadius = 0.0;
			for(int i=0; i<cir.length; i++)
			{
				if(cir[i].radius > maxRadius)
				{
					maxRadius = cir[i].radius;
				}
			}
			
			return maxRadius;
		}

}
