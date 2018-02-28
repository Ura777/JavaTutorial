/*
 * continue
 */

package ch05;

public class App5_9 
{

	public static void main(String[] args) 
	{
		int i;
		
		for(i=1; i<=10; i++)
		{
			if(i%3 == 0)
			{
				continue;
			}
			System.out.println("i = " + i);
		}
		System.out.println("When loop is interruped, i = " + i + ".");

	}

}
