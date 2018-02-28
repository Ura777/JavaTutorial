/*
 * 簡單的繼承範例
 * 請搭配SuperCircle與SubCoin
 * 
 * 繼承是指以既有的Class為基礎，進而衍生出另外一個Class。
 * 既有的Class被稱為父類別(Super Class)、基底類別(Basic Class)。
 * 衍生出來的Class被稱為子類別(Sub Class)、衍生類別(Derived Class)。
 * 
 * 在Java中，每一個Class只能繼承1個Super Class，這就是所謂的單一繼承(Single Inheritance)。
 * 如果要實現多重繼承(Multiple Inheritance)，可以透過介面(Interface)來達成
 * 
 * 經過繼承後，Sub Class將會擁有Super Class內的所有成員。
 * Sub Class可以直接使用以public、protected或是沒有宣告當作開頭的成員。
 * Sub Class雖然擁有以private宣告當作開頭的成員，但是無法直接使用，必須要透過Super Class的Method才行。
 * 
 * 繼承的關鍵字為extends。
 */

package ch10;

public class App10_1 
{

	public static void main(String[] args) 
	{
		//建立SubCoin類別的物件
		SubCoin coin = new SubCoin();
		
		//因為SubCoin繼承SuperCircle，因此可以呼叫setRadius()與show()。
		coin.setRadius(2.0);
		coin.show();
		
		//呼叫SubCoin自己的Method
		coin.setValue(5);

	}

}
