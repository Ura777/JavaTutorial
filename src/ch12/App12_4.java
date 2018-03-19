/*
 * 匯入package
 * 請搭配pack01.Circle。
 * 
 * 為了能夠更簡的直接存取存放於不同package內的Class，
 * 可以透過匯入(import)的方式將Class匯入。
 * 
 * 使用的關鍵字為import。
 */

package ch12;

//將pack01.Circle匯入
import pack01.Circle;

public class App12_4 
{

	public static void main(String[] args) 
	{
		//匯入後不用將pack01寫出來
		Circle circle = new Circle();
		circle.show();

	}

}
