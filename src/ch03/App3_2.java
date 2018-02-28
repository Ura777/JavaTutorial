/*
 * 整數設值的錯誤範例
 */

/*
 * Integer最大值為2147483647
 * 要設定大於2147483647的整數時，要把變數型態設定為long才行。
 * 必須要在數值後方加上「L」，編譯才能通過。*/

package ch03;

public class App3_2 
{

	public static void main(String[] args) 
	{
		//long num = 32967359818;
		long num = 32967359818L;
		System.out.println("num = " + num);

	}

}
