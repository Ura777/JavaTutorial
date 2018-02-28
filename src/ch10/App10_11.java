/*
 * Class Object - toString()範例
 * 請搭配Class Caa2
 * 
 * 因為toString()原本的回傳值是一段亂七八糟的String，
 * 所以通常都會先Overriding toString()後，
 * 才會拿來使用。
 * 
 * 21行與22行的執行結果一樣
 */

package ch10;

public class App10_11 
{
	public static void main(String[] args) 
	{
		Caa2 a = new Caa2(20);
	
		//印出結果
		System.out.println(a.toString());
		//System.out.println(a);

	}

}
