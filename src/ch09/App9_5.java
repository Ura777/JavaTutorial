/*
 * 類別變數 Class Variable
 * 
 * 請搭配Class Circle03
 * 
 * 在變數前方加上static即可變成Class Variable
 * 所有物件共同使用Class Variable
 */

/*
 * 類別方法 Class method
 * 
 * 請搭配Class Circle03
 * 
 * 在方法前方加上static即可變成Class Method
 * 可以直接透過Class進行呼叫，當然也可以透過物件進行呼叫。
 * Class Method無法存取Instance Variable與Instance Method。
 * Class Method內不能夠使用關鍵字this。
 */

package ch09;

public class App9_5 
{

	@SuppressWarnings({ "static-access", "unused" })
	public static void main(String[] args) 
	{
		Circle03 circle01 = new Circle03();
		Circle03.show_count();
		
		Circle03 circle02 = new Circle03(2.0);
		Circle03.show_count();
		
		Circle03 circle03 = new Circle03(4.0);
		circle03.show_count();

	}

}
