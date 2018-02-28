/*
 * 陣列內數值的比大小
 */

package ch06;

import java.util.Random;

public class App6_3 
{

	public static void main(String[] args) 
	{
		int min = 0, max = 0;
		int a[] = new int[5];
		//宣告亂數變數random
		Random random = new Random();
		
		//透過亂數去隨機設定陣列內的數值
		for(int i=0; i<a.length; i++)
		{
			//亂數的範圍是1~100，+1是因為原本的範圍是0~99，總共100個變數。
			a[i] = random.nextInt(100)+1;
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		//設定max min的初始值為陣列第一個數值，用此當作基準來比大小。
		max = min = a[0];
		
		//比大小
		for(int i=0; i<a.length; i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
			
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		
		//印出結果
		System.out.println("\nMax = " + max);
		System.out.println("Min = " + min);

	}

}
