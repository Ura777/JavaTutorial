/*
 * Return Array
 */

package ch07;

public class App7_7 
{

	public static void main(String[] args) 
	{
		int record[][] = {{18,32,65,27,30},{17,56,12,66}};
		
		add10(record); //Call add10(), Parameter is record[][].
		print(record); //Call print(), Parameter is record[][].

	}
	
	//add10() Method
	public static int[][] add10(int arr[][])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]+=10;
			}
		}
		
		return arr;
	}
	
	//print() Method
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
