/*
 * 在程式中拋出例外
 * 
 * 在本範例中，即使不刻意撰寫拋出的程式碼，
 * Java還是會自動幫忙拋出Exception，
 * 因此在程式中拋出內建的Exception Class是沒有意義的。
 * 
 * 一般而言，在程式中拋出的Exception，
 * 多半是由程式設計師自行撰寫的Exception Class，
 * 因為Java不會自動幫忙拋出這類的Exception Class。
 */

package ch13;

public class App13_5 
{

	public static void main(String[] args) 
	{
		int a = 4, b = 0;
		
		try
		{
			System.out.println(a + " / " + b + " = " + (a/b));
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e + " throwed.");
		}

	}

}
