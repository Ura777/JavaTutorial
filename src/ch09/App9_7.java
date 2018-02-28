/*
 * 由Method回傳類別型態的變數
 * 
 * 請搭配Circle03
 */

package ch09;

public class App9_7 
{

	public static void main(String[] args) 
	{
		Circle03 circleA = new Circle03(1.0);
		Circle03 circleB = new Circle03(2.0);
		Circle03 object;
		
		object = circleA.compare_radius_with_return(circleB);
		
		//判斷回傳回來的物件是哪個
		if(circleA == object)
		{
			System.out.println("Radius of circleA is larger.");
		}
		else
		{
			System.out.println("Radius of circleB is larger.");
		}

	}

}
