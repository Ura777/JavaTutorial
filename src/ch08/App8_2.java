/*
 * 建立多個物件
 * 
 * 請搭配Class Rectangle
 */

package ch08;

public class App8_2 
{

	public static void main(String[] args) 
	{
		//建立多個物件
		Rectangle rectangle01 = new Rectangle();
		Rectangle rectangle02 = new Rectangle();
				
		//設定rectangle01的寬與高
		rectangle01.width = 20;
		rectangle01.height = 15;
		
		//設定rectangle02的寬與高
		rectangle02.width = 25;
		rectangle02.height = rectangle01.height + 3;
				
		System.out.println("rectangle01.width = " + rectangle01.width);
		System.out.println("rectangle01.height = " + rectangle01.height);
		
		System.out.println();
		
		System.out.println("rectangle02.width = " + rectangle02.width);
		System.out.println("rectangle02.height = " + rectangle02.height);

	}

}
