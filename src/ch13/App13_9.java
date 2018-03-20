/*
 * 輸入型態不合的例外處理
 * 
 * 拋出的Exception Class為InputMismatchException。
 * 
 * 另外一種例外處理則是拋出IOException。
 * 
 * 拋出IOException的處理方式有2種：
 * 1.在main()後方加上throws IOException
 * 2.使用try-catch
 * 
 * IOException通常會在檔案處理時會用到。
 */

package ch13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App13_9 
{

	public static void main(String[] args) 
	{
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		try
		{
			//取得使用者輸入
			System.out.print("請輸入1個整數：");
			num = scanner.nextInt();
			
			//印出使用者的輸入
			System.out.println("num = " + num);
		}
		catch(InputMismatchException e)
		{
			System.out.println("拋出" + e + "例外！");
		}
		
		//關閉scanner
		scanner.close();

	}

}
