/*
 * 類別關係的判斷 instanceof
 * 請搭配SuperCircle、SubCoin。
 * 
 * 該運算子是用來判斷物件是否繼承自某個Class或是實作某個Interface，
 * 回傳值為Boolean。
 * 
 * 如果instanceof前後的型態不合，就會無法比較。
 * 可以將第42、43行的註解拿掉並且編譯執行，觀察看看。
 */

package ch11;

public class App11_8 extends SubCoin
{

	public static void main(String[] args) 
	{
		boolean status;
		SuperCircle circle = new SuperCircle();
		SubCoin coin = new SubCoin();
		App11_8 app11_8 = new App11_8();
		SubCoin coinArray[] = new SubCoin[5];
		
		status = circle instanceof SubCoin;
		System.out.println("circle instanceof SubCoin? " + status);
		
		status = app11_8 instanceof SuperCircle;
		System.out.println("app11_8 instanceof SuperCircle? " + status);
		
		status = coin instanceof App11_8;
		System.out.println("coin instanceof App11_8? " + status);
		
		status = coin instanceof SuperCircle;
		System.out.println("coin instanceof SuperCircle? " + status);
		
		status = coin instanceof SubCoin;
		System.out.println("coin instanceof SubCoin? " + status);
		
		status = coinArray instanceof Object;
		System.out.println("coinArray instanceof Object? " + status);
		
		//status = circle instanceof String;
		//System.out.println("circle instanceof String? " + status);

	}

}
