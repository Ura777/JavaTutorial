/*
 * 執行緒 Thread
 * 請搭配Test。
 * 
 * 指的是程式執行流程，多執行緒可以同時執行多個程式區塊，
 * 讓效率變高，加快處理速度。
 * 
 * 本範例為單一執行緒。
 */

package ch15;

public class App15_1 
{

	public static void main(String[] args) 
	{
		Test dog = new Test("Doggy");
		Test cat = new Test("Kitty");
		
		dog.run();
		cat.run();

	}

}
