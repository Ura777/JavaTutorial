/*
 * for 內的區域變數
 */

package ch05;

public class App5_4 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		
		for(int i=1; i<=5; i++)
		{
			sum+=i;
			System.out.println("i = " + i + ", sum = " + sum);
		}
		
		//這行會出現錯誤，因為 i 不是全域變數。
		//System.out.println("i = " + i);

	}

}
