/*
 * 抽象類別 Abstract Class
 * 請搭配AbstractShape、SubCircle、SubRectangle。
 * 
 * 指的是建立專門的Class用來當作Super Class，
 * 有點類似範本的概念，目的是要依據其格式來修改並建立新的Class。
 * 
 * Abstract Class不能夠直接產生物件，
 * 必須得透過繼承的方式才能夠透過Sub Class產生物件。
 * 
 * Abstract Class的內容有：
 * 1.Data Member
 * 2.Function Member
 * 3.Abstract Method(抽象函數)
 * 
 * 抽象函數 Abstract Method
 * 指的是以abstract為開頭的Method，
 * 只定義回傳的資料型態、函數名稱、所需要的引數，
 * 處理方式的定義必須要在Sub Class進行Override。
 * 只能夠宣告為public、protected、不做宣告。
 * 
 * 使用Abstract Class的好處：
 * 可以針對Sub Class的特性去明確地的定義Abstract Method，
 * 以符合程式所需。
 */

package ch11;

public class App11_1 
{

	public static void main(String[] args) 
	{
		SubRectangle rectangle = new SubRectangle(10, 5);
		rectangle.setColor("Red");  //呼叫AbstractShape的setColor()
		rectangle.show();  //呼叫SubRectangle的show()
		
		SubCircle circle = new SubCircle(2.0);
		circle.setColor("Blue");  //呼叫AbstractShape的setColor()
		circle.show();  //呼叫SubCircle的show()

	}

}
