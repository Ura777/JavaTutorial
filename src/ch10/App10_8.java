/*
 * Class Object - getClass()範例
 * 請搭配Class Caa
 * 
 * 在Java內，如果Class沒有指定其Spuer Class的話，
 * Java會自動設定該Class繼承自Class Object。
 * 
 * Class Object可以視為所有Class的根源，
 * 所有的Class都是直接或是間接繼承自Class Object。
 * 
 * getClass()可以取得呼叫這個Method的物件所屬的Class
 */

package ch10;

public class App10_8 
{

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		//建立Caa的物件
		Caa a = new Caa(7);
		
		/*
		 * Class是定義於Java.lang裡的一個類別，
		 * 而且直接繼承自Object
		 */
		//建立Class的物件用來存放getClass()回傳的結果
		Class cla = a.getClass();
		
		//印出結果
		System.out.println("Class of a = " + cla);

	}

}
