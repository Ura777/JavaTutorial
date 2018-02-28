/*
 * Class Object - equals()範例
 * 請搭配Class Caa
 * 
 * equals()可以知道兩個Class變數所指向的物件是否為同一個
 */

package ch10;

public class App10_9 
{
	public static void main(String[] args) 
	{
		Caa a = new Caa(10);
		Caa b = new Caa(10);
		Caa c = a;
		
		boolean isEqualB = a.equals(b); 
		boolean isEqualC = a.equals(c); 
		
		//印出結果
		System.out.println("a.equals(b) = " + isEqualB);
		System.out.println("a.equals(c) = " + isEqualC);

	}

}
