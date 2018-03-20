/*
 * 例外處理
 * 
 * 由關鍵字try、catch、finally組成，
 * finally的區塊可以省略不寫。
 * 
 * 處理的順序如下：
 * 1.try區塊產生Exception時，中斷執行，拋出由Exception Class產生的物件。
 * 2.拋出的物件如果是catch可以捕捉的Exception，catch將會進行捕捉，並且執行catch區塊內的程式。
 * 3.finally區塊裡的程式碼一定會被執行。
 * 4.結束後，程式會回到try-catch-finally區塊之後的地方繼續執行。
 * 
 * Exception繼承自Throwable，
 * 因此catch只能接收由Throwable Class的Sub Class所產生的物件。
 * 
 * 比較常見的Exception Class是RuntimeException跟IOException。
 * 前者即使不必撰寫Exception處理程式碼，依然可以編譯成功；
 * 後者一定得賺咧例外處理程式碼才行。
 * 
 * RuntimeException底下常用的Class為：
 * IndexOutOfBoundsException
 * ArithmeticException
 */

package ch13;

public class App13_2 
{

	public static void main(String[] args) 
	{
		//檢查程式碼是否會產生Exception
		try
		{
			int array[] = new int[5];
			array[10] = 20;
		}
		
		//如果拋出Exception，就執行這個區塊內的程式碼
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index out of bound!!!");
			
			//印出Exception的訊息
			System.out.println("Execption = " + e);
		}
		
		//這個區塊內的程式碼一定會被執行
		finally
		{
			System.out.println("This line is always executed!!!");
		}
		
		System.out.println("=====End of main()=====");

	}

}
