/*
 * 二維陣列
 */

package ch06;

public class App6_4 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		int score[][] = {{60, 90, 70, 75, 80},{95, 60, 85, 70, 75}};
		
		for(int i=0; i<score.length; i++)
		{
			System.out.print((i+1) + "號的五科成績分別為 ");
			for(int j=0; j<score[i].length; j++)
			{
				System.out.print(score[i][j] + " ");
				sum+=score[i][j];
			}
			System.out.println();
		}
		System.out.println("\n兩位同學的總分加總為 " + sum + " 分");
	}

}
