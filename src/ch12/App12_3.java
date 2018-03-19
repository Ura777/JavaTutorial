/*
 * 存取不同package內的Class
 * 請搭配pack01.Circle。
 * 
 * 被存取的Class必須以public為開頭才行，
 * 否則編譯時將會發生錯誤。
 */

package ch12;

public class App12_3 
{

	public static void main(String[] args) 
	{
		//必須要將pack01寫出來才能使用Circle
		pack01.Circle circle = new pack01.Circle();
		circle.show();

	}

}
