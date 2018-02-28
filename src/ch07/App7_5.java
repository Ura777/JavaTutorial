/*
 * 傳參照、傳址 Pass by Reference
 * 
 * 傳遞1維陣列
 */

package ch07;

public class App7_5 
{

	public static void main(String[] args) 
	{
		int score[] = {9,14,6,18,2,10};
		
		largest(score); //Call largest(), Parameter is score[].

	}
	
	//找陣列中最大值的方法
	public static void largest(int arr[])
	{
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		System.out.println("Largest number = " + max);
	}

}
