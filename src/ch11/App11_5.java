/*
 * 利用介面型態的變數或是陣列來存取物件
 * 請搭配IShape2D、Circle、Rectangle。
 */

package ch11;

public class App11_5 
{

	public static void main(String[] args) 
	{
		//宣告IShape2D變數
		IShape2D var01, var02;
		
		//var01指向Rectangle物件
		var01 = new Rectangle(10, 5);
		var01.area();
		
		//var02指向Circle物件
		var02 = new Circle(2.0);
		var02.area();

	}

}
