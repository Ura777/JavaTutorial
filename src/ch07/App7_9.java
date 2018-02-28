/*
 * 遞迴 Recursive
 * 
 * 方法本身呼叫自己，例如階乘函數(factorial function, n!)。
 */

package ch07;

public class App7_9 
{

	public static void main(String[] args) 
	{
		System.out.println("1*2*...*4 = " + fac(4));

	}
	
	//遞迴方法
	public static int fac(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n * fac(n-1);
		}
	}

}
