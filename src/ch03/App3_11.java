/*
 * 型態自動轉換
 */

/*
 * Java會將表示範圍小的型態，自動轉換成表示範圍大的型態。
 */

package ch03;

public class App3_11 
{

	public static void main(String[] args) 
	{
		int a = 45;
		float b = 2.3f;
		
		System.out.println("a = " + a +", b = " + b);
		System.out.println("a/b = " + (a/b));

	}

}
