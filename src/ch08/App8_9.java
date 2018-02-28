/*
 * Call Instance method with Return
 * 
 * 請搭配Class Circle02
 */

package ch08;

public class App8_9 
{

	public static void main(String[] args) 
	{
		Circle02 circle = new Circle02();
		
		circle.setCircle(3.1415926, 2.0);
		System.out.println("radius = " + circle.getRadius());
	}

}
