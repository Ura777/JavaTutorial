/*
 * Parameter and Return
 */

package ch07;

public class App7_2 
{

	public static void main(String[] args) 
	{
		int i=0;
		
		i=star(9); //呼叫star()，參數為9。
		System.out.println(i + " stars printed");

	}
	
	//star() Method
	//Parameter is n
	//Return 2*n
	//Return Data Type is integer.
	public static int star(int n)
	{
		for(int i=1; i<=2*n; i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		
		return 2*n;
	}

}
