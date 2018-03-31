/*
 * 實作Runnable介面來建立執行緒
 * 請搭配Test3。
 * 
 * 當Class已經繼承自某個Super Class，
 * 但是又想要繼承Thread Class來建立Thread，
 * 此時便可透過Implement Runnable Interface來達到此目的。
 * 
 * Runnable Interface的Abstract Method為run()。
 */

package ch15;

public class App15_3 
{

	public static void main(String[] args) 
	{
		Test3 dog = new Test3("Doggy");
		Test3 cat = new Test3("Kitty");
		
		//產生Thread物件，引數為Runnable物件。
		Thread t1 = new Thread(dog);
		Thread t2 = new Thread(cat);
		
		t1.start();
		t2.start();

	}

}
