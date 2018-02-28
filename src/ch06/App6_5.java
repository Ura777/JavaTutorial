/*
 * 多維陣列
 */

package ch06;

import java.util.Random;

public class App6_5 
{

	public static void main(String[] args) 
	{
		int max=0, min=0;
		int a[][][] = new int[2][4][3];
		Random random = new Random();
		
		//利用亂數設定陣列內的值
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{
					//亂數範圍是1~100
					a[i][j][k] = random.nextInt(100)+1;
					//使用String.format()讓輸出比較整齊
					System.out.print(String.format("a[%d][%d][%d] = %3d  ", i,j,k,a[i][j][k]));
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//設定max min的初始值
		max = min = a[0][0][0];
		
		//開始比大小
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				for(int k=0; k<a[i][j].length; k++)
				{
					if(a[i][j][k] > max)
					{
						max = a[i][j][k];
					}
					
					if(a[i][j][k] < min)
					{
						min = a[i][j][k];
					}
				}
			}
		}
		
		//印出結果
		System.out.println("\nMax = " + max);
		System.out.println("Min = " + min);

	}

}
