/*
 * 多重繼承
 * 請搭配IShape2D、IColor、Circle02。
 * 
 * 在Java當中，只允許單一繼承。
 * 如果想要實現多重繼承，可以使用Interface來實現。
 */

package ch11;

public class App11_6 
{

	public static void main(String[] args) 
	{
		Circle02 circle = new Circle02(2.0);
		circle.setColor("Red");
		circle.area();

	}

}
