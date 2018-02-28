/*
 * 溢位 Overflow
 */

package ch03;

public class App3_4 
{

	public static void main(String[] args) 
	{
		int i = Integer.MAX_VALUE;
		int sum = 0;
		
		System.out.println("i = " + i);
		
		sum = i + 1;
		System.out.println("i + 1 = " + sum);
		
		sum = i + 2;
		System.out.println("i + 2 = " + sum);

	}

}
