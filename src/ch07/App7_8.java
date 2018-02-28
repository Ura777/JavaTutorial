/*
 * 傳參照、傳址 Pass by Reference
 */

package ch07;

public class App7_8 
{

	public static void main(String[] args) 
	{
		int record[] = {1,2,3,4,5};
		
		square(record); //Call square(), Parameter is record[].
		print(record); //Call print(), Parameter is record[].

	}
	
	//square() Method
	public static void square(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = arr[i] * arr[i];
		}
	}
	
	//print() Method
	public static void print(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
	}

}
