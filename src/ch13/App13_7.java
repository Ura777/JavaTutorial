/*
 * 從不同類別內的函數拋出例外
 * 請搭配Test。 
 */

package ch13;

public class App13_7 
{

	public static void main(String[] args) 
	{
		try
		{
			Test.test(20, 0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e + " throwed.");
		}

	}

}
