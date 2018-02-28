/*
 * 類別型態的變數傳遞參數
 * 
 * 請搭配Circle03
 */

package ch09;

public class App9_6 
{

	public static void main(String[] args) 
	{
		Circle03 circleA = new Circle03(1.0);
		Circle03 circleB = new Circle03(2.0);
		
		circleA.compare_radius(circleB);

	}

}
