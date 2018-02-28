/*
 * 多載 Overloading
 * 
 * 方法名稱相同，但是參數型態不同。
 */

package ch07;

public class App7_10 
{

	public static void main(String[] args) 
	{
		int value=5;
		int record[] = {1,2,3,4};
		
		show();
		show(value);
		show(record);

	}
	
	//show(), No parameter.
	public static void show()
	{
		System.out.println("Hello");
	}
	
	//show(), Parameter is v.
	public static void show(int v)
	{
		System.out.println("value = " + v);
	}
	
	//show(), Parameter is arr[].
	public static void show(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
