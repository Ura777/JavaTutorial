/*
 * 執行緒的使用
 * 請搭配Test2。
 * 
 * 準備步驟：
 * 1.該Class必須繼承自Thread Class。
 * 2.Tread的處理必須寫在run()內，也就是Override run()。
 * 
 * 因為Class已經繼承自Thread，
 * 因此在呼叫run()時必須要用start()來呼叫，
 * Thread才會開始執行。
 * 
 * 當有複數的Thread執行時，看誰先搶到CPU的資源就會先執行。
 */

package ch15;

public class App15_2 
{

	public static void main(String[] args) 
	{
		Test2 dog = new Test2("Doggy");
		Test2 cat = new Test2("Kitty");
		
		//這邊是要start()，而不是呼叫run()
		dog.start();
		cat.start();

	}

}
