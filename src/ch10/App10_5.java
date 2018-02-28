/*
 * 以Super Class的變數存取Sub Class物件的成員
 * 請搭配SuperCircle4與SubCoin5
 * 
 * 以Super Class的變數指向Sub Class的實體物件，
 * 然後進行呼叫show()，
 * Overriding依然會發生。
 * 
 * 因此，雖然是Super Class的變數，
 * 但是依然可以存取到Sub Class物件的成員。
 * 
 * 請注意，Sub Class的變數不能指派給Super Class的實體物件。
 */

package ch10;

public class App10_5 
{

	public static void main(String[] args) 
	{
		//將SuperCircle4的變數指向SuperCircle4的實體物件
		SuperCircle4 circle = new SubCoin5(2.0, 5);
		circle.show();
		
		//cir無法呼叫showValue()，因為showValue()只存在於SubCoin5。
		//cir.showValue();
		
		//SubCoin5的變數不能指派給SuperCircle4的物件
		//SubCoin5 coin = new SuperCircle4(2.0);

	}

}
