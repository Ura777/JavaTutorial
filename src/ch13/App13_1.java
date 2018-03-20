/*
 * 例外 Exception
 * 
 * 指的是在執行時會發生的錯誤(Run-Time Error)。
 * 
 * 產生Exception的常見情況如下：
 * 要開啟的檔案不存在
 * 陣列的Index超出範圍
 * 使用者輸入的型態與程式設計師所預期的不同
 * 整數除以0 
 * 
 * 如果沒有撰寫處理Exception的程式碼，
 * Java預設的處理程序為拋出Exception後停止執行程式。 
 */

package ch13;

public class App13_1 
{

	public static void main(String[] args) 
	{
		int array[] = new int[5];
		
		//會產生Exception
		array[10] = 20;
		
	}

}
