/*
 * 一維陣列
 */

package ch06;

public class App6_1 
{

	public static void main(String[] args) 
	{
		int i;
		//宣告一維陣列a
		int a[] = new int[3];
		
		//設定第0個位置的值是9
		a[0] = 9;
		//設定第1個位置的值是6
		a[1] = 6;
		
		for(i=0; i<a.length; i++)
		{
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println("\nLength of array = " + a.length);

	}

}
