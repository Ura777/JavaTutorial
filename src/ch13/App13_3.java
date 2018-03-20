/*
 * Exception的捕捉
 * 
 * 可以使用多個catch來捕捉1個以上的Exception。
 * 處理範圍小的Exception要排在前面，
 * 處理範圍大的Exception要排在後面。
 * 
 * 如果catch括號內寫的是Exception，
 * 代表著將會捕捉到所有的Exception。
 * 
 * 可以將註解拿掉，觀察看看是哪個Exception被捕捉到。
 */

package ch13;

public class App13_3 
{

	public static void main(String[] args) 
	{
		try 
		{
			
			int array[] = new int[5];
			array[10] = 20;
			
			
			/*
			int ans = 0;
			ans = 7/0;
			*/
			
			/*
			String str = "Hello World!!!";
			char ch;
			ch = str.charAt(20);
			*/
		}
		
		//處理範圍小的要排在前面
		catch(ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Exception = " + e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception = " + e);
		}
		
		//處理範圍大的要排在後面
		catch(Exception e)
		{
			System.out.println("Exception = " + e);
		}

	}

}
