/*
 * 關係運算子 > < >= <= == !=
 */

/*
 * 大於
 * 小於
 * 大於等於
 * 小於等於
 * 等於
 * 不等於
 */

package ch04;

public class App4_3 
{

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		int x = 10, y = 20;
		
		// 印出原來的數值
		System.out.println("x = " + x + ", y = " + y + "\n");

		if (x > y)
			System.out.println("x > y 成立");
		
		if (true)
			System.out.println("此行將會被執行---true");
		
		if (false)
			System.out.println("此行將會被執行---false");
		
		if (x == y)
			System.out.println("x = y 成立");
	}

}
