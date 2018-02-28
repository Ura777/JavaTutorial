/*
 * 封裝 Encapsulation
 * 
 * 請搭配Class Circle04
 * 使用Private與Public將Data member劃分，並且包裝在同個Class內來保護private member，讓其不會直接受到外界的存取。
 */

package ch08;

public class App8_11 
{

	public static void main(String[] args) 
	{
		Circle04 circle = new Circle04();
		
		circle.setRadius(-2.0);
		circle.show_area();
		
		//這行會編譯失敗，因為radius為private。
		//circle.radius = 2.0;
		
	}

}
