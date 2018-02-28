/*
 * 溢位的處理
 */

package ch03;

public class App3_5 
{

	public static void main(String[] args) 
	{
		int i = Integer.MAX_VALUE;
		
		System.out.println("i = " + i);
		System.out.println("i + 1 = " + (i+1));
		System.out.println("i + 2 = " + (i+2L));
		System.out.println("i + 3 = " + ((long)i+3));

	}

}
