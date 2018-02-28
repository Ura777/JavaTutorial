/*
 * 建立物件陣列並傳遞至Method
 * 
 * 請搭配Class Circle03
 */

package ch09;

public class App9_8 
{

	public static void main(String[] args) 
	{
		//宣告陣列
		Circle03 circleArray[] = new Circle03[3];
		
		//產生新物件並且放入circleArray
		circleArray[0] = new Circle03(1.0);
		circleArray[1] = new Circle03(2.0);
		circleArray[2] = new Circle03(4.0);
		
		//呼叫show()顯示radius與area
		for(int i=0; i<circleArray.length; i++)
		{
			circleArray[i].show();
		}
		
		//呼叫compare_radius_with_static()並印出結果
		System.out.println("Largest radius = " + Circle03.compare_radius_with_static(circleArray));

	}

}
