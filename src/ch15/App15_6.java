/*
 * 執行緒的生命週期
 * 請搭配Test4。
 * 
 * 如果想要讓程式最後再印出"main() finished."，
 * 可以使用join()。
 * 
 * join()
 * 概念就像是吃飯吃到一半(Thread A)跑去接電話(Thread B)，
 * 講完電話後(Thread B)再回來繼續吃飯(Thread A)。
 * 
 * 因為有可能會被中斷，被中斷時會拋出InterruptedException，
 * 所以join()一定要做例外處理。
 */

package ch15;

public class App15_6 
{

	public static void main(String[] args) 
	{
		Test4 dog = new Test4("Doggy");
		Test4 cat = new Test4("Kitty");
		
		dog.start();
		
		try 
		{
			//限制dog thread結束後才能往下執行。
			dog.join();
			cat.start();
			//限制cat thread結束後才能往下執行。
			cat.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("main() finished.");

	}

}
