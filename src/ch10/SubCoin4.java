/*
 * SubClass
 */

package ch10;

class SubCoin4 extends SuperCircle4
{
	private int value;

	//Constructor
	public SubCoin4(double r, int v) 
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
	
	
}
