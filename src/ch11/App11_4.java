/*
 * 介面 Interface
 * 請搭配IShape2D、Circle、Rectangle。
 * 
 * 可以透過Interface實現多重繼承。
 * 
 * Interface的規則如下：
 * 1.Data Member皆為常數，final這個關鍵字可以省略不寫。
 * 2.Function Member皆為Abstract Method。
 * 3.只能宣告成public或是不做宣告。
 * 
 * 無法直接產生物件， 必須透過介面的實作(Implementation)才行，
 * 使用的關鍵字為implements。
 */

package ch11;

public class App11_4 
{

	public static void main(String[] args) 
	{
		Rectangle rectangle = new Rectangle(10, 5);
		rectangle.area();
		
		Circle circle = new Circle(2.0);
		circle.area();

	}

}
