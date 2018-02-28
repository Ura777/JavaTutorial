/*
 * 跳脫字元 Escape character
 */

package ch03;

public class App3_7 
{

	public static void main(String[] args) 
	{
		//將ch1設定為"
		char ch1 = '\"';
		
		//以8進位數值設定ch2
		char ch2 = '\74';
		//char ch2 = '074';
		
		//以16進位數值設定字元
		char ch3 = '\u003e';
		//char ch3 = '0x3e'
				
		System.out.println(ch1 + "Time flies." + ch1);
		System.out.println("\"Time is money!\"");
		System.out.println(ch2 + "Tomorrow never comes" + ch3);

	}

}
