/*
 * Instance method overloading
 * 
 * 請搭配Class Circle03
 */

package ch08;

public class App8_10 
{

	public static void main(String[] args) 
	{
		Circle03 circle = new Circle03();
		
		circle.setCircle(2.0);
		circle.setCircle("Red");
		circle.show();
		
		circle.setCircle(4.0, "Blue");
		circle.show();

	}

}
