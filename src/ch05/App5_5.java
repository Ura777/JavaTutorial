/*
 * while
 */

package ch05;

public class App5_5 
{

	public static void main(String[] args) 
	{
		int n=0, sum=0;
		
		while(sum < 20)
		{
			System.out.println("n = " + n + ", sum = " + sum);
			n++;
			sum+=n;
		}

	}

}
