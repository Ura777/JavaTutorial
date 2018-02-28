/*
 * SubClass
 */

package ch10;

class SubCoin3 extends SuperCircle3
{
	private int value;

	//Constructor
	public SubCoin3(double r, int v) 
	{
		radius = r;  //在SubCoin內可以直接存取SuperCircle內的protected成員：radius。
		value = v;
		System.out.println("radius = " + radius + ", value = " + value);
	}
	
}
