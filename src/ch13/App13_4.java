/*
 * 拋出例外 Throw Exception
 * 
 * 拋出例外的方式有2種：
 * 1.在程式中拋出
 * 2.指定函數拋出
 * 
 * 使用的關鍵字為throw。
 * 
 * 本範例為在程式中拋出例外。
 */

package ch13;

public class App13_4 
{

	public static void main(String[] args) 
	{
		int a = 4, b = 0;
		
		try
		{
			if(b==0)
			{
				//拋出例外
				throw new ArithmeticException();
			}
			else
			{
				System.out.println(a + " / " + b + " = " + (a/b));
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println(e + " throwed.");
		}

	}

}
