/*
 * 巢狀迴圈
 */

/*
 * 九九乘法表
 */

package ch05;

public class App5_7 
{

	public static void main(String[] args) 
	{
		//外層迴圈
		for(int i=1; i<=9; i++)
		{
			//內層迴圈
			for(int j=1; j<=9; j++)
			{
				//輸出格式化
				System.out.print(String.format("%d * %d = %2d\t", i, j, i*j));
			}
			System.out.println();
		}

	}

}
