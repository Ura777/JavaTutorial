/*
 * 指定函數拋出例外
 * 
 * 當Method內可能會發生Exception，
 * 而且Method內又沒有任何的try-catch時，
 * 就可以使用拋出例外的方式來處理這種情況。
 * 
 * 使用的關鍵字為throws。
 * 
 * throw是在Method內部拋出Exception。
 * throws是指定Method拋出Exception。
 */

package ch13;

public class App13_6 
{

	public static void main(String[] args) 
	{
		//主程式這邊要用try-catch將Call test()的部分包住
		try
		{
			test(10,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e + " throwed.");
		}

	}
	
	//指定Method拋出Exception
	public static void test(int a, int b) throws ArithmeticException
	{
		int ans = 0;
		ans = a/b;
		System.out.println(a + " / " + b + " = " + ans);
	}

}
