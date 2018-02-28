/*
 * 運算式的轉換
 */

package ch04;

public class App4_7 
{

	public static void main(String[] args) 
	{
		char ch = 'X';
		short sh = -5;
		int in = 6;
		float fl = 9.7f;
		double dou = 1.76;
		
		System.out.println("(sh*ch) - (dou/fl) * (in + fl) = " + ((sh*ch) - (dou/fl) * (in + fl)));

	}

}
