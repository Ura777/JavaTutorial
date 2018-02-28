/*
 * Constructor Overloading
 * 
 * 請搭配Class Circle
 */

package ch09;

public class App9_2 
{

	public static void main(String[] args) 
	{
		//建立物件並呼叫不同的建構元
		Circle circle01 = new Circle();
		Circle circle02 = new Circle(4.0, "Blue");
		
		circle01.show_all();
		circle02.show_all();

	}

}
