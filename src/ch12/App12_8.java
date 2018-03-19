/*
 * Wrapper Class
 * 
 * 指的是讓原始資料型態能夠像物件一樣的特殊Class，
 * 將原始資料型態包裝起來，並且提供額外的功能。
 * 
 * Wrapper Class的Method皆屬於Class Method；
 * 最大值與最小值也皆屬於Class Variable。
 * 
 * 原始資料型態 -> Wrapper Class
 * boolean -> Boolean
 * byte -> Byte
 * char -> Character
 * short -> Short
 * int -> Integer
 * long -> Long
 * float -> Float
 * double -> Double
 * 
 * 本範例將以Integer作為範例。
 */

package ch12;

public class App12_8 
{

	public static void main(String[] args) 
	{
		String str = "";
		int num = 0;
		
		//將字串轉換成整數
		num = Integer.parseInt("10") + 10;
		System.out.println("num = " + num);
		
		//將"3"附加在字串後方
		str = Integer.toString(num) + "10";
		System.out.println("str = " + str);

	}

}
