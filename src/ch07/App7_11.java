/*
 * 多載 Overloading
 * 
 * 方法名稱相同，但是參數型態、個數不同。
 */

package ch07;

public class App7_11 
{

	public static void main(String[] args) 
	{
		star();
		star(7);
		star(9, '@');

	}
	
	//star(), No parameter.
	public static void star()
	{
		star(5);
	}
		
	//star(), Parameter is n.
	public static void star(int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
		
	//star(), Parameters are n and ch.
	public static void star(int n, char ch)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(ch);
		}
		System.out.println();
	}

}
