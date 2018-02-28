/*
 * 比較陣列間的參考位置
 */

package ch06;

public class App6_6 
{

	public static void main(String[] args) 
	{
		int a[] = {2, 7, 6, 3, 8, 4};
		int b[] = {2, 7, 6, 3, 8, 4};
		int c[] = a;
		
		if(a==b)
		{
			System.out.println("a = b");
		}
		else
		{
			System.out.println("a != b");
		}

		if(a==c)
		{
			System.out.println("a = c");
		}
		else
		{
			System.out.println("a != c");
		}
	}

}
