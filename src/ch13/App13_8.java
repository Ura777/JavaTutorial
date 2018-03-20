/*
 * 撰寫並且拋出自訂的Exception Class
 * 請搭配CircleException、Circle。
 * 
 * 自訂的Exception Class一定要繼承自Exception。
 */

package ch13;

public class App13_8 
{

	public static void main(String[] args) 
	{
		Circle circle = new Circle();
		
		//try-catch做例外處理
		try
		{
			circle.setRadius(-10.0);
		}
		catch(CircleException e)
		{
			System.out.println(e);
		}
		
		circle.show();

	}

}
