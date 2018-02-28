/*
 * 方法 Method
 * 
 * Method加上static是為了在不建立物件的情況下可以呼叫該Method
 */

package ch07;

public class App7_1 
{
	//main() Method
	public static void main(String[] args) 
	{
		star(); //呼叫star()
		System.out.println("Knowledge is power");
		star(); //呼叫star()
		
	}
	
	//star() Method
	//印出19顆星號
	public static void star()
	{
		for(int i=1; i<20; i++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		
	}
}
