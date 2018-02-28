/*
 * 建構元 Constructor
 * 
 * 請搭配Class Circle
 * 
 * 在物件建立時就會自動呼叫Constructor
 * 用來對物件的資料成員做初始化(Initialization)
 */

package ch09;

public class App9_1 
{

	public static void main(String[] args) 
	{
		//建立物件並且呼叫建構元
		Circle circle = new Circle(4.0);
		
		circle.show();

	}

}
