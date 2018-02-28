/*
 * 建立物件與存取Data Member
 * 
 * 請搭配Class Rectangle
 */

package ch08;

public class App8_1 
{

	public static void main(String[] args) 
	{
		//建立物件
		Rectangle rectangle = new Rectangle();
		
		//設定rectangle的寬與高
		rectangle.width = 20;
		rectangle.height = 15;
		
		System.out.println("width = " + rectangle.width);
		System.out.println("heigh = " + rectangle.height);

	}

}
