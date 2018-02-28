/*
 * 巢狀if
 */

package ch05;

public class App5_1a 
{

	public static void main(String[] args) 
	{
		int x = 7;
		
		if(x > 0)
		{
			if(x % 2 == 0)
			{
				System.out.println(x + "是大於0的偶數");
			}
			else
			{
				System.out.println(x + "是大於0的基數");
			}
		}
		else
		{
			System.out.println("x必須要大於0");
		}
		

	}

}
