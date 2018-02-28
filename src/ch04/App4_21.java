/*
 * 算術運算子 + - * / %
 */

/*
 * Arithmetic operator
 * 加法
 * 減法
 * 乘法
 * 除法
 * 取餘數
 */

package ch04;

public class App4_21 
{

	public static void main(String[] args) 
	{
		int x = 1, y = 2, z = 3;
		
		System.out.println("x = " + x + ", y = " + y + ", z = " + z);
		//空一行
		System.out.println();
		
		System.out.println("x + y + z = " + (x + y + z));
		System.out.println("z - y     = " + (z - y));
		System.out.println("x * y * z = " + (x * y * z));
		System.out.println("z / x     = " + (z / x));
		System.out.println("z % y     = " + (z % y));

	}

}
