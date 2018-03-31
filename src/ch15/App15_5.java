/*
 * 執行緒的生命週期
 * 請搭配Test4。
 * 
 * 由於main()本身也是Thread，
 * 所以執行完第21、22行後，就會接著往下執行第24行。
 * 會執行第24行主要是因為不用經過Thread的啟動程序，
 * 因此會比第21、22行還要快搶到CPU資源。
 */

package ch15;

public class App15_5 
{

	public static void main(String[] args) 
	{
		Test4 dog = new Test4("Doggy");
		Test4 cat = new Test4("Kitty");
		
		dog.start();
		cat.start();
		
		System.out.println("main() finished.");

	}

}
