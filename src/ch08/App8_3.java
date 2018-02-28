/*
 * 使用Class Rectangle內的函數
 * 
 * 請搭配Class Rectangle
 */

package ch08;

public class App8_3 
{

	public static void main(String[] args) 
	{
		//建立物件
		Rectangle rectangle = new Rectangle();
		
		//設定rectangle的寬與高
		rectangle.width = 20;
		rectangle.height = 15;
		
		System.out.println("area = " + rectangle.area());
		System.out.println("perimeter = " + rectangle.perimeter());

	}

}
