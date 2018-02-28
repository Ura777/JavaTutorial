/*
 * 傳參照、傳址 Pass by Reference
 * 
 * 傳遞2維陣列
 */

package ch07;

public class App7_6 
{

	public static void main(String[] args) 
	{
		int record[][] = {{18,32,65,27,30},{17,56,12,66}};
		
		print(record); //Call print(), Parameter is record[][].

	}
	
	//print() method
	public static void print(int arr[][])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
