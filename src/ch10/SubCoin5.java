/*
 * SubClass
 */

package ch10;

class SubCoin5 extends SuperCircle4
{
	private int value;

	//Constructor
	public SubCoin5(double r, int v) 
	{
		super(r);
		value = v;
	}

	//Method
	@Override
	public void show() 
	{
		System.out.println("radius = " + radius + ", value = " + value);
	}
	
	public void showValue()
	{
		System.out.println("value = " + value);
	}
	
	
}
