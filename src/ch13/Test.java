/*
 * Test Class
 */

package ch13;

public class Test 
{
	//指定Method拋出Exception
	public static void test(int a, int b) throws ArithmeticException
	{
		int ans = 0;
		ans = a/b;
		System.out.println(a + " / " + b + " = " + ans);
	}

}
