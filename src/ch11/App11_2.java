/*
 * 利用抽象類別的變數來存取子類別物件的成員
 * 請搭配AbstractShape、SubCircle、SubRectangle。
 * 
 * 即使Super Class為Abstract Class，
 * 也可以利用該變數來建立或是存取子類別物件。
 */

package ch11;

public class App11_2 
{

	public static void main(String[] args) 
	{
		//用AbstractShape的變數去建立SubRectangle的物件
		AbstractShape shape01 = new SubRectangle(10, 5);
		shape01.setColor("Red");
		shape01.show();
		
		//用AbstractShape的變數去建立SubCircle的物件
		AbstractShape shape02 = new SubCircle(2.0);
		shape02.setColor("Blue");
		shape02.show();

	}

}
