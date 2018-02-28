/*
 * 取得由鍵盤輸入的資料
 */

/*
 * 若輸入的字串中含有空白，必須要使用nextLine()，不然輸入的資料會被截斷。
 */

package ch03;

//載入Scanner類別
import java.util.Scanner;

public class App3_13 
{

	public static void main(String[] args) 
	{
		//宣告Scanner類別的物件
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		int age = 0;
		
		System.out.println("What's your name?");
		//取得字串
		name = myScanner.nextLine();
		
		System.out.println("How old are you?");
		//取得整數
		age = myScanner.nextInt();
		
		System.out.println("Hi, " + name + ", you're " + age + " years old.");
		
		//顯示name的第1個字元
		System.out.println("Your name's first letter is " + name.charAt(0) + ".");
		
		//關閉Scanner
		myScanner.close();

	}

}
