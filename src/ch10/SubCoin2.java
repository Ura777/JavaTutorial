/*
 * SubClass
 */

package ch10;

class SubCoin2 extends SuperCircle2
{
	@SuppressWarnings("unused")
	private int value;

	//Constructor
	public SubCoin2() 
	{
		System.out.println("SubCoin() constructor called.");
	}
	
	public SubCoin2(double r, int v)
	{
		super(r);
		value = v;
		System.out.println("SubCoin(double r, int v) constructor called.");
	}

}
