/*
 * 條件運算子 ?:
 */

package ch05;

public class App5_2 
{

	public static void main(String[] args) 
	{
		int a = 10, b = 7, max = 0;
		
		max = (a > b) ? a : b;
		System.out.println("a = " + a + ", b = " + b + "\n" + max + "是比較大的數字");
	}

}
